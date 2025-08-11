package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;
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
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock(), "Lastra verticale di acacia");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock().asItem(), "Lastra verticale di acacia");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock(), "Lastra verticale di andesite");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock().asItem(), "Lastra verticale di andesite");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock(), "Lastra verticale di bambù intrecciato");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock().asItem(), "Lastra verticale di bambù intrecciato");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock(), "Lastra verticale di bambù");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock().asItem(), "Lastra verticale di bambù");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock(), "Lastra verticale di betulla");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock().asItem(), "Lastra verticale di betulla");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock(), "Lastra verticale di pietranera");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock().asItem(), "Lastra verticale di pietranera");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock(), "Lastra verticale di ciliegio");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock().asItem(), "Lastra verticale di ciliegio");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock(), "Lastra verticale di pietrisco di ardesia profonda");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock().asItem(), "Lastra verticale di pietrisco di ardesia profonda");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock(), "Lastra verticale di pietrisco");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock().asItem(), "Lastra verticale di pietrisco");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock(), "Lastra verticale cremisi");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock().asItem(), "Lastra verticale cremisi");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock(), "Lastra verticale di rame inciso");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock().asItem(), "Lastra verticale di rame inciso");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock(), "Lastra verticale di arenaria rossa incisa");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock().asItem(), "Lastra verticale di arenaria rossa incisa");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock(), "Lastra verticale di arenaria incisa");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock().asItem(), "Lastra verticale di arenaria incisa");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock(), "Lastra verticale di quercia scura");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock().asItem(), "Lastra verticale di quercia scura");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock(), "Lastra verticale di prismarino scuro");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock().asItem(), "Lastra verticale di prismarino scuro");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni di ardesia profonda");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni di ardesia profonda");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock(), "Lastra verticale di piastrelle di ardesia profonda");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock().asItem(), "Lastra verticale di piastrelle di ardesia profonda");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock(), "Lastra verticale di diorite");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock().asItem(), "Lastra verticale di diorite");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni di pietra dell'End");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni di pietra dell'End");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock(), "Lastra verticale di rame inciso esposto");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock().asItem(), "Lastra verticale di rame inciso esposto");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock(), "Lastra verticale di granito");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock().asItem(), "Lastra verticale di granito");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock(), "Lastra verticale della giungla");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock().asItem(), "Lastra verticale della giungla");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock(), "Lastra verticale di mangrovia");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock().asItem(), "Lastra verticale di mangrovia");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock(), "Lastra verticale di pietrisco muschioso");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock().asItem(), "Lastra verticale di pietrisco muschioso");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni di pietra muschiosi");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni di pietra muschiosi");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni di fango");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni di fango");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni del Nether");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni del Nether");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock(), "Lastra verticale di quercia");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock().asItem(), "Lastra verticale di quercia");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock(), "Lastra verticale di rame inciso ossidato");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock().asItem(), "Lastra verticale di rame inciso ossidato");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock(), "Lastra verticale di quercia pallida");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock().asItem(), "Lastra verticale di quercia pallida");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock(), "Lastra verticale di andesite levigata");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock().asItem(), "Lastra verticale di andesite levigata");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni di pietranera levigata");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni di pietranera levigata");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock(), "Lastra verticale di pietranera levigata");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock().asItem(), "Lastra verticale di pietranera levigata");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock(), "Lastra verticale di diorite levigata");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock().asItem(), "Lastra verticale di diorite levigata");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock(), "Lastra verticale di granito levigato");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock().asItem(), "Lastra verticale di granito levigato");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock(), "Lastra verticale di ardesia profonda levigata");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock().asItem(), "Lastra verticale di ardesia profonda levigata");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock(), "Lastra verticale di tufo levigato");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock().asItem(), "Lastra verticale di tufo levigato");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni di prismarino");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni di prismarino");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock(), "Lastra verticale di prismarino");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock().asItem(), "Lastra verticale di prismarino");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock(), "Lastra verticale di purpur");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock().asItem(), "Lastra verticale di purpur");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock(), "Lastra verticale di quarzo");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock().asItem(), "Lastra verticale di quarzo");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni del Nether rossi");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni del Nether rossi");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock(), "Lastra verticale di arenaria rossa");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock().asItem(), "Lastra verticale di arenaria rossa");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni di resina");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni di resina");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock(), "Lastra verticale di arenaria");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock().asItem(), "Lastra verticale di arenaria");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock(), "Lastra verticale di quarzo liscio");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock().asItem(), "Lastra verticale di quarzo liscio");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock(), "Lastra verticale di arenaria rossa liscia");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock().asItem(), "Lastra verticale di arenaria rossa liscia");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock(), "Lastra verticale di arenaria liscia");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock().asItem(), "Lastra verticale di arenaria liscia");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock(), "Lastra verticale di pietra liscia");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock().asItem(), "Lastra verticale di pietra liscia");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock(), "Lastra verticale di abete");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock().asItem(), "Lastra verticale di abete");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni di pietra");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni di pietra");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock(), "Lastra verticale di pietra");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock().asItem(), "Lastra verticale di pietra");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock(), "Lastra verticale di mattoni di tufo");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock().asItem(), "Lastra verticale di mattoni di tufo");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock(), "Lastra verticale di tufo");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock().asItem(), "Lastra verticale di tufo");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock(), "Lastra verticale distorta");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock().asItem(), "Lastra verticale distorta");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock(), "Lastra verticale di rame inciso cerato");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock().asItem(), "Lastra verticale di rame inciso cerato");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock(), "Lastra verticale di rame inciso esposto cerato");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock().asItem(), "Lastra verticale di rame inciso esposto cerato");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock(), "Lastra verticale di rame inciso ossidato cerato");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock().asItem(), "Lastra verticale di rame inciso ossidato cerato");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock(), "Lastra verticale di rame inciso corroso cerato");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock().asItem(), "Lastra verticale di rame inciso corroso cerato");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock(), "Lastra verticale di rame inciso corroso");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock().asItem(), "Lastra verticale di rame inciso corroso");

    }

}