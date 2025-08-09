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
 * <p>
 * This class handles the registration of vertical slab blocks and their corresponding items,
 * as well as their integration into custom item groups. It provides utility methods for
 * block and item registration, and ensures all blocks are properly initialized for the mod.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class ModBlocks {

    /**
     * Vertical Oak Slab block instance.
     */
    public static final Block VERTICAL_OAK_SLAB = register(
            "vertical_oak_slab", VerticalSlabBlock::new, Blocks.OAK_SLAB.getSettings(), true
    );

    /**
     * Vertical Spruce Slab block instance.
     */
    public static final Block VERTICAL_SPRUCE_SLAB = register(
            "vertical_spruce_slab", VerticalSlabBlock::new, Blocks.SPRUCE_SLAB.getSettings(), true
    );
    /**
     * Vertical Birch Slab block instance.
     */
    public static final Block VERTICAL_BIRCH_SLAB = register(
            "vertical_birch_slab", VerticalSlabBlock::new, Blocks.BIRCH_SLAB.getSettings(), true
    );
    /**
     * Vertical Jungle Slab block instance.
     */
    public static final Block VERTICAL_JUNGLE_SLAB = register(
            "vertical_jungle_slab", VerticalSlabBlock::new, Blocks.JUNGLE_SLAB.getSettings(), true
    );
    /**
     * Vertical Acacia Slab block instance.
     */
    public static final Block VERTICAL_ACACIA_SLAB = register(
            "vertical_acacia_slab", VerticalSlabBlock::new, Blocks.ACACIA_SLAB.getSettings(), true
    );
    /**
     * Vertical Dark Oak Slab block instance.
     */
    public static final Block VERTICAL_DARK_OAK_SLAB = register(
            "vertical_dark_oak_slab", VerticalSlabBlock::new, Blocks.DARK_OAK_SLAB.getSettings(), true
    );
    /**
     * Vertical Mangrove Slab block instance.
     */
    public static final Block VERTICAL_MANGROVE_SLAB = register(
            "vertical_mangrove_slab", VerticalSlabBlock::new, Blocks.MANGROVE_SLAB.getSettings(), true
    );
    /**
     * Vertical Cherry Slab block instance.
     */
    public static final Block VERTICAL_CHERRY_SLAB = register(
            "vertical_cherry_slab", VerticalSlabBlock::new, Blocks.CHERRY_SLAB.getSettings(), true
    );

    /**
     * Registers a block and optionally its item in the mod's registries.
     * <p>
     * This method creates a block using the provided factory and settings, registers it with a unique key,
     * and if specified, registers a corresponding BlockItem.
     * </p>
     *
     * @param name               The registry name for the block.
     * @param blockFactory       The factory function to create the block.
     * @param settings           The block settings to use.
     * @param shouldRegisterItem Whether to also register a BlockItem for this block.
     * @return The registered Block instance.
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

    /**
     * Creates a registry key for a block using the mod's namespace.
     *
     * @param name The name of the block.
     * @return The registry key for the block.
     */
    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(PearExpansion.MOD_ID, name));
    }

    /**
     * Creates a registry key for an item using the mod's namespace.
     *
     * @param name The name of the item.
     * @return The registry key for the item.
     */
    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PearExpansion.MOD_ID, name));
    }

    /**
     * Initializes all custom blocks for the mod.
     * <p>
     * This method should be called during mod initialization to ensure all blocks and their item groups are set up.
     * </p>
     */
    public static void initialize() {
        setupItemGroups();
    }

    /**
     * Adds all custom blocks to the mod's custom item group.
     * <p>
     * Registers each vertical slab block to the custom item group for display in the creative inventory.
     * </p>
     */
    public static void setupItemGroups() {

        ItemGroupEvents.modifyEntriesEvent(ModItems.CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
            itemGroup.add(ModBlocks.VERTICAL_OAK_SLAB);
            itemGroup.add(ModBlocks.VERTICAL_SPRUCE_SLAB);
            itemGroup.add(ModBlocks.VERTICAL_BIRCH_SLAB);
            itemGroup.add(ModBlocks.VERTICAL_JUNGLE_SLAB);
            itemGroup.add(ModBlocks.VERTICAL_ACACIA_SLAB);
            itemGroup.add(ModBlocks.VERTICAL_DARK_OAK_SLAB);
            itemGroup.add(ModBlocks.VERTICAL_MANGROVE_SLAB);
            itemGroup.add(ModBlocks.VERTICAL_CHERRY_SLAB);
        });
    }

}