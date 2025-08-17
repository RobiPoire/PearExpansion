package net.pearadise.pearexpansion.state

import net.minecraft.state.property.EnumProperty
import net.pearadise.pearexpansion.block.enums.VerticalSlabType

/**
 * Contains custom block state properties for the mod.
 */
object ModProperties {

    /**
     * Property for the type of vertical slab.
     *
     * Used to store and manage the [VerticalSlabType] state in vertical slab blocks.
     */
    val VERTICAL_SLAB_TYPE: EnumProperty<VerticalSlabType> =
        EnumProperty.of("type", VerticalSlabType::class.java)
}