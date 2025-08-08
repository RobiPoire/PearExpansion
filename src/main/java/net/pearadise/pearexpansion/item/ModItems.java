/**
 * Enumeration of custom items for the PearExpansion mod.
 * <p>
 * Each enum constant represents a mod item with its unique identifier and
 * settings, including food components, consumable components, rarity, and
 * additional data components.
 * </p>
 *
 * <p>Items are registered to the Minecraft registry upon construction,
 * and grouped into default item groups during initialization.</p>
 *
 * @author RobiPoire
 */
package net.pearadise.pearexpansion.item;

import net.pearadise.pearexpansion.PearExpansion;
import net.pearadise.pearexpansion.component.type.ModConsumableComponents;
import net.pearadise.pearexpansion.component.type.ModFoodComponents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public enum ModItems {

    /**
     * Basic pear item that restores hunger using the PEAR food component.
     */
    PEAR(
            "pear",
            new Item.Settings()
                    .food(ModFoodComponents.PEAR.getFoodComponent())
    ),

    /**
     * Golden pear item that restores hunger and applies additional effects
     * using GOLDEN_PEAR food and consumable components.
     */
    GOLDEN_PEAR(
            "golden_pear",
            new Item.Settings()
                    .food(
                            ModFoodComponents.GOLDEN_PEAR.getFoodComponent(),
                            ModConsumableComponents.GOLDEN_PEAR.getConsumableComponent()
                    )
    ),

    /**
     * Enchanted golden pear with rare rarity, hunger restoration, status effects,
     * and an enchantment glint override component.
     */
    ENCHANTED_GOLDEN_PEAR(
            "enchanted_golden_pear",
            new Item.Settings()
                    .rarity(Rarity.RARE)
                    .food(
                            ModFoodComponents.ENCHANTED_GOLDEN_PEAR.getFoodComponent(),
                            ModConsumableComponents.ENCHANTED_GOLDEN_PEAR.getConsumableComponent()
                    )
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
    );

    /**
     * The registered {@link Item} instance.
     */
    private final Item item;

    /**
     * Constructs a new enum constant by registering an item with the given
     * identifier and settings.
     *
     * @param id       the string identifier of the item
     * @param settings the item settings to apply
     */
    ModItems(String id, Item.Settings settings) {
        this.item = Items.register(
                RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PearExpansion.MOD_ID, id)),
                Item::new,
                settings
        );
    }

    /**
     * Initializes all mod items by adding them to the default item group.
     * <p>
     * This method should be called during mod initialization to ensure items
     * appear in the creative inventory.
     * </p>
     *
     * @since 0.1
     * <p>Example usage:</p>
     * <pre><code>
     * ModItems.init();
     * </code></pre>
     */
    public static void init() {
        for (ModItems entry : values()) {
            ModItemGroups.addItemToDefaultGroup(entry.getItem());
        }
    }

    /**
     * Retrieves the registered {@link Item} instance for this enum constant.
     *
     * @return the {@code Item}
     */
    public Item getItem() {
        return item;
    }
}

