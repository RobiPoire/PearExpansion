package net.pearadise.pearexpansion.item.enums

enum class CrabClawLevel(val level: Int, val blockInteractionRange: Double) {
    COPPER_LEVEL(1, 1.0),
    DIAMOND_LEVEL(2, 2.0),
    NETHERITE_LEVEL(3, 4.0);

    fun retrieveLevel(): Int = level

    companion object {
        @Suppress("unused")
        fun fromLevel(level: Int): CrabClawLevel? {
            return entries.find { it.level == level }
        }
    }
}
