package net.pearadise.pearexpansion.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.pearadise.pearexpansion.PearExpansion;

import java.util.function.Function;

public class ModBlocks {

    public static final Block VERTICAL_OAK_SLAB =
            register(
                    "vertical_oak_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.OAK_SLAB));

    public static final Block VERTICAL_SPRUCE_SLAB =
            register(
                    "vertical_spruce_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SPRUCE_SLAB));
    public static final Block VERTICAL_BIRCH_SLAB =
            register(
                    "vertical_birch_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.BIRCH_SLAB));
    public static final Block VERTICAL_JUNGLE_SLAB =
            register(
                    "vertical_jungle_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB));
    public static final Block VERTICAL_ACACIA_SLAB =
            register(
                    "vertical_acacia_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.ACACIA_SLAB));
    public static final Block VERTICAL_DARK_OAK_SLAB =
            register(
                    "vertical_dark_oak_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.DARK_OAK_SLAB));
    public static final Block VERTICAL_MANGROVE_SLAB =
            register(
                    "vertical_mangrove_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB));
    public static final Block VERTICAL_CHERRY_SLAB =
            register(
                    "vertical_cherry_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.CHERRY_SLAB));
    public static final Block VERTICAL_CRIMSON_SLAB =
            register(
                    "vertical_crimson_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB));
    public static final Block VERTICAL_WARPED_SLAB =
            register(
                    "vertical_warped_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.WARPED_SLAB));
    public static final Block VERTICAL_BAMBOO_SLAB =
            register(
                    "vertical_bamboo_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.BAMBOO_SLAB));
    public static final Block VERTICAL_BAMBOO_MOSAIC_SLAB =
            register(
                    "vertical_bamboo_mosaic_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC_SLAB));
    public static final Block VERTICAL_PALE_OAK_SLAB =
            register(
                    "vertical_pale_oak_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.PALE_OAK_SLAB));

    public static final Block VERTICAL_CUT_COPPER_SLAB =
            register(
                    "vertical_cut_copper_slab",
                    settings -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings),
                    AbstractBlock.Settings.copy(Blocks.CUT_COPPER_SLAB));

    public static final Block VERTICAL_EXPOSED_CUT_COPPER_SLAB =
            register(
                    "vertical_exposed_cut_copper_slab",
                    settings -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings),
                    AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER_SLAB));
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_SLAB =
            register(
                    "vertical_weathered_cut_copper_slab",
                    settings -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings),
                    AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER_SLAB));
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_SLAB =
            register(
                    "vertical_oxidized_cut_copper_slab",
                    settings -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings),
                    AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER_SLAB));
    public static final Block VERTICAL_WAXED_CUT_COPPER_SLAB =
            register(
                    "vertical_waxed_cut_copper_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB));
    public static final Block VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB =
            register(
                    "vertical_waxed_exposed_cut_copper_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB));
    public static final Block VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB =
            register(
                    "vertical_waxed_weathered_cut_copper_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB));
    public static final Block VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB =
            register(
                    "vertical_waxed_oxidized_cut_copper_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB));

    public static final Block VERTICAL_STONE_SLAB =
            register(
                    "vertical_stone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.STONE_SLAB));
    public static final Block VERTICAL_SMOOTH_STONE_SLAB =
            register(
                    "vertical_smooth_stone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE_SLAB));
    public static final Block VERTICAL_SANDSTONE_SLAB =
            register(
                    "vertical_sandstone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB));
    public static final Block VERTICAL_CUT_SANDSTONE_SLAB =
            register(
                    "vertical_cut_sandstone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE_SLAB));
    public static final Block VERTICAL_COBBLESTONE_SLAB =
            register(
                    "vertical_cobblestone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.COBBLESTONE_SLAB));
    public static final Block VERTICAL_BRICK_SLAB =
            register(
                    "vertical_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.BRICK_SLAB));
    public static final Block VERTICAL_STONE_BRICK_SLAB =
            register(
                    "vertical_stone_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB));
    public static final Block VERTICAL_QUARTZ_SLAB =
            register(
                    "vertical_quartz_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.QUARTZ_SLAB));
    public static final Block VERTICAL_SMOOTH_QUARTZ_SLAB =
            register(
                    "vertical_smooth_quartz_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB));
    public static final Block VERTICAL_RED_SANDSTONE_SLAB =
            register(
                    "vertical_red_sandstone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE_SLAB));
    public static final Block VERTICAL_CUT_RED_SANDSTONE_SLAB =
            register(
                    "vertical_cut_red_sandstone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE_SLAB));
    public static final Block VERTICAL_PURPUR_SLAB =
            register(
                    "vertical_purpur_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.PURPUR_SLAB));
    public static final Block VERTICAL_PRISMARINE_SLAB =
            register(
                    "vertical_prismarine_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.PRISMARINE_SLAB));
    public static final Block VERTICAL_PRISMARINE_BRICK_SLAB =
            register(
                    "vertical_prismarine_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICK_SLAB));
    public static final Block VERTICAL_DARK_PRISMARINE_SLAB =
            register(
                    "vertical_dark_prismarine_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE_SLAB));
    public static final Block VERTICAL_POLISHED_GRANITE_SLAB =
            register(
                    "vertical_polished_granite_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_SLAB));
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_SLAB =
            register(
                    "vertical_smooth_red_sandstone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB));
    public static final Block VERTICAL_MOSSY_STONE_BRICK_SLAB =
            register(
                    "vertical_mossy_stone_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICK_SLAB));
    public static final Block VERTICAL_POLISHED_DIORITE_SLAB =
            register(
                    "vertical_polished_diorite_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE_SLAB));
    public static final Block VERTICAL_MOSSY_COBBLESTONE_SLAB =
            register(
                    "vertical_mossy_cobblestone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE_SLAB));
    public static final Block VERTICAL_SMOOTH_SANDSTONE_SLAB =
            register(
                    "vertical_smooth_sandstone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB));
    public static final Block VERTICAL_GRANITE_SLAB =
            register(
                    "vertical_granite_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB));
    public static final Block VERTICAL_ANDESITE_SLAB =
            register(
                    "vertical_andesite_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.ANDESITE_SLAB));
    public static final Block VERTICAL_POLISHED_ANDESITE_SLAB =
            register(
                    "vertical_polished_andesite_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE_SLAB));
    public static final Block VERTICAL_DIORITE_SLAB =
            register(
                    "vertical_diorite_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB));
    public static final Block VERTICAL_RED_NETHER_BRICK_SLAB =
            register(
                    "vertical_red_nether_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB));
    public static final Block VERTICAL_NETHER_BRICK_SLAB =
            register(
                    "vertical_nether_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB));
    public static final Block VERTICAL_COBBLED_DEEPSLATE_SLAB =
            register(
                    "vertical_cobbled_deepslate_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB));
    public static final Block VERTICAL_POLISHED_DEEPSLATE_SLAB =
            register(
                    "vertical_polished_deepslate_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB));
    public static final Block VERTICAL_DEEPSLATE_BRICK_SLAB =
            register(
                    "vertical_deepslate_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB));
    public static final Block VERTICAL_DEEPSLATE_TILE_SLAB =
            register(
                    "vertical_deepslate_tile_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB));
    public static final Block VERTICAL_BLACKSTONE_SLAB =
            register(
                    "vertical_blackstone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.BLACKSTONE_SLAB));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_SLAB =
            register(
                    "vertical_polished_blackstone_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_SLAB));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB =
            register(
                    "vertical_polished_blackstone_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB));
    public static final Block VERTICAL_MUD_BRICK_SLAB =
            register(
                    "vertical_mud_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.MUD_BRICK_SLAB));
    public static final Block VERTICAL_RESIN_BRICK_SLAB =
            register(
                    "vertical_resin_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.RESIN_BRICK_SLAB));
    public static final Block VERTICAL_TUFF_SLAB =
            register(
                    "vertical_tuff_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.TUFF_SLAB));
    public static final Block VERTICAL_POLISHED_TUFF_SLAB =
            register(
                    "vertical_polished_tuff_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF_SLAB));
    public static final Block VERTICAL_TUFF_BRICK_SLAB =
            register(
                    "vertical_tuff_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.TUFF_BRICK_SLAB));
    public static final Block VERTICAL_END_STONE_BRICK_SLAB =
            register(
                    "vertical_end_stone_brick_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB));

    private static Block register(String id, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return register(keyOf(id), factory, settings);
    }

    private static Block register(RegistryKey<Block> key, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        // 1) on crée et enregistre le block
        Block block = factory.apply(settings.registryKey(key));
        Block registered = Registry.register(Registries.BLOCK, key, block);

        // 2) on crée ET enregistre le BlockItem correspondant (même id)
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, key.getValue());
        Registry.register(
                Registries.ITEM,
                itemKey,
                new BlockItem(registered, new Item.Settings().registryKey(itemKey))
        );
        return registered;
    }

    private static RegistryKey<Block> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(PearExpansion.MOD_ID, id));
    }

    public static void initialize() {
        PearExpansion.LOGGER.info("ModBlocks initialized.");
    }

}


