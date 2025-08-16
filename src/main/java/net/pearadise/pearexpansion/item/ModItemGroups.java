package net.pearadise.pearexpansion.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pearadise.pearexpansion.PearExpansion;
import net.pearadise.pearexpansion.util.ModContentLists;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> PEAR_EXPANSION =
            RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(PearExpansion.MOD_ID, "item_group"));

    public static void initialize() {

        Registry.register(Registries.ITEM_GROUP, PEAR_EXPANSION, FabricItemGroup.builder().icon(() ->
                new ItemStack(ModItems.PEAR)).displayName(Text.translatable("itemGroup.pear_expansion")).build());


        ItemGroupEvents.modifyEntriesEvent(PEAR_EXPANSION).register(itemGroup -> {
            for (ItemConvertible itemConvertible : ModContentLists.ALL_ITEMS_CONVERTIBLE) {
                itemGroup.add(itemConvertible);
            }
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(itemGroup -> {
            itemGroup.add(ModItems.PEAR);
            itemGroup.add(ModItems.GOLDEN_PEAR);
            itemGroup.add(ModItems.ENCHANTED_GOLDEN_PEAR);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(itemGroup -> {
            for (Block verticalSlab : ModContentLists.ALL_VERTICAL_SLABS) {
                itemGroup.add(verticalSlab);
            }
        });
    }
}