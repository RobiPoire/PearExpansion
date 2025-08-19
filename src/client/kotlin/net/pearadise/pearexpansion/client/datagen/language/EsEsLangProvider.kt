package net.pearadise.pearexpansion.client.datagen.language

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.item.ModItems
import java.util.concurrent.CompletableFuture

/**
 * Fournit les traductions en espagnol (es_es) pour le mod Pear Expansion.
 */
class EsEsLangProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricLanguageProvider(dataOutput, "es_es", registryLookup) {

    override fun generateTranslations(
        wrapperLookup: RegistryWrapper.WrapperLookup,
        translationBuilder: TranslationBuilder
    ) {
        translationBuilder.apply {
            // Groupe d'items
            add("itemGroup.pear_expansion", "Pear Expansion")

            // Items
            add(ModItems.PEAR, "Pera")
            add(ModItems.GOLDEN_PEAR, "Pera Dorada")
            add(ModItems.ENCHANTED_GOLDEN_PEAR, "Pera Dorada Encantada")

            // Blocs (map + foreach pour ajouter bloc + item)
            val translations = mapOf(
                ModBlocks.ACACIA_VERTICAL_SLAB to "Losa vertical de acacia",
                ModBlocks.ANDESITE_VERTICAL_SLAB to "Losa vertical de andesita",
                ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB to "Losa vertical de mosaico de bambú",
                ModBlocks.BAMBOO_VERTICAL_SLAB to "Losa vertical de bambú",
                ModBlocks.BIRCH_VERTICAL_SLAB to "Losa vertical de abedul",
                ModBlocks.BLACKSTONE_VERTICAL_SLAB to "Losa vertical de piedra negra",
                ModBlocks.BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos",
                ModBlocks.CHERRY_VERTICAL_SLAB to "Losa vertical de cerezo",
                ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB to "Losa vertical de pizarra profunda rocosa",
                ModBlocks.COBBLESTONE_VERTICAL_SLAB to "Losa vertical de roca",
                ModBlocks.CRIMSON_VERTICAL_SLAB to "Losa vertical carmesí",
                ModBlocks.CUT_COPPER_VERTICAL_SLAB to "Losa vertical de cobre cortado",
                ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB to "Losa vertical de arenisca roja cortada",
                ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB to "Losa vertical de arenisca cortada",
                ModBlocks.DARK_OAK_VERTICAL_SLAB to "Losa vertical de roble oscuro",
                ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB to "Losa vertical de prismarina oscura",
                ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos de pizarra profunda",
                ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB to "Losa vertical de baldosas de pizarra profunda",
                ModBlocks.DIORITE_VERTICAL_SLAB to "Losa vertical de diorita",
                ModBlocks.END_STONE_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos de piedra del End",
                ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB to "Losa vertical de cobre cortado expuesto",
                ModBlocks.GRANITE_VERTICAL_SLAB to "Losa vertical de granito",
                ModBlocks.JUNGLE_VERTICAL_SLAB to "Losa vertical de jungla",
                ModBlocks.MANGROVE_VERTICAL_SLAB to "Losa vertical de mangle",
                ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB to "Losa vertical de roca musgosa",
                ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos de piedra musgosos",
                ModBlocks.MUD_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos de adobe",
                ModBlocks.NETHER_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos del Nether",
                ModBlocks.OAK_VERTICAL_SLAB to "Losa vertical de roble",
                ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "Losa vertical de cobre cortado oxidado",
                ModBlocks.PALE_OAK_VERTICAL_SLAB to "Losa vertical de roble pálido",
                ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB to "Losa vertical de andesita pulida",
                ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos de piedra negra pulida",
                ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB to "Losa vertical de piedra negra pulida",
                ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB to "Losa vertical de diorita pulida",
                ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB to "Losa vertical de granito pulido",
                ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB to "Losa vertical de pizarra profunda pulida",
                ModBlocks.POLISHED_TUFF_VERTICAL_SLAB to "Losa vertical de toba pulida",
                ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos de prismarina",
                ModBlocks.PRISMARINE_VERTICAL_SLAB to "Losa vertical de prismarina",
                ModBlocks.PURPUR_VERTICAL_SLAB to "Losa vertical de purpur",
                ModBlocks.QUARTZ_VERTICAL_SLAB to "Losa vertical de cuarzo",
                ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos del Nether rojos",
                ModBlocks.RED_SANDSTONE_VERTICAL_SLAB to "Losa vertical de arenisca roja",
                ModBlocks.RESIN_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos de resina",
                ModBlocks.SANDSTONE_VERTICAL_SLAB to "Losa vertical de arenisca",
                ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB to "Losa vertical de cuarzo liso",
                ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB to "Losa vertical de arenisca roja lisa",
                ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB to "Losa vertical de arenisca lisa",
                ModBlocks.SMOOTH_STONE_VERTICAL_SLAB to "Losa vertical de piedra lisa",
                ModBlocks.SPRUCE_VERTICAL_SLAB to "Losa vertical de abeto",
                ModBlocks.STONE_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos de piedra",
                ModBlocks.STONE_VERTICAL_SLAB to "Losa vertical de piedra",
                ModBlocks.TUFF_BRICK_VERTICAL_SLAB to "Losa vertical de ladrillos de toba",
                ModBlocks.TUFF_VERTICAL_SLAB to "Losa vertical de toba",
                ModBlocks.WARPED_VERTICAL_SLAB to "Losa vertical distorsionada",
                ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB to "Losa vertical de cobre cortado encerado",
                ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB to "Losa vertical de cobre cortado expuesto encerado",
                ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB to "Losa vertical de cobre cortado oxidado encerado",
                ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB to "Losa vertical de cobre cortado degradado encerado",
                ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB to "Losa vertical de cobre cortado degradado"
            )

            translations.forEach { add(it.key, it.value) }

        }
    }
}

