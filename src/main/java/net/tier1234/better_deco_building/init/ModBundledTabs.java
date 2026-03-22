package net.tier1234.better_deco_building.init;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.tier1234.better_deco_building.Constants;
import net.tier1234.better_deco_building.creative_tabs.BundledTabs;

import java.util.ArrayList;
import java.util.List;

/**
 * BundledTabs from VanillaBackport, used with BlackGear's permission.
 * @author BlackGear
 */
public class ModBundledTabs {
    private static final List<BundledTabs> FILTERS = new ArrayList<>();

    public static final BundledTabs ITEMS_AND_TOOLS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab." + Constants.MOD_ID + ".tools.title"))
                    .icon(new ItemStack(ModItems.DIAMOND_CHISEL.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModItems.IRON_CHISEL);
                        output.accept(ModItems.GOLD_CHISEL);
                        output.accept(ModItems.DIAMOND_CHISEL);
                        output.accept(ModItems.NETHERITE_CHISEL);


                    })
                    .build()
    );

    public static final BundledTabs FUNCTIONAL_BLOCKS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.functional_blocks.title"))
                    .icon(new ItemStack(ModBlocks.OAK_BARREL.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.OAK_BARREL);
                        output.accept(Blocks.BARREL);
                        output.accept(ModBlocks.BIRCH_BARREL);
                        output.accept(ModBlocks.JUNGLE_BARREL);
                        output.accept(ModBlocks.ACACIA_BARREL);
                        output.accept(ModBlocks.DARK_OAK_BARREL);
                        output.accept(ModBlocks.MANGROVE_BARREL);
                        output.accept(ModBlocks.CHERRY_BARREL);
                        output.accept(ModBlocks.BAMBOO_BARREL);
                        output.accept(ModBlocks.CRIMSON_BARREL);
                        output.accept(ModBlocks.WARPED_BARREL);

                        output.accept(ModBlocks.OAK_CHEST);

                    })
                    .build()
    );

    public static final BundledTabs BUILDINGS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.buildings.title"))
                    .icon(new ItemStack(ModBlocks.OAK_BARREL.get()))
                    .displayItems((provider, output) -> {

                        output.accept(ModBlocks.OAK_VERTICAL_PLANKS);
                        output.accept(ModBlocks.OAK_PILED_PLANKS);
                        output.accept(ModBlocks.OAK_POLISHED_PLANKS);
                        output.accept(ModBlocks.OAK_PLANKS_BRICKS);
                        output.accept(ModBlocks.OAK_SOFT_BRICKS);
                        output.accept(ModBlocks.OAK_PLANKS_PILLAR);
                        output.accept(ModBlocks.OAK_BARREL);
                        //Spruce
                        output.accept(ModBlocks.SPRUCE_VERTICAL_PLANKS);
                        output.accept(ModBlocks.SPRUCE_PILED_PLANKS);
                        output.accept(ModBlocks.SPRUCE_POLISHED_PLANKS);
                        output.accept(ModBlocks.SPRUCE_PLANKS_BRICKS);
                        output.accept(ModBlocks.SPRUCE_SOFT_BRICKS);
                        output.accept(ModBlocks.SPRUCE_PLANKS_PILLAR);
                        output.accept(Blocks.BARREL);
                        //Birch
                        output.accept(ModBlocks.BIRCH_VERTICAL_PLANKS);
                        output.accept(ModBlocks.BIRCH_PILED_PLANKS);
                        output.accept(ModBlocks.BIRCH_POLISHED_PLANKS);
                        output.accept(ModBlocks.BIRCH_PLANKS_BRICKS);
                        output.accept(ModBlocks.BIRCH_SOFT_BRICKS);
                        output.accept(ModBlocks.BIRCH_PLANKS_PILLAR);
                        output.accept(ModBlocks.BIRCH_BARREL);
                        //Jungle
                        output.accept(ModBlocks.JUNGLE_VERTICAL_PLANKS);
                        output.accept(ModBlocks.JUNGLE_PILED_PLANKS);
                        output.accept(ModBlocks.JUNGLE_POLISHED_PLANKS);
                        output.accept(ModBlocks.JUNGLE_PLANKS_BRICKS);
                        output.accept(ModBlocks.JUNGLE_SOFT_BRICKS);
                        output.accept(ModBlocks.JUNGLE_PLANKS_PILLAR);
                        output.accept(ModBlocks.JUNGLE_BARREL);
                        //Acacia
                        output.accept(ModBlocks.ACACIA_VERTICAL_PLANKS);
                        output.accept(ModBlocks.ACACIA_PILED_PLANKS);
                        output.accept(ModBlocks.ACACIA_POLISHED_PLANKS);
                        output.accept(ModBlocks.ACACIA_PLANKS_BRICKS);
                        output.accept(ModBlocks.ACACIA_SOFT_BRICKS);
                        output.accept(ModBlocks.ACACIA_PLANKS_PILLAR);
                        output.accept(ModBlocks.ACACIA_BARREL);
                        //DarkOak
                        output.accept(ModBlocks.DARK_OAK_VERTICAL_PLANKS);
                        output.accept(ModBlocks.DARK_OAK_PILED_PLANKS);
                        output.accept(ModBlocks.DARK_OAK_POLISHED_PLANKS);
                        output.accept(ModBlocks.DARK_OAK_PLANKS_BRICKS);
                        output.accept(ModBlocks.DARK_OAK_SOFT_BRICKS);
                        output.accept(ModBlocks.DARK_OAK_PLANKS_PILLAR);
                        output.accept(ModBlocks.DARK_OAK_BARREL);
                        //Mangrove
                        output.accept(ModBlocks.MANGROVE_VERTICAL_PLANKS);
                        output.accept(ModBlocks.MANGROVE_PILED_PLANKS);
                        output.accept(ModBlocks.MANGROVE_POLISHED_PLANKS);
                        output.accept(ModBlocks.MANGROVE_PLANKS_BRICKS);
                        output.accept(ModBlocks.MANGROVE_SOFT_BRICKS);
                        output.accept(ModBlocks.MANGROVE_PLANKS_PILLAR);
                        output.accept(ModBlocks.MANGROVE_BARREL);
                        //Cherry
                        output.accept(ModBlocks.CHERRY_VERTICAL_PLANKS);
                        output.accept(ModBlocks.CHERRY_PILED_PLANKS);
                        output.accept(ModBlocks.CHERRY_POLISHED_PLANKS);
                        output.accept(ModBlocks.CHERRY_PLANKS_BRICKS);
                        output.accept(ModBlocks.CHERRY_SOFT_BRICKS);
                        output.accept(ModBlocks.CHERRY_PLANKS_PILLAR);
                        output.accept(ModBlocks.CHERRY_BARREL);
                        //Bamboo
                        output.accept(ModBlocks.BAMBOO_VERTICAL_PLANKS);
                        output.accept(ModBlocks.BAMBOO_PILED_PLANKS);
                        output.accept(ModBlocks.BAMBOO_POLISHED_PLANKS);
                        output.accept(ModBlocks.BAMBOO_PLANKS_BRICKS);
                        output.accept(ModBlocks.BAMBOO_SOFT_BRICKS);
                        output.accept(ModBlocks.BAMBOO_PLANKS_PILLAR);
                        output.accept(ModBlocks.BAMBOO_BARREL);
                        //Crimson
                        output.accept(ModBlocks.CRIMSON_VERTICAL_PLANKS);
                        output.accept(ModBlocks.CRIMSON_PILED_PLANKS);
                        output.accept(ModBlocks.CRIMSON_POLISHED_PLANKS);
                        output.accept(ModBlocks.CRIMSON_PLANKS_BRICKS);
                        output.accept(ModBlocks.CRIMSON_SOFT_BRICKS);
                        output.accept(ModBlocks.CRIMSON_PLANKS_PILLAR);
                        output.accept(ModBlocks.CRIMSON_BARREL);
                        //Warped
                        output.accept(ModBlocks.WARPED_VERTICAL_PLANKS);
                        output.accept(ModBlocks.WARPED_PILED_PLANKS);
                        output.accept(ModBlocks.WARPED_POLISHED_PLANKS);
                        output.accept(ModBlocks.WARPED_PLANKS_BRICKS);
                        output.accept(ModBlocks.WARPED_SOFT_BRICKS);
                        output.accept(ModBlocks.WARPED_PLANKS_PILLAR);
                        output.accept(ModBlocks.WARPED_BARREL);

                        output.accept(ModBlocks.ANDESITE_ARRAY_BRICKS);
                        output.accept(ModBlocks.ANDESITE_MIXED_BRICKS);
                        output.accept(ModBlocks.ANDESITE_MOSAIC_BRICKS);
                        output.accept(ModBlocks.ANDESITE_BRICKS);
                        output.accept(ModBlocks.RAW_ANDESITE);

                        output.accept(ModBlocks.DIORITE_ARRAY_BRICKS);
                        output.accept(ModBlocks.DIORITE_MIXED_BRICKS);
                        output.accept(ModBlocks.DIORITE_MOSAIC_BRICKS);
                        output.accept(ModBlocks.DIORITE_BRICKS);
                        output.accept(ModBlocks.RAW_DIORITE);

                        output.accept(ModBlocks.GRANITE_ARRAY_BRICKS);
                        output.accept(ModBlocks.GRANITE_MIXED_BRICKS);
                        output.accept(ModBlocks.GRANITE_MOSAIC_BRICKS);
                        output.accept(ModBlocks.GRANITE_BRICKS);
                        output.accept(ModBlocks.RAW_GRANITE);

                        output.accept(ModBlocks.OAK_VERTICAL_SLAB);
                        output.accept(ModBlocks.SPRUCE_VERTICAL_SLAB);
                        output.accept(ModBlocks.BIRCH_VERTICAL_SLAB);
                        output.accept(ModBlocks.JUNGLE_VERTICAL_SLAB);
                        output.accept(ModBlocks.ACACIA_VERTICAL_SLAB);
                        output.accept(ModBlocks.DARK_OAK_VERTICAL_SLAB);
                        output.accept(ModBlocks.MANGROVE_VERTICAL_SLAB);
                        output.accept(ModBlocks.CHERRY_VERTICAL_SLAB);
                        output.accept(ModBlocks.BAMBOO_VERTICAL_SLAB);
                        output.accept(ModBlocks.CRIMSON_VERTICAL_SLAB);
                        output.accept(ModBlocks.WARPED_VERTICAL_SLAB);


                    })
                    .build()
    );


    public static final BundledTabs UTILITIES = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab" + Constants.MOD_ID + "utilities.title"))
                    .icon(new ItemStack(ModBlocks.BIG_CHAIN.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.BIG_CHAIN);
                        output.accept(ModBlocks.WALL_LANTERN);

                    })





                    .build()
    );












    public static BundledTabs register(BundledTabs builder) {
        FILTERS.add(builder);
        return builder;
    }

    public static List<BundledTabs> getFilters() {
        return FILTERS;
    }
}