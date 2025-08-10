package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides Toki Pona language translations for the Pear Expansion mod.
 * <p>
 * This class generates the tok language file, adding translations for
 * the item group and custom items introduced by the mod. It extends
 * FabricLanguageProvider to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionTokiPonaLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new PearExpansionTokiPonaLangProvider.
     *
     * @param dataOutput     The output destination for generated language data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionTokiPonaLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "tok", registryLookup);
    }

    /**
     * Generates Toki Pona translations for the mod.
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

        translationBuilder.add(ModItems.PEAR, "kili pi kasi palisa");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "kili seli jelo");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "kili palisa jelo pi wile pona");

        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "kule palisa palisa Acacia");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "kule palisa palisa Acacia");

        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB, "kule palisa palisa Andesite");
        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asItem(), "kule palisa palisa Andesite");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, "kule palisa palisa kulupu waso bambi");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asItem(), "kule palisa palisa kulupu waso bambi");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, "kule palisa palisa bambi");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asItem(), "kule palisa palisa bambi");

        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "kule palisa palisa walo sijelo");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "kule palisa palisa walo sijelo");

        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB, "kule palisa palisa walo pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asItem(), "kule palisa palisa walo pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB, "kule palisa palisa sijelo");
        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB.asItem(), "kule palisa palisa sijelo");

        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "kule palisa palisa kili walo");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "kule palisa palisa kili walo");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, "kule palisa palisa mani suli ala");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asItem(), "kule palisa palisa mani suli ala");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB, "kule palisa palisa mani");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asItem(), "kule palisa palisa mani");

        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB, "kule palisa palisa kasi pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asItem(), "kule palisa palisa kasi pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB, "kule palisa palisa mani walo");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asItem(), "kule palisa palisa mani walo");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, "kule palisa palisa mani walo loje");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asItem(), "kule palisa palisa mani walo loje");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, "kule palisa palisa mani walo");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asItem(), "kule palisa palisa mani walo");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "kule palisa palisa kasi pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "kule palisa palisa kasi pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, "kule palisa palisa mani laso pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asItem(), "kule palisa palisa mani laso pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, "kule palisa palisa mani suli");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asItem(), "kule palisa palisa mani suli");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, "kule palisa palisa mani suli");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asItem(), "kule palisa palisa mani suli");

        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB, "kule palisa palisa walo suli");
        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB.asItem(), "kule palisa palisa walo suli");

        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, "kule palisa palisa mani suli tenpo pini");
        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB.asItem(), "kule palisa palisa mani suli tenpo pini");

        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "kule palisa palisa mani walo pini");
        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asItem(), "kule palisa palisa mani walo pini");

        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB, "kule palisa palisa kasi walo");
        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB.asItem(), "kule palisa palisa kasi walo");

        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "kule palisa palisa kasi suli");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "kule palisa palisa kasi suli");

        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "kule palisa palisa kasi mani");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "kule palisa palisa kasi mani");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, "kule palisa palisa mani pi waso");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asItem(), "kule palisa palisa mani pi waso");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, "kule palisa palisa mani pi waso");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asItem(), "kule palisa palisa mani pi waso");

        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB, "kule palisa palisa sijelo wawa");
        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asItem(), "kule palisa palisa sijelo wawa");

        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, "kule palisa palisa mani pi ma waso");
        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asItem(), "kule palisa palisa mani pi ma waso");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "kule palisa palisa kasi");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "kule palisa palisa kasi");

        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "kule palisa palisa mani walo pi sijelo sijelo");
        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asItem(), "kule palisa palisa mani walo pi sijelo sijelo");

        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, "kule palisa palisa kasi walo");
        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB.asItem(), "kule palisa palisa kasi walo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, "kule palisa palisa mani walo pi suli");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asItem(), "kule palisa palisa mani walo pi suli");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "kule palisa palisa mani pimeja pi suli");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), "kule palisa palisa mani pimeja pi suli");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, "kule palisa palisa mani pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asItem(), "kule palisa palisa mani pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, "kule palisa palisa mani walo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asItem(), "kule palisa palisa mani walo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, "kule palisa palisa mani walo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asItem(), "kule palisa palisa mani walo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, "kule palisa palisa mani suli");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asItem(), "kule palisa palisa mani suli");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, "kule palisa palisa mani suli");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB.asItem(), "kule palisa palisa mani suli");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, "kule palisa palisa mani laso");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asItem(), "kule palisa palisa mani laso");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB, "kule palisa palisa mani laso");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asItem(), "kule palisa palisa mani laso");

        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB, "kule palisa palisa kasi laso");
        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB.asItem(), "kule palisa palisa kasi laso");

        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB, "kule palisa palisa mani pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asItem(), "kule palisa palisa mani pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, "kule palisa palisa mani loje pi ma waso");
        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asItem(), "kule palisa palisa mani loje pi ma waso");

        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, "kule palisa palisa mani loje");
        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asItem(), "kule palisa palisa mani loje");

        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, "kule palisa palisa mani pi sijelo");
        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB.asItem(), "kule palisa palisa mani pi sijelo");

        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB, "kule palisa palisa mani");
        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asItem(), "kule palisa palisa mani");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, "kule palisa palisa mani pimeja pi wawa");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asItem(), "kule palisa palisa mani pimeja pi wawa");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "kule palisa palisa mani loje pi wawa");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asItem(), "kule palisa palisa mani loje pi wawa");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, "kule palisa palisa mani pi wawa");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asItem(), "kule palisa palisa mani pi wawa");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, "kule palisa palisa mani pi wawa");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asItem(), "kule palisa palisa mani pi wawa");

        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "kule palisa palisa kasi walo pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "kule palisa palisa kasi walo pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB, "kule palisa palisa mani sijelo");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asItem(), "kule palisa palisa mani sijelo");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB, "kule palisa palisa mani");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB.asItem(), "kule palisa palisa mani");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, "kule palisa palisa mani suli");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB.asItem(), "kule palisa palisa mani suli");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB, "kule palisa palisa mani suli");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB.asItem(), "kule palisa palisa mani suli");

        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB, "kule palisa palisa kasi pi sijelo sijelo");
        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB.asItem(), "kule palisa palisa kasi pi sijelo sijelo");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, "kule palisa palisa mani walo pi wile waso");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asItem(), "kule palisa palisa mani walo pi wile waso");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "kule palisa palisa mani walo pi wile waso pini");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), "kule palisa palisa mani walo pi wile waso pini");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "kule palisa palisa mani walo pi sijelo sijelo pi wile waso");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), "kule palisa palisa mani walo pi sijelo sijelo pi wile waso");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "kule palisa palisa mani walo pi sijelo suli pi wile waso");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), "kule palisa palisa mani walo pi sijelo suli pi wile waso");

        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "kule palisa palisa mani walo pi sijelo suli");
        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asItem(), "kule palisa palisa mani walo pi sijelo suli");


    }

}