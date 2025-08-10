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

        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "supa pi linja sewi pi kasi seli");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "supa pi linja sewi pi kasi seli");

        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB, "supa pi linja sewi pi kiwen pimeja walo");
        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asItem(), "supa pi linja sewi pi kiwen pimeja walo");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, "supa pi linja sewi namako pi kasi palisa");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asItem(), "supa pi linja sewi namako pi kasi palisa");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, "supa pi linja sewi pi kasi palisa");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asItem(), "supa pi linja sewi pi kasi palisa");

        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "supa pi linja sewi pi kasi jelo");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "supa pi linja sewi pi kasi jelo");

        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB, "supa pi linja sewi kiwen pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asItem(), "supa pi linja sewi kiwen pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB, "supa pi linja sewi pi kiwen leko loje");
        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB.asItem(), "supa pi linja sewi pi kiwen leko loje");

        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "supa pi linja sewi pi kasi suwi");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "supa pi linja sewi pi kasi suwi");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, "supa pi linja sewi pi kiwen anpa nena");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asItem(), "supa pi linja sewi pi kiwen anpa nena");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB, "supa pi linja sewi pi kiwen nena");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asItem(), "supa pi linja sewi pi kiwen nena");

        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB, "supa pi linja sewi pi soko loje");
        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asItem(), "supa pi linja sewi pi soko loje");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB, "supa pi linja sewi pi kiwen ante");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asItem(), "supa pi linja sewi pi kiwen ante");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, "supa pi linja sewi pi kiwen ko loje kipisi");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asItem(), "supa pi linja sewi pi kiwen ko loje kipisi");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, "supa pi linja sewi pi kiwen ko kipisi");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asItem(), "supa pi linja sewi pi kiwen ko kipisi");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "supa pi linja sewi pi kasi pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "supa pi linja sewi pi kasi pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, "supa pi linja sewi pi kiwen Prismarine pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asItem(), "supa pi linja sewi pi kiwen Prismarine pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, "supa pi linja sewi pi kiwen anpa leko");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asItem(), "supa pi linja sewi pi kiwen anpa leko");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, "supa pi linja sewi pi kiwen anpa pi leko lipu");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asItem(), "supa pi linja sewi pi kiwen anpa pi leko lipu");

        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB, "supa pi linja sewi pi kiwen walo pimeja");
        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB.asItem(), "supa pi linja sewi pi kiwen walo pimeja");

        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, "supa pi linja sewi kiwen pi ma End");
        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB.asItem(), "supa pi linja sewi kiwen pi ma End");

        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "supa pi linja sewi pi kiwen ante pi loje ma");
        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asItem(), "supa pi linja sewi pi kiwen ante pi loje ma");

        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB, "supa pi linja sewi pi kiwen loje");
        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB.asItem(), "supa pi linja sewi pi kiwen loje");

        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "supa pi linja sewi pi kasi suli");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "supa pi linja sewi pi kasi suli");

        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "supa pi linja sewi pi kasi telo");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "supa pi linja sewi pi kasi telo");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, "supa pi linja sewi pi kiwen nena kasi");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asItem(), "supa pi linja sewi pi kiwen nena kasi");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, "supa pi linja sewi pi kiwen leko kasi");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asItem(), "supa pi linja sewi pi kiwen leko kasi");

        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB, "supa pi linja sewi pi kiwen leko ma");
        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asItem(), "supa pi linja sewi pi kiwen leko ma");

        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, "supa pi linja sewi pi ma Nether");
        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asItem(), "supa pi linja sewi pi ma Nether");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "supa pi linja sewi pi kasi kili");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "supa pi linja sewi pi kasi kili");

        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "supa pi linja sewi pi kiwen ante laso");
        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asItem(), "supa pi linja sewi pi kiwen ante laso");

        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, "supa pi linja sewi pi kasi walo");
        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB.asItem(), "supa pi linja sewi pi kasi walo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, "supa pi linja sewi pi kiwen pimeja walo pi selo pona");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asItem(), "supa pi linja sewi pi kiwen pimeja walo pi selo pona");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "supa pi linja sewi pi kiwen pimeja leko");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), "supa pi linja sewi pi kiwen pimeja leko");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, "supa pi linja sewi pi kiwen pimeja pi selo pona");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asItem(), "supa pi linja sewi pi kiwen pimeja pi selo pona");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, "supa pi linja sewi pi kiwen anpa pi selo pona");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asItem(), "supa pi linja sewi pi kiwen anpa pi selo pona");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, "supa pi linja sewi pi kiwen walo pimeja pi selo pona");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asItem(), "supa pi linja sewi pi kiwen walo pimeja pi selo pona");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, "supa pi linja sewi pi kiwen loje pi selo pona");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asItem(), "supa pi linja sewi pi kiwen loje pi selo pona");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, "supa pi linja sewi pi ko seli kiwen pi selo pona");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB.asItem(), "supa pi linja sewi pi ko seli kiwen pi selo pona");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, "supa pi linja sewi pi kiwen leko Prismarine");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asItem(), "supa pi linja sewi pi kiwen leko Prismarine");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB, "supa pi linja sewi pi kiwen Prismarine");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asItem(), "supa pi linja sewi pi kiwen Prismarine");

        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB, "supa pi linja sewi pi kiwen Purpur");
        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB.asItem(), "supa pi linja sewi pi kiwen Purpur");

        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB, "supa pi linja sewi pi kiwen walo");
        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asItem(), "supa pi linja sewi pi kiwen walo");

        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, "supa pi linja sewi pi kiwen leko loje pi ma Nether");
        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asItem(), "supa pi linja sewi pi kiwen leko loje pi ma Nether");

        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, "supa pi linja sewi pi kiwen ko loje");
        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asItem(), "supa pi linja sewi pi kiwen ko loje");

        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, "supa pi linja sewi pi kiwen ko loje");
        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB.asItem(), "supa pi linja sewi pi kiwen ko loje");

        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB, "supa pi linja sewi pi kiwen ko");
        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asItem(), "supa pi linja sewi pi kiwen ko");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, "supa pi linja sewi pi kiwen walo pi selo pona");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asItem(), "supa pi linja sewi pi kiwen walo pi selo pona");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "supa pi linja sewi pi kiwen ko loje pi selo pona");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asItem(), "supa pi linja sewi pi kiwen ko loje pi selo pona");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, "supa pi linja sewi pi kiwen ko pi selo pona");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asItem(), "supa pi linja sewi pi kiwen ko pi selo pona");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, "supa pi linja sewi kiwen pi selo pona");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asItem(), "supa pi linja sewi kiwen pi selo pona");

        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "supa pi linja sewi pi kasi lete");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "supa pi linja sewi pi kasi lete");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB, "supa pi linja sewi pi kiwen leko");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asItem(), "supa pi linja sewi pi kiwen leko");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB, "supa pi linja sewi kiwen");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB.asItem(), "supa pi linja sewi kiwen");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, "supa pi linja sewi pi ko seli kiwen leko");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB.asItem(), "supa pi linja sewi pi ko seli kiwen leko");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB, "supa pi linja sewi pi ko seli kiwen");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB.asItem(), "supa pi linja sewi pi ko seli kiwen");

        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB, "supa pi linja sewi pi soko laso");
        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB.asItem(), "supa pi linja sewi pi soko laso");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, "supa pi linja sewi pi kiwen ante awen");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asItem(), "supa pi linja sewi pi kiwen ante awen");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "supa pi linja sewi pi kiwen ante awen pi loje ma");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), "supa pi linja sewi pi kiwen ante awen pi loje ma");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "supa pi linja sewi pi kiwen ante awen laso");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), "supa pi linja sewi pi kiwen ante awen laso");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "supa pi linja sewi pi kiwen ante awen pi laso lili");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), "supa pi linja sewi pi kiwen ante awen pi laso lili");

        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "supa pi linja sewi pi kiwen ante pi laso lili");
        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asItem(), "supa pi linja sewi pi kiwen ante pi laso lili");


    }

}