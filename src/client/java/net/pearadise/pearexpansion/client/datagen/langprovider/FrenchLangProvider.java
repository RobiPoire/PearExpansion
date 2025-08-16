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
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB, "Dalle verticale en acacia");
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB.asItem(), "Dalle verticale en acacia");

        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB, "Dalle verticale d'andésite");
        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB.asItem(), "Dalle verticale d'andésite");

        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, "Dalle verticale de mosaïque de bambou");
        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.asItem(), "Dalle verticale de mosaïque de bambou");

        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB, "Dalle verticale en bambou");
        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB.asItem(), "Dalle verticale en bambou");

        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB, "Dalle verticale en bouleau");
        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB.asItem(), "Dalle verticale en bouleau");

        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB, "Dalle verticale de roche noire");
        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de roche noire");

        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB, "Dalle verticale de briques");
        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques");

        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB, "Dalle verticale en cerisier");
        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB.asItem(), "Dalle verticale en cerisier");

        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, "Dalle verticale de pierres des abîmes");
        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Dalle verticale de pierres des abîmes");

        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB, "Dalle verticale de pierres");
        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de pierres");

        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB, "Dalle verticale carmin");
        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB.asItem(), "Dalle verticale carmin");

        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé");
        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé");

        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès rouge taillé");
        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès rouge taillé");

        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès taillé");
        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès taillé");

        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB, "Dalle verticale en chêne noir");
        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB.asItem(), "Dalle verticale en chêne noir");

        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, "Dalle verticale de prismarine sombre");
        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB.asItem(), "Dalle verticale de prismarine sombre");

        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, "Dalle verticale d'ardoise des abîmes taillée");
        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale d'ardoise des abîmes taillée");

        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, "Dalle verticale d'ardoise des abîmes carrelée");
        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.asItem(), "Dalle verticale d'ardoise des abîmes carrelée");

        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB, "Dalle verticale de diorite");
        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB.asItem(), "Dalle verticale de diorite");

        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, "Dalle verticale de pierre taillée de l'End");
        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de pierre taillée de l'End");

        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé exposé");
        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé exposé");

        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB, "Dalle verticale de granite");
        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB.asItem(), "Dalle verticale de granite");

        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB, "Dalle verticale en acajou");
        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB.asItem(), "Dalle verticale en acajou");

        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB, "Dalle verticale en palétuvier");
        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB.asItem(), "Dalle verticale en palétuvier");

        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, "Dalle verticale de pierres moussues");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de pierres moussues");

        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, "Dalle verticale de pierre taillée moussue");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de pierre taillée moussue");

        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB, "Dalle verticale de briques de terre crue");
        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques de terre crue");

        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, "Dalle verticale de briques du Nether");
        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques du Nether");

        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB, "Dalle verticale en chêne");
        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB.asItem(), "Dalle verticale en chêne");

        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé oxydé");
        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé oxydé");

        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB, "Dalle verticale en chêne pâle");
        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB.asItem(), "Dalle verticale en chêne pâle");

        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, "Dalle verticale d'andésite polie");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.asItem(), "Dalle verticale d'andésite polie");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, "Dalle verticale de pierre noire taillée");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de pierre noire taillée");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, "Dalle verticale de pierre noire");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de pierre noire");

        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, "Dalle verticale d'ardoise des abîmes polie");
        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Dalle verticale d'ardoise des abîmes polie");

        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, "Dalle verticale de diorite polie");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB.asItem(), "Dalle verticale de diorite polie");

        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, "Dalle verticale de granite poli");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB.asItem(), "Dalle verticale de granite poli");

        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, "Dalle verticale de tuf poli");
        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB.asItem(), "Dalle verticale de tuf poli");

        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, "Dalle verticale de briques de prismarine");
        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques de prismarine");

        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB, "Dalle verticale de prismarine");
        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB.asItem(), "Dalle verticale de prismarine");

        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB, "Dalle verticale de purpur");
        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB.asItem(), "Dalle verticale de purpur");

        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB, "Dalle verticale de quartz");
        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB.asItem(), "Dalle verticale de quartz");

        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, "Dalle verticale de briques rouges du Nether");
        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques rouges du Nether");

        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès rouge");
        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès rouge");

        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB, "Dalle verticale de briques de résine");
        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques de résine");

        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès");
        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès");

        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, "Dalle verticale de quartz lisse");
        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.asItem(), "Dalle verticale de quartz lisse");

        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès rouge lisse");
        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès rouge lisse");

        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès lisse");
        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès lisse");

        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "Dalle verticale de roche lisse");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB.asItem(), "Dalle verticale de roche lisse");

        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB, "Dalle verticale en sapin");
        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB.asItem(), "Dalle verticale en sapin");

        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB, "Dalle verticale de pierre taillée");
        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de pierre taillée");

        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB, "Dalle verticale de roche");
        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB.asItem(), "Dalle verticale de roche");

        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB, "Dalle verticale de tuf taillé");
        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de tuf taillé");

        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB, "Dalle verticale de tuf");
        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB.asItem(), "Dalle verticale de tuf");

        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB, "Dalle verticale biscornue");
        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB.asItem(), "Dalle verticale biscornue");

        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé ciré");
        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé ciré");

        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé exposé ciré");
        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé exposé ciré");

        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé oxydé ciré");
        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé oxydé ciré");

        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé érodé ciré");
        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé érodé ciré");

        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé érodé");
        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé érodé");

    }

}