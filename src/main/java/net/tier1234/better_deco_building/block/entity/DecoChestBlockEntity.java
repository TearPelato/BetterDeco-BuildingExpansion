package net.tier1234.better_deco_building.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.tier1234.better_deco_building.init.ModBlockEntities;
/**
 * Author: Kaupenjoe
 * */
public class DecoChestBlockEntity extends ChestBlockEntity {
    public DecoChestBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.CUSTOM_CHEST_BE.get(), pos, blockState);
    }
}
