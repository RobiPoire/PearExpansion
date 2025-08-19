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
import net.pearadise.pearexpansion.item.enums.CrabClawLevel

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
     * Register a plain item with the default Item factory.
     */
    private fun register(id: String, settings: Item.Settings): Item =
        register(keyOf(id), ::Item, settings)

    /**
     * Register an item with a custom factory.
     */
    private fun register(id: String, factory: (Item.Settings) -> Item, settings: Item.Settings): Item =
        register(keyOf(id), factory, settings)

    /**
     * Core register implementation that builds the item with its registry key,
     * registers the item, and ensures BlockItem entries are appended when needed.
     */
    private fun register(key: RegistryKey<Item>, factory: (Item.Settings) -> Item, settings: Item.Settings): Item {
        val item = factory(settings.registryKey(key))

        // If a BlockItem, ensure it's registered in Item.BLOCK_ITEMS
        if (item is BlockItem) item.appendBlocks(Item.BLOCK_ITEMS, item)

        return Registry.register(Registries.ITEM, key, item)
    }

    /**
     * Creates a registry key for an item using its ID.
     */
    private fun keyOf(id: String): RegistryKey<Item> =
        RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, id))

    /**
     * Initializes the mod items.
     *
     * Should be called during mod setup.
     */
    fun initialize() {
        PearExpansion.LOGGER.info("ModItems initialized.")
    }
}