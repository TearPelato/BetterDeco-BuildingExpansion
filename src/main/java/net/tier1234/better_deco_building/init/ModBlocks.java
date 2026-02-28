package net.tier1234.better_deco_building.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco_building.Constants;
import net.tier1234.better_deco_building.block.custom.DecoBarrelBlock;
import net.tier1234.better_deco_building.block.custom.DecoChestBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);


    /** Author: Tier1234
     * Custom Barrels
     **/
    public static final DeferredBlock<DecoBarrelBlock> OAK_BARREL = registerBlock("oak_barrel",
            ()-> new DecoBarrelBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<DecoBarrelBlock> BIRCH_BARREL = registerBlock("birch_barrel",
            ()-> new DecoBarrelBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<DecoBarrelBlock> JUNGLE_BARREL = registerBlock("jungle_barrel",
            ()-> new DecoBarrelBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<DecoBarrelBlock> ACACIA_BARREL = registerBlock("acacia_barrel",
            ()-> new DecoBarrelBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<DecoBarrelBlock> DARK_OAK_BARREL = registerBlock("dark_oak_barrel",
            ()-> new DecoBarrelBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<DecoBarrelBlock> MANGROVE_BARREL = registerBlock("mangrove_barrel",
            ()-> new DecoBarrelBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<DecoBarrelBlock> CHERRY_BARREL = registerBlock("cherry_barrel",
            ()-> new DecoBarrelBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<DecoBarrelBlock> BAMBOO_BARREL = registerBlock("bamboo_barrel",
            ()-> new DecoBarrelBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<DecoBarrelBlock> CRIMSON_BARREL = registerBlock("crimson_barrel",
            ()-> new DecoBarrelBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<DecoBarrelBlock> WARPED_BARREL = registerBlock("warped_barrel",
            ()-> new DecoBarrelBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion().requiresCorrectToolForDrops()));

    /** Author: Tier1234
     * Custom Chest
     **/

    public static final DeferredBlock<DecoChestBlock> OAK_CHEST = registerBlock("oak_chest",
            ()-> new DecoChestBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHEST), () -> ModBlockEntities.CUSTOM_CHEST_BE.get()));




















    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
