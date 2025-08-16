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
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB, "Losa vertical de acacia");
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB.asItem(), "Losa vertical de acacia");

        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB, "Losa vertical de andesita");
        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB.asItem(), "Losa vertical de andesita");

        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, "Losa vertical de mosaico de bambú");
        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.asItem(), "Losa vertical de mosaico de bambú");

        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB, "Losa vertical de bambú");
        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB.asItem(), "Losa vertical de bambú");

        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB, "Losa vertical de abedul");
        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB.asItem(), "Losa vertical de abedul");

        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB, "Losa vertical de piedra negra");
        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB.asItem(), "Losa vertical de piedra negra");

        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos");
        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos");

        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB, "Losa vertical de cerezo");
        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB.asItem(), "Losa vertical de cerezo");

        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, "Losa vertical de pizarra profunda rocosa");
        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Losa vertical de pizarra profunda rocosa");

        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB, "Losa vertical de roca");
        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB.asItem(), "Losa vertical de roca");

        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB, "Losa vertical carmesí");
        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB.asItem(), "Losa vertical carmesí");

        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB, "Losa vertical de cobre cortado");
        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB.asItem(), "Losa vertical de cobre cortado");

        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, "Losa vertical de arenisca roja cortada");
        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Losa vertical de arenisca roja cortada");

        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, "Losa vertical de arenisca cortada");
        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB.asItem(), "Losa vertical de arenisca cortada");

        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB, "Losa vertical de roble oscuro");
        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB.asItem(), "Losa vertical de roble oscuro");

        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, "Losa vertical de prismarina oscura");
        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB.asItem(), "Losa vertical de prismarina oscura");

        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos de pizarra profunda");
        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos de pizarra profunda");

        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, "Losa vertical de baldosas de pizarra profunda");
        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.asItem(), "Losa vertical de baldosas de pizarra profunda");

        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB, "Losa vertical de diorita");
        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB.asItem(), "Losa vertical de diorita");

        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos de piedra del End");
        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos de piedra del End");

        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Losa vertical de cobre cortado expuesto");
        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Losa vertical de cobre cortado expuesto");

        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB, "Losa vertical de granito");
        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB.asItem(), "Losa vertical de granito");

        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB, "Losa vertical de jungla");
        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB.asItem(), "Losa vertical de jungla");

        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB, "Losa vertical de mangle");
        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB.asItem(), "Losa vertical de mangle");

        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, "Losa vertical de roca musgosa");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.asItem(), "Losa vertical de roca musgosa");

        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos de piedra musgosos");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos de piedra musgosos");

        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos de adobe");
        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos de adobe");

        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos del Nether");
        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos del Nether");

        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB, "Losa vertical de roble");
        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB.asItem(), "Losa vertical de roble");

        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Losa vertical de cobre cortado oxidado");
        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Losa vertical de cobre cortado oxidado");

        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB, "Losa vertical de roble pálido");
        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB.asItem(), "Losa vertical de roble pálido");

        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, "Losa vertical de andesita pulida");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.asItem(), "Losa vertical de andesita pulida");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos de piedra negra pulida");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos de piedra negra pulida");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, "Losa vertical de piedra negra pulida");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.asItem(), "Losa vertical de piedra negra pulida");

        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, "Losa vertical de diorita pulida");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB.asItem(), "Losa vertical de diorita pulida");

        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, "Losa vertical de granito pulido");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB.asItem(), "Losa vertical de granito pulido");

        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, "Losa vertical de pizarra profunda pulida");
        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Losa vertical de pizarra profunda pulida");

        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, "Losa vertical de toba pulida");
        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB.asItem(), "Losa vertical de toba pulida");

        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos de prismarina");
        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos de prismarina");

        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB, "Losa vertical de prismarina");
        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB.asItem(), "Losa vertical de prismarina");

        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB, "Losa vertical de purpur");
        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB.asItem(), "Losa vertical de purpur");

        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB, "Losa vertical de cuarzo");
        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB.asItem(), "Losa vertical de cuarzo");

        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos del Nether rojos");
        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos del Nether rojos");

        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, "Losa vertical de arenisca roja");
        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Losa vertical de arenisca roja");

        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos de resina");
        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos de resina");

        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB, "Losa vertical de arenisca");
        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB.asItem(), "Losa vertical de arenisca");

        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, "Losa vertical de cuarzo liso");
        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.asItem(), "Losa vertical de cuarzo liso");

        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, "Losa vertical de arenisca roja lisa");
        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Losa vertical de arenisca roja lisa");

        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, "Losa vertical de arenisca lisa");
        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.asItem(), "Losa vertical de arenisca lisa");

        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "Losa vertical de piedra lisa");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB.asItem(), "Losa vertical de piedra lisa");

        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB, "Losa vertical de abeto");
        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB.asItem(), "Losa vertical de abeto");

        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos de piedra");
        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos de piedra");

        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB, "Losa vertical de piedra");
        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB.asItem(), "Losa vertical de piedra");

        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB, "Losa vertical de ladrillos de toba");
        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB.asItem(), "Losa vertical de ladrillos de toba");

        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB, "Losa vertical de toba");
        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB.asItem(), "Losa vertical de toba");

        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB, "Losa vertical distorsionada");
        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB.asItem(), "Losa vertical distorsionada");

        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, "Losa vertical de cobre cortado encerado");
        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Losa vertical de cobre cortado encerado");

        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Losa vertical de cobre cortado expuesto encerado");
        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Losa vertical de cobre cortado expuesto encerado");

        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Losa vertical de cobre cortado oxidado encerado");
        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Losa vertical de cobre cortado oxidado encerado");

        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Losa vertical de cobre cortado degradado encerado");
        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Losa vertical de cobre cortado degradado encerado");

        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Losa vertical de cobre cortado degradado");
        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Losa vertical de cobre cortado degradado");
    }
}