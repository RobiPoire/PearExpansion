package net.pearadise.pearexpansion.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.pearadise.pearexpansion.PearExpansion;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlock;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.function.Function;

/**
 * Registers and manages all custom blocks for the Pear Expansion mod.
 *
 * <p>This class handles the registration of all vertical slab blocks and their corresponding items.
 * It provides helper methods for block registration, maintains a list of all custom blocks,
 * and integrates them into the mod's custom item group for display in the creative inventory.
 * Call {@link #initialize()} during mod initialization to ensure all blocks are registered.
 *
 * @author RobiPoire
 * @see net.pearadise.pearexpansion.block.custom.VerticalSlabBlock
 * @see net.pearadise.pearexpansion.item.ModItems
 */
public class ModBlocks {

    // Vertical Slabs - Alphabetical order for maintainability
    public static final Block VERTICAL_ACACIA_SLAB = registerFromTemplate("vertical_acacia_slab", Blocks.ACACIA_SLAB);
    public static final Block VERTICAL_ANDESITE_SLAB = registerFromTemplate("vertical_andesite_slab", Blocks.ANDESITE_SLAB);
    public static final Block VERTICAL_BAMBOO_MOSAIC_SLAB = registerFromTemplate("vertical_bamboo_mosaic_slab", Blocks.BAMBOO_MOSAIC_SLAB);
    public static final Block VERTICAL_BAMBOO_SLAB = registerFromTemplate("vertical_bamboo_slab", Blocks.BAMBOO_SLAB);
    public static final Block VERTICAL_BIRCH_SLAB = registerFromTemplate("vertical_birch_slab", Blocks.BIRCH_SLAB);
    public static final Block VERTICAL_BLACKSTONE_SLAB = registerFromTemplate("vertical_blackstone_slab", Blocks.BLACKSTONE_SLAB);
    public static final Block VERTICAL_BRICK_SLAB = registerFromTemplate("vertical_brick_slab", Blocks.BRICK_SLAB);
    public static final Block VERTICAL_CHERRY_SLAB = registerFromTemplate("vertical_cherry_slab", Blocks.CHERRY_SLAB);
    public static final Block VERTICAL_COBBLED_DEEPSLATE_SLAB = registerFromTemplate("vertical_cobbled_deepslate_slab", Blocks.COBBLED_DEEPSLATE_SLAB);
    public static final Block VERTICAL_COBBLESTONE_SLAB = registerFromTemplate("vertical_cobblestone_slab", Blocks.COBBLESTONE_SLAB);
    public static final Block VERTICAL_CRIMSON_SLAB = registerFromTemplate("vertical_crimson_slab", Blocks.CRIMSON_SLAB);
    public static final Block VERTICAL_CUT_COPPER_SLAB = registerFromTemplate("vertical_cut_copper_slab", Blocks.CUT_COPPER_SLAB);
    public static final Block VERTICAL_CUT_RED_SANDSTONE_SLAB = registerFromTemplate("vertical_cut_red_sandstone_slab", Blocks.CUT_RED_SANDSTONE_SLAB);
    public static final Block VERTICAL_CUT_SANDSTONE_SLAB = registerFromTemplate("vertical_cut_sandstone_slab", Blocks.CUT_SANDSTONE_SLAB);
    public static final Block VERTICAL_DARK_OAK_SLAB = registerFromTemplate("vertical_dark_oak_slab", Blocks.DARK_OAK_SLAB);
    public static final Block VERTICAL_DARK_PRISMARINE_SLAB = registerFromTemplate("vertical_dark_prismarine_slab", Blocks.DARK_PRISMARINE_SLAB);
    public static final Block VERTICAL_DEEPSLATE_BRICK_SLAB = registerFromTemplate("vertical_deepslate_brick_slab", Blocks.DEEPSLATE_BRICK_SLAB);
    public static final Block VERTICAL_DEEPSLATE_TILE_SLAB = registerFromTemplate("vertical_deepslate_tile_slab", Blocks.DEEPSLATE_TILE_SLAB);
    public static final Block VERTICAL_DIORITE_SLAB = registerFromTemplate("vertical_diorite_slab", Blocks.DIORITE_SLAB);
    public static final Block VERTICAL_END_STONE_BRICK_SLAB = registerFromTemplate("vertical_end_stone_brick_slab", Blocks.END_STONE_BRICK_SLAB);
    public static final Block VERTICAL_EXPOSED_CUT_COPPER_SLAB = registerFromTemplate("vertical_exposed_cut_copper_slab", Blocks.EXPOSED_CUT_COPPER_SLAB);
    public static final Block VERTICAL_GRANITE_SLAB = registerFromTemplate("vertical_granite_slab", Blocks.GRANITE_SLAB);
    public static final Block VERTICAL_JUNGLE_SLAB = registerFromTemplate("vertical_jungle_slab", Blocks.JUNGLE_SLAB);
    public static final Block VERTICAL_MANGROVE_SLAB = registerFromTemplate("vertical_mangrove_slab", Blocks.MANGROVE_SLAB);
    public static final Block VERTICAL_MOSSY_COBBLESTONE_SLAB = registerFromTemplate("vertical_mossy_cobblestone_slab", Blocks.MOSSY_COBBLESTONE_SLAB);
    public static final Block VERTICAL_MOSSY_STONE_BRICK_SLAB = registerFromTemplate("vertical_mossy_stone_brick_slab", Blocks.MOSSY_STONE_BRICK_SLAB);
    public static final Block VERTICAL_MUD_BRICK_SLAB = registerFromTemplate("vertical_mud_brick_slab", Blocks.MUD_BRICK_SLAB);
    public static final Block VERTICAL_NETHER_BRICK_SLAB = registerFromTemplate("vertical_nether_brick_slab", Blocks.NETHER_BRICK_SLAB);
    public static final Block VERTICAL_OAK_SLAB = registerFromTemplate("vertical_oak_slab", Blocks.OAK_SLAB);
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_SLAB = registerFromTemplate("vertical_oxidized_cut_copper_slab", Blocks.OXIDIZED_CUT_COPPER_SLAB);
    public static final Block VERTICAL_PALE_OAK_SLAB = registerFromTemplate("vertical_pale_oak_slab", Blocks.PALE_OAK_SLAB);
    public static final Block VERTICAL_POLISHED_ANDESITE_SLAB = registerFromTemplate("vertical_polished_andesite_slab", Blocks.POLISHED_ANDESITE_SLAB);
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB = registerFromTemplate("vertical_polished_blackstone_brick_slab", Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
    public static final Block VERTICAL_POLISHED_BLACKSTONE_SLAB = registerFromTemplate("vertical_polished_blackstone_slab", Blocks.POLISHED_BLACKSTONE_SLAB);
    public static final Block VERTICAL_POLISHED_DIORITE_SLAB = registerFromTemplate("vertical_polished_diorite_slab", Blocks.POLISHED_DIORITE_SLAB);
    public static final Block VERTICAL_POLISHED_GRANITE_SLAB = registerFromTemplate("vertical_polished_granite_slab", Blocks.POLISHED_GRANITE_SLAB);
    public static final Block VERTICAL_POLISHED_DEEPSLATE_SLAB = registerFromTemplate("vertical_polished_deepslate_slab", Blocks.POLISHED_DEEPSLATE_SLAB);
    public static final Block VERTICAL_POLISHED_TUFF_SLAB = registerFromTemplate("vertical_polished_tuff_slab", Blocks.POLISHED_TUFF_SLAB);
    public static final Block VERTICAL_PRISMARINE_BRICK_SLAB = registerFromTemplate("vertical_prismarine_brick_slab", Blocks.PRISMARINE_BRICK_SLAB);
    public static final Block VERTICAL_PRISMARINE_SLAB = registerFromTemplate("vertical_prismarine_slab", Blocks.PRISMARINE_SLAB);
    public static final Block VERTICAL_PURPUR_SLAB = registerFromTemplate("vertical_purpur_slab", Blocks.PURPUR_SLAB);
    public static final Block VERTICAL_QUARTZ_SLAB = registerFromTemplate("vertical_quartz_slab", Blocks.QUARTZ_SLAB);
    public static final Block VERTICAL_RED_NETHER_BRICK_SLAB = registerFromTemplate("vertical_red_nether_brick_slab", Blocks.RED_NETHER_BRICK_SLAB);
    public static final Block VERTICAL_RED_SANDSTONE_SLAB = registerFromTemplate("vertical_red_sandstone_slab", Blocks.RED_SANDSTONE_SLAB);
    public static final Block VERTICAL_RESIN_BRICK_SLAB = registerFromTemplate("vertical_resin_brick_slab", Blocks.RESIN_BRICK_SLAB);
    public static final Block VERTICAL_SANDSTONE_SLAB = registerFromTemplate("vertical_sandstone_slab", Blocks.SANDSTONE_SLAB);
    public static final Block VERTICAL_SMOOTH_QUARTZ_SLAB = registerFromTemplate("vertical_smooth_quartz_slab", Blocks.SMOOTH_QUARTZ_SLAB);
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_SLAB = registerFromTemplate("vertical_smooth_red_sandstone_slab", Blocks.SMOOTH_RED_SANDSTONE_SLAB);
    public static final Block VERTICAL_SMOOTH_SANDSTONE_SLAB = registerFromTemplate("vertical_smooth_sandstone_slab", Blocks.SMOOTH_SANDSTONE_SLAB);
    public static final Block VERTICAL_SMOOTH_STONE_SLAB = registerFromTemplate("vertical_smooth_stone_slab", Blocks.SMOOTH_STONE_SLAB);
    public static final Block VERTICAL_SPRUCE_SLAB = registerFromTemplate("vertical_spruce_slab", Blocks.SPRUCE_SLAB);
    public static final Block VERTICAL_STONE_BRICK_SLAB = registerFromTemplate("vertical_stone_brick_slab", Blocks.STONE_BRICK_SLAB);
    public static final Block VERTICAL_STONE_SLAB = registerFromTemplate("vertical_stone_slab", Blocks.STONE_SLAB);
    public static final Block VERTICAL_TUFF_BRICK_SLAB = registerFromTemplate("vertical_tuff_brick_slab", Blocks.TUFF_BRICK_SLAB);
    public static final Block VERTICAL_TUFF_SLAB = registerFromTemplate("vertical_tuff_slab", Blocks.TUFF_SLAB);
    public static final Block VERTICAL_WARPED_SLAB = registerFromTemplate("vertical_warped_slab", Blocks.WARPED_SLAB);
    public static final Block VERTICAL_WAXED_CUT_COPPER_SLAB = registerFromTemplate("vertical_waxed_cut_copper_slab", Blocks.WAXED_CUT_COPPER_SLAB);
    public static final Block VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB = registerFromTemplate("vertical_waxed_exposed_cut_copper_slab", Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB);
    public static final Block VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB = registerFromTemplate("vertical_waxed_oxidized_cut_copper_slab", Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);
    public static final Block VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB = registerFromTemplate("vertical_waxed_weathered_cut_copper_slab", Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB);
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_SLAB = registerFromTemplate("vertical_weathered_cut_copper_slab", Blocks.WEATHERED_CUT_COPPER_SLAB);
    /**
     * Array containing all custom vertical slab blocks.
     *
     * <p>Used to populate the custom item group and for batch operations.
     */
    public static final Block[] ALL_BLOCKS = {
            VERTICAL_ACACIA_SLAB, VERTICAL_ANDESITE_SLAB, VERTICAL_BAMBOO_MOSAIC_SLAB, VERTICAL_BAMBOO_SLAB,
            VERTICAL_BIRCH_SLAB, VERTICAL_BLACKSTONE_SLAB, VERTICAL_BRICK_SLAB, VERTICAL_CHERRY_SLAB,
            VERTICAL_COBBLED_DEEPSLATE_SLAB, VERTICAL_COBBLESTONE_SLAB, VERTICAL_CRIMSON_SLAB, VERTICAL_CUT_COPPER_SLAB,
            VERTICAL_CUT_RED_SANDSTONE_SLAB, VERTICAL_CUT_SANDSTONE_SLAB, VERTICAL_DARK_OAK_SLAB, VERTICAL_DARK_PRISMARINE_SLAB,
            VERTICAL_DEEPSLATE_BRICK_SLAB, VERTICAL_DEEPSLATE_TILE_SLAB, VERTICAL_DIORITE_SLAB, VERTICAL_END_STONE_BRICK_SLAB,
            VERTICAL_EXPOSED_CUT_COPPER_SLAB, VERTICAL_GRANITE_SLAB, VERTICAL_JUNGLE_SLAB, VERTICAL_MANGROVE_SLAB,
            VERTICAL_MOSSY_COBBLESTONE_SLAB, VERTICAL_MOSSY_STONE_BRICK_SLAB, VERTICAL_MUD_BRICK_SLAB, VERTICAL_NETHER_BRICK_SLAB,
            VERTICAL_OAK_SLAB, VERTICAL_OXIDIZED_CUT_COPPER_SLAB, VERTICAL_PALE_OAK_SLAB, VERTICAL_POLISHED_ANDESITE_SLAB,
            VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, VERTICAL_POLISHED_BLACKSTONE_SLAB, VERTICAL_POLISHED_DIORITE_SLAB, VERTICAL_POLISHED_GRANITE_SLAB,
            VERTICAL_POLISHED_DEEPSLATE_SLAB, VERTICAL_POLISHED_TUFF_SLAB, VERTICAL_PRISMARINE_BRICK_SLAB, VERTICAL_PRISMARINE_SLAB,
            VERTICAL_PURPUR_SLAB, VERTICAL_QUARTZ_SLAB, VERTICAL_RED_NETHER_BRICK_SLAB, VERTICAL_RED_SANDSTONE_SLAB,
            VERTICAL_RESIN_BRICK_SLAB, VERTICAL_SANDSTONE_SLAB, VERTICAL_SMOOTH_QUARTZ_SLAB, VERTICAL_SMOOTH_RED_SANDSTONE_SLAB,
            VERTICAL_SMOOTH_SANDSTONE_SLAB, VERTICAL_SMOOTH_STONE_SLAB, VERTICAL_SPRUCE_SLAB, VERTICAL_STONE_BRICK_SLAB,
            VERTICAL_STONE_SLAB, VERTICAL_TUFF_BRICK_SLAB, VERTICAL_TUFF_SLAB, VERTICAL_WARPED_SLAB,
            VERTICAL_WAXED_CUT_COPPER_SLAB, VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB,
            VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, VERTICAL_WEATHERED_CUT_COPPER_SLAB
    };

    // Registers a block using the settings of a template block.
    // Used to create vertical slab variants with matching properties.
    private static Block registerFromTemplate(String name, Block template) {
        // Use the template's settings to create a new VerticalSlabBlock and register it
        return register(name, VerticalSlabBlock::new, template.getSettings(), true);
    }

    /**
     * Registers a block and optionally its item in the mod's registries.
     *
     * <p>This method creates a new block using the provided factory and settings,
     * registers it with the Fabric registry, and optionally registers a {@link BlockItem}
     * so the block appears in inventories and creative tabs.
     *
     * @param name               the registry name for the block (should be unique within the mod)
     * @param blockFactory       a function that creates the block from its settings
     * @param settings           the block settings to use (copied from a template block)
     * @param shouldRegisterItem whether to also register a BlockItem for this block
     * @return the registered {@link Block} instance
     */
    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    // Returns a registry key for a block with the given name in this mod's namespace.
    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(PearExpansion.MOD_ID, name));
    }

    // Returns a registry key for an item with the given name in this mod's namespace.
    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PearExpansion.MOD_ID, name));
    }

    /**
     * Initializes all custom blocks for the mod.
     *
     * <p>Call this method during the mod's initialization phase to ensure all blocks
     * are registered and added to the custom item group.
     */
    public static void initialize() {
        setupItemGroups();
    }

    /**
     * Adds all custom blocks to the mod's custom item group.
     *
     * <p>This method registers a callback with Fabric's {@link ItemGroupEvents}
     * to add all vertical slab blocks to the creative inventory tab.
     */
    public static void setupItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ModItems.CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
            // Add each custom block to the item group for creative inventory display
            for (Block b : ALL_BLOCKS) {
                itemGroup.add(b);
            }
        });
    }

}