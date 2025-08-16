package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides Italian language translations for the Pear Expansion mod.
 *
 * <p>
 * This class generates the {@code it_it} language file for the mod using Fabric's data generation system.
 * It adds translations for the item group, custom items, and all custom blocks introduced by the mod.
 * Register this provider in your data generator to include Italian translations in your mod's assets.
 * </p>
 *
 * @author RobiPoire
 * @see FabricLanguageProvider
 * @see ModBlocks
 * @see ModItems
 */
public class ItalianLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new Italian language provider for Pear Expansion.
     *
     * <p>
     * Use this constructor when registering the provider with Fabric's data generator.
     * </p>
     *
     * @param dataOutput     the output destination for generated language data
     * @param registryLookup a future providing access to the registry lookup
     */
    protected ItalianLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "it_it", registryLookup);
    }

    /**
     * Generates Italian translations for all custom items and blocks in the mod.
     *
     * <p>
     * This method is called by the Fabric data generator during the data generation phase.
     * It adds translation entries for the item group, all custom pear items, and all custom vertical slab blocks.
     * </p>
     *
     * @param wrapperLookup      the registry lookup used for translation (not used directly here)
     * @param translationBuilder the builder used to add translation entries
     */
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        // Add translation for the custom item group
        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion");

        // Add translations for custom pear items
        translationBuilder.add(ModItems.PEAR, "Pera");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Pera Dorata");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Pera Dorata Incantata");

        // Add translations for all custom vertical slab blocks and their item forms
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB, "Lastra verticale di acacia");
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB.asItem(), "Lastra verticale di acacia");

        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB, "Lastra verticale di andesite");
        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB.asItem(), "Lastra verticale di andesite");

        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, "Lastra verticale di bambù intrecciato");
        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.asItem(), "Lastra verticale di bambù intrecciato");

        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB, "Lastra verticale di bambù");
        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB.asItem(), "Lastra verticale di bambù");

        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB, "Lastra verticale di betulla");
        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB.asItem(), "Lastra verticale di betulla");

        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB, "Lastra verticale di pietranera");
        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB.asItem(), "Lastra verticale di pietranera");

        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni");
        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni");

        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB, "Lastra verticale di ciliegio");
        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB.asItem(), "Lastra verticale di ciliegio");

        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, "Lastra verticale di pietrisco di ardesia profonda");
        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Lastra verticale di pietrisco di ardesia profonda");

        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB, "Lastra verticale di pietrisco");
        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB.asItem(), "Lastra verticale di pietrisco");

        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB, "Lastra verticale cremisi");
        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB.asItem(), "Lastra verticale cremisi");

        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB, "Lastra verticale di rame inciso");
        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB.asItem(), "Lastra verticale di rame inciso");

        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, "Lastra verticale di arenaria rossa incisa");
        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Lastra verticale di arenaria rossa incisa");

        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, "Lastra verticale di arenaria incisa");
        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB.asItem(), "Lastra verticale di arenaria incisa");

        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB, "Lastra verticale di quercia scura");
        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB.asItem(), "Lastra verticale di quercia scura");

        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, "Lastra verticale di prismarino scuro");
        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB.asItem(), "Lastra verticale di prismarino scuro");

        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni di ardesia profonda");
        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni di ardesia profonda");

        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, "Lastra verticale di piastrelle di ardesia profonda");
        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.asItem(), "Lastra verticale di piastrelle di ardesia profonda");

        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB, "Lastra verticale di diorite");
        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB.asItem(), "Lastra verticale di diorite");

        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni di pietra dell'End");
        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni di pietra dell'End");

        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Lastra verticale di rame inciso esposto");
        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Lastra verticale di rame inciso esposto");

        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB, "Lastra verticale di granito");
        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB.asItem(), "Lastra verticale di granito");

        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB, "Lastra verticale della giungla");
        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB.asItem(), "Lastra verticale della giungla");

        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB, "Lastra verticale di mangrovia");
        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB.asItem(), "Lastra verticale di mangrovia");

        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, "Lastra verticale di pietrisco muschioso");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.asItem(), "Lastra verticale di pietrisco muschioso");

        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni di pietra muschiosi");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni di pietra muschiosi");

        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni di fango");
        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni di fango");

        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni del Nether");
        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni del Nether");

        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB, "Lastra verticale di quercia");
        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB.asItem(), "Lastra verticale di quercia");

        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Lastra verticale di rame inciso ossidato");
        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Lastra verticale di rame inciso ossidato");

        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB, "Lastra verticale di quercia pallida");
        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB.asItem(), "Lastra verticale di quercia pallida");

        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, "Lastra verticale di andesite levigata");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.asItem(), "Lastra verticale di andesite levigata");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni di pietranera levigata");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni di pietranera levigata");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, "Lastra verticale di pietranera levigata");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.asItem(), "Lastra verticale di pietranera levigata");

        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, "Lastra verticale di diorite levigata");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB.asItem(), "Lastra verticale di diorite levigata");

        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, "Lastra verticale di granito levigato");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB.asItem(), "Lastra verticale di granito levigato");

        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, "Lastra verticale di ardesia profonda levigata");
        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Lastra verticale di ardesia profonda levigata");

        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, "Lastra verticale di tufo levigato");
        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB.asItem(), "Lastra verticale di tufo levigato");

        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni di prismarino");
        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni di prismarino");

        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB, "Lastra verticale di prismarino");
        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB.asItem(), "Lastra verticale di prismarino");

        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB, "Lastra verticale di purpur");
        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB.asItem(), "Lastra verticale di purpur");

        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB, "Lastra verticale di quarzo");
        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB.asItem(), "Lastra verticale di quarzo");

        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni del Nether rossi");
        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni del Nether rossi");

        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, "Lastra verticale di arenaria rossa");
        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Lastra verticale di arenaria rossa");

        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni di resina");
        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni di resina");

        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB, "Lastra verticale di arenaria");
        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB.asItem(), "Lastra verticale di arenaria");

        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, "Lastra verticale di quarzo liscio");
        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.asItem(), "Lastra verticale di quarzo liscio");

        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, "Lastra verticale di arenaria rossa liscia");
        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Lastra verticale di arenaria rossa liscia");

        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, "Lastra verticale di arenaria liscia");
        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.asItem(), "Lastra verticale di arenaria liscia");

        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "Lastra verticale di pietra liscia");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB.asItem(), "Lastra verticale di pietra liscia");

        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB, "Lastra verticale di abete");
        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB.asItem(), "Lastra verticale di abete");

        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni di pietra");
        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni di pietra");

        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB, "Lastra verticale di pietra");
        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB.asItem(), "Lastra verticale di pietra");

        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB, "Lastra verticale di mattoni di tufo");
        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB.asItem(), "Lastra verticale di mattoni di tufo");

        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB, "Lastra verticale di tufo");
        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB.asItem(), "Lastra verticale di tufo");

        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB, "Lastra verticale distorta");
        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB.asItem(), "Lastra verticale distorta");

        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, "Lastra verticale di rame inciso cerato");
        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Lastra verticale di rame inciso cerato");

        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Lastra verticale di rame inciso esposto cerato");
        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Lastra verticale di rame inciso esposto cerato");

        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Lastra verticale di rame inciso ossidato cerato");
        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Lastra verticale di rame inciso ossidato cerato");

        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Lastra verticale di rame inciso corroso cerato");
        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Lastra verticale di rame inciso corroso cerato");

        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Lastra verticale di rame inciso corroso");
        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Lastra verticale di rame inciso corroso");

    }

}