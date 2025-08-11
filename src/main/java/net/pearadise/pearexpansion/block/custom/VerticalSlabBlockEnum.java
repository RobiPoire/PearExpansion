package net.pearadise.pearexpansion.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.Arrays;
import java.util.Optional;

import static net.pearadise.pearexpansion.block.ModBlocks.register;

public enum VerticalSlabBlockEnum {

    VERTICAL_ACACIA_SLAB(Blocks.ACACIA_SLAB, "acacia_planks_top", "acacia_planks", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_ANDESITE_SLAB(Blocks.ANDESITE_SLAB, "andesite", "andesite", false, true, null, null, null, null),
    VERTICAL_BAMBOO_MOSAIC_SLAB(Blocks.BAMBOO_MOSAIC_SLAB, "bamboo_mosaic_top", "bamboo_mosaic", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_BAMBOO_SLAB(Blocks.BAMBOO_SLAB, "bamboo_top", "bamboo", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_BIRCH_SLAB(Blocks.BIRCH_SLAB, "birch_planks_top", "birch_planks", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_BLACKSTONE_SLAB(Blocks.BLACKSTONE_SLAB, "blackstone", "blackstone", false, true, null, null, null, null),
    VERTICAL_BRICK_SLAB(Blocks.BRICK_SLAB, "brick", "brick", false, true, null, null, null, null),
    VERTICAL_CHERRY_SLAB(Blocks.CHERRY_SLAB, "cherry_planks_top", "cherry_planks", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_COBBLED_DEEPSLATE_SLAB(Blocks.COBBLED_DEEPSLATE_SLAB, "cobbled_deepslate", "cobbled_deepslate", false, true, null, null, null, null),
    VERTICAL_COBBLESTONE_SLAB(Blocks.COBBLESTONE_SLAB, "cobblestone", "cobblestone", false, true, null, null, null, null),
    VERTICAL_CRIMSON_SLAB(Blocks.CRIMSON_SLAB, "crimson_planks_top", "crimson_planks", true, false, null, null, null, 300),
    VERTICAL_CUT_COPPER_SLAB(Blocks.CUT_COPPER_SLAB, "cut_copper_top", "cut_copper", false, true, null, "VERTICAL_EXPOSED_CUT_COPPER_SLAB", "VERTICAL_WAXED_CUT_COPPER_SLAB", null),
    VERTICAL_CUT_RED_SANDSTONE_SLAB(Blocks.CUT_RED_SANDSTONE_SLAB, "cut_red_sandstone", "cut_red_sandstone", false, true, null, null, null, null),
    VERTICAL_CUT_SANDSTONE_SLAB(Blocks.CUT_SANDSTONE_SLAB, "cut_sandstone", "cut_sandstone", false, true, null, null, null, null),
    VERTICAL_DARK_OAK_SLAB(Blocks.DARK_OAK_SLAB, "dark_oak_planks_top", "dark_oak_planks", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_DARK_PRISMARINE_SLAB(Blocks.DARK_PRISMARINE_SLAB, "dark_prismarine", "dark_prismarine", false, true, null, null, null, null),
    VERTICAL_DEEPSLATE_BRICK_SLAB(Blocks.DEEPSLATE_BRICK_SLAB, "deepslate_brick", "deepslate_brick", false, true, null, null, null, null),
    VERTICAL_DEEPSLATE_TILE_SLAB(Blocks.DEEPSLATE_TILE_SLAB, "polished_deepslate", "polished_deepslate", false, true, null, null, null, null),
    VERTICAL_DIORITE_SLAB(Blocks.DIORITE_SLAB, "diorite", "diorite", false, true, null, null, null, null),
    VERTICAL_END_STONE_BRICK_SLAB(Blocks.END_STONE_BRICK_SLAB, "end_stone_brick", "end_stone_brick", false, true, null, null, null, null),
    VERTICAL_EXPOSED_CUT_COPPER_SLAB(Blocks.EXPOSED_CUT_COPPER_SLAB, "exposed_cut_copper_top", "exposed_cut_copper", false, true, null, "VERTICAL_WEATHERED_CUT_COPPER_SLAB", "VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB", null),
    VERTICAL_GRANITE_SLAB(Blocks.GRANITE_SLAB, "granite", "granite", false, true, null, null, null, null),
    VERTICAL_JUNGLE_SLAB(Blocks.JUNGLE_SLAB, "jungle_planks_top", "jungle_planks", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_MANGROVE_SLAB(Blocks.MANGROVE_SLAB, "mangrove_planks_top", "mangrove_planks", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_MOSSY_COBBLESTONE_SLAB(Blocks.MOSSY_COBBLESTONE_SLAB, "mossy_cobblestone", "mossy_cobblestone", false, true, null, null, null, null),
    VERTICAL_MOSSY_STONE_BRICK_SLAB(Blocks.MOSSY_STONE_BRICK_SLAB, "mossy_stone_brick", "mossy_stone_brick", false, true, null, null, null, null),
    VERTICAL_MUD_BRICK_SLAB(Blocks.MUD_BRICK_SLAB, "mud_brick", "mud_brick", false, true, null, null, null, null),
    VERTICAL_NETHER_BRICK_SLAB(Blocks.NETHER_BRICK_SLAB, "nether_brick", "nether_brick", false, true, null, null, null, null),
    VERTICAL_OAK_SLAB(Blocks.OAK_SLAB, "oak_planks_top", "oak_planks", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_OXIDIZED_CUT_COPPER_SLAB(Blocks.OXIDIZED_CUT_COPPER_SLAB, "oxidized_cut_copper_top", "oxidized_cut_copper", false, true, null, null, "VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB", null),
    VERTICAL_PALE_OAK_SLAB(Blocks.PALE_OAK_SLAB, "pale_oak_planks_top", "pale_oak_planks", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_POLISHED_ANDESITE_SLAB(Blocks.POLISHED_ANDESITE_SLAB, "polished_andesite", "polished_andesite", false, true, null, null, null, null),
    VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, "polished_blackstone_brick", "polished_blackstone_brick", false, true, null, null, null, null),
    VERTICAL_POLISHED_BLACKSTONE_SLAB(Blocks.POLISHED_BLACKSTONE_SLAB, "polished_blackstone", "polished_blackstone", false, true, null, null, null, null),
    VERTICAL_POLISHED_DIORITE_SLAB(Blocks.POLISHED_DIORITE_SLAB, "polished_diorite", "polished_diorite", false, true, null, null, null, null),
    VERTICAL_POLISHED_GRANITE_SLAB(Blocks.POLISHED_GRANITE_SLAB, "polished_granite", "polished_granite", false, true, null, null, null, null),
    VERTICAL_POLISHED_DEEPSLATE_SLAB(Blocks.POLISHED_DEEPSLATE_SLAB, "polished_deepslate", "polished_deepslate", false, true, null, null, null, null),
    VERTICAL_POLISHED_TUFF_SLAB(Blocks.POLISHED_TUFF_SLAB, "polished_tuff", "polished_tuff", false, true, null, null, null, null),
    VERTICAL_PRISMARINE_BRICK_SLAB(Blocks.PRISMARINE_BRICK_SLAB, "prismarine_brick", "prismarine_brick", false, true, null, null, null, null),
    VERTICAL_PRISMARINE_SLAB(Blocks.PRISMARINE_SLAB, "prismarine", "prismarine", false, true, null, null, null, null),
    VERTICAL_PURPUR_SLAB(Blocks.PURPUR_SLAB, "purpur", "purpur", false, true, null, null, null, null),
    VERTICAL_QUARTZ_SLAB(Blocks.QUARTZ_SLAB, "quartz_block", "quartz_block", false, true, null, null, null, null),
    VERTICAL_RED_NETHER_BRICK_SLAB(Blocks.RED_NETHER_BRICK_SLAB, "red_nether_brick", "red_nether_brick", false, true, null, null, null, null),
    VERTICAL_RED_SANDSTONE_SLAB(Blocks.RED_SANDSTONE_SLAB, "red_sandstone", "red_sandstone", false, true, null, null, null, null),
    VERTICAL_RESIN_BRICK_SLAB(Blocks.RESIN_BRICK_SLAB, "resin_brick", "resin_brick", false, true, null, null, null, null),
    VERTICAL_SANDSTONE_SLAB(Blocks.SANDSTONE_SLAB, "sandstone", "sandstone", false, true, null, null, null, null),
    VERTICAL_SMOOTH_QUARTZ_SLAB(Blocks.SMOOTH_QUARTZ_SLAB, "smooth_quartz", "smooth_quartz", false, true, null, null, null, null),
    VERTICAL_SMOOTH_RED_SANDSTONE_SLAB(Blocks.SMOOTH_RED_SANDSTONE_SLAB, "smooth_red_sandstone", "smooth_red_sandstone", false, true, null, null, null, null),
    VERTICAL_SMOOTH_SANDSTONE_SLAB(Blocks.SMOOTH_SANDSTONE_SLAB, "smooth_sandstone", "smooth_sandstone", false, true, null, null, null, null),
    VERTICAL_SMOOTH_STONE_SLAB(Blocks.SMOOTH_STONE_SLAB, "smooth_stone", "smooth_stone", false, true, null, null, null, null),
    VERTICAL_SPRUCE_SLAB(Blocks.SPRUCE_SLAB, "spruce_planks_top", "spruce_planks", true, false, new int[]{5, 20}, null, null, 300),
    VERTICAL_STONE_BRICK_SLAB(Blocks.STONE_BRICK_SLAB, "stone_brick", "stone_brick", false, true, null, null, null, null),
    VERTICAL_STONE_SLAB(Blocks.STONE_SLAB, "stone", "stone", false, true, null, null, null, null),
    VERTICAL_TUFF_BRICK_SLAB(Blocks.TUFF_BRICK_SLAB, "tuff_brick", "tuff_brick", false, true, null, null, null, null),
    VERTICAL_TUFF_SLAB(Blocks.TUFF_SLAB, "tuff", "tuff", false, true, null, null, null, null),
    VERTICAL_WARPED_SLAB(Blocks.WARPED_SLAB, "warped_planks_top", "warped_planks", true, false, null, null, null, 300),
    VERTICAL_WAXED_CUT_COPPER_SLAB(Blocks.WAXED_CUT_COPPER_SLAB, "waxed_cut_copper_top", "waxed_cut_copper", false, true, null, null, null, null),
    VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, "waxed_exposed_cut_copper_top", "waxed_exposed_cut_copper", false, true, null, null, null, null),
    VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, "waxed_oxidized_cut_copper_top", "waxed_oxidized_cut_copper", false, true, null, null, null, null),
    VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, "waxed_weathered_cut_copper_top", "waxed_weathered_cut_copper", false, true, null, null, null, null),
    VERTICAL_WEATHERED_CUT_COPPER_SLAB(Blocks.WEATHERED_CUT_COPPER_SLAB, "weathered_cut_copper_top", "weathered_cut_copper", false, true, null, "VERTICAL_OXIDIZED_CUT_COPPER_SLAB", "VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB", null);

    private final Block template;
    private final String textureTopBottom;
    private final String textureSides;
    private final boolean axeable;
    private final boolean pickaxable;
    private final int[] flammability;
    private final String oxidizesTo;
    private final String waxedVariant;
    private final Integer fuelValue;
    private final Block block;

    VerticalSlabBlockEnum(Block template, String textureTopBottom, String textureSides,
                          boolean axeable, boolean pickaxable, int[] flammability,
                          String oxidizesTo, String waxedVariant, Integer fuelValue) {
        this.template = template;
        this.textureTopBottom = textureTopBottom;
        this.textureSides = textureSides;
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

    public static  VerticalSlabBlockEnum[] getAllVerticalSlabsWithFuelValue() {
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

    public String getTextureTopBottom() {
        return textureTopBottom;
    }

    public String getTextureSides() {
        return textureSides;
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