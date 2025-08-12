package net.pearadise.pearexpansion.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

import static net.pearadise.pearexpansion.block.ModBlocks.register;

/**
 * Enum that lists all vertical slab types for the mod.
 *
 * <p>
 * Each enum value contains:
 * <ul>
 *   <li>a vanilla template block (used for block settings),</li>
 *   <li>a vanilla texture source block (used by datagen for textures),</li>
 *   <li>flags for common behaviors (axeable / pickaxable),</li>
 *   <li>optional metadata like flammability or fuel value,</li>
 *   <li>optional names of related variants (oxidized / waxed).</li>
 * </ul>
 * The {@link #block} field is the registered mod Block instance returned by {@code ModBlocks.register(...)}.
 * </p>
 */
public enum VerticalSlabBlockEnum {

    // Wood
    VERTICAL_ACACIA_SLAB(Blocks.ACACIA_SLAB, Blocks.ACACIA_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_BAMBOO_MOSAIC_SLAB(Blocks.BAMBOO_MOSAIC_SLAB, Blocks.BAMBOO_MOSAIC, true, false, new int[]{5, 20}, null, null, 150),
    VERTICAL_BAMBOO_SLAB(Blocks.BAMBOO_SLAB, Blocks.BAMBOO_PLANKS, true, false, new int[]{5, 20}, null, null, 150),
    VERTICAL_BIRCH_SLAB(Blocks.BIRCH_SLAB, Blocks.BIRCH_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_CHERRY_SLAB(Blocks.CHERRY_SLAB, Blocks.CHERRY_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_CRIMSON_SLAB(Blocks.CRIMSON_SLAB, Blocks.CRIMSON_PLANKS, true, false, null, null, null, 300),
    VERTICAL_DARK_OAK_SLAB(Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_JUNGLE_SLAB(Blocks.JUNGLE_SLAB, Blocks.JUNGLE_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_MANGROVE_SLAB(Blocks.MANGROVE_SLAB, Blocks.MANGROVE_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_OAK_SLAB(Blocks.OAK_SLAB, Blocks.OAK_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_PALE_OAK_SLAB(Blocks.PALE_OAK_SLAB, Blocks.PALE_OAK_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_SPRUCE_SLAB(Blocks.SPRUCE_SLAB, Blocks.SPRUCE_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_WARPED_SLAB(Blocks.WARPED_SLAB, Blocks.WARPED_PLANKS, true, false, null, null, null, 300),

    // Stone / rock
    VERTICAL_ANDESITE_SLAB(Blocks.ANDESITE_SLAB, Blocks.ANDESITE, false, true, null, null, null, null),
    VERTICAL_BLACKSTONE_SLAB(Blocks.BLACKSTONE_SLAB, Blocks.BLACKSTONE, false, true, null, null, null, null),
    VERTICAL_BRICK_SLAB(Blocks.BRICK_SLAB, Blocks.BRICKS, false, true, null, null, null, null),
    VERTICAL_COBBLED_DEEPSLATE_SLAB(Blocks.COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE, false, true, null, null, null, null),
    VERTICAL_COBBLESTONE_SLAB(Blocks.COBBLESTONE_SLAB, Blocks.COBBLESTONE, false, true, null, null, null, null),
    VERTICAL_DEEPSLATE_BRICK_SLAB(Blocks.DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICKS, false, true, null, null, null, null),
    VERTICAL_DEEPSLATE_TILE_SLAB(Blocks.DEEPSLATE_TILE_SLAB, Blocks.DEEPSLATE_TILES, false, true, null, null, null, null),
    VERTICAL_DIORITE_SLAB(Blocks.DIORITE_SLAB, Blocks.DIORITE, false, true, null, null, null, null),
    VERTICAL_END_STONE_BRICK_SLAB(Blocks.END_STONE_BRICK_SLAB, Blocks.END_STONE_BRICKS, false, true, null, null, null, null),
    VERTICAL_GRANITE_SLAB(Blocks.GRANITE_SLAB, Blocks.GRANITE, false, true, null, null, null, null),
    VERTICAL_MOSSY_COBBLESTONE_SLAB(Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE, false, true, null, null, null, null),
    VERTICAL_MOSSY_STONE_BRICK_SLAB(Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICKS, false, true, null, null, null, null),
    VERTICAL_MUD_BRICK_SLAB(Blocks.MUD_BRICK_SLAB, Blocks.MUD_BRICKS, false, true, null, null, null, null),
    VERTICAL_NETHER_BRICK_SLAB(Blocks.NETHER_BRICK_SLAB, Blocks.NETHER_BRICKS, false, true, null, null, null, null),
    VERTICAL_POLISHED_ANDESITE_SLAB(Blocks.POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE, false, true, null, null, null, null),
    VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS, false, true, null, null, null, null),
    VERTICAL_POLISHED_BLACKSTONE_SLAB(Blocks.POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE, false, true, null, null, null, null),
    VERTICAL_POLISHED_DEEPSLATE_SLAB(Blocks.POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE, false, true, null, null, null, null),
    VERTICAL_POLISHED_DIORITE_SLAB(Blocks.POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE, false, true, null, null, null, null),
    VERTICAL_POLISHED_GRANITE_SLAB(Blocks.POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE, false, true, null, null, null, null),
    VERTICAL_POLISHED_TUFF_SLAB(Blocks.POLISHED_TUFF_SLAB, Blocks.POLISHED_TUFF, false, true, null, null, null, null),
    VERTICAL_PRISMARINE_BRICK_SLAB(Blocks.PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICKS, false, true, null, null, null, null),
    VERTICAL_PRISMARINE_SLAB(Blocks.PRISMARINE_SLAB, Blocks.PRISMARINE, false, true, null, null, null, null),
    VERTICAL_PURPUR_SLAB(Blocks.PURPUR_SLAB, Blocks.PURPUR_BLOCK, false, true, null, null, null, null),
    VERTICAL_QUARTZ_SLAB(Blocks.QUARTZ_SLAB, Blocks.QUARTZ_BLOCK, false, true, null, null, null, null),
    VERTICAL_RED_NETHER_BRICK_SLAB(Blocks.RED_NETHER_BRICK_SLAB, Blocks.RED_NETHER_BRICKS, false, true, null, null, null, null),
    VERTICAL_RESIN_BRICK_SLAB(Blocks.RESIN_BRICK_SLAB, Blocks.RESIN_BRICKS, false, true, null, null, null, null),
    VERTICAL_SANDSTONE_SLAB(Blocks.SANDSTONE_SLAB, Blocks.SANDSTONE, false, true, null, null, null, null),
    VERTICAL_SMOOTH_QUARTZ_SLAB(Blocks.SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ, false, true, null, null, null, null),
    VERTICAL_SMOOTH_RED_SANDSTONE_SLAB(Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE, false, true, null, null, null, null),
    VERTICAL_SMOOTH_SANDSTONE_SLAB(Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE, false, true, null, null, null, null),
    VERTICAL_SMOOTH_STONE_SLAB(Blocks.SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE, false, true, null, null, null, null),
    VERTICAL_STONE_BRICK_SLAB(Blocks.STONE_BRICK_SLAB, Blocks.STONE_BRICKS, false, true, null, null, null, null),
    VERTICAL_STONE_SLAB(Blocks.STONE_SLAB, Blocks.STONE, false, true, null, null, null, null),
    VERTICAL_TUFF_BRICK_SLAB(Blocks.TUFF_BRICK_SLAB, Blocks.TUFF_BRICKS, false, true, null, null, null, null),
    VERTICAL_TUFF_SLAB(Blocks.TUFF_SLAB, Blocks.TUFF, false, true, null, null, null, null),

    // Sandstone family
    VERTICAL_CUT_RED_SANDSTONE_SLAB(Blocks.CUT_RED_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE, false, true, null, null, null, null),
    VERTICAL_CUT_SANDSTONE_SLAB(Blocks.CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE, false, true, null, null, null, null),
    VERTICAL_RED_SANDSTONE_SLAB(Blocks.RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE, false, true, null, null, null, null),

    // Copper family (oxidation / waxed relationships)
    VERTICAL_CUT_COPPER_SLAB(Blocks.CUT_COPPER_SLAB, Blocks.CUT_COPPER, false, true, null, "VERTICAL_EXPOSED_CUT_COPPER_SLAB", "VERTICAL_WAXED_CUT_COPPER_SLAB", null),
    VERTICAL_EXPOSED_CUT_COPPER_SLAB(Blocks.EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER, false, true, null, "VERTICAL_WEATHERED_CUT_COPPER_SLAB", "VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB", null),
    VERTICAL_OXIDIZED_CUT_COPPER_SLAB(Blocks.OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER, false, true, null, null, "VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB", null),
    VERTICAL_WAXED_CUT_COPPER_SLAB(Blocks.WAXED_CUT_COPPER_SLAB, Blocks.CUT_COPPER, false, true, null, null, null, null),
    VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER, false, true, null, null, null, null),
    VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER, false, true, null, null, null, null),
    VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER, false, true, null, null, null, null),
    VERTICAL_WEATHERED_CUT_COPPER_SLAB(Blocks.WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER, false, true, null, "VERTICAL_OXIDIZED_CUT_COPPER_SLAB", "VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB", null),

    // Prismarine
    VERTICAL_DARK_PRISMARINE_SLAB(Blocks.DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE, false, true, null, null, null, null);


    /**
     * The vanilla block used as template for the settings.
     */
    private final Block templateBlock;

    /**
     * The vanilla block used as texture source by datagen.
     */
    private final Block textureSourceBlock;

    /**
     * True if this slab is treated as wood (axe interactions).
     */
    private final boolean axeable;

    /**
     * True if this slab is treated as stone (pickaxe interactions).
     */
    private final boolean pickaxable;

    /**
     * Optional flammability data: [encouragement, flammability].
     */
    private final int[] flammability;

    /**
     * Enum name (string) of the slab this one oxidizes into, if any.
     */
    private final String oxidizesToEnumName;

    /**
     * Enum name (string) of the waxed variant, if any.
     */
    private final String waxedVariantEnumName;

    /**
     * Optional fuel value (ticks).
     */
    private final Integer fuelValue;

    /**
     * The registered Block instance returned by ModBlocks.register.
     */
    private final Block block;

    VerticalSlabBlockEnum(Block templateBlock, Block textureSourceBlock, boolean axeable, boolean pickaxable, int[] flammability,
                          String oxidizesToEnumName, String waxedVariantEnumName, Integer fuelValue) {
        this.templateBlock = templateBlock;
        this.textureSourceBlock = textureSourceBlock;
        this.axeable = axeable;
        this.pickaxable = pickaxable;
        this.flammability = flammability;
        this.oxidizesToEnumName = oxidizesToEnumName;
        this.waxedVariantEnumName = waxedVariantEnumName;
        this.fuelValue = fuelValue;

        // Register the block and keep the returned instance.
        this.block = register(this.getRegistryName(), VerticalSlabBlock::new, templateBlock.getSettings(), true);
    }

    /**
     * Find the enum value by a vanilla template block.
     *
     * @param template the vanilla template block
     * @return Optional with the enum if found
     */
    public static Optional<VerticalSlabBlockEnum> fromTemplate(Block template) {
        return Arrays.stream(values()).filter(e -> e.templateBlock == template).findFirst();
    }

    /**
     * Safely parse an enum name to its value.
     *
     * @param name enum name (case-insensitive)
     * @return the matching enum or throw IllegalArgumentException if not found
     */
    public static VerticalSlabBlockEnum fromString(String name) {
        return Arrays.stream(values())
                .filter(e -> e.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No VerticalSlabBlockEnum with name: " + name));
    }

    /**
     * Return all values as a list.
     */
    public static List<VerticalSlabBlockEnum> allAsList() {
        return List.of(values());
    }

    /**
     * Return a list of enums that are pickaxable.
     */
    public static List<VerticalSlabBlockEnum> allPickaxable() {
        return Arrays.stream(values()).filter(VerticalSlabBlockEnum::isPickaxable).collect(Collectors.toList());
    }

    /**
     * Return a list of enums that are axeable.
     */
    public static List<VerticalSlabBlockEnum> allAxeable() {
        return Arrays.stream(values()).filter(VerticalSlabBlockEnum::isAxeable).collect(Collectors.toList());
    }

    /**
     * Return a list of enums with flammability data.
     */
    public static List<VerticalSlabBlockEnum> allFlammable() {
        return Arrays.stream(values()).filter(e -> e.flammability != null).collect(Collectors.toList());
    }

    /**
     * Return a list of enums having a fuel value.
     */
    public static List<VerticalSlabBlockEnum> allWithFuelValue() {
        return Arrays.stream(values()).filter(e -> e.fuelValue != null).collect(Collectors.toList());
    }

    /**
     * Return a list of enums that have a waxed variant.
     */
    public static List<VerticalSlabBlockEnum> allWithWaxedVariant() {
        return Arrays.stream(values()).filter(e -> e.waxedVariantEnumName != null).collect(Collectors.toList());
    }

    /**
     * Return a list of enums that oxidize.
     */
    public static List<VerticalSlabBlockEnum> allWithOxidation() {
        return Arrays.stream(values()).filter(e -> e.oxidizesToEnumName != null).collect(Collectors.toList());
    }


    /**
     * Backwards-compatible helper: return an array of blocks from enum array.
     */
    public static List<Block> allBlocksList() {
        return Arrays.stream(values()).map(VerticalSlabBlockEnum::getBlock).toList();
    }

    /**
     * Safe parsing of enum name strings.
     *
     * @param enumName enum name or null
     * @return Optional with enum value or empty
     */
    private static Optional<VerticalSlabBlockEnum> fromStringSafe(String enumName) {
        if (enumName == null) return Optional.empty();
        return Arrays.stream(values())
                .filter(e -> e.name().equalsIgnoreCase(enumName))
                .findFirst();
    }

    /**
     * Return the registered mod Block for this slab.
     */
    public Block getBlock() {
        return block;
    }

    /**
     * Return the registry-friendly id for this slab (lower-case).
     * Example: "vertical_oak_slab"
     */
    public String getRegistryName() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    /**
     * Return the vanilla template block used for settings.
     */
    public Block getTemplateBlock() {
        return templateBlock;
    }

    /**
     * Return the vanilla block used as texture source.
     */
    public Block getTextureSourceBlock() {
        return textureSourceBlock;
    }

    /**
     * True if this slab should be treated as wooden (axe interactions).
     */
    public boolean isAxeable() {
        return axeable;
    }

    /**
     * True if this slab should be treated as stone (pickaxe interactions).
     */
    public boolean isPickaxable() {
        return pickaxable;
    }

    /**
     * If present, return a copy of the flammability array.
     *
     * @return Optional containing a copy of [encouragement, flammability] or empty
     */
    public Optional<int[]> getFlammability() {
        return flammability == null ? Optional.empty() : Optional.of(Arrays.copyOf(flammability, flammability.length));
    }

    /**
     * If this slab oxidizes, return the target enum.
     */
    public Optional<VerticalSlabBlockEnum> getOxidizesTo() {
        return fromStringSafe(oxidizesToEnumName);
    }

    /**
     * If this slab has a waxed variant, return it.
     */
    public Optional<VerticalSlabBlockEnum> getWaxedVariant() {
        return fromStringSafe(waxedVariantEnumName);
    }

    /**
     * If present, return the fuel value in ticks.
     */
    public Optional<Integer> getFuelValue() {
        return Optional.ofNullable(fuelValue);
    }

    /**
     * Return the block that this slab oxidizes to, if any.
     */
    public Optional<Block> getOxidizesToBlock() {
        return getOxidizesTo().map(VerticalSlabBlockEnum::getBlock);
    }

    /**
     * Return the block that is the waxed variant, if any.
     */
    public Optional<Block> getWaxedVariantBlock() {
        return getWaxedVariant().map(VerticalSlabBlockEnum::getBlock);
    }

    @Override
    public String toString() {
        return "VerticalSlabBlockEnum{" + getRegistryName() + '}';
    }
}
