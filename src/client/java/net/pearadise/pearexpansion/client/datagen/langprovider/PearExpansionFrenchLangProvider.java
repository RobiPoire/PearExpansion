package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;
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
public class PearExpansionFrenchLangProvider extends FabricLanguageProvider {

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
    protected PearExpansionFrenchLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
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
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock(), "Dalle verticale en acacia");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock().asItem(), "Dalle verticale en acacia");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock(), "Dalle verticale d'andésite");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock().asItem(), "Dalle verticale d'andésite");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock(), "Dalle verticale de mosaïque de bambou");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock().asItem(), "Dalle verticale de mosaïque de bambou");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock(), "Dalle verticale en bambou");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock().asItem(), "Dalle verticale en bambou");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock(), "Dalle verticale en bouleau");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock().asItem(), "Dalle verticale en bouleau");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock(), "Dalle verticale de roche noire");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock().asItem(), "Dalle verticale de roche noire");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock(), "Dalle verticale de briques");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de briques");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock(), "Dalle verticale en cerisier");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock().asItem(), "Dalle verticale en cerisier");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock(), "Dalle verticale de pierres des abîmes");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock().asItem(), "Dalle verticale de pierres des abîmes");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock(), "Dalle verticale de pierres");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock().asItem(), "Dalle verticale de pierres");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock(), "Dalle verticale carmin");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock().asItem(), "Dalle verticale carmin");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock(), "Dalle verticale de cuivre taillé");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock().asItem(), "Dalle verticale de cuivre taillé");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock(), "Dalle verticale de grès rouge taillé");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock().asItem(), "Dalle verticale de grès rouge taillé");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock(), "Dalle verticale de grès taillé");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock().asItem(), "Dalle verticale de grès taillé");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock(), "Dalle verticale en chêne noir");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock().asItem(), "Dalle verticale en chêne noir");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock(), "Dalle verticale de prismarine sombre");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock().asItem(), "Dalle verticale de prismarine sombre");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock(), "Dalle verticale d'ardoise des abîmes taillée");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock().asItem(), "Dalle verticale d'ardoise des abîmes taillée");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock(), "Dalle verticale d'ardoise des abîmes carrelée");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock().asItem(), "Dalle verticale d'ardoise des abîmes carrelée");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock(), "Dalle verticale de diorite");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock().asItem(), "Dalle verticale de diorite");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock(), "Dalle verticale de pierre taillée de l'End");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de pierre taillée de l'End");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock(), "Dalle verticale de cuivre taillé exposé");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock().asItem(), "Dalle verticale de cuivre taillé exposé");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock(), "Dalle verticale de granite");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock().asItem(), "Dalle verticale de granite");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock(), "Dalle verticale en acajou");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock().asItem(), "Dalle verticale en acajou");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock(), "Dalle verticale en palétuvier");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock().asItem(), "Dalle verticale en palétuvier");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock(), "Dalle verticale de pierres moussues");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock().asItem(), "Dalle verticale de pierres moussues");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock(), "Dalle verticale de pierre taillée moussue");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de pierre taillée moussue");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock(), "Dalle verticale de briques de terre crue");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de briques de terre crue");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock(), "Dalle verticale de briques du Nether");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de briques du Nether");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock(), "Dalle verticale en chêne");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock().asItem(), "Dalle verticale en chêne");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock(), "Dalle verticale de cuivre taillé oxydé");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock().asItem(), "Dalle verticale de cuivre taillé oxydé");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock(), "Dalle verticale en chêne pâle");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock().asItem(), "Dalle verticale en chêne pâle");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock(), "Dalle verticale d'andésite polie");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock().asItem(), "Dalle verticale d'andésite polie");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock(), "Dalle verticale de pierre noire taillée");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de pierre noire taillée");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock(), "Dalle verticale de pierre noire");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock().asItem(), "Dalle verticale de pierre noire");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock(), "Dalle verticale d'ardoise des abîmes polie");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock().asItem(), "Dalle verticale d'ardoise des abîmes polie");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock(), "Dalle verticale de diorite polie");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock().asItem(), "Dalle verticale de diorite polie");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock(), "Dalle verticale de granite poli");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock().asItem(), "Dalle verticale de granite poli");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock(), "Dalle verticale de tuf poli");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock().asItem(), "Dalle verticale de tuf poli");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock(), "Dalle verticale de briques de prismarine");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de briques de prismarine");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock(), "Dalle verticale de prismarine");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock().asItem(), "Dalle verticale de prismarine");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock(), "Dalle verticale de purpur");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock().asItem(), "Dalle verticale de purpur");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock(), "Dalle verticale de quartz");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock().asItem(), "Dalle verticale de quartz");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock(), "Dalle verticale de briques rouges du Nether");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de briques rouges du Nether");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock(), "Dalle verticale de grès rouge");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock().asItem(), "Dalle verticale de grès rouge");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock(), "Dalle verticale de briques de résine");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de briques de résine");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock(), "Dalle verticale de grès");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock().asItem(), "Dalle verticale de grès");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock(), "Dalle verticale de quartz lisse");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock().asItem(), "Dalle verticale de quartz lisse");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock(), "Dalle verticale de grès rouge lisse");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock().asItem(), "Dalle verticale de grès rouge lisse");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock(), "Dalle verticale de grès lisse");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock().asItem(), "Dalle verticale de grès lisse");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock(), "Dalle verticale de roche lisse");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock().asItem(), "Dalle verticale de roche lisse");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock(), "Dalle verticale en sapin");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock().asItem(), "Dalle verticale en sapin");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock(), "Dalle verticale de pierre taillée");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de pierre taillée");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock(), "Dalle verticale de roche");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock().asItem(), "Dalle verticale de roche");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock(), "Dalle verticale de tuf taillé");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock().asItem(), "Dalle verticale de tuf taillé");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock(), "Dalle verticale de tuf");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock().asItem(), "Dalle verticale de tuf");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock(), "Dalle verticale biscornue");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock().asItem(), "Dalle verticale biscornue");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock(), "Dalle verticale de cuivre taillé ciré");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock().asItem(), "Dalle verticale de cuivre taillé ciré");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock(), "Dalle verticale de cuivre taillé exposé ciré");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock().asItem(), "Dalle verticale de cuivre taillé exposé ciré");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock(), "Dalle verticale de cuivre taillé oxydé ciré");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock().asItem(), "Dalle verticale de cuivre taillé oxydé ciré");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock(), "Dalle verticale de cuivre taillé érodé ciré");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock().asItem(), "Dalle verticale de cuivre taillé érodé ciré");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock(), "Dalle verticale de cuivre taillé érodé");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock().asItem(), "Dalle verticale de cuivre taillé érodé");

    }

}