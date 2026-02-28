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

    public static final BundledTabs UTILITIES = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab." + Constants.MOD_ID + ".utilities.title"))
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