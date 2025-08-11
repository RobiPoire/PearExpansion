package net.pearadise.pearexpansion.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.pearadise.pearexpansion.PearExpansion;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;
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
    /**
     * Array containing all custom vertical slab blocks.
     *
     * <p>Used to populate the custom item group and for batch operations.
     */
    public static final Block[] ALL_BLOCKS = VerticalSlabBlockEnum.getBlocksFromEnums(VerticalSlabBlockEnum.getAllVerticalSlabs());


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
    public static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
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