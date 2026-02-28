package net.tier1234.better_deco_building.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.tier1234.better_deco_building.block.entity.DecoChestBlockEntity;

import java.util.function.Supplier;
/**
 * Author: Kaupenjoe
 * */
public class DecoChestBlock extends ChestBlock {
    public DecoChestBlock(Properties properties, Supplier<BlockEntityType<? extends ChestBlockEntity>> supplier) {
        super(properties, supplier);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DecoChestBlockEntity(pos,state);
    }
}
