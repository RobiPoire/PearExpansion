package net.pearadise.pearexpansion.client.datagen.language

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.item.ModItems
import java.util.concurrent.CompletableFuture

/**
 * Fournit les traductions en Toki Pona (tok) pour le mod Pear Expansion.
 *
 * Les chaînes sont basées sur les traductions Toki Pona fournies.
 */
class TokLangProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricLanguageProvider(dataOutput, "tok", registryLookup) {

    override fun generateTranslations(
        wrapperLookup: RegistryWrapper.WrapperLookup,
        translationBuilder: TranslationBuilder
    ) {
        translationBuilder.apply {
            // Groupe d'items
            add("itemGroup.pear_expansion", "Pear Expansion")

            // Items
            add(ModItems.PEAR, "kili pi kasi palisa")
            add(ModItems.GOLDEN_PEAR, "kili seli jelo")
            add(ModItems.ENCHANTED_GOLDEN_PEAR, "kili palisa jelo pi wile pona")

            // Blocs (map + foreach pour ajouter bloc + item)
            val translations = mapOf(
                ModBlocks.ACACIA_VERTICAL_SLAB to "supa pi linja sewi pi kasi seli",
                ModBlocks.ANDESITE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen pimeja walo",
                ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB to "supa pi linja sewi namako pi kasi palisa",
                ModBlocks.BAMBOO_VERTICAL_SLAB to "supa pi linja sewi pi kasi palisa",
                ModBlocks.BIRCH_VERTICAL_SLAB to "supa pi linja sewi pi kasi jelo",
                ModBlocks.BLACKSTONE_VERTICAL_SLAB to "supa pi linja sewi kiwen pimeja",
                ModBlocks.BRICK_VERTICAL_SLAB to "supa pi linja sewi pi kiwen leko loje",
                ModBlocks.CHERRY_VERTICAL_SLAB to "supa pi linja sewi pi kasi suwi",
                ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen anpa nena",
                ModBlocks.COBBLESTONE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen nena",
                ModBlocks.CRIMSON_VERTICAL_SLAB to "supa pi linja sewi pi soko loje",
                ModBlocks.CUT_COPPER_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ante",
                ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ko loje kipisi",
                ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ko kipisi",
                ModBlocks.DARK_OAK_VERTICAL_SLAB to "supa pi linja sewi pi kasi pimeja",
                ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen Prismarine pimeja",
                ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB to "supa pi linja sewi pi kiwen anpa leko",
                ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen anpa pi leko lipu",
                ModBlocks.DIORITE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen walo pimeja",
                ModBlocks.END_STONE_BRICK_VERTICAL_SLAB to "supa pi linja sewi kiwen pi ma End",
                ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ante pi loje ma",
                ModBlocks.GRANITE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen loje",
                ModBlocks.JUNGLE_VERTICAL_SLAB to "supa pi linja sewi pi kasi suli",
                ModBlocks.MANGROVE_VERTICAL_SLAB to "supa pi linja sewi pi kasi telo",
                ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen nena kasi",
                ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB to "supa pi linja sewi pi kiwen leko kasi",
                ModBlocks.MUD_BRICK_VERTICAL_SLAB to "supa pi linja sewi pi kiwen leko ma",
                ModBlocks.NETHER_BRICK_VERTICAL_SLAB to "supa pi linja sewi pi ma Nether",
                ModBlocks.OAK_VERTICAL_SLAB to "supa pi linja sewi pi kasi kili",
                ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ante laso",
                ModBlocks.PALE_OAK_VERTICAL_SLAB to "supa pi linja sewi pi kasi walo",
                ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen pimeja walo pi selo pona",
                ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB to "supa pi linja sewi pi kiwen pimeja leko",
                ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen pimeja pi selo pona",
                ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen anpa pi selo pona",
                ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen walo pimeja pi selo pona",
                ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen loje pi selo pona",
                ModBlocks.POLISHED_TUFF_VERTICAL_SLAB to "supa pi linja sewi pi ko seli kiwen pi selo pona",
                ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB to "supa pi linja sewi pi kiwen leko Prismarine",
                ModBlocks.PRISMARINE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen Prismarine",
                ModBlocks.PURPUR_VERTICAL_SLAB to "supa pi linja sewi pi kiwen Purpur",
                ModBlocks.QUARTZ_VERTICAL_SLAB to "supa pi linja sewi pi kiwen walo",
                ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB to "supa pi linja sewi pi kiwen leko loje pi ma Nether",
                ModBlocks.RED_SANDSTONE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ko loje",
                ModBlocks.RESIN_BRICK_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ko loje",
                ModBlocks.SANDSTONE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ko",
                ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB to "supa pi linja sewi pi kiwen walo pi selo pona",
                ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ko loje pi selo pona",
                ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ko pi selo pona",
                ModBlocks.SMOOTH_STONE_VERTICAL_SLAB to "supa pi linja sewi kiwen pi selo pona",
                ModBlocks.SPRUCE_VERTICAL_SLAB to "supa pi linja sewi pi kasi lete",
                ModBlocks.STONE_BRICK_VERTICAL_SLAB to "supa pi linja sewi pi kiwen leko",
                ModBlocks.STONE_VERTICAL_SLAB to "supa pi linja sewi kiwen",
                ModBlocks.TUFF_BRICK_VERTICAL_SLAB to "supa pi linja sewi pi ko seli kiwen leko",
                ModBlocks.TUFF_VERTICAL_SLAB to "supa pi linja sewi pi ko seli kiwen",
                ModBlocks.WARPED_VERTICAL_SLAB to "supa pi linja sewi pi soko laso",
                ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ante awen",
                ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ante awen pi loje ma",
                ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ante awen laso",
                ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ante awen pi laso lili",
                ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB to "supa pi linja sewi pi kiwen ante pi laso lili"
            )

            translations.forEach { (block, name) ->
                add(block, name)
                add(block.asItem(), name)
            }
        }
    }
}
