package net.tier1234.better_deco_building.block.entity.render;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.tier1234.better_deco_building.block.entity.DecoChestBlockEntity;
import net.tier1234.better_deco_building.init.ModBlocks;
/**
 * Author: Kaupenjoe
 * */
public class DecoChestItemRenderer extends ItemRenderer {
    private final DecoChestBlockEntity chestEntity = new DecoChestBlockEntity(BlockPos.ZERO, ModBlocks.OAK_CHEST.get().defaultBlockState());

    public DecoChestItemRenderer(Minecraft minecraft, TextureManager textureManager, ModelManager modelManager, ItemColors itemColors, BlockEntityWithoutLevelRenderer blockEntityRenderer) {
        super(minecraft, textureManager, modelManager, itemColors, blockEntityRenderer);
    }

    @Override
    public void render(ItemStack itemStack, ItemDisplayContext displayContext, boolean leftHand, PoseStack poseStack, MultiBufferSource bufferSource, int combinedLight, int combinedOverlay, BakedModel p_model) {
        BlockEntityRenderDispatcher dispatcher = Minecraft.getInstance().getBlockEntityRenderDispatcher();
        BlockEntityRenderer<DecoChestBlockEntity> renderer = (BlockEntityRenderer<DecoChestBlockEntity>) dispatcher.getRenderer(chestEntity);

        if (renderer != null) {
            renderer.render(chestEntity, 0.0F, poseStack, bufferSource, combinedLight, combinedOverlay);
        }
    }
}
