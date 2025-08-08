/**
 * Enumeration of custom food components for the PearExpansion mod.
 * <p>
 * Each enum constant represents a {@link net.minecraft.component.type.FoodComponent}
 * preconfigured with specific nutrition, saturation, and edible flags.
 * </p>
 *
 * @author RobiPoire
 * @since 0.1
 */
package net.pearadise.pearexpansion.type;

import net.minecraft.component.type.FoodComponent;

public enum ModFoodComponents {

    /**
     * Standard pear food component that restores 4 hunger points
     * with a saturation modifier of 0.3.
     */
    PEAR(
            createFoodComponent(4, 0.3f, false)
    ),

    /**
     * Golden pear food component that restores 4 hunger points
     * with a saturation modifier of 1.2 and is always edible.
     */
    GOLDEN_PEAR(
            createFoodComponent(4, 1.2f, true)
    ),

    /**
     * Enchanted golden pear food component identical to GOLDEN_PEAR.
     */
    ENCHANTED_GOLDEN_PEAR(
            createFoodComponent(4, 1.2f, true)
    );

    /**
     * The underlying {@link FoodComponent} instance.
     */
    private final FoodComponent component;

    /**
     * Constructs a new enum constant with the given food component.
     *
     * @param component the food component to associate with this enum constant
     */
    ModFoodComponents(FoodComponent component) {
        this.component = component;
    }

    /**
     * Creates a {@link FoodComponent} configured with specified properties.
     * <p>
     * The component will use:
     * <ul>
     *   <li>Nutrition: specified hunger points</li>
     *   <li>Saturation modifier: specified float value</li>
     *   <li>Always edible flag if enabled</li>
     * </ul>
     * </p>
     *
     * @param nutrition        amount of hunger points restored
     * @param saturation       the saturation modifier for the food
     * @param alwaysEdibleFlag whether the food can be eaten at any time
     * @return a fully configured {@link FoodComponent}
     * @since 0.1
     *
     * <p>Example usage:</p>
     * <pre><code>
     * FoodComponent comp = ModFoodComponents.createFoodComponent(2, 0.1f, false);
     * </code></pre>
     */
    private static FoodComponent createFoodComponent(int nutrition, float saturation, boolean alwaysEdibleFlag) {
        FoodComponent.Builder builder = new FoodComponent.Builder()
                .nutrition(nutrition)
                .saturationModifier(saturation);

        if (alwaysEdibleFlag) {
            builder.alwaysEdible();
        }

        return builder.build();
    }

    /**
     * Retrieves the underlying {@link FoodComponent} associated with this enum constant.
     *
     * @return the configured food component
     */
    public FoodComponent getFoodComponent() {
        return component;
    }
}

