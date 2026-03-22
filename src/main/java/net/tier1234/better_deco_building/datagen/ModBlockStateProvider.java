package net.tier1234.better_deco_building.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.tier1234.better_deco_building.Constants;
import net.tier1234.better_deco_building.block.custom.DecoVerticalSlab;
import net.tier1234.better_deco_building.init.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Constants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        createVerticalSlab(ModBlocks.OAK_VERTICAL_SLAB.get(), ResourceLocation.parse("block/oak_planks"), Constants.id("block/oak_vertical_slab"));
        createVerticalSlab(ModBlocks.SPRUCE_VERTICAL_SLAB.get(), ResourceLocation.parse("block/spruce_planks"), Constants.id("block/spruce_vertical_slab"));
        createVerticalSlab(ModBlocks.BIRCH_VERTICAL_SLAB.get(), ResourceLocation.parse("block/birch_planks"), Constants.id("block/birch_vertical_slab"));
        createVerticalSlab(ModBlocks.JUNGLE_VERTICAL_SLAB.get(), ResourceLocation.parse("block/jungle_planks"), Constants.id("block/jungle_vertical_slab"));
        createVerticalSlab(ModBlocks.ACACIA_VERTICAL_SLAB.get(), ResourceLocation.parse("block/acacia_planks"), Constants.id("block/acacia_vertical_slab"));
        createVerticalSlab(ModBlocks.DARK_OAK_VERTICAL_SLAB.get(), ResourceLocation.parse("block/dark_oak_planks"), Constants.id("block/dark_oak_vertical_slab"));
        createVerticalSlab(ModBlocks.MANGROVE_VERTICAL_SLAB.get(), ResourceLocation.parse("block/mangrove_planks"), Constants.id("block/mangrove_vertical_slab"));
        createVerticalSlab(ModBlocks.CHERRY_VERTICAL_SLAB.get(), ResourceLocation.parse("block/cherry_planks"), Constants.id("block/cherry_vertical_slab"));
        createVerticalSlab(ModBlocks.BAMBOO_VERTICAL_SLAB.get(), ResourceLocation.parse("block/bamboo_planks"), Constants.id("block/bamboo_vertical_slab"));
        createVerticalSlab(ModBlocks.CRIMSON_VERTICAL_SLAB.get(), ResourceLocation.parse("block/crimson_planks"), Constants.id("block/crimson_vertical_slab"));
        createVerticalSlab(ModBlocks.WARPED_VERTICAL_SLAB.get(), ResourceLocation.parse("block/warped_planks"), Constants.id("block/warped_vertical_slab"));
    }

    public void createVerticalSlab(DecoVerticalSlab block, ResourceLocation doubleFile, ResourceLocation slabFile) {
        createVerticalSlab(
                block,
                new ModelFile.ExistingModelFile(doubleFile, models().existingFileHelper),
                new ModelFile.ExistingModelFile(slabFile, models().existingFileHelper)
        );
    }

    public void createVerticalSlab(DecoVerticalSlab block, ModelFile doubleFile, ModelFile slabFile) {
        getVariantBuilder(block)
                .forAllStates(state -> {
                    if(state.getValue(DecoVerticalSlab.TYPE) == SlabType.DOUBLE) return ConfiguredModel.builder()
                            .modelFile(doubleFile).build();
                    return ConfiguredModel.builder()
                            .modelFile(slabFile).rotationY(((int) DecoVerticalSlab.toDirection(state).toYRot() + 180) % 360).build();
                });
    }
}
