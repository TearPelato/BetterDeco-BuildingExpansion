package net.tier1234.better_deco_building.init;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco_building.Constants;
import net.tier1234.better_deco_building.item.chisel.ChiselItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);

    public static final DeferredItem<Item> IRON_CHISEL = ITEMS.register("iron_chisel",
            ()-> new ChiselItem(new Item.Properties().durability(250)));
    public static final DeferredItem<Item> GOLD_CHISEL = ITEMS.register("gold_chisel",
            ()-> new ChiselItem(new Item.Properties().durability(250)));
    public static final DeferredItem<Item> DIAMOND_CHISEL = ITEMS.register("diamond_chisel",
            ()-> new ChiselItem(new Item.Properties().durability(250)));
    public static final DeferredItem<Item> NETHERITE_CHISEL = ITEMS.register("netherite_chisel",
            ()-> new ChiselItem(new Item.Properties().durability(250)));




    public static void register (IEventBus bus) {
        ITEMS.register(bus);
    }
}
