package net.pearadise.pearexpansion.client.datagen.language

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.item.ModItems
import java.util.concurrent.CompletableFuture

/**
 * Fournit les traductions en français (fr_fr) pour le mod Pear Expansion.
 *
 * Ce provider génère le fichier de langue français via le système de data-gen
 * de Fabric. Il ajoute les entrées pour le groupe d'objets, les items personnalisés
 * et les blocs (ainsi que leurs formes "item").
 */
class FrFrLangProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricLanguageProvider(dataOutput, "fr_fr", registryLookup) {

    override fun generateTranslations(
        wrapperLookup: RegistryWrapper.WrapperLookup,
        translationBuilder: TranslationBuilder
    ) {
        translationBuilder.apply {
            // Groupe d'items
            add("itemGroup.pear_expansion", "Pear Expansion")

            // Items
            add(ModItems.PEAR, "Poire")
            add(ModItems.GOLDEN_PEAR, "Poire dorée")
            add(ModItems.ENCHANTED_GOLDEN_PEAR, "Poire dorée enchantée")

            // Blocs (et leurs formes item)
            add(ModBlocks.ACACIA_VERTICAL_SLAB, "Dalle verticale en acacia")
            add(ModBlocks.ACACIA_VERTICAL_SLAB.asItem(), "Dalle verticale en acacia")

            add(ModBlocks.ANDESITE_VERTICAL_SLAB, "Dalle verticale d'andésite")
            add(ModBlocks.ANDESITE_VERTICAL_SLAB.asItem(), "Dalle verticale d'andésite")

            add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, "Dalle verticale de mosaïque de bambou")
            add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.asItem(), "Dalle verticale de mosaïque de bambou")

            add(ModBlocks.BAMBOO_VERTICAL_SLAB, "Dalle verticale en bambou")
            add(ModBlocks.BAMBOO_VERTICAL_SLAB.asItem(), "Dalle verticale en bambou")

            add(ModBlocks.BIRCH_VERTICAL_SLAB, "Dalle verticale en bouleau")
            add(ModBlocks.BIRCH_VERTICAL_SLAB.asItem(), "Dalle verticale en bouleau")

