package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
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
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Vertikale Akazienholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Vertikale Akazienholzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB, "Vertikale Andesitstufe");
        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asItem(), "Vertikale Andesitstufe");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, "Vertikale Bambusmosaikstufe");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asItem(), "Vertikale Bambusmosaikstufe");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, "Vertikale Bambusstufe");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asItem(), "Vertikale Bambusstufe");

        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Vertikale Birkenholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Vertikale Birkenholzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB, "Vertikale Schwarzsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asItem(), "Vertikale Schwarzsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB, "Vertikale Ziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB.asItem(), "Vertikale Ziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Vertikale Kirschholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Vertikale Kirschholzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, "Vertikale Bruchtiefenschieferstufe");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asItem(), "Vertikale Bruchtiefenschieferstufe");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB, "Vertikale Bruchsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asItem(), "Vertikale Bruchsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB, "Vertikale Karmesinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asItem(), "Vertikale Karmesinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB, "Vertikale Geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asItem(), "Vertikale Geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, "Vertikale Geschnittene rote Sandsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asItem(), "Vertikale Geschnittene rote Sandsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, "Vertikale Geschnittene Sandsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asItem(), "Vertikale Geschnittene Sandsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Vertikale Schwarzeichenholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Vertikale Schwarzeichenholzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, "Vertikale Dunkle Prismarinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asItem(), "Vertikale Dunkle Prismarinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, "Vertikale Tiefenschieferziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asItem(), "Vertikale Tiefenschieferziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, "Vertikale Tiefenschieferfliesenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asItem(), "Vertikale Tiefenschieferfliesenstufe");

        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB, "Vertikale Dioritstufe");
        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB.asItem(), "Vertikale Dioritstufe");

        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, "Vertikale Endsteinziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB.asItem(), "Vertikale Endsteinziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "Vertikale Angelaufene geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asItem(), "Vertikale Angelaufene geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB, "Vertikale Granitstufe");
        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB.asItem(), "Vertikale Granitstufe");

        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Vertikale Tropenholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Vertikale Tropenholzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Vertikale Mangrovenholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Vertikale Mangrovenholzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, "Vertikale Bemooste Bruchsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asItem(), "Vertikale Bemooste Bruchsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, "Vertikale Bemooste Steinziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asItem(), "Vertikale Bemooste Steinziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB, "Vertikale Schlammziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asItem(), "Vertikale Schlammziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, "Vertikale Netherziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asItem(), "Vertikale Netherziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Vertikale Eichenholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Vertikale Eichenholzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "Vertikale Oxidierte geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Vertikale Oxidierte geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, "Vertikale Blasseichenholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB.asItem(), "Vertikale Blasseichenholzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, "Vertikale Polierte Andesitstufe");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asItem(), "Vertikale Polierte Andesitstufe");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "Vertikale Polierte Schwarzsteinziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), "Vertikale Polierte Schwarzsteinziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, "Vertikale Polierte Schwarzsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asItem(), "Vertikale Polierte Schwarzsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, "Vertikale Polierte Tiefenschieferstufe");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asItem(), "Vertikale Polierte Tiefenschieferstufe");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, "Vertikale Polierte Dioritstufe");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asItem(), "Vertikale Polierte Dioritstufe");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, "Vertikale Polierte Granitstufe");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asItem(), "Vertikale Polierte Granitstufe");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, "Vertikale Polierte Tuffsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB.asItem(), "Vertikale Polierte Tuffsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, "Vertikale Prismarinziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asItem(), "Vertikale Prismarinziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB, "Vertikale Prismarinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asItem(), "Vertikale Prismarinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB, "Vertikale Purpurstufe");
        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB.asItem(), "Vertikale Purpurstufe");

        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB, "Vertikale Quarzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asItem(), "Vertikale Quarzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, "Vertikale Rote Netherziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asItem(), "Vertikale Rote Netherziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, "Vertikale Rote Sandsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asItem(), "Vertikale Rote Sandsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, "Vertikale Harzziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB.asItem(), "Vertikale Harzziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB, "Vertikale Sandsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asItem(), "Vertikale Sandsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, "Vertikale Glatte Quarzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asItem(), "Vertikale Glatte Quarzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "Vertikale Glatte rote Sandsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asItem(), "Vertikale Glatte rote Sandsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, "Vertikale Glatte Sandsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asItem(), "Vertikale Glatte Sandsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, "Vertikale Glatte Steinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asItem(), "Vertikale Glatte Steinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Vertikale Fichtenholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Vertikale Fichtenholzstufe");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB, "Vertikale Steinziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asItem(), "Vertikale Steinziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB, "Vertikale Steinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB.asItem(), "Vertikale Steinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, "Vertikale Tuffsteinziegelstufe");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB.asItem(), "Vertikale Tuffsteinziegelstufe");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB, "Vertikale Tuffsteinstufe");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB.asItem(), "Vertikale Tuffsteinstufe");

        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB, "Vertikale Wirrstufe");
        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB.asItem(), "Vertikale Wirrstufe");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, "Vertikale Gewachste geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asItem(), "Vertikale Gewachste geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "Vertikale Gewachste angelaufene geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), "Vertikale Gewachste angelaufene geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "Vertikale Gewachste oxidierte geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Vertikale Gewachste oxidierte geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "Vertikale Gewachste verwitterte geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), "Vertikale Gewachste verwitterte geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "Vertikale Verwitterte geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asItem(), "Vertikale Verwitterte geschnittene Kupferstufe");
    }

}