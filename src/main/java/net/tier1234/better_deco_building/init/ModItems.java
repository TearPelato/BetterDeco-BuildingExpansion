package net.tier1234.better_deco_building.init;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco_building.Constants;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(Constants.MOD_ID);




    public static void register (IEventBus bus) {
        ITEMS.register(bus);
    }
}
