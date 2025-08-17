package net.pearadise.pearexpansion.block.enums

import net.minecraft.util.StringIdentifiable

/**
 * Represents the possible types of vertical slabs.
 *
 * Each value defines the orientation of the slab or if it is a double slab.
 *
 * @property slabName The string name used for serialization and display.
 */
enum class VerticalSlabType(private val slabName: String) : StringIdentifiable {
    /** Vertical slab facing north. */
    NORTH("north"),

    /** Vertical slab facing south. */
    SOUTH("south"),

    /** Vertical slab facing west. */
    WEST("west"),

    /** Vertical slab facing east. */
    EAST("east"),

    /** Double vertical slab (fills the whole block). */
    DOUBLE("double");

    /**
     * Returns the string name of this slab type.
     *
     * @return The name of the slab type.
     */
    override fun toString(): String = slabName

    /**
     * Returns the string name of this slab type for registry and serialization.
     *
     * @return The name of the slab type.
     */
    override fun asString(): String = slabName
}