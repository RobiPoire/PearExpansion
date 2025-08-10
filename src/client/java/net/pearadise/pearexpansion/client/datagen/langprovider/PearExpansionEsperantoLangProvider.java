package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides Esperanto language translations for the Pear Expansion mod.
 * <p>
 * This class generates the eo_uy language file, adding translations for
 * item group names and custom items introduced by the mod. It extends
 * FabricLanguageProvider to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionEsperantoLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new PearExpansionEsperantoLangProvider.
     *
     * @param dataOutput     The output destination for generated language data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionEsperantoLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "eo_uy", registryLookup);
    }

    /**
     * Generates Esperanto translations for the mod.
     * <p>
     * Adds translation entries for the item group and all custom pear items.
     * This method is called during data generation.
     * </p>
     *
     * @param wrapperLookup      The registry lookup used for translation.
     * @param translationBuilder The builder used to add translation entries.
     */
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion");

        translationBuilder.add(ModItems.PEAR, "Piro");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Ora Piro");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Sorĉita Ora Piro");

        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Vertikala akacio tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Vertikala akacio tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB, "Vertikala andesito tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asItem(), "Vertikala andesito tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, "Vertikala bambuo mozaiko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asItem(), "Vertikala bambuo mozaiko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, "Vertikala bambuo tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asItem(), "Vertikala bambuo tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Vertikala betulo tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Vertikala betulo tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB, "Vertikala nigraŝtono tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asItem(), "Vertikala nigraŝtono tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB, "Vertikala briko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB.asItem(), "Vertikala briko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Vertikala ceriso tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Vertikala ceriso tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, "Vertikala ŝtonbriko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asItem(), "Vertikala ŝtonbriko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB, "Vertikala ŝtonpavima tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asItem(), "Vertikala ŝtonpavima tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB, "Vertikala ruĝa tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asItem(), "Vertikala ruĝa tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB, "Vertikala tranĉita kupro tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asItem(), "Vertikala tranĉita kupro tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, "Vertikala tranĉita ruĝa sabloŝtono tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asItem(), "Vertikala tranĉita ruĝa sabloŝtono tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, "Vertikala tranĉita sabloŝtono tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asItem(), "Vertikala tranĉita sabloŝtono tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Vertikala malhela kverko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Vertikala malhela kverko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, "Vertikala malhela prismarino tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asItem(), "Vertikala malhela prismarino tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, "Vertikala ŝtonbriko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asItem(), "Vertikala ŝtonbriko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, "Vertikala ŝtonplato tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asItem(), "Vertikala ŝtonplato tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB, "Vertikala diorito tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB.asItem(), "Vertikala diorito tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, "Vertikala finoŝtono briko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB.asItem(), "Vertikala finoŝtono briko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "Vertikala elmontrita tranĉita kupro tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asItem(), "Vertikala elmontrita tranĉita kupro tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB, "Vertikala granito tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB.asItem(), "Vertikala granito tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Vertikala ĝangalo tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Vertikala ĝangalo tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Vertikala mangrovo tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Vertikala mangrovo tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, "Vertikala muska ŝtonpavima tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asItem(), "Vertikala muska ŝtonpavima tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, "Vertikala muska ŝtonbriko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asItem(), "Vertikala muska ŝtonbriko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB, "Vertikala muda briko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asItem(), "Vertikala muda briko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, "Vertikala netera briko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asItem(), "Vertikala netera briko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Vertikala kverko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Vertikala kverko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "Vertikala oksidita tranĉita kupro tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Vertikala oksidita tranĉita kupro tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, "Vertikala pala kverko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB.asItem(), "Vertikala pala kverko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, "Vertikala polurita andesito tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asItem(), "Vertikala polurita andesito tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "Vertikala polurita nigraŝtono briko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), "Vertikala polurita nigraŝtono briko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, "Vertikala polurita nigraŝtono tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asItem(), "Vertikala polurita nigraŝtono tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, "Vertikala polurita diorito tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asItem(), "Vertikala polurita diorito tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, "Vertikala polurita granito tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asItem(), "Vertikala polurita granito tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, "Vertikala polurita ŝtonplato tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asItem(), "Vertikala polurita ŝtonplato tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, "Vertikala polurita tuf tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB.asItem(), "Vertikala polurita tuf tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, "Vertikala prismarino briko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asItem(), "Vertikala prismarino briko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB, "Vertikala prismarino tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asItem(), "Vertikala prismarino tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB, "Vertikala purpuro tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB.asItem(), "Vertikala purpuro tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB, "Vertikala kvarco tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asItem(), "Vertikala kvarco tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, "Vertikala ruĝa netera briko tabulo");
        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asItem(), "Vertikala ruĝa netera briko tabulo");

        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, "Vertikala ruĝa sabloŝtono slabo");
        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asItem(), "Vertikala ruĝa sabloŝtono slabo");

        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, "Vertikala rezina briko slabo");
        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB.asItem(), "Vertikala rezina briko slabo");

        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB, "Vertikala sabloŝtono slabo");
        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asItem(), "Vertikala sabloŝtono slabo");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, "Vertikala glata kvarca slabo");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asItem(), "Vertikala glata kvarca slabo");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "Vertikala glata ruĝa sabloŝtono slabo");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asItem(), "Vertikala glata ruĝa sabloŝtono slabo");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, "Vertikala glata sabloŝtono slabo");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asItem(), "Vertikala glata sabloŝtono slabo");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, "Vertikala glata ŝtono slabo");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asItem(), "Vertikala glata ŝtono slabo");

        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Vertikala piceo slabo");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Vertikala piceo slabo");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB, "Vertikala ŝtonbriko slabo");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asItem(), "Vertikala ŝtonbriko slabo");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB, "Vertikala ŝtono slabo");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB.asItem(), "Vertikala ŝtono slabo");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, "Vertikala tufbriko slabo");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB.asItem(), "Vertikala tufbriko slabo");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB, "Vertikala tufŝtono slabo");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB.asItem(), "Vertikala tufŝtono slabo");

        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB, "Vertikala tordita ligna slabo");
        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB.asItem(), "Vertikala tordita ligna slabo");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, "Vertikala vaksiĝinta tranĉita kupro slabo");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asItem(), "Vertikala vaksiĝinta tranĉita kupro slabo");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "Vertikala vaksiĝinta elmontrita tranĉita kupro slabo");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), "Vertikala vaksiĝinta elmontrita tranĉita kupro slabo");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "Vertikala vaksiĝinta oksidita tranĉita kupro slabo");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Vertikala vaksiĝinta oksidita tranĉita kupro slabo");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "Vertikala vaksiĝinta veterita tranĉita kupro slabo");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), "Vertikala vaksiĝinta veterita tranĉita kupro slabo");

        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "Vertikala veterita tranĉita kupro slabo");
        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asItem(), "Vertikala veterita tranĉita kupro slabo");
    }
}