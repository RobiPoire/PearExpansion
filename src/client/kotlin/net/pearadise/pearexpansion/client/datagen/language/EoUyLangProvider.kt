package net.pearadise.pearexpansion.client.datagen.language

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.item.ModItems
import java.util.concurrent.CompletableFuture

/**
 * Provides Esperanto (`eo_uy`) language translations for the Pear Expansion mod.
 *
 * Generates translation entries for the item group, custom items, and all vertical slab blocks.
 *
 * @constructor Creates a new Esperanto language provider.
 * @param dataOutput The data output for generated files.
 * @param registryLookup Future for registry lookup.
 */
class EoUyLangProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricLanguageProvider(dataOutput, "eo_uy", registryLookup) {

    /**
     * Adds Esperanto translations for the item group, pear items, and all vertical slab blocks.
     *
     * @param registryLookup The registry lookup.
     * @param translationBuilder The builder for adding translations.
     */
    override fun generateTranslations(
        registryLookup: RegistryWrapper.WrapperLookup,
        translationBuilder: TranslationBuilder
    ) {
        translationBuilder.apply {


            // Add translation for the custom item group
            add("itemGroup.pear_expansion", "Pear Expansion")

            // Add translations for pear items
            add(ModItems.PEAR, "Piro")
            add(ModItems.GOLDEN_PEAR, "Ora Piro")
            add(ModItems.ENCHANTED_GOLDEN_PEAR, "Sorĉita Ora Piro")

            // Add translations for all vertical slab blocks and their item forms
            val translations = mapOf(
                ModBlocks.ACACIA_VERTICAL_SLAB to "Vertikala Akacia ŝtupo",
                ModBlocks.ANDESITE_VERTICAL_SLAB to "Vertikala Andezita ŝtupo",
                ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB to "Vertikala Bambumozaika ŝtupo",
                ModBlocks.BAMBOO_VERTICAL_SLAB to "Vertikala Bambua ŝtupo",
                ModBlocks.BIRCH_VERTICAL_SLAB to "Vertikala Betula ŝtupo",
                ModBlocks.BLACKSTONE_VERTICAL_SLAB to "Vertikala Nigroŝtona ŝtupo",
                ModBlocks.BRICK_VERTICAL_SLAB to "Vertikala Brika ŝtupo",
                ModBlocks.CHERRY_VERTICAL_SLAB to "Vertikala Sakura ŝtupo",
                ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB to "Vertikala Pavimardeza ŝtupo",
                ModBlocks.COBBLESTONE_VERTICAL_SLAB to "Vertikala Pavimŝtona ŝtupo",
                ModBlocks.CRIMSON_VERTICAL_SLAB to "Vertikala Skarlata ŝtupo",
                ModBlocks.CUT_COPPER_VERTICAL_SLAB to "Vertikala Tranĉita kupra ŝtupo",
                ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB to "Vertikala Tranĉita ruĝa sabloŝtona ŝtupo",
                ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB to "Vertikala Tranĉita sabloŝtona ŝtupo",
                ModBlocks.DARK_OAK_VERTICAL_SLAB to "Vertikala Malhelkverka ŝtupo",
                ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB to "Vertikala Malhelprismarina ŝtupo",
                ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB to "Vertikala Ardezbrika ŝtupo",
                ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB to "Vertikala Ardeza briketa ŝtupo",
                ModBlocks.DIORITE_VERTICAL_SLAB to "Vertikala Diorita ŝtupo",
                ModBlocks.END_STONE_BRICK_VERTICAL_SLAB to "Vertikala Endŝtonbrika ŝtupo",
                ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB to "Vertikala Verdigreta tranĉita kupra ŝtupo",
                ModBlocks.GRANITE_VERTICAL_SLAB to "Vertikala Granita ŝtupo",
                ModBlocks.JUNGLE_VERTICAL_SLAB to "Vertikala Ĝangalarba ŝtupo",
                ModBlocks.MANGROVE_VERTICAL_SLAB to "Vertikala Mangla ŝtupo",
                ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB to "Vertikala Muska pavimŝtona ŝtupo",
                ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB to "Vertikala Muska ŝtonbrika ŝtupo",
                ModBlocks.MUD_BRICK_VERTICAL_SLAB to "Vertikala Fangobrika ŝtupo",
                ModBlocks.NETHER_BRICK_VERTICAL_SLAB to "Vertikala Netherbrika ŝtupo",
                ModBlocks.OAK_VERTICAL_SLAB to "Vertikala Kverka ŝtupo",
                ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "Vertikala Verdigrega tranĉita kupra ŝtupo",
                ModBlocks.PALE_OAK_VERTICAL_SLAB to "Vertikala Helkverka ŝtupo",
                ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB to "Vertikala Polurita andezita ŝtupo",
                ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB to "Vertikala Polurita nigroŝtonbrika ŝtupo",
                ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB to "Vertikala Polurita nigroŝtona ŝtupo",
                ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB to "Vertikala Polurita ardeza ŝtupo",
                ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB to "Vertikala Polurita diorita ŝtupo",
                ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB to "Vertikala Polurita granita ŝtupo",
                ModBlocks.POLISHED_TUFF_VERTICAL_SLAB to "Vertikala Polurita tofa ŝtupo",
                ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB to "Vertikala Prismarinbrika ŝtupo",
                ModBlocks.PRISMARINE_VERTICAL_SLAB to "Vertikala Prismarina ŝtupo",
                ModBlocks.PURPUR_VERTICAL_SLAB to "Vertikala Purpura ŝtupo",
                ModBlocks.QUARTZ_VERTICAL_SLAB to "Vertikala Kvarca ŝtupo",
                ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB to "Vertikala Ruĝa Netherbrika ŝtupo",
                ModBlocks.RED_SANDSTONE_VERTICAL_SLAB to "Vertikala Ruĝa sabloŝtona ŝtupo",
                ModBlocks.RESIN_BRICK_VERTICAL_SLAB to "Vertikala Rezinbrika ŝtupo",
                ModBlocks.SANDSTONE_VERTICAL_SLAB to "Vertikala Sabloŝtona ŝtupo",
                ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB to "Vertikala Glata kvarca ŝtupo",
                ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB to "Vertikala Glata ruĝa sabloŝtona ŝtupo",
                ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB to "Vertikala Glata sabloŝtona ŝtupo",
                ModBlocks.SMOOTH_STONE_VERTICAL_SLAB to "Vertikala Glata ŝtona ŝtupo",
                ModBlocks.SPRUCE_VERTICAL_SLAB to "Vertikala Picea ŝtupo",
                ModBlocks.STONE_BRICK_VERTICAL_SLAB to "Vertikala Ŝtonbrika ŝtupo",
                ModBlocks.STONE_VERTICAL_SLAB to "Vertikala Ŝtona ŝtupo",
                ModBlocks.TUFF_BRICK_VERTICAL_SLAB to "Vertikala Tofbrika ŝtupo",
                ModBlocks.TUFF_VERTICAL_SLAB to "Vertikala Tofa ŝtupo",
                ModBlocks.WARPED_VERTICAL_SLAB to "Vertikala Torda ŝtupo",
                ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB to "Vertikala Vaksita tranĉita kupra ŝtupo",
                ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB to "Vertikala Vaksita verdigreta tranĉita kupra ŝtupo",
                ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "Vertikala Vaksita verdigrega tranĉita kupra ŝtupo",
                ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB to "Vertikala Vaksita verdigra tranĉita kupra ŝtupo",
                ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB to "Vertikala Verdigra tranĉita kupra ŝtupo"
            )

            translations.forEach { add(it.key, it.value) }
        }
    }
}