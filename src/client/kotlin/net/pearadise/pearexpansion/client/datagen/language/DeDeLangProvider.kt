package net.pearadise.pearexpansion.client.datagen.language

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.item.ModItems
import java.util.concurrent.CompletableFuture

/**
 * German language provider for the Pear Expansion mod.
 *
 * Generates the `de_de` language file, adding translations for item groups,
 * custom items, and vertical slab blocks.
 */
class DeDeLangProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricLanguageProvider(dataOutput, "de_de", registryLookup) {

    override fun generateTranslations(
        registryLookup: RegistryWrapper.WrapperLookup,
        translationBuilder: TranslationBuilder
    ) {

        translationBuilder.apply {
            // Item group
            add("itemGroup.pear_expansion", "Pear Expansion")

            // Pear items
            add(ModItems.PEAR, "Birne")
            add(ModItems.GOLDEN_PEAR, "Goldene Birne")
            add(ModItems.ENCHANTED_GOLDEN_PEAR, "Verzauberte Goldene Birne")

            // Vertical slabs (block + item form)
            val translations = mapOf(
                ModBlocks.ACACIA_VERTICAL_SLAB to "Vertikale Akazienholzstufe",
                ModBlocks.ANDESITE_VERTICAL_SLAB to "Vertikale Andesitstufe",
                ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB to "Vertikale Bambusmosaikstufe",
                ModBlocks.BAMBOO_VERTICAL_SLAB to "Vertikale Bambusstufe",
                ModBlocks.BIRCH_VERTICAL_SLAB to "Vertikale Birkenholzstufe",
                ModBlocks.BLACKSTONE_VERTICAL_SLAB to "Vertikale Schwarzsteinstufe",
                ModBlocks.BRICK_VERTICAL_SLAB to "Vertikale Ziegelstufe",
                ModBlocks.CHERRY_VERTICAL_SLAB to "Vertikale Kirschholzstufe",
                ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB to "Vertikale Bruchtiefenschieferstufe",
                ModBlocks.COBBLESTONE_VERTICAL_SLAB to "Vertikale Bruchsteinstufe",
                ModBlocks.CRIMSON_VERTICAL_SLAB to "Vertikale Karmesinstufe",
                ModBlocks.CUT_COPPER_VERTICAL_SLAB to "Vertikale Geschnittene Kupferstufe",
                ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB to "Vertikale Geschnittene rote Sandsteinstufe",
                ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB to "Vertikale Geschnittene Sandsteinstufe",
                ModBlocks.DARK_OAK_VERTICAL_SLAB to "Vertikale Schwarzeichenholzstufe",
                ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB to "Vertikale Dunkle Prismarinstufe",
                ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB to "Vertikale Tiefenschieferziegelstufe",
                ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB to "Vertikale Tiefenschieferfliesenstufe",
                ModBlocks.DIORITE_VERTICAL_SLAB to "Vertikale Dioritstufe",
                ModBlocks.END_STONE_BRICK_VERTICAL_SLAB to "Vertikale Endsteinziegelstufe",
                ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB to "Vertikale Angelaufene geschnittene Kupferstufe",
                ModBlocks.GRANITE_VERTICAL_SLAB to "Vertikale Granitstufe",
                ModBlocks.JUNGLE_VERTICAL_SLAB to "Vertikale Tropenholzstufe",
                ModBlocks.MANGROVE_VERTICAL_SLAB to "Vertikale Mangrovenholzstufe",
                ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB to "Vertikale Bemooste Bruchsteinstufe",
                ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB to "Vertikale Bemooste Steinziegelstufe",
                ModBlocks.MUD_BRICK_VERTICAL_SLAB to "Vertikale Schlammziegelstufe",
                ModBlocks.NETHER_BRICK_VERTICAL_SLAB to "Vertikale Netherziegelstufe",
                ModBlocks.OAK_VERTICAL_SLAB to "Vertikale Eichenholzstufe",
                ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "Vertikale Oxidierte geschnittene Kupferstufe",
                ModBlocks.PALE_OAK_VERTICAL_SLAB to "Vertikale Blasseichenholzstufe",
                ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB to "Vertikale Polierte Andesitstufe",
                ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB to "Vertikale Polierte Schwarzsteinziegelstufe",
                ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB to "Vertikale Polierte Schwarzsteinstufe",
                ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB to "Vertikale Polierte Tiefenschieferstufe",
                ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB to "Vertikale Polierte Dioritstufe",
                ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB to "Vertikale Polierte Granitstufe",
                ModBlocks.POLISHED_TUFF_VERTICAL_SLAB to "Vertikale Polierte Tuffsteinstufe",
                ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB to "Vertikale Prismarinziegelstufe",
                ModBlocks.PRISMARINE_VERTICAL_SLAB to "Vertikale Prismarinstufe",
                ModBlocks.PURPUR_VERTICAL_SLAB to "Vertikale Purpurstufe",
                ModBlocks.QUARTZ_VERTICAL_SLAB to "Vertikale Quarzstufe",
                ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB to "Vertikale Rote Netherziegelstufe",
                ModBlocks.RED_SANDSTONE_VERTICAL_SLAB to "Vertikale Rote Sandsteinstufe",
                ModBlocks.RESIN_BRICK_VERTICAL_SLAB to "Vertikale Harzziegelstufe",
                ModBlocks.SANDSTONE_VERTICAL_SLAB to "Vertikale Sandsteinstufe",
                ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB to "Vertikale Glatte Quarzstufe",
                ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB to "Vertikale Glatte rote Sandsteinstufe",
                ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB to "Vertikale Glatte Sandsteinstufe",
                ModBlocks.SMOOTH_STONE_VERTICAL_SLAB to "Vertikale Glatte Steinstufe",
                ModBlocks.SPRUCE_VERTICAL_SLAB to "Vertikale Fichtenholzstufe",
                ModBlocks.STONE_BRICK_VERTICAL_SLAB to "Vertikale Steinziegelstufe",
                ModBlocks.STONE_VERTICAL_SLAB to "Vertikale Steinstufe",
                ModBlocks.TUFF_BRICK_VERTICAL_SLAB to "Vertikale Tuffsteinziegelstufe",
                ModBlocks.TUFF_VERTICAL_SLAB to "Vertikale Tuffsteinstufe",
                ModBlocks.WARPED_VERTICAL_SLAB to "Vertikale Wirrstufe",
                ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB to "Vertikale Gewachste geschnittene Kupferstufe",
                ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB to "Vertikale Gewachste angelaufene geschnittene Kupferstufe",
                ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "Vertikale Gewachste oxidierte geschnittene Kupferstufe",
                ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB to "Vertikale Gewachste verwitterte geschnittene Kupferstufe",
                ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB to "Vertikale Verwitterte geschnittene Kupferstufe"
            )

            translations.forEach { (block, name) ->
                add(block, name)
                add(block.asItem(), name)
            }
        }
    }
}
