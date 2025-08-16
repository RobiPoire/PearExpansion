package net.pearadise.pearexpansion.block.enums;

import net.minecraft.util.StringIdentifiable;

/**
 * Enum representing the different types of vertical slabs.
 * Each type corresponds to a specific orientation or a double slab.
 */
public enum VerticalSlabType implements StringIdentifiable {
    /**
     * Vertical slab facing north.
     */
    NORTH("north"),

    /**
     * Vertical slab facing south.
     */
    SOUTH("south"),

    /**
     * Vertical slab facing west.
     */
    WEST("west"),

    /**
     * Vertical slab facing east.
     */
    EAST("east"),

    /**
     * Double vertical slab.
     */
    DOUBLE("double");

    // The name of the vertical slab type.
    private final String name;

    /**
     * Constructor for the VerticalSlabType enum.
     *
     * @param name The name of the vertical slab type.
     */
    VerticalSlabType(final String name) {
        this.name = name;
    }

    /**
     * Returns the name of the vertical slab type as a string.
     *
     * @return The name of the vertical slab type.
     */
    public String toString() {
        return this.name;
    }

    /**
     * Returns the name of the vertical slab type as a string.
     * This method is required by the StringIdentifiable interface.
     *
     * @return The name of the vertical slab type.
     */
    @Override
    public String asString() {
        return this.name;
    }
}