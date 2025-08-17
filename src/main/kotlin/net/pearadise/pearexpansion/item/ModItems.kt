package net.pearadise.pearexpansion.item

import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.ConsumableComponents
import net.minecraft.component.type.FoodComponents
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity
import net.pearadise.pearexpansion.MOD_ID
import net.pearadise.pearexpansion.PearExpansion

/**
 * Handles registration of all custom items for the mod.
 *
 * This object defines and registers pear-related items.
 */
object ModItems {

    /**
     * Basic pear item.
     *
     * Acts like a regular apple in the game.
     */
    val PEAR: Item = register(
        "pear",
        Item.Settings().food(FoodComponents.APPLE)
    )

    /**
     * Golden pear item.
     *
     * Functions like a golden apple, giving special effects when eaten.
     */
    val GOLDEN_PEAR: Item = register(
        "golden_pear",
        Item.Settings().food(FoodComponents.GOLDEN_APPLE, ConsumableComponents.GOLDEN_APPLE)
    )

    /**
     * Enchanted golden pear item.
     *
     * Rare item with strong effects, similar to an enchanted golden apple.
     */
    val ENCHANTED_GOLDEN_PEAR: Item = register(
        "enchanted_golden_pear",
        Item.Settings()
            .rarity(Rarity.RARE)
            .food(FoodComponents.ENCHANTED_GOLDEN_APPLE, ConsumableComponents.ENCHANTED_GOLDEN_APPLE)
            .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
    )

    /**
     * Registers an item with the given ID and settings.
     *
     * @param id The string ID for the item.
     * @param settings The item settings.
     * @return The registered [Item].
     */
    fun register(id: String, settings: Item.Settings): Item =
        register(keyOf(id), ::Item, settings)

    /**
     * Creates a registry key for an item using its ID.
     *
     * @param id The string ID for the item.
     * @return The [RegistryKey] for the item.
     */
    private fun keyOf(id: String): RegistryKey<Item> =
        RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, id))

    /**
     * Registers an item with a custom factory and settings.
     *
     * @param key The registry key for the item.
     * @param factory The function to create the item.
     * @param settings The item settings.
     * @return The registered [Item].
     */
    fun register(key: RegistryKey<Item>, factory: (Item.Settings) -> Item, settings: Item.Settings): Item {
        val item = factory(settings.registryKey(key))
        // If the item is a BlockItem, add it to the block items map
        if (item is BlockItem) {
            item.appendBlocks(Item.BLOCK_ITEMS, item)
        }
        return Registry.register(Registries.ITEM, key, item)
    }

    /**
     * Initializes the mod items.
     *
     * Should be called during mod setup.
     */
    fun initialize() {
        PearExpansion.LOGGER.info("ModItems initialized.")
    }
}