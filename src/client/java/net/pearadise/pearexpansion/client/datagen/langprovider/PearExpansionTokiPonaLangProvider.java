package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;
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
public class PearExpansionTokiPonaLangProvider extends FabricLanguageProvider {

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
    protected PearExpansionTokiPonaLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
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
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock(), "supa pi linja sewi pi kasi seli");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock().asItem(), "supa pi linja sewi pi kasi seli");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock(), "supa pi linja sewi pi kiwen pimeja walo");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen pimeja walo");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock(), "supa pi linja sewi namako pi kasi palisa");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock().asItem(), "supa pi linja sewi namako pi kasi palisa");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock(), "supa pi linja sewi pi kasi palisa");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock().asItem(), "supa pi linja sewi pi kasi palisa");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock(), "supa pi linja sewi pi kasi jelo");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock().asItem(), "supa pi linja sewi pi kasi jelo");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock(), "supa pi linja sewi kiwen pimeja");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock().asItem(), "supa pi linja sewi kiwen pimeja");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock(), "supa pi linja sewi pi kiwen leko loje");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen leko loje");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock(), "supa pi linja sewi pi kasi suwi");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock().asItem(), "supa pi linja sewi pi kasi suwi");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock(), "supa pi linja sewi pi kiwen anpa nena");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen anpa nena");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock(), "supa pi linja sewi pi kiwen nena");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen nena");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock(), "supa pi linja sewi pi soko loje");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock().asItem(), "supa pi linja sewi pi soko loje");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock(), "supa pi linja sewi pi kiwen ante");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ante");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock(), "supa pi linja sewi pi kiwen ko loje kipisi");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ko loje kipisi");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock(), "supa pi linja sewi pi kiwen ko kipisi");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ko kipisi");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock(), "supa pi linja sewi pi kasi pimeja");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kasi pimeja");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock(), "supa pi linja sewi pi kiwen Prismarine pimeja");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen Prismarine pimeja");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock(), "supa pi linja sewi pi kiwen anpa leko");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen anpa leko");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock(), "supa pi linja sewi pi kiwen anpa pi leko lipu");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen anpa pi leko lipu");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock(), "supa pi linja sewi pi kiwen walo pimeja");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen walo pimeja");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock(), "supa pi linja sewi kiwen pi ma End");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi kiwen pi ma End");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock(), "supa pi linja sewi pi kiwen ante pi loje ma");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ante pi loje ma");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock(), "supa pi linja sewi pi kiwen loje");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen loje");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock(), "supa pi linja sewi pi kasi suli");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kasi suli");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock(), "supa pi linja sewi pi kasi telo");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kasi telo");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock(), "supa pi linja sewi pi kiwen nena kasi");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen nena kasi");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock(), "supa pi linja sewi pi kiwen leko kasi");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen leko kasi");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock(), "supa pi linja sewi pi kiwen leko ma");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen leko ma");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock(), "supa pi linja sewi pi ma Nether");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi ma Nether");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock(), "supa pi linja sewi pi kasi kili");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kasi kili");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock(), "supa pi linja sewi pi kiwen ante laso");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ante laso");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock(), "supa pi linja sewi pi kasi walo");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kasi walo");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock(), "supa pi linja sewi pi kiwen pimeja walo pi selo pona");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen pimeja walo pi selo pona");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock(), "supa pi linja sewi pi kiwen pimeja leko");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen pimeja leko");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock(), "supa pi linja sewi pi kiwen pimeja pi selo pona");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen pimeja pi selo pona");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock(), "supa pi linja sewi pi kiwen anpa pi selo pona");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen anpa pi selo pona");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock(), "supa pi linja sewi pi kiwen walo pimeja pi selo pona");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen walo pimeja pi selo pona");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock(), "supa pi linja sewi pi kiwen loje pi selo pona");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen loje pi selo pona");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock(), "supa pi linja sewi pi ko seli kiwen pi selo pona");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock().asItem(), "supa pi linja sewi pi ko seli kiwen pi selo pona");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock(), "supa pi linja sewi pi kiwen leko Prismarine");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen leko Prismarine");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock(), "supa pi linja sewi pi kiwen Prismarine");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen Prismarine");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock(), "supa pi linja sewi pi kiwen Purpur");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen Purpur");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock(), "supa pi linja sewi pi kiwen walo");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen walo");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock(), "supa pi linja sewi pi kiwen leko loje pi ma Nether");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen leko loje pi ma Nether");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock(), "supa pi linja sewi pi kiwen ko loje");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ko loje");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock(), "supa pi linja sewi pi kiwen ko loje");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ko loje");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock(), "supa pi linja sewi pi kiwen ko");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ko");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock(), "supa pi linja sewi pi kiwen walo pi selo pona");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen walo pi selo pona");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock(), "supa pi linja sewi pi kiwen ko loje pi selo pona");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ko loje pi selo pona");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock(), "supa pi linja sewi pi kiwen ko pi selo pona");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ko pi selo pona");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock(), "supa pi linja sewi kiwen pi selo pona");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock().asItem(), "supa pi linja sewi kiwen pi selo pona");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock(), "supa pi linja sewi pi kasi lete");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock().asItem(), "supa pi linja sewi pi kasi lete");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock(), "supa pi linja sewi pi kiwen leko");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen leko");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock(), "supa pi linja sewi kiwen");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock().asItem(), "supa pi linja sewi kiwen");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock(), "supa pi linja sewi pi ko seli kiwen leko");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock().asItem(), "supa pi linja sewi pi ko seli kiwen leko");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock(), "supa pi linja sewi pi ko seli kiwen");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock().asItem(), "supa pi linja sewi pi ko seli kiwen");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock(), "supa pi linja sewi pi soko laso");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock().asItem(), "supa pi linja sewi pi soko laso");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock(), "supa pi linja sewi pi kiwen ante awen");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ante awen");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock(), "supa pi linja sewi pi kiwen ante awen pi loje ma");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ante awen pi loje ma");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock(), "supa pi linja sewi pi kiwen ante awen laso");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ante awen laso");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock(), "supa pi linja sewi pi kiwen ante awen pi laso lili");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ante awen pi laso lili");

        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock(), "supa pi linja sewi pi kiwen ante pi laso lili");
        translationBuilder.add(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock().asItem(), "supa pi linja sewi pi kiwen ante pi laso lili");

    }

}