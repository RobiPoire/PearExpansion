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
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB, "Vertikale Akazienholzstufe");
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB.asItem(), "Vertikale Akazienholzstufe");

        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB, "Vertikale Andesitstufe");
        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB.asItem(), "Vertikale Andesitstufe");

        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, "Vertikale Bambusmosaikstufe");
        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.asItem(), "Vertikale Bambusmosaikstufe");

        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB, "Vertikale Bambusstufe");
        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB.asItem(), "Vertikale Bambusstufe");

        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB, "Vertikale Birkenholzstufe");
        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB.asItem(), "Vertikale Birkenholzstufe");

        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB, "Vertikale Schwarzsteinstufe");
        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB.asItem(), "Vertikale Schwarzsteinstufe");

        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB, "Vertikale Ziegelstufe");
        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB.asItem(), "Vertikale Ziegelstufe");

        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB, "Vertikale Kirschholzstufe");
        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB.asItem(), "Vertikale Kirschholzstufe");

        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, "Vertikale Bruchtiefenschieferstufe");
        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Vertikale Bruchtiefenschieferstufe");

        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB, "Vertikale Bruchsteinstufe");
        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB.asItem(), "Vertikale Bruchsteinstufe");

        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB, "Vertikale Karmesinstufe");
        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB.asItem(), "Vertikale Karmesinstufe");

        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB, "Vertikale Geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikale Geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, "Vertikale Geschnittene rote Sandsteinstufe");
        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikale Geschnittene rote Sandsteinstufe");

        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, "Vertikale Geschnittene Sandsteinstufe");
        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikale Geschnittene Sandsteinstufe");

        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB, "Vertikale Schwarzeichenholzstufe");
        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB.asItem(), "Vertikale Schwarzeichenholzstufe");

        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, "Vertikale Dunkle Prismarinstufe");
        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB.asItem(), "Vertikale Dunkle Prismarinstufe");

        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, "Vertikale Tiefenschieferziegelstufe");
        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Tiefenschieferziegelstufe");

        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, "Vertikale Tiefenschieferfliesenstufe");
        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.asItem(), "Vertikale Tiefenschieferfliesenstufe");

        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB, "Vertikale Dioritstufe");
        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB.asItem(), "Vertikale Dioritstufe");

        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, "Vertikale Endsteinziegelstufe");
        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Endsteinziegelstufe");

        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Vertikale Angelaufene geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikale Angelaufene geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB, "Vertikale Granitstufe");
        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB.asItem(), "Vertikale Granitstufe");

        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB, "Vertikale Tropenholzstufe");
        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB.asItem(), "Vertikale Tropenholzstufe");

        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB, "Vertikale Mangrovenholzstufe");
        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB.asItem(), "Vertikale Mangrovenholzstufe");

        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, "Vertikale Bemooste Bruchsteinstufe");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.asItem(), "Vertikale Bemooste Bruchsteinstufe");

        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, "Vertikale Bemooste Steinziegelstufe");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Bemooste Steinziegelstufe");

        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB, "Vertikale Schlammziegelstufe");
        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Schlammziegelstufe");

        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, "Vertikale Netherziegelstufe");
        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Netherziegelstufe");

        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB, "Vertikale Eichenholzstufe");
        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB.asItem(), "Vertikale Eichenholzstufe");

        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Vertikale Oxidierte geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikale Oxidierte geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB, "Vertikale Blasseichenholzstufe");
        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB.asItem(), "Vertikale Blasseichenholzstufe");

        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, "Vertikale Polierte Andesitstufe");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.asItem(), "Vertikale Polierte Andesitstufe");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, "Vertikale Polierte Schwarzsteinziegelstufe");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Polierte Schwarzsteinziegelstufe");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, "Vertikale Polierte Schwarzsteinstufe");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.asItem(), "Vertikale Polierte Schwarzsteinstufe");

        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, "Vertikale Polierte Tiefenschieferstufe");
        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Vertikale Polierte Tiefenschieferstufe");

        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, "Vertikale Polierte Dioritstufe");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB.asItem(), "Vertikale Polierte Dioritstufe");

        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, "Vertikale Polierte Granitstufe");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB.asItem(), "Vertikale Polierte Granitstufe");

        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, "Vertikale Polierte Tuffsteinstufe");
        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB.asItem(), "Vertikale Polierte Tuffsteinstufe");

        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, "Vertikale Prismarinziegelstufe");
        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Prismarinziegelstufe");

        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB, "Vertikale Prismarinstufe");
        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB.asItem(), "Vertikale Prismarinstufe");

        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB, "Vertikale Purpurstufe");
        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB.asItem(), "Vertikale Purpurstufe");

        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB, "Vertikale Quarzstufe");
        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB.asItem(), "Vertikale Quarzstufe");

        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, "Vertikale Rote Netherziegelstufe");
        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Rote Netherziegelstufe");

        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, "Vertikale Rote Sandsteinstufe");
        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikale Rote Sandsteinstufe");

        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB, "Vertikale Harzziegelstufe");
        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Harzziegelstufe");

        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB, "Vertikale Sandsteinstufe");
        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikale Sandsteinstufe");

        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, "Vertikale Glatte Quarzstufe");
        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.asItem(), "Vertikale Glatte Quarzstufe");

        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, "Vertikale Glatte rote Sandsteinstufe");
        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikale Glatte rote Sandsteinstufe");

        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, "Vertikale Glatte Sandsteinstufe");
        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikale Glatte Sandsteinstufe");

        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "Vertikale Glatte Steinstufe");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB.asItem(), "Vertikale Glatte Steinstufe");

        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB, "Vertikale Fichtenholzstufe");
        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB.asItem(), "Vertikale Fichtenholzstufe");

        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB, "Vertikale Steinziegelstufe");
        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Steinziegelstufe");

        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB, "Vertikale Steinstufe");
        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB.asItem(), "Vertikale Steinstufe");

        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB, "Vertikale Tuffsteinziegelstufe");
        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB.asItem(), "Vertikale Tuffsteinziegelstufe");

        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB, "Vertikale Tuffsteinstufe");
        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB.asItem(), "Vertikale Tuffsteinstufe");

        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB, "Vertikale Wirrstufe");
        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB.asItem(), "Vertikale Wirrstufe");

        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, "Vertikale Gewachste geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikale Gewachste geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Vertikale Gewachste angelaufene geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikale Gewachste angelaufene geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Vertikale Gewachste oxidierte geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikale Gewachste oxidierte geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Vertikale Gewachste verwitterte geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikale Gewachste verwitterte geschnittene Kupferstufe");

        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Vertikale Verwitterte geschnittene Kupferstufe");
        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikale Verwitterte geschnittene Kupferstufe");
    }

}