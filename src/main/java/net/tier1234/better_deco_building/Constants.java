package net.tier1234.better_deco_building;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

public class Constants {

    public static final String MOD_ID = "better_deco_building";
    public static final String MOD_NAME = "Better Deco Building";
    public static final String VERSION = "1.0.0";
    private static final Logger LOGGER = LogUtils.getLogger();


    public static ResourceLocation id (String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

}
