package net.pearadise.pearexpansion.entity.effect

import net.minecraft.entity.attribute.EntityAttributeModifier
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectCategory
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import net.pearadise.pearexpansion.MOD_ID
import net.pearadise.pearexpansion.LOGGER

object ModStatusEffects {

    val GROWTH: StatusEffect = registerScaleStatusEffect("growth", 5882118, +0.5)
    val SHRINKING: StatusEffect = registerScaleStatusEffect("shrinking", 5882118, -0.5)

    @Suppress("SameParameterValue")
    private fun registerScaleStatusEffect(id: String, color: Int, scaleModifier: Double): StatusEffect {
        val effect = object : StatusEffect(StatusEffectCategory.BENEFICIAL, color) {
            init {
                addAttributeModifier(
                    EntityAttributes.SCALE,
                    Identifier.of(MOD_ID, "effect.$id"),
                    scaleModifier,
                    EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                )
            }
        }
        return Registry.register(Registries.STATUS_EFFECT, Identifier.of(MOD_ID, id), effect)
    }

    fun initialize() {
        LOGGER.info("ModStatusEffects initialized.")
    }
}
