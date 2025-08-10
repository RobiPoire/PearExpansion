package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides German language translations for the Pear Expansion mod.
 * <p>
 * This class generates the de_de language file, adding translations for
 * the item group and custom items introduced by the mod. It extends
 * FabricLanguageProvider to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionGermanLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new PearExpansionGermanLangProvider.
     *
     * @param dataOutput     The output destination for generated language data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionGermanLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "de_de", registryLookup);
    }

    /**
     * Generates German translations for the mod.
     * <p>
     * Adds translation entries for the item group and all custom pear items.
     * This method is called during data generation.
     * </p>
     *
     * @param wrapperLookup      The registry lookup used for translation.
     * @param translationBuilder The builder used to add translation entries.
     */
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion");

        translationBuilder.add(ModItems.PEAR, "Birne");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Goldene Birne");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Verzauberte Goldene Birne");

        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Vertikale Akazienplatte");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Vertikale Akazienplatte");

        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB, "Vertikale Andesitplatte");
        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asItem(), "Vertikale Andesitplatte");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, "Vertikale Bambus-Mosaikplatte");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asItem(), "Vertikale Bambus-Mosaikplatte");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, "Vertikale Bambusplatte");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asItem(), "Vertikale Bambusplatte");

        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Vertikale Birkenplatte");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Vertikale Birkenplatte");

        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB, "Vertikale Schwarzsteinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asItem(), "Vertikale Schwarzsteinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB, "Vertikale Ziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB.asItem(), "Vertikale Ziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Vertikale Kirschholzplatte");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Vertikale Kirschholzplatte");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, "Vertikale grobe Tiefenschieferplatte");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asItem(), "Vertikale grobe Tiefenschieferplatte");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB, "Vertikale Pflastersteinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asItem(), "Vertikale Pflastersteinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB, "Vertikale Karmesinholzplatte");
        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asItem(), "Vertikale Karmesinholzplatte");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB, "Vertikale geschnittene Kupferplatte");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asItem(), "Vertikale geschnittene Kupferplatte");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, "Vertikale geschnittene rote Sandsteinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asItem(), "Vertikale geschnittene rote Sandsteinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, "Vertikale geschnittene Sandsteinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asItem(), "Vertikale geschnittene Sandsteinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Vertikale Dunkleichenplatte");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Vertikale Dunkleichenplatte");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, "Vertikale dunkle Prismarinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asItem(), "Vertikale dunkle Prismarinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, "Vertikale Tiefenschieferziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asItem(), "Vertikale Tiefenschieferziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, "Vertikale Tiefenschieferfliesenplatte");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asItem(), "Vertikale Tiefenschieferfliesenplatte");

        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB, "Vertikale Dioritplatte");
        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB.asItem(), "Vertikale Dioritplatte");

        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, "Vertikale Endsteinziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB.asItem(), "Vertikale Endsteinziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "Vertikale freiliegende geschnittene Kupferplatte");
        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asItem(), "Vertikale freiliegende geschnittene Kupferplatte");

        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB, "Vertikale Granitplatte");
        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB.asItem(), "Vertikale Granitplatte");

        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Vertikale Dschungelholzplatte");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Vertikale Dschungelholzplatte");

        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Vertikale Mangrovenholzplatte");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Vertikale Mangrovenholzplatte");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, "Vertikale moosige Pflastersteinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asItem(), "Vertikale moosige Pflastersteinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, "Vertikale moosige Steinziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asItem(), "Vertikale moosige Steinziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB, "Vertikale Lehmziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asItem(), "Vertikale Lehmziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, "Vertikale Netherziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asItem(), "Vertikale Netherziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Vertikale Eichenplatte");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Vertikale Eichenplatte");

        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "Vertikale oxidierte geschnittene Kupferplatte");
        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Vertikale oxidierte geschnittene Kupferplatte");

        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, "Vertikale bleiche Eichenplatte");
        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB.asItem(), "Vertikale bleiche Eichenplatte");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, "Vertikale polierte Andesitplatte");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asItem(), "Vertikale polierte Andesitplatte");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "Vertikale polierte Schwarzsteinziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), "Vertikale polierte Schwarzsteinziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, "Vertikale polierte Schwarzsteinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asItem(), "Vertikale polierte Schwarzsteinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, "Vertikale polierte Dioritplatte");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asItem(), "Vertikale polierte Dioritplatte");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, "Vertikale polierte Granitplatte");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asItem(), "Vertikale polierte Granitplatte");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, "Vertikale polierte Tiefenschieferplatte");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asItem(), "Vertikale polierte Tiefenschieferplatte");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, "Vertikale polierte Tuffplatte");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB.asItem(), "Vertikale polierte Tuffplatte");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, "Vertikale Prismarinziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asItem(), "Vertikale Prismarinziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB, "Vertikale Prismarinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asItem(), "Vertikale Prismarinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB, "Vertikale Purpurplatte");
        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB.asItem(), "Vertikale Purpurplatte");

        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB, "Vertikale Quarzplatte");
        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asItem(), "Vertikale Quarzplatte");

        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, "Vertikale rote Netherziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asItem(), "Vertikale rote Netherziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, "Vertikale roter Sandsteinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asItem(), "Vertikale roter Sandsteinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, "Vertikale Harzziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB.asItem(), "Vertikale Harzziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB, "Vertikale Sandsteinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asItem(), "Vertikale Sandsteinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, "Vertikale glatte Quarzplatte");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asItem(), "Vertikale glatte Quarzplatte");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "Vertikale glatte rote Sandsteinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asItem(), "Vertikale glatte rote Sandsteinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, "Vertikale glatte Sandsteinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asItem(), "Vertikale glatte Sandsteinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, "Vertikale glatte Steinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asItem(), "Vertikale glatte Steinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Vertikale Fichtenplatte");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Vertikale Fichtenplatte");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB, "Vertikale Steinziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asItem(), "Vertikale Steinziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB, "Vertikale Steinplatte");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB.asItem(), "Vertikale Steinplatte");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, "Vertikale Tuffziegelplatte");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB.asItem(), "Vertikale Tuffziegelplatte");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB, "Vertikale Tuffplatte");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB.asItem(), "Vertikale Tuffplatte");

        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB, "Vertikale verdrehte Holzplatte");
        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB.asItem(), "Vertikale verdrehte Holzplatte");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, "Vertikale gewachste geschnittene Kupferplatte");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asItem(), "Vertikale gewachste geschnittene Kupferplatte");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "Vertikale gewachste freiliegende geschnittene Kupferplatte");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), "Vertikale gewachste freiliegende geschnittene Kupferplatte");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "Vertikale gewachste oxidierte geschnittene Kupferplatte");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Vertikale gewachste oxidierte geschnittene Kupferplatte");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "Vertikale gewachste verwitterte geschnittene Kupferplatte");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), "Vertikale gewachste verwitterte geschnittene Kupferplatte");

        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "Vertikale verwitterte geschnittene Kupferplatte");
        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asItem(), "Vertikale verwitterte geschnittene Kupferplatte");
    }

}