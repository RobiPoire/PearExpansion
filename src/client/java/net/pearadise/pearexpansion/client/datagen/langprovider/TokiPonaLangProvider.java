package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides Toki Pona language translations for the Pear Expansion mod.
 *
 * <p>
 * This class generates the Toki Pona language file for the mod using Fabric's data generation system.
 * It adds translations for the item group, custom items, and custom blocks introduced by the mod.
 * Register this provider in your data generator to output the Toki Pona language file.
 * </p>
 *
 * @author RobiPoire
 * @see FabricLanguageProvider
 * @see ModBlocks
 * @see ModItems
 */
public class TokiPonaLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new Toki Pona language provider for Pear Expansion.
     *
     * <p>
     * This constructor sets up the language provider for the "tok" (Toki Pona) language code.
     * </p>
     *
     * @param dataOutput     the output destination for generated language data
     * @param registryLookup a future providing access to the registry lookup
     */
    protected TokiPonaLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "tok", registryLookup);
    }

    /**
     * Generates Toki Pona translations for all mod items and blocks.
     *
     * <p>
     * This method is called by the Fabric data generator during the data generation phase.
     * It adds translation entries for the item group, all custom pear items, and all custom vertical slab blocks.
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
        translationBuilder.add(ModItems.PEAR, "kili pi kasi palisa");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "kili seli jelo");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "kili palisa jelo pi wile pona");

        // Add translations for all custom vertical slab blocks and their items
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB, "supa pi linja sewi pi kasi seli");
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kasi seli");

        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen pimeja walo");
        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen pimeja walo");

        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, "supa pi linja sewi namako pi kasi palisa");
        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.asItem(), "supa pi linja sewi namako pi kasi palisa");

        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB, "supa pi linja sewi pi kasi palisa");
        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kasi palisa");

        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB, "supa pi linja sewi pi kasi jelo");
        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kasi jelo");

        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB, "supa pi linja sewi kiwen pimeja");
        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi kiwen pimeja");

        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB, "supa pi linja sewi pi kiwen leko loje");
        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen leko loje");

        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB, "supa pi linja sewi pi kasi suwi");
        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kasi suwi");

        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen anpa nena");
        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen anpa nena");

        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen nena");
        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen nena");

        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB, "supa pi linja sewi pi soko loje");
        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi soko loje");

        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ante");
        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ante");

        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ko loje kipisi");
        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ko loje kipisi");

        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ko kipisi");
        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ko kipisi");

        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB, "supa pi linja sewi pi kasi pimeja");
        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kasi pimeja");

        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen Prismarine pimeja");
        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen Prismarine pimeja");

        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, "supa pi linja sewi pi kiwen anpa leko");
        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen anpa leko");

        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen anpa pi leko lipu");
        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen anpa pi leko lipu");

        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen walo pimeja");
        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen walo pimeja");

        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, "supa pi linja sewi kiwen pi ma End");
        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi kiwen pi ma End");

        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ante pi loje ma");
        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ante pi loje ma");

        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen loje");
        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen loje");

        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB, "supa pi linja sewi pi kasi suli");
        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kasi suli");

        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB, "supa pi linja sewi pi kasi telo");
        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kasi telo");

        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen nena kasi");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen nena kasi");

        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, "supa pi linja sewi pi kiwen leko kasi");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen leko kasi");

        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB, "supa pi linja sewi pi kiwen leko ma");
        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen leko ma");

        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, "supa pi linja sewi pi ma Nether");
        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi ma Nether");

        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB, "supa pi linja sewi pi kasi kili");
        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kasi kili");

        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ante laso");
        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ante laso");

        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB, "supa pi linja sewi pi kasi walo");
        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kasi walo");

        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen pimeja walo pi selo pona");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen pimeja walo pi selo pona");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, "supa pi linja sewi pi kiwen pimeja leko");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen pimeja leko");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen pimeja pi selo pona");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen pimeja pi selo pona");

        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen anpa pi selo pona");
        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen anpa pi selo pona");

        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen walo pimeja pi selo pona");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen walo pimeja pi selo pona");

        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen loje pi selo pona");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen loje pi selo pona");

        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, "supa pi linja sewi pi ko seli kiwen pi selo pona");
        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi ko seli kiwen pi selo pona");

        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, "supa pi linja sewi pi kiwen leko Prismarine");
        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen leko Prismarine");

        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen Prismarine");
        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen Prismarine");

        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB, "supa pi linja sewi pi kiwen Purpur");
        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen Purpur");

        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB, "supa pi linja sewi pi kiwen walo");
        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen walo");

        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, "supa pi linja sewi pi kiwen leko loje pi ma Nether");
        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen leko loje pi ma Nether");

        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ko loje");
        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ko loje");

        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ko loje");
        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ko loje");

        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ko");
        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ko");

        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, "supa pi linja sewi pi kiwen walo pi selo pona");
        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen walo pi selo pona");

        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ko loje pi selo pona");
        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ko loje pi selo pona");

        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ko pi selo pona");
        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ko pi selo pona");

        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "supa pi linja sewi kiwen pi selo pona");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi kiwen pi selo pona");

        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB, "supa pi linja sewi pi kasi lete");
        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kasi lete");

        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB, "supa pi linja sewi pi kiwen leko");
        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen leko");

        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB, "supa pi linja sewi kiwen");
        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB.asItem(), "supa pi linja sewi kiwen");

        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB, "supa pi linja sewi pi ko seli kiwen leko");
        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi ko seli kiwen leko");

        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB, "supa pi linja sewi pi ko seli kiwen");
        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi ko seli kiwen");

        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB, "supa pi linja sewi pi soko laso");
        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi soko laso");

        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ante awen");
        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ante awen");

        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ante awen pi loje ma");
        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ante awen pi loje ma");

        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ante awen laso");
        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ante awen laso");

        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ante awen pi laso lili");
        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ante awen pi laso lili");

        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, "supa pi linja sewi pi kiwen ante pi laso lili");
        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "supa pi linja sewi pi kiwen ante pi laso lili");

    }

}