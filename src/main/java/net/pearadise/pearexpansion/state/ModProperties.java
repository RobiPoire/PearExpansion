package net.pearadise.pearexpansion.state;


import net.minecraft.state.property.EnumProperty;
import net.pearadise.pearexpansion.block.enums.VerticalSlabType;

public class ModProperties {
    public static final EnumProperty<VerticalSlabType> VERTICAL_SLAB_TYPE =
            EnumProperty.of("type", VerticalSlabType.class);

}
