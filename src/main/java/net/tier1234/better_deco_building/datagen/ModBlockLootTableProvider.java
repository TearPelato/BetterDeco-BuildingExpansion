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




    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

}
