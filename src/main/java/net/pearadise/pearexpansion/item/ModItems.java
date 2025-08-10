package net.pearadise.pearexpansion.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.pearadise.pearexpansion.PearExpansion;

import java.util.function.Function;

/**
 * Registers and manages custom items and item groups for the Pear Expansion mod.
 *
 * <p>
 * This class defines, registers, and manages all custom items and the custom item group
 * for the mod. It provides helper methods for item registration and ensures that all
 * items are added to the creative inventory tab. Call {@link #initialize()} during mod
 * initialization to register items and item groups.
 * </p>
 *
 * @author RobiPoire
 * @see net.pearadise.pearexpansion.PearExpansion
 */
public class ModItems {

    /**
     * The registry key for the custom item group used by the Pear Expansion mod.
     */
    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(),
            Identifier.of(PearExpansion.MOD_ID, "item_group")
    );

    /**
     * The basic Pear item.
     *
     * <p>
     * Restores 4 hunger and provides a low saturation modifier.
     * </p>
     */
    public static final Item PEAR = register(
            "pear",
            Item::new,
            new Item.Settings().food(new FoodComponent.Builder()
                    .nutrition(4)
                    .saturationModifier(0.3f)
                    .build())
    );

    /**
     * The custom item group instance containing all mod items.
     *
     * <p>
     * This group is used to display all custom items in the creative inventory.
     * </p>
     */
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.PEAR))
            .displayName(Text.translatable("itemGroup.pear_expansion"))
            .build();

    /**
     * The Golden Pear item.
     *
     * <p>
     * Restores 4 hunger, provides high saturation, and grants
     * Regeneration and Absorption effects upon consumption.
     * </p>
     */
    public static final Item GOLDEN_PEAR = register(
            "golden_pear",
            Item::new,
            new Item.Settings().food(new FoodComponent.Builder()
                            .nutrition(4)
                            .saturationModifier(1.2f)
                            .alwaysEdible()
                            .build(),
                    ConsumableComponents.food()
                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1)))
                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                    new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0)))
                            .build())
    );

    /**
     * The Enchanted Golden Pear item.
     *
     * <p>
     * Restores 4 hunger, provides high saturation, and grants
     * Regeneration, Resistance, Fire Resistance, and enhanced Absorption
     * effects upon consumption.
     * </p>
     */
    public static final Item ENCHANTED_GOLDEN_PEAR = register(
            "enchanted_golden_pear",
            Item::new,
            new Item.Settings().rarity(Rarity.RARE)
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
                    .food(new FoodComponent.Builder()
                                    .nutrition(4)
                                    .saturationModifier(1.2f)
                                    .alwaysEdible()
                                    .build(),
                            ConsumableComponents.food()
                                    .consumeEffect(new ApplyEffectsConsumeEffect(
                                            new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1)))
                                    .consumeEffect(new ApplyEffectsConsumeEffect(
                                            new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0)))
                                    .consumeEffect(new ApplyEffectsConsumeEffect(
                                            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0)))
                                    .consumeEffect(new ApplyEffectsConsumeEffect(
                                            new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3)))
                                    .build())
    );

    /**
     * Registers a custom item with the specified name, factory, and settings.
     *
     * <p>
     * This method creates and registers a new item in the mod's namespace using the provided
     * factory and settings. The item is registered with the Fabric registry system.
     * </p>
     *
     * @param name        the unique name of the item within the mod namespace
     * @param itemFactory a function that creates the item from its settings
     * @param settings    the settings to apply to the item
     * @return the registered {@link Item} instance
     */
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PearExpansion.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

    /**
     * Initializes the mod's items and item group.
     *
     * <p>
     * Registers the custom item group and adds all custom items to it.
     * This method should be called during the mod's initialization phase,
     * typically from the mod initializer.
     * </p>
     */
    public static void initialize() {
        // Register the custom item group in the registry
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        // Add all custom items to the item group for creative inventory display
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.PEAR);
            itemGroup.add(ModItems.GOLDEN_PEAR);
            itemGroup.add(ModItems.ENCHANTED_GOLDEN_PEAR);
        });
    }
}