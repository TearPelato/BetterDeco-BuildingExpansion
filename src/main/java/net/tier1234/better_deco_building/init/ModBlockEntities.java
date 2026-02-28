package net.tier1234.better_deco_building.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco_building.Constants;
import net.tier1234.better_deco_building.block.entity.DecoBarrelBlockEntity;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Constants.MOD_ID);

    public static final Supplier<BlockEntityType<DecoBarrelBlockEntity>> CUSTOM_BARREL_BE =
            BLOCK_ENTITIES.register("custom_barrel", () ->
                    BlockEntityType.Builder
                            .of(DecoBarrelBlockEntity::new,
                                    ModBlocks.OAK_BARREL.get(),
                                    ModBlocks.BIRCH_BARREL.get(),
                                    ModBlocks.DARK_OAK_BARREL.get(),
                                    ModBlocks.JUNGLE_BARREL.get(),
                                    ModBlocks.ACACIA_BARREL.get(),
                                    ModBlocks.CHERRY_BARREL.get(),
                                    ModBlocks.BAMBOO_BARREL.get(),
                                    ModBlocks.MANGROVE_BARREL.get(),
                                    ModBlocks.CRIMSON_BARREL.get(),
                                    ModBlocks.WARPED_BARREL.get())
                            .build(null)
            );


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
