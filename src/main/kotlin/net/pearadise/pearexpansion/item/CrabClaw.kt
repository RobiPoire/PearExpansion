package net.pearadise.pearexpansion.item

import com.google.common.collect.Multimap
import dev.emi.trinkets.api.SlotReference
import dev.emi.trinkets.api.TrinketItem
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.attribute.EntityAttribute
import net.minecraft.entity.attribute.EntityAttributeModifier
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.item.ItemStack
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.util.Identifier
import net.pearadise.pearexpansion.MOD_ID
import net.pearadise.pearexpansion.item.enums.CrabClawLevel


class CrabClaw(settings: Settings, private val level: CrabClawLevel) : TrinketItem(settings) {
    override fun getModifiers(
        stack: ItemStack,
        slot: SlotReference,
        entity: LivingEntity,
        slotIdentifier: Identifier
    ): Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> {
        val modifiers = super.getModifiers(stack, slot, entity, slotIdentifier)

        modifiers.put(
            EntityAttributes.BLOCK_INTERACTION_RANGE,
            EntityAttributeModifier(
                Identifier.of(MOD_ID, "block_interaction_range"),
                level.blockInteractionRange,
                EntityAttributeModifier.Operation.ADD_VALUE
            )
        )
        return modifiers
    }
}