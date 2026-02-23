package net.tier1234.better_deco_building.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco_building.Constants;
import net.tier1234.better_deco_building.creative_tabs.BundledTabs;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, Constants.MOD_ID);


    public static final
    Supplier<CreativeModeTab> BETTER_DECO = CREATIVE_MODE_TAB.register(
            "better_deco_buildings",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
                    .withSearchBar()
                    .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".main"))
                    .icon(() -> new ItemStack(Blocks.BARREL))
                    .displayItems((parameters, output) -> {
                        var provider = parameters.holders();
                        List<BundledTabs> filters = ModBundledTabs.getFilters();
                        Collections.reverse(filters);
                        filters.forEach(tab -> tab.populate(provider));
                        filters.stream()
                                .flatMap(filter -> filter.getDisplayItems().stream())
                                .forEach(output::accept);
                    })
                    .build()
    );



    public static void register(IEventBus bus) {
        CREATIVE_MODE_TAB.register(bus);
    }
}
