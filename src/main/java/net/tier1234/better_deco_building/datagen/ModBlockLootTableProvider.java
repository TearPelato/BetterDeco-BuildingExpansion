package net.tier1234.better_deco_building.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.tier1234.better_deco_building.init.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        // Vertical slab
        add(ModBlocks.OAK_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OAK_VERTICAL_SLAB.get()));
        add(ModBlocks.SPRUCE_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SPRUCE_VERTICAL_SLAB.get()));
        add(ModBlocks.BIRCH_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BIRCH_VERTICAL_SLAB.get()));
        add(ModBlocks.JUNGLE_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.JUNGLE_VERTICAL_SLAB.get()));
        add(ModBlocks.ACACIA_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ACACIA_VERTICAL_SLAB.get()));
        add(ModBlocks.DARK_OAK_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_OAK_VERTICAL_SLAB.get()));
        add(ModBlocks.MANGROVE_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MANGROVE_VERTICAL_SLAB.get()));
        add(ModBlocks.CHERRY_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHERRY_VERTICAL_SLAB.get()));
        add(ModBlocks.BAMBOO_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BAMBOO_VERTICAL_SLAB.get()));
        add(ModBlocks.CRIMSON_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRIMSON_VERTICAL_SLAB.get()));
        add(ModBlocks.WARPED_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WARPED_VERTICAL_SLAB.get()));

        dropSelf(ModBlocks.BIG_CHAIN.get());
        dropSelf(ModBlocks.WALL_LANTERN.get());

        //Barrels
        dropSelf(ModBlocks.OAK_BARREL.get());
        dropSelf(ModBlocks.BIRCH_BARREL.get());
        dropSelf(ModBlocks.JUNGLE_BARREL.get());
        dropSelf(ModBlocks.ACACIA_BARREL.get());
        dropSelf(ModBlocks.MANGROVE_BARREL.get());
        dropSelf(ModBlocks.DARK_OAK_BARREL.get());
        dropSelf(ModBlocks.CHERRY_BARREL.get());
        dropSelf(ModBlocks.BAMBOO_BARREL.get());
        dropSelf(ModBlocks.CRIMSON_BARREL.get());
        dropSelf(ModBlocks.WARPED_BARREL.get());

        dropSelf(ModBlocks.OAK_CHEST.get());

        //Andesite
        dropSelf(ModBlocks.ANDESITE_ARRAY_BRICKS.get());
        dropSelf(ModBlocks.ANDESITE_BRICKS.get());
        dropSelf(ModBlocks.ANDESITE_MIXED_BRICKS.get());
        dropSelf(ModBlocks.ANDESITE_MOSAIC_BRICKS.get());
        dropSelf(ModBlocks.RAW_ANDESITE.get());

        //Diorite
        dropSelf(ModBlocks.DIORITE_ARRAY_BRICKS.get());
        dropSelf(ModBlocks.DIORITE_BRICKS.get());
        dropSelf(ModBlocks.DIORITE_MIXED_BRICKS.get());
        dropSelf(ModBlocks.DIORITE_MOSAIC_BRICKS.get());
        dropSelf(ModBlocks.RAW_DIORITE.get());
        //Granite
        dropSelf(ModBlocks.GRANITE_ARRAY_BRICKS.get());
        dropSelf(ModBlocks.GRANITE_BRICKS.get());
        dropSelf(ModBlocks.GRANITE_MIXED_BRICKS.get());
        dropSelf(ModBlocks.GRANITE_MOSAIC_BRICKS.get());
        dropSelf(ModBlocks.RAW_GRANITE.get());


        //Oak Variants

        dropSelf(ModBlocks.OAK_PILED_PLANKS.get());
        dropSelf(ModBlocks.OAK_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.OAK_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.SPRUCE_PILED_PLANKS.get());
        dropSelf(ModBlocks.SPRUCE_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.SPRUCE_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.BIRCH_PILED_PLANKS.get());
        dropSelf(ModBlocks.BIRCH_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.BIRCH_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.JUNGLE_PILED_PLANKS.get());
        dropSelf(ModBlocks.JUNGLE_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.JUNGLE_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.ACACIA_PILED_PLANKS.get());
        dropSelf(ModBlocks.ACACIA_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.ACACIA_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.DARK_OAK_PILED_PLANKS.get());
        dropSelf(ModBlocks.DARK_OAK_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.DARK_OAK_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.MANGROVE_PILED_PLANKS.get());
        dropSelf(ModBlocks.MANGROVE_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.MANGROVE_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.CHERRY_PILED_PLANKS.get());
        dropSelf(ModBlocks.CHERRY_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.CHERRY_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.BAMBOO_PILED_PLANKS.get());
        dropSelf(ModBlocks.BAMBOO_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.BAMBOO_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.CRIMSON_PILED_PLANKS.get());
        dropSelf(ModBlocks.CRIMSON_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.CRIMSON_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.WARPED_PILED_PLANKS.get());
        dropSelf(ModBlocks.WARPED_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.WARPED_VERTICAL_PLANKS.get());





        //Planks Bricks
        dropSelf(ModBlocks.OAK_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.SPRUCE_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.BIRCH_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.JUNGLE_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.MANGROVE_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.DARK_OAK_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.CHERRY_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.BAMBOO_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.CRIMSON_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.WARPED_PLANKS_BRICKS.get());


        //Planks Pillar
        dropSelf(ModBlocks.OAK_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.SPRUCE_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.BIRCH_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.JUNGLE_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.MANGROVE_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.DARK_OAK_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.CHERRY_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.BAMBOO_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.CRIMSON_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.WARPED_PLANKS_PILLAR.get());

        //Planks Soft Bricks
        dropSelf(ModBlocks.OAK_SOFT_BRICKS.get());
        dropSelf(ModBlocks.SPRUCE_SOFT_BRICKS.get());
        dropSelf(ModBlocks.BIRCH_SOFT_BRICKS.get());
        dropSelf(ModBlocks.JUNGLE_SOFT_BRICKS.get());
        dropSelf(ModBlocks.ACACIA_SOFT_BRICKS.get());
        dropSelf(ModBlocks.MANGROVE_SOFT_BRICKS.get());
        dropSelf(ModBlocks.DARK_OAK_SOFT_BRICKS.get());
        dropSelf(ModBlocks.CHERRY_SOFT_BRICKS.get());
        dropSelf(ModBlocks.BAMBOO_SOFT_BRICKS.get());
        dropSelf(ModBlocks.CRIMSON_SOFT_BRICKS.get());
        dropSelf(ModBlocks.WARPED_SOFT_BRICKS.get());

    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

}
