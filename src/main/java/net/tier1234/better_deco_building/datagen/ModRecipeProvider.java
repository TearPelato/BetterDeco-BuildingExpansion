package net.tier1234.better_deco_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.tier1234.better_deco_building.Constants;
import net.tier1234.better_deco_building.init.ModBlocks;
import net.tier1234.better_deco_building.init.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);

    }
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> PLANKS = List.of(Blocks.OAK_PLANKS,
                Blocks.SPRUCE_PLANKS, Blocks.BIRCH_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.ACACIA_PLANKS, Blocks.DARK_OAK_PLANKS,
                Blocks.MANGROVE_PLANKS,Blocks.CHERRY_PLANKS,Blocks.BAMBOO_PLANKS,Blocks.CRIMSON_PLANKS,Blocks.WARPED_PLANKS);

        //Deco
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIG_CHAIN.get())
                .pattern(" # ")
                .pattern(" B ")
                .pattern(" # ")
                .define('B', Blocks.CHAIN.asItem())
                .define('#', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

//Items
        //Chisel
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_CHISEL.get())
                .pattern("   ")
                .pattern(" # ")
                .pattern("B  ")
                .define('B', Items.STICK.asItem())
                .define('#', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_CHISEL.get())
                .pattern("   ")
                .pattern(" # ")
                .pattern("B  ")
                .define('B', Items.STICK.asItem())
                .define('#', Items.GOLD_INGOT.asItem())
                .unlockedBy("has_gold", has(Items.GOLD_INGOT))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_CHISEL.get())
                .pattern("   ")
                .pattern(" # ")
                .pattern("B  ")
                .define('B', Items.STICK.asItem())
                .define('#', Items.DIAMOND.asItem())
                .unlockedBy("has_diamond", has(Items.IRON_INGOT))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeOutput);

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.DIAMOND_CHISEL),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.NETHERITE_CHISEL.get()
                )
                .unlocks("has_custom_template", has(Items.NETHERITE_INGOT))
                .save(recipeOutput, String.valueOf(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "netherite_chisel")));

    }
}
