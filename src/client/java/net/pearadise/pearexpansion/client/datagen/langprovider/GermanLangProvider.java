package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides German language translations for the Pear Expansion mod.
 *
 * <p>
 * This class generates the {@code de_de.json} language file for the mod using Fabric's data generation system.
 * It adds translation entries for the item group, custom items, and all custom blocks introduced by the mod.
 * Register this provider in your data generator to ensure German translations are included.
 * </p>
 *
 * @author RobiPoire
 * @see FabricLanguageProvider
 * @see ModBlocks
 * @see ModItems
 */
public class GermanLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new German language provider for Pear Expansion.
     *
     * <p>
     * Use this constructor to register the provider with Fabric's data generation system.
     * </p>
     *
     * @param dataOutput     the output destination for generated language data (must not be null)
     * @param registryLookup a future providing access to the registry lookup (must not be null)
     */
    protected GermanLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "de_de", registryLookup);
    }

    /**
     * Generates German translations for all mod content.
     *
     * <p>
     * Adds translation entries for the item group, all custom pear items, and all custom vertical slab blocks.
     * This method is called automatically during the Fabric data generation phase.
     * </p>
     *
     * @param wrapperLookup      the registry lookup used for translation (provided by Fabric)
     * @param translationBuilder the builder used to add translation entries (must not be null)
     */
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        // Add translation for the custom item group
        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion");

        // Add translations for custom pear items
        translationBuilder.add(ModItems.PEAR, "Birne");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Goldene Birne");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Verzauberte Goldene Birne");

        // Add translations for all custom vertical slab blocks and their item forms
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock(), "Vertikale Akazienholzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock().asItem(), "Vertikale Akazienholzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock(), "Vertikale Andesitstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock().asItem(), "Vertikale Andesitstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock(), "Vertikale Bambusmosaikstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock().asItem(), "Vertikale Bambusmosaikstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock(), "Vertikale Bambusstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock().asItem(), "Vertikale Bambusstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock(), "Vertikale Birkenholzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock().asItem(), "Vertikale Birkenholzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock(), "Vertikale Schwarzsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock().asItem(), "Vertikale Schwarzsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock(), "Vertikale Ziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock().asItem(), "Vertikale Ziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock(), "Vertikale Kirschholzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock().asItem(), "Vertikale Kirschholzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock(), "Vertikale Bruchtiefenschieferstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock().asItem(), "Vertikale Bruchtiefenschieferstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock(), "Vertikale Bruchsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock().asItem(), "Vertikale Bruchsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock(), "Vertikale Karmesinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock().asItem(), "Vertikale Karmesinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock(), "Vertikale Geschnittene Kupferstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock().asItem(), "Vertikale Geschnittene Kupferstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock(), "Vertikale Geschnittene rote Sandsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock().asItem(), "Vertikale Geschnittene rote Sandsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock(), "Vertikale Geschnittene Sandsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock().asItem(), "Vertikale Geschnittene Sandsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock(), "Vertikale Schwarzeichenholzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock().asItem(), "Vertikale Schwarzeichenholzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock(), "Vertikale Dunkle Prismarinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock().asItem(), "Vertikale Dunkle Prismarinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock(), "Vertikale Tiefenschieferziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock().asItem(), "Vertikale Tiefenschieferziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock(), "Vertikale Tiefenschieferfliesenstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock().asItem(), "Vertikale Tiefenschieferfliesenstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock(), "Vertikale Dioritstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock().asItem(), "Vertikale Dioritstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock(), "Vertikale Endsteinziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock().asItem(), "Vertikale Endsteinziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock(), "Vertikale Angelaufene geschnittene Kupferstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock().asItem(), "Vertikale Angelaufene geschnittene Kupferstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock(), "Vertikale Granitstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock().asItem(), "Vertikale Granitstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock(), "Vertikale Tropenholzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock().asItem(), "Vertikale Tropenholzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock(), "Vertikale Mangrovenholzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock().asItem(), "Vertikale Mangrovenholzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock(), "Vertikale Bemooste Bruchsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock().asItem(), "Vertikale Bemooste Bruchsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock(), "Vertikale Bemooste Steinziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock().asItem(), "Vertikale Bemooste Steinziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock(), "Vertikale Schlammziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock().asItem(), "Vertikale Schlammziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock(), "Vertikale Netherziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock().asItem(), "Vertikale Netherziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock(), "Vertikale Eichenholzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock().asItem(), "Vertikale Eichenholzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock(), "Vertikale Oxidierte geschnittene Kupferstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock().asItem(), "Vertikale Oxidierte geschnittene Kupferstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock(), "Vertikale Blasseichenholzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock().asItem(), "Vertikale Blasseichenholzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock(), "Vertikale Polierte Andesitstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock().asItem(), "Vertikale Polierte Andesitstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock(), "Vertikale Polierte Schwarzsteinziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock().asItem(), "Vertikale Polierte Schwarzsteinziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock(), "Vertikale Polierte Schwarzsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock().asItem(), "Vertikale Polierte Schwarzsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock(), "Vertikale Polierte Tiefenschieferstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock().asItem(), "Vertikale Polierte Tiefenschieferstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock(), "Vertikale Polierte Dioritstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock().asItem(), "Vertikale Polierte Dioritstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock(), "Vertikale Polierte Granitstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock().asItem(), "Vertikale Polierte Granitstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock(), "Vertikale Polierte Tuffsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock().asItem(), "Vertikale Polierte Tuffsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock(), "Vertikale Prismarinziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock().asItem(), "Vertikale Prismarinziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock(), "Vertikale Prismarinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock().asItem(), "Vertikale Prismarinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock(), "Vertikale Purpurstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock().asItem(), "Vertikale Purpurstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock(), "Vertikale Quarzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock().asItem(), "Vertikale Quarzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock(), "Vertikale Rote Netherziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock().asItem(), "Vertikale Rote Netherziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock(), "Vertikale Rote Sandsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock().asItem(), "Vertikale Rote Sandsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock(), "Vertikale Harzziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock().asItem(), "Vertikale Harzziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock(), "Vertikale Sandsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock().asItem(), "Vertikale Sandsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock(), "Vertikale Glatte Quarzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock().asItem(), "Vertikale Glatte Quarzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock(), "Vertikale Glatte rote Sandsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock().asItem(), "Vertikale Glatte rote Sandsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock(), "Vertikale Glatte Sandsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock().asItem(), "Vertikale Glatte Sandsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock(), "Vertikale Glatte Steinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock().asItem(), "Vertikale Glatte Steinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock(), "Vertikale Fichtenholzstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock().asItem(), "Vertikale Fichtenholzstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock(), "Vertikale Steinziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock().asItem(), "Vertikale Steinziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock(), "Vertikale Steinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock().asItem(), "Vertikale Steinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock(), "Vertikale Tuffsteinziegelstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock().asItem(), "Vertikale Tuffsteinziegelstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock(), "Vertikale Tuffsteinstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock().asItem(), "Vertikale Tuffsteinstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock(), "Vertikale Wirrstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock().asItem(), "Vertikale Wirrstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock(), "Vertikale Gewachste geschnittene Kupferstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock().asItem(), "Vertikale Gewachste geschnittene Kupferstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock(), "Vertikale Gewachste angelaufene geschnittene Kupferstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock().asItem(), "Vertikale Gewachste angelaufene geschnittene Kupferstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock(), "Vertikale Gewachste oxidierte geschnittene Kupferstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock().asItem(), "Vertikale Gewachste oxidierte geschnittene Kupferstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock(), "Vertikale Gewachste verwitterte geschnittene Kupferstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock().asItem(), "Vertikale Gewachste verwitterte geschnittene Kupferstufe");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock(), "Vertikale Verwitterte geschnittene Kupferstufe");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock().asItem(), "Vertikale Verwitterte geschnittene Kupferstufe");
    }

}