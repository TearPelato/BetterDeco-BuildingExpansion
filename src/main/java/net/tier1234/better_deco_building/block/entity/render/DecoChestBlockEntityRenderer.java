package net.tier1234.better_deco_building.block.entity.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BrightnessCombiner;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractChestBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.entity.LidBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.tier1234.better_deco_building.Constants;

import java.util.Calendar;


/**
 * Author: Kaupenjoe
 * */

public class DecoChestBlockEntityRenderer<T extends BlockEntity & LidBlockEntity> extends ChestRenderer {
    private static final String BASE = "bottom";
    private static final String LID = "lid";
    private static final String LATCH = "lock";
    private final ModelPart singleChestLid;
    private final ModelPart singleChestBase;
    private final ModelPart singleChestLatch;
    private final ModelPart doubleChestLeftLid;
    private final ModelPart doubleChestLeftBase;
    private final ModelPart doubleChestLeftLatch;
    private final ModelPart doubleChestRightLid;
    private final ModelPart doubleChestRightBase;
    private final ModelPart doubleChestRightLatch;
    private boolean christmas;

    public DecoChestBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
        super(ctx);
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(Calendar.MONTH) + 1 == 12 && calendar.get(Calendar.DAY_OF_MONTH) >= 24 && calendar.get(Calendar.DAY_OF_MONTH) <= 26) {
            this.christmas = true;
        }

        ModelPart modelPart = ctx.bakeLayer(ModelLayers.CHEST);
        this.singleChestBase = modelPart.getChild("bottom");
        this.singleChestLid = modelPart.getChild("lid");
        this.singleChestLatch = modelPart.getChild("lock");
        ModelPart modelPart2 = ctx.bakeLayer(ModelLayers.DOUBLE_CHEST_LEFT);
        this.doubleChestLeftBase = modelPart2.getChild("bottom");
        this.doubleChestLeftLid = modelPart2.getChild("lid");
        this.doubleChestLeftLatch = modelPart2.getChild("lock");
        ModelPart modelPart3 = ctx.bakeLayer(ModelLayers.DOUBLE_CHEST_RIGHT);
        this.doubleChestRightBase = modelPart3.getChild("bottom");
        this.doubleChestRightLid = modelPart3.getChild("lid");
        this.doubleChestRightLatch = modelPart3.getChild("lock");
    }


    @Override
    public void render(BlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        Level level = blockEntity.getLevel();
        boolean hasLevel = level != null;
        BlockState blockState = hasLevel
                ? blockEntity.getBlockState()
                : Blocks.CHEST.defaultBlockState().setValue(ChestBlock.FACING, Direction.SOUTH);
        ChestType chestType = blockState.hasProperty(ChestBlock.TYPE) ? blockState.getValue(ChestBlock.TYPE) : ChestType.SINGLE;

        if (blockState.getBlock() instanceof AbstractChestBlock<?> abstractChestBlock) {
            boolean isDouble = chestType != ChestType.SINGLE;
            poseStack.pushPose();
            float yRot = blockState.getValue(ChestBlock.FACING).toYRot();
            poseStack.translate(0.5F, 0.5F, 0.5F);
            poseStack.mulPose(Axis.YP.rotationDegrees(-yRot));
            poseStack.translate(-0.5F, -0.5F, -0.5F);

            DoubleBlockCombiner.NeighborCombineResult<? extends ChestBlockEntity> propertySource;
            if (hasLevel) {
                propertySource = abstractChestBlock.combine(blockState, level, blockEntity.getBlockPos(), true);
            } else {
                propertySource = DoubleBlockCombiner.Combiner::acceptNone;
            }

            float openProgress = propertySource.apply(ChestBlock.opennessCombiner((LidBlockEntity) blockEntity)).get(partialTick);
            openProgress = 1.0F - openProgress;
            openProgress = 1.0F - openProgress * openProgress * openProgress;

            int combinedLight = propertySource.apply(new BrightnessCombiner<>()).applyAsInt(packedLight);

            Material material = createChestMaterial(chestType);
            VertexConsumer vertexConsumer = material.buffer(bufferSource, RenderType::entityCutout);

            if (isDouble) {
                if (chestType == ChestType.LEFT) {
                    this.renderParts(poseStack, vertexConsumer, this.doubleChestLeftLid, this.doubleChestLeftLatch, this.doubleChestLeftBase, openProgress, combinedLight, packedOverlay);
                } else {
                    this.renderParts(poseStack, vertexConsumer, this.doubleChestRightLid, this.doubleChestRightLatch, this.doubleChestRightBase, openProgress, combinedLight, packedOverlay);
                }
            } else {
                this.renderParts(poseStack, vertexConsumer, this.singleChestLid, this.singleChestLatch, this.singleChestBase, openProgress, combinedLight, packedOverlay);
            }

            poseStack.popPose();
        }
    }

    private void renderParts(PoseStack poseStack, VertexConsumer vertexConsumer, ModelPart lid, ModelPart latch, ModelPart base, float openFactor, int packedLight, int packedOverlay) {
        lid.xRot = -(openFactor * (float) (Math.PI / 2));
        latch.xRot = lid.xRot;
        lid.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        latch.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        base.render(poseStack, vertexConsumer, packedLight, packedOverlay);
    }

    private static Material createChestMaterial(ChestType type) {
        return switch (type) {
            case LEFT -> new Material(Sheets.CHEST_SHEET, Constants.id("entity/chest/custom_chest_left"));
            case RIGHT -> new Material(Sheets.CHEST_SHEET, Constants.id("entity/chest/custom_chest_right"));
            default -> new Material(Sheets.CHEST_SHEET, Constants.id("entity/chest/custom_chest"));
        };
    }
}