package net.pearadise.pearexpansion.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
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

    public static final Block OAK_VERTICAL_SLAB =
            register(
                    "oak_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.OAK_SLAB));

    public static final Block SPRUCE_VERTICAL_SLAB =
            register(
                    "spruce_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SPRUCE_SLAB));
    public static final Block BIRCH_VERTICAL_SLAB =
            register(
                    "birch_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.BIRCH_SLAB));
    public static final Block JUNGLE_VERTICAL_SLAB =
            register(
                    "jungle_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB));
    public static final Block ACACIA_VERTICAL_SLAB =
            register(
                    "acacia_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.ACACIA_SLAB));
    public static final Block DARK_OAK_VERTICAL_SLAB =
            register(
                    "dark_oak_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.DARK_OAK_SLAB));
    public static final Block MANGROVE_VERTICAL_SLAB =
            register(
                    "mangrove_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB));
    public static final Block CHERRY_VERTICAL_SLAB =
            register(
                    "cherry_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.CHERRY_SLAB));
    public static final Block CRIMSON_VERTICAL_SLAB =
            register(
                    "crimson_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB));
    public static final Block WARPED_VERTICAL_SLAB =
            register(
                    "warped_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.WARPED_SLAB));
    public static final Block BAMBOO_VERTICAL_SLAB =
            register(
                    "bamboo_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.BAMBOO_SLAB));
    public static final Block BAMBOO_MOSAIC_VERTICAL_SLAB =
            register(
                    "bamboo_mosaic_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC_SLAB));
    public static final Block PALE_OAK_VERTICAL_SLAB =
            register(
                    "pale_oak_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.PALE_OAK_SLAB));

    public static final Block CUT_COPPER_VERTICAL_SLAB =
            register(
                    "cut_copper_vertical_slab",
                    settings -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings),
                    AbstractBlock.Settings.copy(Blocks.CUT_COPPER_SLAB));

    public static final Block EXPOSED_CUT_COPPER_VERTICAL_SLAB =
            register(
                    "exposed_cut_copper_vertical_slab",
                    settings -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings),
                    AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER_SLAB));
    public static final Block WEATHERED_CUT_COPPER_VERTICAL_SLAB =
            register(
                    "weathered_cut_copper_vertical_slab",
                    settings -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings),
                    AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER_SLAB));
    public static final Block OXIDIZED_CUT_COPPER_VERTICAL_SLAB =
            register(
                    "oxidized_cut_copper_vertical_slab",
                    settings -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings),
                    AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER_SLAB));
    public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB =
            register(
                    "waxed_cut_copper_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB));
    public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB =
            register(
                    "waxed_exposed_cut_copper_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB));
    public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB =
            register(
                    "waxed_weathered_cut_copper_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB =
            register(
                    "waxed_oxidized_cut_copper_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB));

    public static final Block STONE_VERTICAL_SLAB =
            register(
                    "stone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.STONE_SLAB));
    public static final Block SMOOTH_STONE_VERTICAL_SLAB =
            register(
                    "smooth_stone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE_SLAB));
    public static final Block SANDSTONE_VERTICAL_SLAB =
            register(
                    "sandstone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB));
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB =
            register(
                    "cut_sandstone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE_SLAB));
    public static final Block COBBLESTONE_VERTICAL_SLAB =
            register(
                    "cobblestone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.COBBLESTONE_SLAB));
    public static final Block BRICK_VERTICAL_SLAB =
            register(
                    "brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.BRICK_SLAB));
    public static final Block STONE_BRICK_VERTICAL_SLAB =
            register(
                    "stone_brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB));
    public static final Block QUARTZ_VERTICAL_SLAB =
            register(
                    "quartz_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.QUARTZ_SLAB));
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB =
            register(
                    "smooth_quartz_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB));
    public static final Block RED_SANDSTONE_VERTICAL_SLAB =
            register(
                    "red_sandstone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE_SLAB));
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB =
            register(
                    "cut_red_sandstone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE_SLAB));
    public static final Block PURPUR_VERTICAL_SLAB =
            register(
                    "purpur_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.PURPUR_SLAB));
    public static final Block PRISMARINE_VERTICAL_SLAB =
            register(
                    "prismarine_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.PRISMARINE_SLAB));
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB =
            register(
                    "prismarine_brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICK_SLAB));
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB =
            register(
                    "dark_prismarine_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE_SLAB));
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB =
            register(
                    "polished_granite_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_SLAB));
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB =
            register(
                    "smooth_red_sandstone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB));
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB =
            register(
                    "mossy_stone_brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICK_SLAB));
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB =
            register(
                    "polished_diorite_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE_SLAB));
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB =
            register(
                    "mossy_cobblestone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE_SLAB));
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB =
            register(
                    "smooth_sandstone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB));
    public static final Block GRANITE_VERTICAL_SLAB =
            register(
                    "granite_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB));
    public static final Block ANDESITE_VERTICAL_SLAB =
            register(
                    "andesite_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.ANDESITE_SLAB));
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB =
            register(
                    "polished_andesite_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE_SLAB));
    public static final Block DIORITE_VERTICAL_SLAB =
            register(
                    "diorite_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB));
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB =
            register(
                    "red_nether_brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB));
    public static final Block NETHER_BRICK_VERTICAL_SLAB =
            register(
                    "nether_brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB));
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB =
            register(
                    "cobbled_deepslate_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB));
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB =
            register(
                    "polished_deepslate_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB));
    public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB =
            register(
                    "deepslate_brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB));
    public static final Block DEEPSLATE_TILE_VERTICAL_SLAB =
            register(
                    "deepslate_tile_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB));
    public static final Block BLACKSTONE_VERTICAL_SLAB =
            register(
                    "blackstone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.BLACKSTONE_SLAB));
    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB =
            register(
                    "polished_blackstone_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_SLAB));
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB =
            register(
                    "polished_blackstone_brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB));
    public static final Block MUD_BRICK_VERTICAL_SLAB =
            register(
                    "mud_brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.MUD_BRICK_SLAB));
    public static final Block RESIN_BRICK_VERTICAL_SLAB =
            register(
                    "resin_brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.RESIN_BRICK_SLAB));
    public static final Block TUFF_VERTICAL_SLAB =
            register(
                    "tuff_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.TUFF_SLAB));
    public static final Block POLISHED_TUFF_VERTICAL_SLAB =
            register(
                    "polished_tuff_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF_SLAB));
    public static final Block TUFF_BRICK_VERTICAL_SLAB =
            register(
                    "tuff_brick_vertical_slab",
                    VerticalSlabBlock::new,
                    AbstractBlock.Settings.copy(Blocks.TUFF_BRICK_SLAB));
    public static final Block END_STONE_BRICK_VERTICAL_SLAB =
            register(
                    "end_stone_brick_vertical_slab",
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
