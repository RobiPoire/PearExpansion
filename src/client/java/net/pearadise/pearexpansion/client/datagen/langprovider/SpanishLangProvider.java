package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;
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
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock(), "Losa vertical de acacia");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock().asItem(), "Losa vertical de acacia");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock(), "Losa vertical de andesita");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock().asItem(), "Losa vertical de andesita");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock(), "Losa vertical de mosaico de bambú");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock().asItem(), "Losa vertical de mosaico de bambú");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock(), "Losa vertical de bambú");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock().asItem(), "Losa vertical de bambú");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock(), "Losa vertical de abedul");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock().asItem(), "Losa vertical de abedul");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock(), "Losa vertical de piedra negra");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock().asItem(), "Losa vertical de piedra negra");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock(), "Losa vertical de cerezo");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock().asItem(), "Losa vertical de cerezo");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock(), "Losa vertical de pizarra profunda rocosa");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock().asItem(), "Losa vertical de pizarra profunda rocosa");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock(), "Losa vertical de roca");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock().asItem(), "Losa vertical de roca");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock(), "Losa vertical carmesí");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock().asItem(), "Losa vertical carmesí");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock(), "Losa vertical de cobre cortado");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock().asItem(), "Losa vertical de cobre cortado");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock(), "Losa vertical de arenisca roja cortada");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock().asItem(), "Losa vertical de arenisca roja cortada");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock(), "Losa vertical de arenisca cortada");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock().asItem(), "Losa vertical de arenisca cortada");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock(), "Losa vertical de roble oscuro");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock().asItem(), "Losa vertical de roble oscuro");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock(), "Losa vertical de prismarina oscura");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock().asItem(), "Losa vertical de prismarina oscura");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos de pizarra profunda");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos de pizarra profunda");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock(), "Losa vertical de baldosas de pizarra profunda");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock().asItem(), "Losa vertical de baldosas de pizarra profunda");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock(), "Losa vertical de diorita");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock().asItem(), "Losa vertical de diorita");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos de piedra del End");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos de piedra del End");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock(), "Losa vertical de cobre cortado expuesto");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock().asItem(), "Losa vertical de cobre cortado expuesto");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock(), "Losa vertical de granito");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock().asItem(), "Losa vertical de granito");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock(), "Losa vertical de jungla");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock().asItem(), "Losa vertical de jungla");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock(), "Losa vertical de mangle");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock().asItem(), "Losa vertical de mangle");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock(), "Losa vertical de roca musgosa");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock().asItem(), "Losa vertical de roca musgosa");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos de piedra musgosos");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos de piedra musgosos");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos de adobe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos de adobe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos del Nether");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos del Nether");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock(), "Losa vertical de roble");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock().asItem(), "Losa vertical de roble");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock(), "Losa vertical de cobre cortado oxidado");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock().asItem(), "Losa vertical de cobre cortado oxidado");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock(), "Losa vertical de roble pálido");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock().asItem(), "Losa vertical de roble pálido");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock(), "Losa vertical de andesita pulida");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock().asItem(), "Losa vertical de andesita pulida");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos de piedra negra pulida");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos de piedra negra pulida");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock(), "Losa vertical de piedra negra pulida");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock().asItem(), "Losa vertical de piedra negra pulida");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock(), "Losa vertical de diorita pulida");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock().asItem(), "Losa vertical de diorita pulida");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock(), "Losa vertical de granito pulido");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock().asItem(), "Losa vertical de granito pulido");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock(), "Losa vertical de pizarra profunda pulida");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock().asItem(), "Losa vertical de pizarra profunda pulida");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock(), "Losa vertical de toba pulida");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock().asItem(), "Losa vertical de toba pulida");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos de prismarina");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos de prismarina");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock(), "Losa vertical de prismarina");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock().asItem(), "Losa vertical de prismarina");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock(), "Losa vertical de purpur");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock().asItem(), "Losa vertical de purpur");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock(), "Losa vertical de cuarzo");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock().asItem(), "Losa vertical de cuarzo");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos del Nether rojos");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos del Nether rojos");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock(), "Losa vertical de arenisca roja");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock().asItem(), "Losa vertical de arenisca roja");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos de resina");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos de resina");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock(), "Losa vertical de arenisca");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock().asItem(), "Losa vertical de arenisca");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock(), "Losa vertical de cuarzo liso");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock().asItem(), "Losa vertical de cuarzo liso");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock(), "Losa vertical de arenisca roja lisa");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock().asItem(), "Losa vertical de arenisca roja lisa");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock(), "Losa vertical de arenisca lisa");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock().asItem(), "Losa vertical de arenisca lisa");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock(), "Losa vertical de piedra lisa");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock().asItem(), "Losa vertical de piedra lisa");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock(), "Losa vertical de abeto");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock().asItem(), "Losa vertical de abeto");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos de piedra");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos de piedra");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock(), "Losa vertical de piedra");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock().asItem(), "Losa vertical de piedra");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock(), "Losa vertical de ladrillos de toba");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock().asItem(), "Losa vertical de ladrillos de toba");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock(), "Losa vertical de toba");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock().asItem(), "Losa vertical de toba");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock(), "Losa vertical distorsionada");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock().asItem(), "Losa vertical distorsionada");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock(), "Losa vertical de cobre cortado encerado");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock().asItem(), "Losa vertical de cobre cortado encerado");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock(), "Losa vertical de cobre cortado expuesto encerado");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock().asItem(), "Losa vertical de cobre cortado expuesto encerado");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock(), "Losa vertical de cobre cortado oxidado encerado");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock().asItem(), "Losa vertical de cobre cortado oxidado encerado");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock(), "Losa vertical de cobre cortado degradado encerado");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock().asItem(), "Losa vertical de cobre cortado degradado encerado");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock(), "Losa vertical de cobre cortado degradado");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock().asItem(), "Losa vertical de cobre cortado degradado");
    }
}