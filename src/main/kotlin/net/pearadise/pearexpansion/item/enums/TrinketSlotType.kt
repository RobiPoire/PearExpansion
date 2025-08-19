package net.pearadise.pearexpansion.item.enums

import net.minecraft.util.StringIdentifiable

@Suppress("unused")
enum class TrinketSlotType(val slot: String) : StringIdentifiable {
    HEAD_HAT("head/hat"), // Hats, primarily cosmetics.
    HEAD_FACE("head/face"), // Masks, glasses, monocles, other forms of face jewelry.
    CHEST_NECKLACE("chest/necklace"), // Necklaces, pendants.
    CHEST_CAPE("chest/cape"), // Capes, primarily cosmetics.
    CHEST_BACK("chest/back"), // Backpacks, jetpacks, other gear affixed to the back or draped across the shoulders.
    LEGS_BELT("legs/belt"), // Belts, skirts.
    FEET_SHOES("feet/shoes"), // Shoes, socks.
    FEET_AGLET("feet/aglet"), // Aglets.
    HAND_GLOVE("hand/glove"), // Gloves
    OFFHAND_GLOVE("offhand/glove"), // Gloves
    HAND_RING("hand/ring"), // Rings, other hand jewelry.
    OFFHAND_RING("offhand/ring"); // Rings, other hand jewelry.

    /**
     * Returns the string representation of this slot type.
     *
     * @return The slot string.
     */
    override fun toString(): String = slot

    override fun asString(): String = slot

}