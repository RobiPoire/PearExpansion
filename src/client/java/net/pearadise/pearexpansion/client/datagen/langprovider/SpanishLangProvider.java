package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides Spanish language translations for the Pear Expansion mod.
 *
 * <p>
 * This class generates the {@code es_es} language file for the mod using Fabric's data generation system.
 * It adds translation entries for the item group, custom items, and all custom blocks introduced by the mod.
 * Register this provider in your data generator to include Spanish translations in your mod's assets.
 * </p>
 *
 * @author RobiPoire
 * @see FabricLanguageProvider
 * @see ModBlocks
 * @see ModItems
 */
public class SpanishLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new Spanish language provider for Pear Expansion.
     *
     * <p>
     * Use this constructor to register the provider with Fabric's data generation system.
     * </p>
     *
     * @param dataOutput     the output destination for generated language data
     * @param registryLookup a future providing access to the registry lookup
     */
    protected SpanishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "es_es", registryLookup);
    }

    /**
     * Generates Spanish translations for all mod content.
     *
     * <p>
     * Adds translation entries for the item group, all custom pear items, and all custom vertical slab blocks.
     * This method is called by the Fabric data generator during the data generation phase.
     * </p>
     *
     * @param wrapperLookup      the registry lookup used for translation (not used directly here)
     * @param translationBuilder the builder used to add translation entries
     */
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        // Add translation for the custom item group
        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion");

        // Add translations for custom pear items
        translationBuilder.add(ModItems.PEAR, "Pera");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Pera Dorada");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Pera Dorada Encantada");

        // Add translations for all custom vertical slab blocks and their item forms
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Losa vertical de acacia");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Losa vertical de acacia");

        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB, "Losa vertical de andesita");
        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asItem(), "Losa vertical de andesita");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, "Losa vertical de mosaico de bambú");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asItem(), "Losa vertical de mosaico de bambú");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, "Losa vertical de bambú");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asItem(), "Losa vertical de bambú");

        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Losa vertical de abedul");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Losa vertical de abedul");

        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB, "Losa vertical de piedra negra");
        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asItem(), "Losa vertical de piedra negra");

        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB, "Losa vertical de ladrillos");
        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB.asItem(), "Losa vertical de ladrillos");

        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Losa vertical de cerezo");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Losa vertical de cerezo");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, "Losa vertical de pizarra profunda rocosa");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asItem(), "Losa vertical de pizarra profunda rocosa");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB, "Losa vertical de roca");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asItem(), "Losa vertical de roca");

        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB, "Losa vertical carmesí");
        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asItem(), "Losa vertical carmesí");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB, "Losa vertical de cobre cortado");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asItem(), "Losa vertical de cobre cortado");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, "Losa vertical de arenisca roja cortada");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asItem(), "Losa vertical de arenisca roja cortada");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, "Losa vertical de arenisca cortada");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asItem(), "Losa vertical de arenisca cortada");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Losa vertical de roble oscuro");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Losa vertical de roble oscuro");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, "Losa vertical de prismarina oscura");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asItem(), "Losa vertical de prismarina oscura");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, "Losa vertical de ladrillos de pizarra profunda");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asItem(), "Losa vertical de ladrillos de pizarra profunda");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, "Losa vertical de baldosas de pizarra profunda");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asItem(), "Losa vertical de baldosas de pizarra profunda");

        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB, "Losa vertical de diorita");
        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB.asItem(), "Losa vertical de diorita");

        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, "Losa vertical de ladrillos de piedra del End");
        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB.asItem(), "Losa vertical de ladrillos de piedra del End");

        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "Losa vertical de cobre cortado expuesto");
        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asItem(), "Losa vertical de cobre cortado expuesto");

        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB, "Losa vertical de granito");
        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB.asItem(), "Losa vertical de granito");

        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Losa vertical de jungla");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Losa vertical de jungla");

        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Losa vertical de mangle");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Losa vertical de mangle");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, "Losa vertical de roca musgosa");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asItem(), "Losa vertical de roca musgosa");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, "Losa vertical de ladrillos de piedra musgosos");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asItem(), "Losa vertical de ladrillos de piedra musgosos");

        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB, "Losa vertical de ladrillos de adobe");
        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asItem(), "Losa vertical de ladrillos de adobe");

        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, "Losa vertical de ladrillos del Nether");
        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asItem(), "Losa vertical de ladrillos del Nether");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Losa vertical de roble");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Losa vertical de roble");

        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "Losa vertical de cobre cortado oxidado");
        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Losa vertical de cobre cortado oxidado");

        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, "Losa vertical de roble pálido");
        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB.asItem(), "Losa vertical de roble pálido");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, "Losa vertical de andesita pulida");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asItem(), "Losa vertical de andesita pulida");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "Losa vertical de ladrillos de piedra negra pulida");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), "Losa vertical de ladrillos de piedra negra pulida");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, "Losa vertical de piedra negra pulida");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asItem(), "Losa vertical de piedra negra pulida");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, "Losa vertical de diorita pulida");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asItem(), "Losa vertical de diorita pulida");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, "Losa vertical de granito pulido");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asItem(), "Losa vertical de granito pulido");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, "Losa vertical de pizarra profunda pulida");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asItem(), "Losa vertical de pizarra profunda pulida");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, "Losa vertical de toba pulida");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB.asItem(), "Losa vertical de toba pulida");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, "Losa vertical de ladrillos de prismarina");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asItem(), "Losa vertical de ladrillos de prismarina");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB, "Losa vertical de prismarina");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asItem(), "Losa vertical de prismarina");

        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB, "Losa vertical de purpur");
        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB.asItem(), "Losa vertical de purpur");

        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB, "Losa vertical de cuarzo");
        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asItem(), "Losa vertical de cuarzo");

        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, "Losa vertical de ladrillos del Nether rojos");
        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asItem(), "Losa vertical de ladrillos del Nether rojos");

        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, "Losa vertical de arenisca roja");
        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asItem(), "Losa vertical de arenisca roja");

        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, "Losa vertical de ladrillos de resina");
        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB.asItem(), "Losa vertical de ladrillos de resina");

        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB, "Losa vertical de arenisca");
        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asItem(), "Losa vertical de arenisca");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, "Losa vertical de cuarzo liso");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asItem(), "Losa vertical de cuarzo liso");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "Losa vertical de arenisca roja lisa");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asItem(), "Losa vertical de arenisca roja lisa");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, "Losa vertical de arenisca lisa");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asItem(), "Losa vertical de arenisca lisa");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, "Losa vertical de piedra lisa");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asItem(), "Losa vertical de piedra lisa");

        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Losa vertical de abeto");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Losa vertical de abeto");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB, "Losa vertical de ladrillos de piedra");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asItem(), "Losa vertical de ladrillos de piedra");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB, "Losa vertical de piedra");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB.asItem(), "Losa vertical de piedra");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, "Losa vertical de ladrillos de toba");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB.asItem(), "Losa vertical de ladrillos de toba");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB, "Losa vertical de toba");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB.asItem(), "Losa vertical de toba");

        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB, "Losa vertical distorsionada");
        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB.asItem(), "Losa vertical distorsionada");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, "Losa vertical de cobre cortado encerado");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asItem(), "Losa vertical de cobre cortado encerado");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "Losa vertical de cobre cortado expuesto encerado");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), "Losa vertical de cobre cortado expuesto encerado");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "Losa vertical de cobre cortado oxidado encerado");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Losa vertical de cobre cortado oxidado encerado");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "Losa vertical de cobre cortado degradado encerado");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), "Losa vertical de cobre cortado degradado encerado");

        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "Losa vertical de cobre cortado degradado");
        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asItem(), "Losa vertical de cobre cortado degradado");
    }
}