package net.pearadise.pearexpansion.item

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.block.Block
import net.minecraft.item.ItemConvertible
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemGroups
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import net.pearadise.pearexpansion.MOD_ID
import net.pearadise.pearexpansion.util.ModContentLists

/**
 * Handles registration and setup of custom item groups for the mod.
 *
 * This object creates the Pear Expansion item group and adds mod items
 * to relevant creative inventory tabs.
 */
object ModItemGroups {

    /**
     * Registry key for the Pear Expansion item group.
     */
    val PEAR_EXPANSION: RegistryKey<ItemGroup> =
        RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, "item_group"))

    /**
     * Registers the Pear Expansion item group and adds mod items to creative tabs.
     *
     * This function should be called during mod initialization.
     */
    fun initialize() {
        // Register the custom item group with icon and display name
        Registry.register(
            Registries.ITEM_GROUP,
            PEAR_EXPANSION,
            FabricItemGroup.builder()
                .icon { ItemStack(ModItems.PEAR) }
                .displayName(Text.translatable("itemGroup.pear_expansion"))
                .build()
        )

        // Add all mod items and blocks to the custom item group
        ItemGroupEvents.modifyEntriesEvent(PEAR_EXPANSION).register { entries ->
            for (itemConvertible: ItemConvertible in ModContentLists.ALL_ITEMS_CONVERTIBLE) {
                entries.add(itemConvertible)
            }
        }

        // Add pear items to the Food & Drink creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register { entries ->
            entries.add(ModItems.PEAR)
            entries.add(ModItems.GOLDEN_PEAR)
            entries.add(ModItems.ENCHANTED_GOLDEN_PEAR)
        }

        // Add all vertical slab blocks to the Building Blocks creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register { entries ->
            for (verticalSlab: Block in ModContentLists.ALL_VERTICAL_SLABS) {
                entries.add(verticalSlab)
            }
        }
    }
}