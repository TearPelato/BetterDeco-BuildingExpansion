package net.tier1234.better_deco_building.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco_building.Constants;
import net.tier1234.better_deco_building.block.custom.*;

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





    //VERTICAL SLABS
    public static final DeferredBlock<DecoVerticalSlab> OAK_VERTICAL_SLAB = registerBlock("oak_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<DecoVerticalSlab> SPRUCE_VERTICAL_SLAB = registerBlock("spruce_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<DecoVerticalSlab> BIRCH_VERTICAL_SLAB = registerBlock("birch_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<DecoVerticalSlab> JUNGLE_VERTICAL_SLAB = registerBlock("jungle_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<DecoVerticalSlab> ACACIA_VERTICAL_SLAB = registerBlock("acacia_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<DecoVerticalSlab> DARK_OAK_VERTICAL_SLAB = registerBlock("dark_oak_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<DecoVerticalSlab> MANGROVE_VERTICAL_SLAB = registerBlock("mangrove_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<DecoVerticalSlab> CHERRY_VERTICAL_SLAB = registerBlock("cherry_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<DecoVerticalSlab> BAMBOO_VERTICAL_SLAB = registerBlock("bamboo_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<DecoVerticalSlab> CRIMSON_VERTICAL_SLAB = registerBlock("crimson_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<DecoVerticalSlab> WARPED_VERTICAL_SLAB = registerBlock("warped_vertical_slab",
            ()-> new DecoVerticalSlab(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));


   //Usefuls
   public static final DeferredBlock<Block> BIG_CHAIN = registerBlock("big_chain",
        ()-> new DecoChainBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion().sound(SoundType.CHAIN)
        ));
    public static final DeferredBlock<Block> WALL_LANTERN = registerBlock("wall_lantern",
            ()-> new DecoWallLantern(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.LANTERN).lightLevel(state -> 15)));















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
