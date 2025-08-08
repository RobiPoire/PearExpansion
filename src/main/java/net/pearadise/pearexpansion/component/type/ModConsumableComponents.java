/**
 * Enumeration of custom consumable components for the PearExpansion mod.
 * <p>
 * Each enum constant represents a {@link net.minecraft.component.type.ConsumableComponent}
 * preconfigured with specific status effects, use action, sound, and particles settings.
 * </p>
 *
 * @author RobiPoire
 * @since 0.1
 */
package net.pearadise.pearexpansion.component.type;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.UseAction;
import net.minecraft.sound.SoundEvents;

import java.util.List;

public enum ModConsumableComponents {

    /**
     * Enchanted golden pear component that grants:
     * <ul>
     *   <li>Regeneration II for 20 seconds</li>
     *   <li>Resistance I for 5 minutes</li>
     *   <li>Fire Resistance I for 5 minutes</li>
     *   <li>Absorption IV for 2 minutes</li>
     * </ul>
     */
    ENCHANTED_GOLDEN_PEAR(
            createFoodComponent(
                    new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1),
                    new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0),
                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0),
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3)
            )
    ),

    /**
     * Golden pear component that grants:
     * <ul>
     *   <li>Regeneration II for 5 seconds</li>
     *   <li>Absorption I for 2 minutes</li>
     * </ul>
     */
    GOLDEN_PEAR(
            createFoodComponent(
                    new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1),
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0)
            )
    );

    /**
     * The underlying {@link ConsumableComponent} instance.
     */
    private final ConsumableComponent component;

    /**
     * Constructs a new enum constant with the given consumable component.
     *
     * @param component the consumable component to associate with this enum constant
     */
    ModConsumableComponents(ConsumableComponent component) {
        this.component = component;
    }

    /**
     * Creates a {@link ConsumableComponent} configured with specified status effects.
     * <p>
     * The component will use:
     * <ul>
     *   <li>1.6 second consume duration</li>
     *   <li>Eat use action</li>
     *   <li>Generic eat sound effect</li>
     *   <li>Particle effects on consume</li>
     *   <li>Application of the provided status effects</li>
     * </ul>
     * </p>
     *
     * @param effects one or more {@link StatusEffectInstance} to apply upon consumption
     * @return a fully configured {@link ConsumableComponent}
     * @since 0.1
     *
     * <p>Example usage:</p>
     * <pre><code>
     * ConsumableComponent comp = ModConsumableComponents.createFoodComponent(
     *     new StatusEffectInstance(StatusEffects.SPEED, 200, 0)
     * );
     * </code></pre>
     */
    private static ConsumableComponent createFoodComponent(StatusEffectInstance... effects) {
        ApplyEffectsConsumeEffect applyEffects = new ApplyEffectsConsumeEffect(List.of(effects));
        return ConsumableComponent.builder()
                .consumeSeconds(1.6f)
                .useAction(UseAction.EAT)
                .sound(SoundEvents.ENTITY_GENERIC_EAT)
                .consumeParticles(true)
                .consumeEffect(applyEffects)
                .build();
    }

    /**
     * Retrieves the underlying {@link ConsumableComponent} associated with this enum constant.
     *
     * @return the configured consumable component
     */
    public ConsumableComponent getConsumableComponent() {
        return component;
    }
}