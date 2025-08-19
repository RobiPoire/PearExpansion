package net.pearadise.pearexpansion.client.datagen.language

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.item.ModItems
import java.util.concurrent.CompletableFuture

/**
 * Provides French (`fr_fr`) translations for the Pear Expansion mod.
 *
 * This provider generates the French language file via Fabric's data-gen system.
 * It adds entries for the item group, the mod items, and all blocks
 * (including their item forms).
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
            // Item group
            add("itemGroup.pear_expansion", "Pear Expansion")

            // Items
            add(ModItems.PEAR, "Poire")
            add(ModItems.GOLDEN_PEAR, "Poire dorée")
            add(ModItems.ENCHANTED_GOLDEN_PEAR, "Poire dorée enchantée")

            // Blocks (map + foreach to add block + item translation)
            val translations = mapOf(
                ModBlocks.ACACIA_VERTICAL_SLAB to "Dalle verticale en acacia",
                ModBlocks.ANDESITE_VERTICAL_SLAB to "Dalle verticale d'andésite",
                ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB to "Dalle verticale de mosaïque de bambou",
                ModBlocks.BAMBOO_VERTICAL_SLAB to "Dalle verticale en bambou",
                ModBlocks.BIRCH_VERTICAL_SLAB to "Dalle verticale en bouleau",
                ModBlocks.BLACKSTONE_VERTICAL_SLAB to "Dalle verticale de roche noire",
                ModBlocks.BRICK_VERTICAL_SLAB to "Dalle verticale de briques",
                ModBlocks.CHERRY_VERTICAL_SLAB to "Dalle verticale en cerisier",
                ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB to "Dalle verticale de pierres des abîmes",
                ModBlocks.COBBLESTONE_VERTICAL_SLAB to "Dalle verticale de pierres",
                ModBlocks.CRIMSON_VERTICAL_SLAB to "Dalle verticale carmin",
                ModBlocks.CUT_COPPER_VERTICAL_SLAB to "Dalle verticale de cuivre taillé",
                ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB to "Dalle verticale de grès rouge taillé",
                ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB to "Dalle verticale de grès taillé",
                ModBlocks.DARK_OAK_VERTICAL_SLAB to "Dalle verticale en chêne noir",
                ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB to "Dalle verticale de prismarine sombre",
                ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB to "Dalle verticale d'ardoise des abîmes taillée",
                ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB to "Dalle verticale d'ardoise des abîmes carrelée",
                ModBlocks.DIORITE_VERTICAL_SLAB to "Dalle verticale de diorite",
                ModBlocks.END_STONE_BRICK_VERTICAL_SLAB to "Dalle verticale de pierre taillée de l'End",
                ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB to "Dalle verticale de cuivre taillé exposé",
                ModBlocks.GRANITE_VERTICAL_SLAB to "Dalle verticale de granite",
                ModBlocks.JUNGLE_VERTICAL_SLAB to "Dalle verticale en acajou",
                ModBlocks.MANGROVE_VERTICAL_SLAB to "Dalle verticale en palétuvier",
                ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB to "Dalle verticale de pierres moussues",
                ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB to "Dalle verticale de pierre taillée moussue",
                ModBlocks.MUD_BRICK_VERTICAL_SLAB to "Dalle verticale de briques de terre crue",
                ModBlocks.NETHER_BRICK_VERTICAL_SLAB to "Dalle verticale de briques du Nether",
                ModBlocks.OAK_VERTICAL_SLAB to "Dalle verticale en chêne",
                ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "Dalle verticale de cuivre taillé oxydé",
                ModBlocks.PALE_OAK_VERTICAL_SLAB to "Dalle verticale en chêne pâle",
                ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB to "Dalle verticale d'andésite polie",
                ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB to "Dalle verticale de pierre noire taillée",
                ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB to "Dalle verticale de pierre noire",
                ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB to "Dalle verticale d'ardoise des abîmes polie",
                ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB to "Dalle verticale de diorite polie",
                ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB to "Dalle verticale de granite poli",
                ModBlocks.POLISHED_TUFF_VERTICAL_SLAB to "Dalle verticale de tuf poli",
                ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB to "Dalle verticale de briques de prismarine",
                ModBlocks.PRISMARINE_VERTICAL_SLAB to "Dalle verticale de prismarine",
                ModBlocks.PURPUR_VERTICAL_SLAB to "Dalle verticale de purpur",
                ModBlocks.QUARTZ_VERTICAL_SLAB to "Dalle verticale de quartz",
                ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB to "Dalle verticale de briques rouges du Nether",
                ModBlocks.RED_SANDSTONE_VERTICAL_SLAB to "Dalle verticale de grès rouge",
                ModBlocks.RESIN_BRICK_VERTICAL_SLAB to "Dalle verticale de briques de résine",
                ModBlocks.SANDSTONE_VERTICAL_SLAB to "Dalle verticale de grès",
                ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB to "Dalle verticale de quartz lisse",
                ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB to "Dalle verticale de grès rouge lisse",
                ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB to "Dalle verticale de grès lisse",
                ModBlocks.SMOOTH_STONE_VERTICAL_SLAB to "Dalle verticale de roche lisse",
                ModBlocks.SPRUCE_VERTICAL_SLAB to "Dalle verticale en sapin",
                ModBlocks.STONE_BRICK_VERTICAL_SLAB to "Dalle verticale de pierre taillée",
                ModBlocks.STONE_VERTICAL_SLAB to "Dalle verticale de roche",
                ModBlocks.TUFF_BRICK_VERTICAL_SLAB to "Dalle verticale de tuf taillé",
                ModBlocks.TUFF_VERTICAL_SLAB to "Dalle verticale de tuf",
                ModBlocks.WARPED_VERTICAL_SLAB to "Dalle verticale biscornue",
                ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB to "Dalle verticale de cuivre taillé ciré",
                ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB to "Dalle verticale de cuivre taillé exposé ciré",
                ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "Dalle verticale de cuivre taillé oxydé ciré",
                ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB to "Dalle verticale de cuivre taillé érodé ciré",
                ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB to "Dalle verticale de cuivre taillé érodé"
            )

            translations.forEach { add(it.key, it.value) }
        }
    }
}
