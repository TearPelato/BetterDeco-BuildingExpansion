package net.tier1234.better_deco_building.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
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



    //Andesite
    public static final DeferredBlock<Block> ANDESITE_ARRAY_BRICKS = registerBlock("andesite_array_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_MOSAIC_BRICKS = registerBlock("andesite_mosaic_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_MIXED_BRICKS = registerBlock("andesite_mixed_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_ANDESITE = registerBlock("raw_andesite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    //Diorite
    public static final DeferredBlock<Block> DIORITE_ARRAY_BRICKS = registerBlock("diorite_array_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_MOSAIC_BRICKS = registerBlock("diorite_mosaic_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_MIXED_BRICKS = registerBlock("diorite_mixed_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_DIORITE = registerBlock("raw_diorite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    //Granite
    public static final DeferredBlock<Block> GRANITE_ARRAY_BRICKS = registerBlock("granite_array_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_MOSAIC_BRICKS = registerBlock("granite_mosaic_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_MIXED_BRICKS = registerBlock("granite_mixed_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_GRANITE = registerBlock("raw_granite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));






//WOOD


    //Extra wood variants
    //Oak
    public static final DeferredBlock<Block> OAK_VERTICAL_PLANKS = registerBlock("oak_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> OAK_PILED_PLANKS = registerBlock("oak_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> OAK_POLISHED_PLANKS = registerBlock("oak_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));







    //Spruce
    public static final DeferredBlock<Block> SPRUCE_VERTICAL_PLANKS = registerBlock("spruce_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_PILED_PLANKS = registerBlock("spruce_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_POLISHED_PLANKS = registerBlock("spruce_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));




    //Birch
    public static final DeferredBlock<Block> BIRCH_VERTICAL_PLANKS = registerBlock("birch_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_PILED_PLANKS = registerBlock("birch_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_POLISHED_PLANKS = registerBlock("birch_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Jungle
    public static final DeferredBlock<Block> JUNGLE_VERTICAL_PLANKS = registerBlock("jungle_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_PILED_PLANKS = registerBlock("jungle_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_POLISHED_PLANKS = registerBlock("jungle_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Acacia
    public static final DeferredBlock<Block> ACACIA_VERTICAL_PLANKS = registerBlock("acacia_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_PILED_PLANKS = registerBlock("acacia_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_POLISHED_PLANKS = registerBlock("acacia_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Dark Oak
    public static final DeferredBlock<Block> DARK_OAK_VERTICAL_PLANKS = registerBlock("dark_oak_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_PILED_PLANKS = registerBlock("dark_oak_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_POLISHED_PLANKS = registerBlock("dark_oak_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Mangrove
    public static final DeferredBlock<Block> MANGROVE_VERTICAL_PLANKS = registerBlock("mangrove_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_PILED_PLANKS = registerBlock("mangrove_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_POLISHED_PLANKS = registerBlock("mangrove_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Cherry
    public static final DeferredBlock<Block> CHERRY_VERTICAL_PLANKS = registerBlock("cherry_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_PILED_PLANKS = registerBlock("cherry_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_POLISHED_PLANKS = registerBlock("cherry_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Bamboo
    public static final DeferredBlock<Block> BAMBOO_VERTICAL_PLANKS = registerBlock("bamboo_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_PILED_PLANKS = registerBlock("bamboo_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_POLISHED_PLANKS = registerBlock("bamboo_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Crimson
    public static final DeferredBlock<Block> CRIMSON_VERTICAL_PLANKS = registerBlock("crimson_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_PILED_PLANKS = registerBlock("crimson_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_POLISHED_PLANKS = registerBlock("crimson_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Warped
    public static final DeferredBlock<Block> WARPED_VERTICAL_PLANKS = registerBlock("warped_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_PILED_PLANKS = registerBlock("warped_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_POLISHED_PLANKS = registerBlock("warped_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



























    //Bricks
    public static final DeferredBlock<Block> OAK_PLANKS_BRICKS = registerBlock("oak_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_PLANKS_BRICKS = registerBlock("spruce_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_PLANKS_BRICKS = registerBlock("dark_oak_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_PLANKS_BRICKS = registerBlock("birch_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_PLANKS_BRICKS = registerBlock("mangrove_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_PLANKS_BRICKS = registerBlock("cherry_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_PLANKS_BRICKS = registerBlock("bamboo_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_PLANKS_BRICKS = registerBlock("crimson_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_PLANKS_BRICKS = registerBlock("warped_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_PLANKS_BRICKS = registerBlock("acacia_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_PLANKS_BRICKS = registerBlock("jungle_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



    //Pillars
    public static final DeferredBlock<Block> ACACIA_PLANKS_PILLAR = registerBlock("acacia_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> BIRCH_PLANKS_PILLAR = registerBlock("birch_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> BAMBOO_PLANKS_PILLAR = registerBlock("bamboo_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> CHERRY_PLANKS_PILLAR = registerBlock("cherry_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> CRIMSON_PLANKS_PILLAR = registerBlock("crimson_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> SPRUCE_PLANKS_PILLAR = registerBlock("spruce_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> OAK_PLANKS_PILLAR = registerBlock("oak_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> WARPED_PLANKS_PILLAR = registerBlock("warped_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> JUNGLE_PLANKS_PILLAR = registerBlock("jungle_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> MANGROVE_PLANKS_PILLAR = registerBlock("mangrove_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> DARK_OAK_PLANKS_PILLAR = registerBlock("dark_oak_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));




    //Soft Bricks
    public static final DeferredBlock<Block> OAK_SOFT_BRICKS = registerBlock("oak_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_SOFT_BRICKS = registerBlock("dark_oak_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_SOFT_BRICKS = registerBlock("spruce_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_SOFT_BRICKS = registerBlock("birch_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_SOFT_BRICKS = registerBlock("bamboo_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_SOFT_BRICKS = registerBlock("cherry_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_SOFT_BRICKS = registerBlock("mangrove_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_SOFT_BRICKS = registerBlock("jungle_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_SOFT_BRICKS = registerBlock("acacia_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_SOFT_BRICKS = registerBlock("crimson_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_SOFT_BRICKS = registerBlock("warped_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));










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
