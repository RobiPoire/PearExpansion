package net.pearadise.pearexpansion.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.Arrays;
import java.util.Optional;

import static net.pearadise.pearexpansion.block.ModBlocks.register;

public enum VerticalSlabBlockEnum {

    VERTICAL_ACACIA_SLAB(Blocks.ACACIA_SLAB, Blocks.ACACIA_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_ANDESITE_SLAB(Blocks.ANDESITE_SLAB, Blocks.ANDESITE, false, true, null, null, null, null),
    VERTICAL_BAMBOO_MOSAIC_SLAB(Blocks.BAMBOO_MOSAIC_SLAB, Blocks.BAMBOO_MOSAIC, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_BAMBOO_SLAB(Blocks.BAMBOO_SLAB, Blocks.BAMBOO_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_BIRCH_SLAB(Blocks.BIRCH_SLAB, Blocks.BIRCH_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_BLACKSTONE_SLAB(Blocks.BLACKSTONE_SLAB, Blocks.BLACKSTONE, false, true, null, null, null, null),
    VERTICAL_BRICK_SLAB(Blocks.BRICK_SLAB, Blocks.BRICKS, false, true, null, null, null, null),
    VERTICAL_CHERRY_SLAB(Blocks.CHERRY_SLAB, Blocks.CHERRY_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_COBBLED_DEEPSLATE_SLAB(Blocks.COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE, false, true, null, null, null, null),
    VERTICAL_COBBLESTONE_SLAB(Blocks.COBBLESTONE_SLAB, Blocks.COBBLESTONE, false, true, null, null, null, null),
    VERTICAL_CRIMSON_SLAB(Blocks.CRIMSON_SLAB, Blocks.CRIMSON_PLANKS, true, false, null, null, null, 300),
    VERTICAL_CUT_COPPER_SLAB(Blocks.CUT_COPPER_SLAB, Blocks.CUT_COPPER, false, true, null, "VERTICAL_EXPOSED_CUT_COPPER_SLAB", "VERTICAL_WAXED_CUT_COPPER_SLAB", null),
    VERTICAL_CUT_RED_SANDSTONE_SLAB(Blocks.CUT_RED_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE, false, true, null, null, null, null),
    VERTICAL_CUT_SANDSTONE_SLAB(Blocks.CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE, false, true, null, null, null, null),
    VERTICAL_DARK_OAK_SLAB(Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_DARK_PRISMARINE_SLAB(Blocks.DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE, false, true, null, null, null, null),
    VERTICAL_DEEPSLATE_BRICK_SLAB(Blocks.DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICKS, false, true, null, null, null, null),
    VERTICAL_DEEPSLATE_TILE_SLAB(Blocks.DEEPSLATE_TILE_SLAB, Blocks.DEEPSLATE_TILES, false, true, null, null, null, null),
    VERTICAL_DIORITE_SLAB(Blocks.DIORITE_SLAB, Blocks.DIORITE, false, true, null, null, null, null),
    VERTICAL_END_STONE_BRICK_SLAB(Blocks.END_STONE_BRICK_SLAB, Blocks.END_STONE_BRICKS, false, true, null, null, null, null),
    VERTICAL_EXPOSED_CUT_COPPER_SLAB(Blocks.EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER, false, true, null, "VERTICAL_WEATHERED_CUT_COPPER_SLAB", "VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB", null),
    VERTICAL_GRANITE_SLAB(Blocks.GRANITE_SLAB, Blocks.GRANITE, false, true, null, null, null, null),
    VERTICAL_JUNGLE_SLAB(Blocks.JUNGLE_SLAB, Blocks.JUNGLE_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_MANGROVE_SLAB(Blocks.MANGROVE_SLAB, Blocks.MANGROVE_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_MOSSY_COBBLESTONE_SLAB(Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE, false, true, null, null, null, null),
    VERTICAL_MOSSY_STONE_BRICK_SLAB(Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICKS, false, true, null, null, null, null),
    VERTICAL_MUD_BRICK_SLAB(Blocks.MUD_BRICK_SLAB, Blocks.MUD_BRICKS, false, true, null, null, null, null),
    VERTICAL_NETHER_BRICK_SLAB(Blocks.NETHER_BRICK_SLAB, Blocks.NETHER_BRICKS, false, true, null, null, null, null),
    VERTICAL_OAK_SLAB(Blocks.OAK_SLAB, Blocks.OAK_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_OXIDIZED_CUT_COPPER_SLAB(Blocks.OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER, false, true, null, null, "VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB", null),
    VERTICAL_PALE_OAK_SLAB(Blocks.PALE_OAK_SLAB, Blocks.PALE_OAK_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_POLISHED_ANDESITE_SLAB(Blocks.POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE, false, true, null, null, null, null),
    VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS, false, true, null, null, null, null),
    VERTICAL_POLISHED_BLACKSTONE_SLAB(Blocks.POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE, false, true, null, null, null, null),
    VERTICAL_POLISHED_DIORITE_SLAB(Blocks.POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE, false, true, null, null, null, null),
    VERTICAL_POLISHED_GRANITE_SLAB(Blocks.POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE, false, true, null, null, null, null),
    VERTICAL_POLISHED_DEEPSLATE_SLAB(Blocks.POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE, false, true, null, null, null, null),
    VERTICAL_POLISHED_TUFF_SLAB(Blocks.POLISHED_TUFF_SLAB, Blocks.POLISHED_TUFF, false, true, null, null, null, null),
    VERTICAL_PRISMARINE_BRICK_SLAB(Blocks.PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICKS, false, true, null, null, null, null),
    VERTICAL_PRISMARINE_SLAB(Blocks.PRISMARINE_SLAB, Blocks.PRISMARINE, false, true, null, null, null, null),
    VERTICAL_PURPUR_SLAB(Blocks.PURPUR_SLAB, Blocks.PURPUR_BLOCK, false, true, null, null, null, null),
    VERTICAL_QUARTZ_SLAB(Blocks.QUARTZ_SLAB, Blocks.QUARTZ_BLOCK, false, true, null, null, null, null),
    VERTICAL_RED_NETHER_BRICK_SLAB(Blocks.RED_NETHER_BRICK_SLAB, Blocks.RED_NETHER_BRICKS, false, true, null, null, null, null),
    VERTICAL_RED_SANDSTONE_SLAB(Blocks.RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE, false, true, null, null, null, null),
    VERTICAL_RESIN_BRICK_SLAB(Blocks.RESIN_BRICK_SLAB, Blocks.RESIN_BRICKS, false, true, null, null, null, null),
    VERTICAL_SANDSTONE_SLAB(Blocks.SANDSTONE_SLAB, Blocks.SANDSTONE, false, true, null, null, null, null),
    VERTICAL_SMOOTH_QUARTZ_SLAB(Blocks.SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ, false, true, null, null, null, null),
    VERTICAL_SMOOTH_RED_SANDSTONE_SLAB(Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE, false, true, null, null, null, null),
    VERTICAL_SMOOTH_SANDSTONE_SLAB(Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE, false, true, null, null, null, null),
    VERTICAL_SMOOTH_STONE_SLAB(Blocks.SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE, false, true, null, null, null, null),
    VERTICAL_SPRUCE_SLAB(Blocks.SPRUCE_SLAB, Blocks.SPRUCE_PLANKS, true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_STONE_BRICK_SLAB(Blocks.STONE_BRICK_SLAB, Blocks.STONE_BRICKS, false, true, null, null, null, null),
    VERTICAL_STONE_SLAB(Blocks.STONE_SLAB, Blocks.STONE, false, true, null, null, null, null),
    VERTICAL_TUFF_BRICK_SLAB(Blocks.TUFF_BRICK_SLAB, Blocks.TUFF_BRICKS, false, true, null, null, null, null),
    VERTICAL_TUFF_SLAB(Blocks.TUFF_SLAB, Blocks.TUFF, false, true, null, null, null, null),
    VERTICAL_WARPED_SLAB(Blocks.WARPED_SLAB, Blocks.WARPED_PLANKS, true, false, null, null, null, 300),
    VERTICAL_WAXED_CUT_COPPER_SLAB(Blocks.WAXED_CUT_COPPER_SLAB, Blocks.CUT_COPPER, false, true, null, null, null, null),
    VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER, false, true, null, null, null, null),
    VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER, false, true, null, null, null, null),
    VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER, false, true, null, null, null, null),
    VERTICAL_WEATHERED_CUT_COPPER_SLAB(Blocks.WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER, false, true, null, "VERTICAL_OXIDIZED_CUT_COPPER_SLAB", "VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB", null);

    private final Block template;
    private final Block textureSource;
    private final boolean axeable;
    private final boolean pickaxable;
    private final int[] flammability;
    private final String oxidizesTo;
    private final String waxedVariant;
    private final Integer fuelValue;
    private final Block block;

    VerticalSlabBlockEnum(Block template, Block textureSource, boolean axeable, boolean pickaxable, int[] flammability,
                          String oxidizesTo, String waxedVariant, Integer fuelValue) {
        this.template = template;
        this.textureSource = textureSource;
        this.axeable = axeable;
        this.pickaxable = pickaxable;
        this.flammability = flammability;
        this.oxidizesTo = oxidizesTo;
        this.waxedVariant = waxedVariant;
        this.fuelValue = fuelValue;
        this.block = register(this.name().toLowerCase(), VerticalSlabBlock::new, template.getSettings(), true);
    }

    public static Optional<VerticalSlabBlockEnum> fromTemplate(Block template) {
        return Arrays.stream(values()).filter(e -> e.template == template).findFirst();
    }

    public static VerticalSlabBlockEnum[] getAllVerticalSlabs() {
        return values();
    }

    public static VerticalSlabBlockEnum[] getAllVerticalSlabsWithWaxed() {
        return Arrays.stream(values())
                .filter(e -> e.waxedVariant != null)
                .toArray(VerticalSlabBlockEnum[]::new);
    }

    public static VerticalSlabBlockEnum[] getAllVerticalSlabsWithOxidation() {
        return Arrays.stream(values())
                .filter(e -> e.oxidizesTo != null)
                .toArray(VerticalSlabBlockEnum[]::new);
    }

    public static VerticalSlabBlockEnum[] getAllVerticalSlabsAxeable() {
        return Arrays.stream(values())
                .filter(VerticalSlabBlockEnum::isAxeable)
                .toArray(VerticalSlabBlockEnum[]::new);
    }

    public static VerticalSlabBlockEnum[] getAllVerticalSlabsPickaxable() {
        return Arrays.stream(values())
                .filter(VerticalSlabBlockEnum::isPickaxable)
                .toArray(VerticalSlabBlockEnum[]::new);
    }

    public static VerticalSlabBlockEnum[] getAllVerticalSlabsFlammable() {
        return Arrays.stream(values())
                .filter(e -> e.getFlammability() != null)
                .toArray(VerticalSlabBlockEnum[]::new);
    }

    public static VerticalSlabBlockEnum[] getAllVerticalSlabsWithFuelValue() {
        return Arrays.stream(values())
                .filter(e -> e.getFuelValue() != null)
                .toArray(VerticalSlabBlockEnum[]::new);
    }

    public static VerticalSlabBlockEnum fromString(String name) {
        return Arrays.stream(values())
                .filter(e -> e.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No VerticalSlabBlockEnum with name: " + name));
    }

    public static Block[] getBlocksFromEnums(VerticalSlabBlockEnum[] enums) {
        return Arrays.stream(enums)
                .map(VerticalSlabBlockEnum::getBlock)
                .toArray(Block[]::new);
    }

    public Block getBlock() {
        return block;
    }

    public String getId() {
        return this.name();
    }

    public Block getTemplate() {
        return template;
    }

    public Block getTextureSource() {
        return textureSource;
    }

    public boolean isAxeable() {
        return axeable;
    }

    public boolean isPickaxable() {
        return pickaxable;
    }

    public int[] getFlammability() {
        return flammability;
    }

    public Block getOxidizesTo() {
        return fromString(oxidizesTo)
                .getBlock();
    }

    public Block getWaxedVariant() {
        return fromString(waxedVariant)
                .getBlock();
    }

    public Integer getFuelValue() {
        return fuelValue;
    }
}
