package net.tier1234.better_deco_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.tier1234.better_deco_building.Constants;
import net.tier1234.better_deco_building.init.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)

        //Barrels
                .add(ModBlocks.OAK_BARREL.get())
                .add(ModBlocks.BIRCH_BARREL.get())
                .add(ModBlocks.JUNGLE_BARREL.get())
                .add(ModBlocks.ACACIA_BARREL.get())
                .add(ModBlocks.MANGROVE_BARREL.get())
                .add(ModBlocks.DARK_OAK_BARREL.get())
                .add(ModBlocks.CHERRY_BARREL.get())
                .add(ModBlocks.BAMBOO_BARREL.get())
                .add(ModBlocks.CRIMSON_BARREL.get())
                .add(ModBlocks.WARPED_BARREL.get())

                //Vertical Slab Planks
                .add(ModBlocks.OAK_VERTICAL_SLAB.get())
                .add(ModBlocks.SPRUCE_VERTICAL_SLAB.get())
                .add(ModBlocks.BIRCH_VERTICAL_SLAB.get())
                .add(ModBlocks.JUNGLE_VERTICAL_SLAB.get())
                .add(ModBlocks.ACACIA_VERTICAL_SLAB.get())
                .add(ModBlocks.DARK_OAK_VERTICAL_SLAB.get())
                .add(ModBlocks.MANGROVE_VERTICAL_SLAB.get())
                .add(ModBlocks.CHERRY_VERTICAL_SLAB.get())
                .add(ModBlocks.BAMBOO_VERTICAL_SLAB.get())
                .add(ModBlocks.CRIMSON_VERTICAL_SLAB.get())
                .add(ModBlocks.WARPED_VERTICAL_SLAB.get())

                //UTILITIES
                .add(ModBlocks.BIG_CHAIN.get())
                .add(ModBlocks.WALL_LANTERN.get())

                //Planks Bricks
                .add(ModBlocks.OAK_PLANKS_BRICKS.get())
                .add(ModBlocks.SPRUCE_PLANKS_BRICKS.get())
                .add(ModBlocks.BIRCH_PLANKS_BRICKS.get())
                .add(ModBlocks.JUNGLE_PLANKS_BRICKS.get())
                .add(ModBlocks.ACACIA_PLANKS_BRICKS.get())
                .add(ModBlocks.MANGROVE_PLANKS_BRICKS.get())
                .add(ModBlocks.DARK_OAK_PLANKS_BRICKS.get())
                .add(ModBlocks.CHERRY_PLANKS_BRICKS.get())
                .add(ModBlocks.BAMBOO_PLANKS_BRICKS.get())
                .add(ModBlocks.CRIMSON_PLANKS_BRICKS.get())
                .add(ModBlocks.WARPED_PLANKS_BRICKS.get())

                //Planks Pillar
                .add(ModBlocks.OAK_PLANKS_PILLAR.get())
                .add(ModBlocks.SPRUCE_PLANKS_PILLAR.get())
                .add(ModBlocks.BIRCH_PLANKS_PILLAR.get())
                .add(ModBlocks.JUNGLE_PLANKS_PILLAR.get())
                .add(ModBlocks.ACACIA_PLANKS_PILLAR.get())
                .add(ModBlocks.MANGROVE_PLANKS_PILLAR.get())
                .add(ModBlocks.DARK_OAK_PLANKS_PILLAR.get())
                .add(ModBlocks.CHERRY_PLANKS_PILLAR.get())
                .add(ModBlocks.BAMBOO_PLANKS_PILLAR.get())
                .add(ModBlocks.CRIMSON_PLANKS_PILLAR.get())
                .add(ModBlocks.WARPED_PLANKS_PILLAR.get())

                //Soft Bricks Planks
                .add(ModBlocks.OAK_SOFT_BRICKS.get())
                .add(ModBlocks.SPRUCE_SOFT_BRICKS.get())
                .add(ModBlocks.BIRCH_SOFT_BRICKS.get())
                .add(ModBlocks.JUNGLE_SOFT_BRICKS.get())
                .add(ModBlocks.ACACIA_SOFT_BRICKS.get())
                .add(ModBlocks.MANGROVE_SOFT_BRICKS.get())
                .add(ModBlocks.DARK_OAK_SOFT_BRICKS.get())
                .add(ModBlocks.CHERRY_SOFT_BRICKS.get())
                .add(ModBlocks.BAMBOO_SOFT_BRICKS.get())
                .add(ModBlocks.CRIMSON_SOFT_BRICKS.get())
                .add(ModBlocks.WARPED_SOFT_BRICKS.get())

                //Planks Additions
                .add(ModBlocks.OAK_PILED_PLANKS.get())
                .add(ModBlocks.OAK_VERTICAL_PLANKS.get())
                .add(ModBlocks.OAK_POLISHED_PLANKS.get())

                .add(ModBlocks.SPRUCE_PILED_PLANKS.get())
                .add(ModBlocks.SPRUCE_VERTICAL_PLANKS.get())
                .add(ModBlocks.SPRUCE_POLISHED_PLANKS.get())

                .add(ModBlocks.BIRCH_PILED_PLANKS.get())
                .add(ModBlocks.BIRCH_VERTICAL_PLANKS.get())
                .add(ModBlocks.BIRCH_POLISHED_PLANKS.get())

                .add(ModBlocks.ACACIA_PILED_PLANKS.get())
                .add(ModBlocks.ACACIA_VERTICAL_PLANKS.get())
                .add(ModBlocks.ACACIA_POLISHED_PLANKS.get())

                .add(ModBlocks.JUNGLE_PILED_PLANKS.get())
                .add(ModBlocks.JUNGLE_VERTICAL_PLANKS.get())
                .add(ModBlocks.JUNGLE_POLISHED_PLANKS.get())

                .add(ModBlocks.DARK_OAK_PILED_PLANKS.get())
                .add(ModBlocks.DARK_OAK_VERTICAL_PLANKS.get())
                .add(ModBlocks.DARK_OAK_POLISHED_PLANKS.get())

                .add(ModBlocks.MANGROVE_PILED_PLANKS.get())
                .add(ModBlocks.MANGROVE_VERTICAL_PLANKS.get())
                .add(ModBlocks.MANGROVE_POLISHED_PLANKS.get())

                .add(ModBlocks.CHERRY_PILED_PLANKS.get())
                .add(ModBlocks.CHERRY_VERTICAL_PLANKS.get())
                .add(ModBlocks.CHERRY_POLISHED_PLANKS.get())

                .add(ModBlocks.BAMBOO_PILED_PLANKS.get())
                .add(ModBlocks.BAMBOO_VERTICAL_PLANKS.get())
                .add(ModBlocks.BAMBOO_POLISHED_PLANKS.get())

                .add(ModBlocks.CRIMSON_PILED_PLANKS.get())
                .add(ModBlocks.CRIMSON_VERTICAL_PLANKS.get())
                .add(ModBlocks.CRIMSON_POLISHED_PLANKS.get())

                .add(ModBlocks.WARPED_PILED_PLANKS.get())
                .add(ModBlocks.WARPED_VERTICAL_PLANKS.get())
                .add(ModBlocks.WARPED_POLISHED_PLANKS.get())
        ;

        tag(BlockTags.MINEABLE_WITH_PICKAXE)

                .add(ModBlocks.ANDESITE_BRICKS.get())
                .add(ModBlocks.ANDESITE_MOSAIC_BRICKS.get())
                .add(ModBlocks.ANDESITE_ARRAY_BRICKS.get())
                .add(ModBlocks.ANDESITE_MIXED_BRICKS.get())
                .add(ModBlocks.RAW_ANDESITE.get())
                //Diorite
                .add(ModBlocks.DIORITE_BRICKS.get())
                .add(ModBlocks.DIORITE_MOSAIC_BRICKS.get())
                .add(ModBlocks.DIORITE_ARRAY_BRICKS.get())
                .add(ModBlocks.DIORITE_MIXED_BRICKS.get())
                .add(ModBlocks.RAW_DIORITE.get())
                //Granite
                .add(ModBlocks.GRANITE_BRICKS.get())
                .add(ModBlocks.GRANITE_MOSAIC_BRICKS.get())
                .add(ModBlocks.GRANITE_ARRAY_BRICKS.get())
                .add(ModBlocks.GRANITE_MIXED_BRICKS.get())
                .add(ModBlocks.RAW_GRANITE.get())





        ;

    }
}
