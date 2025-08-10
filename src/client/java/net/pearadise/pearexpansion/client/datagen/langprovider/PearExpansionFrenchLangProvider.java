package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides French language translations for the Pear Expansion mod.
 * <p>
 * This class generates the fr_fr language file, adding translations for
 * the item group and custom items introduced by the mod. It extends
 * FabricLanguageProvider to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionFrenchLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new PearExpansionFrenchLangProvider.
     *
     * @param dataOutput     The output destination for generated language data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionFrenchLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "fr_fr", registryLookup);
    }

    /**
     * Generates French translations for the mod.
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

        translationBuilder.add(ModItems.PEAR, "Poire");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Poire dorée");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Poire dorée enchantée");

        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Dalle verticale en acacia");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Dalle verticale en acacia");

        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB, "Dalle verticale d'andésite");
        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asItem(), "Dalle verticale d'andésite");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, "Dalle verticale de mosaïque de bambou");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asItem(), "Dalle verticale de mosaïque de bambou");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, "Dalle verticale bambou");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asItem(), "Dalle verticale bambou");

        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Dalle verticale bouleau");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Dalle verticale bouleau");

        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB, "Dalle verticale pierre noire");
        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asItem(), "Dalle verticale pierre noire");

        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB, "Dalle verticale brique");
        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB.asItem(), "Dalle verticale brique");

        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Dalle verticale cerisier");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Dalle verticale cerisier");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, "Dalle verticale dalles de tuffeau grossier");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asItem(), "Dalle verticale dalles de tuffeau grossier");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB, "Dalle verticale pavé");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asItem(), "Dalle verticale pavé");

        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB, "Dalle verticale bois cramoisi");
        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asItem(), "Dalle verticale bois cramoisi");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB, "Dalle verticale cuivre taillé");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asItem(), "Dalle verticale cuivre taillé");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, "Dalle verticale grès rouge taillé");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asItem(), "Dalle verticale grès rouge taillé");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, "Dalle verticale grès taillé");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asItem(), "Dalle verticale grès taillé");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Dalle verticale en chêne noir");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Dalle verticale en chêne noir");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, "Dalle verticale prismarine sombre");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asItem(), "Dalle verticale prismarine sombre");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, "Dalle verticale brique de tuffeau");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asItem(), "Dalle verticale brique de tuffeau");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, "Dalle verticale dalle de tuffeau");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asItem(), "Dalle verticale dalle de tuffeau");

        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB, "Dalle verticale diorite");
        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB.asItem(), "Dalle verticale diorite");

        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, "Dalle verticale brique de pierre de l'end");
        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB.asItem(), "Dalle verticale brique de pierre de l'end");

        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "Dalle verticale cuivre taillé exposé");
        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asItem(), "Dalle verticale cuivre taillé exposé");

        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB, "Dalle verticale granite");
        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB.asItem(), "Dalle verticale granite");

        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Dalle verticale bois de la jungle");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Dalle verticale bois de la jungle");

        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Dalle verticale bois de mangrove");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Dalle verticale bois de mangrove");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, "Dalle verticale pavé moussu");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asItem(), "Dalle verticale pavé moussu");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, "Dalle verticale brique de pierre moussu");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asItem(), "Dalle verticale brique de pierre moussu");

        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB, "Dalle verticale brique de boue");
        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asItem(), "Dalle verticale brique de boue");

        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, "Dalle verticale brique du Nether");
        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asItem(), "Dalle verticale brique du Nether");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Dalle verticale en chêne");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Dalle verticale en chêne");

        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "Dalle verticale cuivre taillé oxydé");
        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Dalle verticale cuivre taillé oxydé");

        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, "Dalle verticale chêne pâle");
        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB.asItem(), "Dalle verticale chêne pâle");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, "Dalle verticale andésite polie");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asItem(), "Dalle verticale andésite polie");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "Dalle verticale brique de pierre noire polie");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), "Dalle verticale brique de pierre noire polie");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, "Dalle verticale pierre noire polie");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asItem(), "Dalle verticale pierre noire polie");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, "Dalle verticale diorite polie");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asItem(), "Dalle verticale diorite polie");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, "Dalle verticale granite poli");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asItem(), "Dalle verticale granite poli");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, "Dalle verticale tuffeau poli");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asItem(), "Dalle verticale tuffeau poli");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, "Dalle verticale tuf polie");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB.asItem(), "Dalle verticale tuf polie");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, "Dalle verticale brique de prismarine");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asItem(), "Dalle verticale brique de prismarine");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB, "Dalle verticale prismarine");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asItem(), "Dalle verticale prismarine");

        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB, "Dalle verticale purpur");
        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB.asItem(), "Dalle verticale purpur");

        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB, "Dalle verticale quartz");
        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asItem(), "Dalle verticale quartz");

        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, "Dalle verticale brique rouge du Nether");
        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asItem(), "Dalle verticale brique rouge du Nether");

        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, "Dalle verticale grès rouge");
        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asItem(), "Dalle verticale grès rouge");

        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, "Dalle verticale brique de résine");
        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB.asItem(), "Dalle verticale brique de résine");

        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB, "Dalle verticale grès");
        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asItem(), "Dalle verticale grès");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, "Dalle verticale quartz lisse");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asItem(), "Dalle verticale quartz lisse");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "Dalle verticale grès rouge lisse");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asItem(), "Dalle verticale grès rouge lisse");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, "Dalle verticale grès lisse");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asItem(), "Dalle verticale grès lisse");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, "Dalle verticale pierre lisse");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asItem(), "Dalle verticale pierre lisse");

        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Dalle verticale épicéa");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Dalle verticale épicéa");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB, "Dalle verticale brique de pierre");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asItem(), "Dalle verticale brique de pierre");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB, "Dalle verticale pierre");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB.asItem(), "Dalle verticale pierre");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, "Dalle verticale brique de tuf");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB.asItem(), "Dalle verticale brique de tuf");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB, "Dalle verticale tuf");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB.asItem(), "Dalle verticale tuf");

        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB, "Dalle verticale biscornue");
        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB.asItem(), "Dalle verticale biscornue");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, "Dalle verticale cuivre taillé ciré");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asItem(), "Dalle verticale cuivre taillé ciré");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "Dalle verticale cuivre taillé exposé ciré");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), "Dalle verticale cuivre taillé exposé ciré");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "Dalle verticale cuivre taillé oxydé ciré");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Dalle verticale cuivre taillé oxydé ciré");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "Dalle verticale cuivre taillé vieilli ciré");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), "Dalle verticale cuivre taillé vieilli ciré");

        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "Dalle verticale cuivre taillé vieilli");
        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asItem(), "Dalle verticale cuivre taillé vieilli");

    }

}