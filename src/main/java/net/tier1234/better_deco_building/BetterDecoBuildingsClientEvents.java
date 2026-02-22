package net.tier1234.better_deco_building;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Constants.MOD_ID, value = Dist.CLIENT)
public class BetterDecoBuildingsClientEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

    }
}
