package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides French language translations for the Pear Expansion mod.
 *
 * <p>
 * This class generates the {@code fr_fr} language file for the mod using Fabric's data generation system.
 * It adds translation entries for the mod's item group, custom items, and all custom blocks.
 * Register this provider in your data generator to ensure French translations are included in generated resources.
 * </p>
 *
 * @author RobiPoire
 * @see FabricLanguageProvider
 * @see ModBlocks
 * @see ModItems
 */
public class FrenchLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new French language provider for Pear Expansion.
     *
     * <p>
     * This constructor is called by the data generator to set up the output and registry lookup.
     * </p>
     *
     * @param dataOutput     the output destination for generated language data (must not be null)
     * @param registryLookup a future providing access to the registry lookup (must not be null)
     */
    protected FrenchLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "fr_fr", registryLookup);
    }

    /**
     * Generates French translations for all mod content.
     *
     * <p>
     * Adds translation entries for the item group, all custom pear items, and all custom vertical slab blocks.
     * This method is called automatically during the Fabric data generation process.
     * </p>
     *
     * @param wrapperLookup      the registry lookup used for translation (provided by Fabric)
     * @param translationBuilder the builder used to add translation entries (must not be null)
     */
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        // Add translation for the custom item group
        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion");

        // Add translations for custom pear items
        translationBuilder.add(ModItems.PEAR, "Poire");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Poire dorée");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Poire dorée enchantée");

        // Add translations for all custom vertical slab blocks and their item forms
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Dalle verticale en acacia");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Dalle verticale en acacia");

        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB, "Dalle verticale d'andésite");
        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asItem(), "Dalle verticale d'andésite");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, "Dalle verticale de mosaïque de bambou");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asItem(), "Dalle verticale de mosaïque de bambou");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, "Dalle verticale en bambou");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asItem(), "Dalle verticale en bambou");

        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Dalle verticale en bouleau");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Dalle verticale en bouleau");

        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB, "Dalle verticale de roche noire");
        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asItem(), "Dalle verticale de roche noire");

        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB, "Dalle verticale de briques");
        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB.asItem(), "Dalle verticale de briques");

        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Dalle verticale en cerisier");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Dalle verticale en cerisier");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, "Dalle verticale de pierres des abîmes");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asItem(), "Dalle verticale de pierres des abîmes");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB, "Dalle verticale de pierres");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asItem(), "Dalle verticale de pierres");

        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB, "Dalle verticale carmin");
        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asItem(), "Dalle verticale carmin");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB, "Dalle verticale de cuivre taillé");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asItem(), "Dalle verticale de cuivre taillé");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, "Dalle verticale de grès rouge taillé");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asItem(), "Dalle verticale de grès rouge taillé");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, "Dalle verticale de grès taillé");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asItem(), "Dalle verticale de grès taillé");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Dalle verticale en chêne noir");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Dalle verticale en chêne noir");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, "Dalle verticale de prismarine sombre");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asItem(), "Dalle verticale de prismarine sombre");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, "Dalle verticale d'ardoise des abîmes taillée");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asItem(), "Dalle verticale d'ardoise des abîmes taillée");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, "Dalle verticale d'ardoise des abîmes carrelée");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asItem(), "Dalle verticale d'ardoise des abîmes carrelée");

        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB, "Dalle verticale de diorite");
        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB.asItem(), "Dalle verticale de diorite");

        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, "Dalle verticale de pierre taillée de l'End");
        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB.asItem(), "Dalle verticale de pierre taillée de l'End");

        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "Dalle verticale de cuivre taillé exposé");
        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asItem(), "Dalle verticale de cuivre taillé exposé");

        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB, "Dalle verticale de granite");
        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB.asItem(), "Dalle verticale de granite");

        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Dalle verticale en acajou");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Dalle verticale en acajou");

        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Dalle verticale en palétuvier");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Dalle verticale en palétuvier");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, "Dalle verticale de pierres moussues");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asItem(), "Dalle verticale de pierres moussues");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, "Dalle verticale de pierre taillée moussue");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asItem(), "Dalle verticale de pierre taillée moussue");

        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB, "Dalle verticale de briques de terre crue");
        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asItem(), "Dalle verticale de briques de terre crue");

        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, "Dalle verticale de briques du Nether");
        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asItem(), "Dalle verticale de briques du Nether");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Dalle verticale en chêne");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Dalle verticale en chêne");

        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "Dalle verticale de cuivre taillé oxydé");
        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Dalle verticale de cuivre taillé oxydé");

        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, "Dalle verticale en chêne pâle");
        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB.asItem(), "Dalle verticale en chêne pâle");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, "Dalle verticale d'andésite polie");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asItem(), "Dalle verticale d'andésite polie");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "Dalle verticale de pierre noire taillée");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), "Dalle verticale de pierre noire taillée");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, "Dalle verticale de pierre noire");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asItem(), "Dalle verticale de pierre noire");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, "Dalle verticale d'ardoise des abîmes polie");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asItem(), "Dalle verticale d'ardoise des abîmes polie");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, "Dalle verticale de diorite polie");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asItem(), "Dalle verticale de diorite polie");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, "Dalle verticale de granite poli");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asItem(), "Dalle verticale de granite poli");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, "Dalle verticale de tuf poli");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB.asItem(), "Dalle verticale de tuf poli");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, "Dalle verticale de briques de prismarine");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asItem(), "Dalle verticale de briques de prismarine");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB, "Dalle verticale de prismarine");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asItem(), "Dalle verticale de prismarine");

        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB, "Dalle verticale de purpur");
        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB.asItem(), "Dalle verticale de purpur");

        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB, "Dalle verticale de quartz");
        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asItem(), "Dalle verticale de quartz");

        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, "Dalle verticale de briques rouges du Nether");
        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asItem(), "Dalle verticale de briques rouges du Nether");

        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, "Dalle verticale de grès rouge");
        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asItem(), "Dalle verticale de grès rouge");

        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, "Dalle verticale de briques de résine");
        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB.asItem(), "Dalle verticale de briques de résine");

        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB, "Dalle verticale de grès");
        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asItem(), "Dalle verticale de grès");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, "Dalle verticale de quartz lisse");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asItem(), "Dalle verticale de quartz lisse");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "Dalle verticale de grès rouge lisse");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asItem(), "Dalle verticale de grès rouge lisse");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, "Dalle verticale de grès lisse");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asItem(), "Dalle verticale de grès lisse");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, "Dalle verticale de roche lisse");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asItem(), "Dalle verticale de roche lisse");

        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Dalle verticale en sapin");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Dalle verticale en sapin");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB, "Dalle verticale de pierre taillée");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asItem(), "Dalle verticale de pierre taillée");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB, "Dalle verticale de roche");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB.asItem(), "Dalle verticale de roche");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, "Dalle verticale de tuf taillé");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB.asItem(), "Dalle verticale de tuf taillé");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB, "Dalle verticale de tuf");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB.asItem(), "Dalle verticale de tuf");

        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB, "Dalle verticale biscornue");
        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB.asItem(), "Dalle verticale biscornue");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, "Dalle verticale de cuivre taillé ciré");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asItem(), "Dalle verticale de cuivre taillé ciré");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "Dalle verticale de cuivre taillé exposé ciré");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), "Dalle verticale de cuivre taillé exposé ciré");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "Dalle verticale de cuivre taillé oxydé ciré");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Dalle verticale de cuivre taillé oxydé ciré");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "Dalle verticale de cuivre taillé érodé ciré");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), "Dalle verticale de cuivre taillé érodé ciré");

        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "Dalle verticale de cuivre taillé érodé");
        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asItem(), "Dalle verticale de cuivre taillé érodé");

    }

}