            add(ModBlocks.BLACKSTONE_VERTICAL_SLAB, "Dalle verticale de roche noire")
            add(ModBlocks.BLACKSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de roche noire")

            add(ModBlocks.BRICK_VERTICAL_SLAB, "Dalle verticale de briques")
            add(ModBlocks.BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques")

            add(ModBlocks.CHERRY_VERTICAL_SLAB, "Dalle verticale en cerisier")
            add(ModBlocks.CHERRY_VERTICAL_SLAB.asItem(), "Dalle verticale en cerisier")

            add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, "Dalle verticale de pierres des abîmes")
            add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Dalle verticale de pierres des abîmes")

            add(ModBlocks.COBBLESTONE_VERTICAL_SLAB, "Dalle verticale de pierres")
            add(ModBlocks.COBBLESTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de pierres")

            add(ModBlocks.CRIMSON_VERTICAL_SLAB, "Dalle verticale carmin")
            add(ModBlocks.CRIMSON_VERTICAL_SLAB.asItem(), "Dalle verticale carmin")

            add(ModBlocks.CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé")
            add(ModBlocks.CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé")

            add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès rouge taillé")
            add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès rouge taillé")

            add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès taillé")
            add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès taillé")

            add(ModBlocks.DARK_OAK_VERTICAL_SLAB, "Dalle verticale en chêne noir")
            add(ModBlocks.DARK_OAK_VERTICAL_SLAB.asItem(), "Dalle verticale en chêne noir")

            add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, "Dalle verticale de prismarine sombre")
            add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB.asItem(), "Dalle verticale de prismarine sombre")

            add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, "Dalle verticale d'ardoise des abîmes taillée")
            add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale d'ardoise des abîmes taillée")

            add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, "Dalle verticale d'ardoise des abîmes carrelée")
            add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.asItem(), "Dalle verticale d'ardoise des abîmes carrelée")

            add(ModBlocks.DIORITE_VERTICAL_SLAB, "Dalle verticale de diorite")
            add(ModBlocks.DIORITE_VERTICAL_SLAB.asItem(), "Dalle verticale de diorite")

            add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, "Dalle verticale de pierre taillée de l'End")
            add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de pierre taillée de l'End")

            add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé exposé")
            add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé exposé")

            add(ModBlocks.GRANITE_VERTICAL_SLAB, "Dalle verticale de granite")
            add(ModBlocks.GRANITE_VERTICAL_SLAB.asItem(), "Dalle verticale de granite")

            add(ModBlocks.JUNGLE_VERTICAL_SLAB, "Dalle verticale en acajou")
            add(ModBlocks.JUNGLE_VERTICAL_SLAB.asItem(), "Dalle verticale en acajou")

            add(ModBlocks.MANGROVE_VERTICAL_SLAB, "Dalle verticale en palétuvier")
            add(ModBlocks.MANGROVE_VERTICAL_SLAB.asItem(), "Dalle verticale en palétuvier")

            add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, "Dalle verticale de pierres moussues")
            add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de pierres moussues")

            add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, "Dalle verticale de pierre taillée moussue")
            add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de pierre taillée moussue")

            add(ModBlocks.MUD_BRICK_VERTICAL_SLAB, "Dalle verticale de briques de terre crue")
            add(ModBlocks.MUD_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques de terre crue")

            add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, "Dalle verticale de briques du Nether")
            add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques du Nether")

            add(ModBlocks.OAK_VERTICAL_SLAB, "Dalle verticale en chêne")
            add(ModBlocks.OAK_VERTICAL_SLAB.asItem(), "Dalle verticale en chêne")

            add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé oxydé")
            add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé oxydé")

            add(ModBlocks.PALE_OAK_VERTICAL_SLAB, "Dalle verticale en chêne pâle")
            add(ModBlocks.PALE_OAK_VERTICAL_SLAB.asItem(), "Dalle verticale en chêne pâle")

            add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, "Dalle verticale d'andésite polie")
            add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.asItem(), "Dalle verticale d'andésite polie")

            add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, "Dalle verticale de pierre noire taillée")
            add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de pierre noire taillée")

            add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, "Dalle verticale de pierre noire")
            add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de pierre noire")

            add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, "Dalle verticale d'ardoise des abîmes polie")
            add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Dalle verticale d'ardoise des abîmes polie")

            add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, "Dalle verticale de diorite polie")
            add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB.asItem(), "Dalle verticale de diorite polie")

            add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, "Dalle verticale de granite poli")
            add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB.asItem(), "Dalle verticale de granite poli")

            add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, "Dalle verticale de tuf poli")
            add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB.asItem(), "Dalle verticale de tuf poli")

            add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, "Dalle verticale de briques de prismarine")
            add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques de prismarine")

            add(ModBlocks.PRISMARINE_VERTICAL_SLAB, "Dalle verticale de prismarine")
            add(ModBlocks.PRISMARINE_VERTICAL_SLAB.asItem(), "Dalle verticale de prismarine")

            add(ModBlocks.PURPUR_VERTICAL_SLAB, "Dalle verticale de purpur")
            add(ModBlocks.PURPUR_VERTICAL_SLAB.asItem(), "Dalle verticale de purpur")

            add(ModBlocks.QUARTZ_VERTICAL_SLAB, "Dalle verticale de quartz")
            add(ModBlocks.QUARTZ_VERTICAL_SLAB.asItem(), "Dalle verticale de quartz")

            add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, "Dalle verticale de briques rouges du Nether")
            add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques rouges du Nether")

            add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès rouge")
            add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès rouge")

            add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB, "Dalle verticale de briques de résine")
            add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de briques de résine")

            add(ModBlocks.SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès")
            add(ModBlocks.SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès")

            add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, "Dalle verticale de quartz lisse")
            add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.asItem(), "Dalle verticale de quartz lisse")

            add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès rouge lisse")
            add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès rouge lisse")

            add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, "Dalle verticale de grès lisse")
            add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.asItem(), "Dalle verticale de grès lisse")

            add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "Dalle verticale de roche lisse")
            add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB.asItem(), "Dalle verticale de roche lisse")

            add(ModBlocks.SPRUCE_VERTICAL_SLAB, "Dalle verticale en sapin")
            add(ModBlocks.SPRUCE_VERTICAL_SLAB.asItem(), "Dalle verticale en sapin")

            add(ModBlocks.STONE_BRICK_VERTICAL_SLAB, "Dalle verticale de pierre taillée")
            add(ModBlocks.STONE_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de pierre taillée")

            add(ModBlocks.STONE_VERTICAL_SLAB, "Dalle verticale de roche")
            add(ModBlocks.STONE_VERTICAL_SLAB.asItem(), "Dalle verticale de roche")

            add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB, "Dalle verticale de tuf taillé")
            add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB.asItem(), "Dalle verticale de tuf taillé")

            add(ModBlocks.TUFF_VERTICAL_SLAB, "Dalle verticale de tuf")
            add(ModBlocks.TUFF_VERTICAL_SLAB.asItem(), "Dalle verticale de tuf")

            add(ModBlocks.WARPED_VERTICAL_SLAB, "Dalle verticale biscornue")
            add(ModBlocks.WARPED_VERTICAL_SLAB.asItem(), "Dalle verticale biscornue")

            add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé ciré")
            add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé ciré")

            add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé exposé ciré")
            add(
                ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(),
                "Dalle verticale de cuivre taillé exposé ciré"
            )

            add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé oxydé ciré")
            add(
                ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(),
                "Dalle verticale de cuivre taillé oxydé ciré"
            )

            add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé érodé ciré")
            add(
                ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(),
                "Dalle verticale de cuivre taillé érodé ciré"
            )

            add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Dalle verticale de cuivre taillé érodé")
            add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Dalle verticale de cuivre taillé érodé")
        }
    }
}