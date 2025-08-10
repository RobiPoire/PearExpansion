package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides Italian language translations for the Pear Expansion mod.
 * <p>
 * This class generates the it_it language file, adding translations for
 * the item group and custom items introduced by the mod. It extends
 * FabricLanguageProvider to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionItalianLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new PearExpansionItalianLangProvider.
     *
     * @param dataOutput     The output destination for generated language data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionItalianLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "it_it", registryLookup);
    }

    /**
     * Generates Italian translations for the mod.
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

        translationBuilder.add(ModItems.PEAR, "Pera");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Pera Dorata");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Pera Dorata Incantata");

        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Lastra verticale di acacia");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Lastra verticale di acacia");

        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB, "Lastra verticale di andesite");
        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asItem(), "Lastra verticale di andesite");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, "Lastra verticale di bambù intrecciato");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asItem(), "Lastra verticale di bambù intrecciato");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, "Lastra verticale di bambù");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asItem(), "Lastra verticale di bambù");

        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Lastra verticale di betulla");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Lastra verticale di betulla");

        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB, "Lastra verticale di pietranera");
        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asItem(), "Lastra verticale di pietranera");

        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB, "Lastra verticale di mattoni");
        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB.asItem(), "Lastra verticale di mattoni");

        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Lastra verticale di ciliegio");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Lastra verticale di ciliegio");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, "Lastra verticale di pietrisco di ardesia profonda");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asItem(), "Lastra verticale di pietrisco di ardesia profonda");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB, "Lastra verticale di pietrisco");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asItem(), "Lastra verticale di pietrisco");

        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB, "Lastra verticale cremisi");
        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asItem(), "Lastra verticale cremisi");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB, "Lastra verticale di rame inciso");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asItem(), "Lastra verticale di rame inciso");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, "Lastra verticale di arenaria rossa incisa");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asItem(), "Lastra verticale di arenaria rossa incisa");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, "Lastra verticale di arenaria incisa");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asItem(), "Lastra verticale di arenaria incisa");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Lastra verticale di quercia scura");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Lastra verticale di quercia scura");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, "Lastra verticale di prismarino scuro");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asItem(), "Lastra verticale di prismarino scuro");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, "Lastra verticale di mattoni di ardesia profonda");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asItem(), "Lastra verticale di mattoni di ardesia profonda");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, "Lastra verticale di piastrelle di ardesia profonda");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asItem(), "Lastra verticale di piastrelle di ardesia profonda");

        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB, "Lastra verticale di diorite");
        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB.asItem(), "Lastra verticale di diorite");

        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, "Lastra verticale di mattoni di pietra dell'End");
        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB.asItem(), "Lastra verticale di mattoni di pietra dell'End");

        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "Lastra verticale di rame inciso esposto");
        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asItem(), "Lastra verticale di rame inciso esposto");

        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB, "Lastra verticale di granito");
        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB.asItem(), "Lastra verticale di granito");

        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Lastra verticale della giungla");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Lastra verticale della giungla");

        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Lastra verticale di mangrovia");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Lastra verticale di mangrovia");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, "Lastra verticale di pietrisco muschioso");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asItem(), "Lastra verticale di pietrisco muschioso");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, "Lastra verticale di mattoni di pietra muschiosi");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asItem(), "Lastra verticale di mattoni di pietra muschiosi");

        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB, "Lastra verticale di mattoni di fango");
        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asItem(), "Lastra verticale di mattoni di fango");

        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, "Lastra verticale di mattoni del Nether");
        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asItem(), "Lastra verticale di mattoni del Nether");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Lastra verticale di quercia");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Lastra verticale di quercia");

        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "Lastra verticale di rame inciso ossidato");
        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Lastra verticale di rame inciso ossidato");

        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, "Lastra verticale di quercia pallida");
        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB.asItem(), "Lastra verticale di quercia pallida");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, "Lastra verticale di andesite levigata");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asItem(), "Lastra verticale di andesite levigata");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "Lastra verticale di mattoni di pietranera levigata");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), "Lastra verticale di mattoni di pietranera levigata");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, "Lastra verticale di pietranera levigata");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asItem(), "Lastra verticale di pietranera levigata");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, "Lastra verticale di diorite levigata");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asItem(), "Lastra verticale di diorite levigata");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, "Lastra verticale di granito levigato");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asItem(), "Lastra verticale di granito levigato");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, "Lastra verticale di ardesia profonda levigata");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asItem(), "Lastra verticale di ardesia profonda levigata");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, "Lastra verticale di tufo levigato");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB.asItem(), "Lastra verticale di tufo levigato");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, "Lastra verticale di mattoni di prismarino");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asItem(), "Lastra verticale di mattoni di prismarino");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB, "Lastra verticale di prismarino");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asItem(), "Lastra verticale di prismarino");

        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB, "Lastra verticale di purpur");
        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB.asItem(), "Lastra verticale di purpur");

        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB, "Lastra verticale di quarzo");
        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asItem(), "Lastra verticale di quarzo");

        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, "Lastra verticale di mattoni del Nether rossi");
        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asItem(), "Lastra verticale di mattoni del Nether rossi");

        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, "Lastra verticale di arenaria rossa");
        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asItem(), "Lastra verticale di arenaria rossa");

        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, "Lastra verticale di mattoni di resina");
        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB.asItem(), "Lastra verticale di mattoni di resina");

        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB, "Lastra verticale di arenaria");
        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asItem(), "Lastra verticale di arenaria");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, "Lastra verticale di quarzo liscio");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asItem(), "Lastra verticale di quarzo liscio");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "Lastra verticale di arenaria rossa liscia");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asItem(), "Lastra verticale di arenaria rossa liscia");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, "Lastra verticale di arenaria liscia");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asItem(), "Lastra verticale di arenaria liscia");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, "Lastra verticale di pietra liscia");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asItem(), "Lastra verticale di pietra liscia");

        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Lastra verticale di abete");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Lastra verticale di abete");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB, "Lastra verticale di mattoni di pietra");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asItem(), "Lastra verticale di mattoni di pietra");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB, "Lastra verticale di pietra");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB.asItem(), "Lastra verticale di pietra");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, "Lastra verticale di mattoni di tufo");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB.asItem(), "Lastra verticale di mattoni di tufo");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB, "Lastra verticale di tufo");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB.asItem(), "Lastra verticale di tufo");

        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB, "Lastra verticale distorta");
        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB.asItem(), "Lastra verticale distorta");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, "Lastra verticale di rame inciso cerato");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asItem(), "Lastra verticale di rame inciso cerato");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "Lastra verticale di rame inciso esposto cerato");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), "Lastra verticale di rame inciso esposto cerato");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "Lastra verticale di rame inciso ossidato cerato");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Lastra verticale di rame inciso ossidato cerato");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "Lastra verticale di rame inciso corroso cerato");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), "Lastra verticale di rame inciso corroso cerato");

        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "Lastra verticale di rame inciso corroso");
        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asItem(), "Lastra verticale di rame inciso corroso");

    }

}