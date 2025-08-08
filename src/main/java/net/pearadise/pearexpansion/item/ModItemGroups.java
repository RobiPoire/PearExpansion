/**
 * Enumeration of custom item groups for the PearExpansion mod.
 * <p>
 * Defines and registers creative inventory tabs specific to the mod,
 * and provides utility methods to add items to these groups.
 * </p>
 *
 * @author RobiPoire
 * @since 0.1
 */
package net.pearadise.pearexpansion.item;

import net.pearadise.pearexpansion.PearExpansion;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public enum ModItemGroups {

    /**
     * Default item group for PearExpansion, using pear as the icon.
     */
    PEAREXPANSION("pearexpansion_group", "itemGroup.pearexpansion", ModItems.PEAR.getItem());

    /**
     * The registry key for this item group.
     */
    private final RegistryKey<net.minecraft.item.ItemGroup> key;

    /**
     * The Fabric item group instance.
     */
    private final net.minecraft.item.ItemGroup group;

    /**
     * Retrieves the identifier of this item group.
     *
     * @return the item group identifier
     */
    public String getGroupId() {
        return groupId;
    }

    private final String groupId;

    /**
     * Constructs a new mod item group with the specified identifier, translation key, and icon.
     *
     * @param groupId        the identifier for the item group
     * @param translationKey the translation key for display name
     * @param iconItem       the item to use as the group icon
     */
    ModItemGroups(String groupId, String translationKey, Item iconItem) {
        this.groupId = groupId;

        this.key = RegistryKey.of(
                Registries.ITEM_GROUP.getKey(),
                Identifier.of(PearExpansion.MOD_ID, groupId)
        );

        this.group = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconItem))
                .displayName(Text.translatable(translationKey))
                .build();
    }

    /**
     * Registers all defined item groups to the game registry.
     * <p>
     * Should be called during mod initialization to make groups available
     * in the creative inventory.
     * </p>
     *
     * @since 0.1
     * <p>Example usage:</p>
     * <pre><code>
     * ModItemGroups.initialize();
     * </code></pre>
     */
    public static void init() {
        for (ModItemGroups modGroup : values()) {
            Registry.register(Registries.ITEM_GROUP, modGroup.key, modGroup.group);
        }
    }

    /**
     * Adds the specified item to the given item group.
     *
     * @param item  the item to add
     * @param group the target mod item group
     * @since 0.1
     */
    public static void addItemToGroup(Item item, ModItemGroups group) {
        ItemGroupEvents.modifyEntriesEvent(group.key)
                .register(entries -> entries.add(item));
    }

    /**
     * Adds the specified item to the default PearExpansion item group.
     *
     * @param item the item to add
     * @since 0.1
     */
    public static void addItemToDefaultGroup(Item item) {
        addItemToGroup(item, PEAREXPANSION);
    }

    /**
     * Retrieves the registry key of this item group.
     *
     * @return the item group registry key
     */
    public RegistryKey<net.minecraft.item.ItemGroup> getKey() {
        return key;
    }

    /**
     * Retrieves the Fabric item group instance.
     *
     * @return the item group
     */
    public net.minecraft.item.ItemGroup getItemGroup() {
        return group;
    }
}

