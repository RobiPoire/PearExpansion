package net.pearadise.pearexpansion.item;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.pearadise.pearexpansion.PearExpansion;

import java.util.function.Function;


public class ModItems {
    public static final Item PEAR = register("pear",
            new Item.Settings().food(FoodComponents.APPLE));

    public static final Item GOLDEN_PEAR = register("golden_pear",
            new Item.Settings().food(FoodComponents.GOLDEN_APPLE, ConsumableComponents.GOLDEN_APPLE));

    public static final Item ENCHANTED_GOLDEN_PEAR = register("enchanted_golden_pear",
            new Item.Settings()
                    .rarity(Rarity.RARE)
                    .food(FoodComponents.ENCHANTED_GOLDEN_APPLE, ConsumableComponents.ENCHANTED_GOLDEN_APPLE)
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
    );

    public static Item register(String id, Item.Settings settings) {
        return register(keyOf(id), Item::new, settings);
    }

    private static RegistryKey<Item> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PearExpansion.MOD_ID, id));
    }

    public static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void initialize() {
        PearExpansion.LOGGER.info("ModItems initialized.");
    }

}