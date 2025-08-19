package net.pearadise.pearexpansion.client.datagen.language

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.item.ModItems
import java.util.concurrent.CompletableFuture

/**
 * Fournit les traductions en italien (it_it) pour le mod Pear Expansion.
 */
class ItItLangProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricLanguageProvider(dataOutput, "it_it", registryLookup) {

    override fun generateTranslations(
        wrapperLookup: RegistryWrapper.WrapperLookup,
        translationBuilder: TranslationBuilder
    ) {
        translationBuilder.apply {
            // Groupe d'items
            add("itemGroup.pear_expansion", "Pear Expansion")

            // Items
            add(ModItems.PEAR, "Pera")
            add(ModItems.GOLDEN_PEAR, "Pera Dorata")
            add(ModItems.ENCHANTED_GOLDEN_PEAR, "Pera Dorata Incantata")

            // Blocs (map + foreach pour ajouter bloc + item)
            val translations = mapOf(
                ModBlocks.ACACIA_VERTICAL_SLAB to "Lastra verticale di acacia",
                ModBlocks.ANDESITE_VERTICAL_SLAB to "Lastra verticale di andesite",
                ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB to "Lastra verticale di bambù intrecciato",
                ModBlocks.BAMBOO_VERTICAL_SLAB to "Lastra verticale di bambù",
                ModBlocks.BIRCH_VERTICAL_SLAB to "Lastra verticale di betulla",
                ModBlocks.BLACKSTONE_VERTICAL_SLAB to "Lastra verticale di pietranera",
                ModBlocks.BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni",
                ModBlocks.CHERRY_VERTICAL_SLAB to "Lastra verticale di ciliegio",
                ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB to "Lastra verticale di pietrisco di ardesia profonda",
                ModBlocks.COBBLESTONE_VERTICAL_SLAB to "Lastra verticale di pietrisco",
                ModBlocks.CRIMSON_VERTICAL_SLAB to "Lastra verticale cremisi",
                ModBlocks.CUT_COPPER_VERTICAL_SLAB to "Lastra verticale di rame inciso",
                ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB to "Lastra verticale di arenaria rossa incisa",
                ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB to "Lastra verticale di arenaria incisa",
                ModBlocks.DARK_OAK_VERTICAL_SLAB to "Lastra verticale di quercia scura",
                ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB to "Lastra verticale di prismarino scuro",
                ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni di ardesia profonda",
                ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB to "Lastra verticale di piastrelle di ardesia profonda",
                ModBlocks.DIORITE_VERTICAL_SLAB to "Lastra verticale di diorite",
                ModBlocks.END_STONE_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni di pietra dell'End",
                ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB to "Lastra verticale di rame inciso esposto",
                ModBlocks.GRANITE_VERTICAL_SLAB to "Lastra verticale di granito",
                ModBlocks.JUNGLE_VERTICAL_SLAB to "Lastra verticale della giungla",
                ModBlocks.MANGROVE_VERTICAL_SLAB to "Lastra verticale di mangrovia",
                ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB to "Lastra verticale di pietrisco muschioso",
                ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni di pietra muschiosi",
                ModBlocks.MUD_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni di fango",
                ModBlocks.NETHER_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni del Nether",
                ModBlocks.OAK_VERTICAL_SLAB to "Lastra verticale di quercia",
                ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "Lastra verticale di rame inciso ossidato",
                ModBlocks.PALE_OAK_VERTICAL_SLAB to "Lastra verticale di quercia pallida",
                ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB to "Lastra verticale di andesite levigata",
                ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni di pietranera levigata",
                ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB to "Lastra verticale di pietranera levigata",
                ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB to "Lastra verticale di diorite levigata",
                ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB to "Lastra verticale di granito levigato",
                ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB to "Lastra verticale di ardesia profonda levigata",
                ModBlocks.POLISHED_TUFF_VERTICAL_SLAB to "Lastra verticale di tufo levigato",
                ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni di prismarino",
                ModBlocks.PRISMARINE_VERTICAL_SLAB to "Lastra verticale di prismarino",
                ModBlocks.PURPUR_VERTICAL_SLAB to "Lastra verticale di purpur",
                ModBlocks.QUARTZ_VERTICAL_SLAB to "Lastra verticale di quarzo",
                ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni del Nether rossi",
                ModBlocks.RED_SANDSTONE_VERTICAL_SLAB to "Lastra verticale di arenaria rossa",
                ModBlocks.RESIN_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni di resina",
                ModBlocks.SANDSTONE_VERTICAL_SLAB to "Lastra verticale di arenaria",
                ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB to "Lastra verticale di quarzo liscio",
                ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB to "Lastra verticale di arenaria rossa liscia",
                ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB to "Lastra verticale di arenaria liscia",
                ModBlocks.SMOOTH_STONE_VERTICAL_SLAB to "Lastra verticale di pietra liscia",
                ModBlocks.SPRUCE_VERTICAL_SLAB to "Lastra verticale di abete",
                ModBlocks.STONE_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni di pietra",
                ModBlocks.STONE_VERTICAL_SLAB to "Lastra verticale di pietra",
                ModBlocks.TUFF_BRICK_VERTICAL_SLAB to "Lastra verticale di mattoni di tufo",
                ModBlocks.TUFF_VERTICAL_SLAB to "Lastra verticale di tufo",
                ModBlocks.WARPED_VERTICAL_SLAB to "Lastra verticale distorta",
                ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB to "Lastra verticale di rame inciso cerato",
                ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB to "Lastra verticale di rame inciso esposto cerato",
                ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "Lastra verticale di rame inciso ossidato cerato",
                ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB to "Lastra verticale di rame inciso corroso cerato",
                ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB to "Lastra verticale di rame inciso corroso"
            )

            translations.forEach { add(it.key, it.value) }
        }
    }
}
