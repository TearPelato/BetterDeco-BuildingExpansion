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







        ;

    }
}
