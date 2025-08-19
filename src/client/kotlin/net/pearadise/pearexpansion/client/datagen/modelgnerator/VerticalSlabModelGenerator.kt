package net.pearadise.pearexpansion.client.datagen.modelgnerator

import net.minecraft.block.Block
import net.minecraft.client.data.BlockModelDefinitionCreator
import net.minecraft.client.data.BlockStateModelGenerator
import net.minecraft.client.data.BlockStateVariantMap
import net.minecraft.client.data.Model
import net.minecraft.client.data.ModelIds
import net.minecraft.client.data.TextureKey
import net.minecraft.client.data.TextureMap
import net.minecraft.client.data.VariantsBlockModelDefinitionCreator
import net.minecraft.client.render.model.json.ModelVariantOperator
import net.minecraft.client.render.model.json.WeightedVariant
import net.minecraft.util.Identifier
import net.minecraft.util.math.AxisRotation
import net.pearadise.pearexpansion.MOD_ID
import net.pearadise.pearexpansion.block.VerticalSlabBlock
import net.pearadise.pearexpansion.block.enums.VerticalSlabType
import java.util.Optional

/**
 * Helper object for generating custom blockstate models for vertical slabs.
 */
object VerticalSlabModelGenerator {

    /** Model template for vertical slabs. */
    val VERTICAL_SLAB: Model = block("vertical_slab", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE)

    /**
     * Creates a model with the given parent and required textures.
     *
     * @param parent The parent model name.
     * @param requiredTextureKeys The required texture keys.
     * @return The [Model] instance.
     */
    @Suppress("SameParameterValue")
    private fun block(parent: String, vararg requiredTextureKeys: TextureKey): Model = // Value of parameter 'parent' is always '"vertical_slab"'
        Model(Optional.of(Identifier.of(MOD_ID, "block/$parent")), Optional.empty(), *requiredTextureKeys)

    /**
     * Creates a model with a parent, variant, and required textures.
     *
     * @param parent The parent model name.
     * @param variant The variant name.
     * @param requiredTextureKeys The required texture keys.
     * @return The [Model] instance.
     */
    @Suppress("unused")
    private fun block(parent: String, variant: String, vararg requiredTextureKeys: TextureKey): Model =
        Model(Optional.of(Identifier.of(MOD_ID, "block/$parent")), Optional.of(variant), *requiredTextureKeys)

    /**
     * Creates a texture map for blocks with top and side textures.
     *
     * @param block The base block.
     * @return The [net.minecraft.client.data.TextureMap] for the block.
     */
    fun blockAndTopForEnds(block: Block): TextureMap =
        TextureMap()
            .put(TextureKey.TOP, ModelIds.getBlockSubModelId(block, "_top"))
            .put(TextureKey.BOTTOM, ModelIds.getBlockSubModelId(block, "_top"))
            .put(TextureKey.SIDE, ModelIds.getBlockModelId(block))

    /**
     * Creates blockstate variants for a vertical slab using the TYPE property.
     *
     * NORTH/EAST/SOUTH/WEST use the vertical slab model with rotation.
     * DOUBLE uses the full block model.
     *
     * @param vertSlabBlock The vertical slab block.
     * @param vertSlabId The model ID for the slab.
     * @param fullBlockId The model ID for the full block.
     * @return The [net.minecraft.client.data.BlockModelDefinitionCreator] for the blockstate.
     */
    private fun createVerticalSlabBlockStates(
        vertSlabBlock: Block,
        vertSlabId: Identifier,
        fullBlockId: Identifier
    ): BlockModelDefinitionCreator {
        val fullBlockModel: WeightedVariant = BlockStateModelGenerator.createWeightedVariant(fullBlockId)

        val northOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
            .then(ModelVariantOperator.UV_LOCK.withValue(true))
            .then(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R0))

        val eastOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
            .then(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R90))
            .then(ModelVariantOperator.UV_LOCK.withValue(true))

        val southOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
            .then(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R180))
            .then(ModelVariantOperator.UV_LOCK.withValue(true))

        val westOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
            .then(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R270))
            .then(ModelVariantOperator.UV_LOCK.withValue(true))

        val doubleOp =
            ModelVariantOperator.MODEL.withValue(fullBlockId).then(ModelVariantOperator.UV_LOCK.withValue(true))

        return VariantsBlockModelDefinitionCreator.of(vertSlabBlock, fullBlockModel)
            .coordinate(
                BlockStateVariantMap.operations(VerticalSlabBlock.TYPE)
                    .register(VerticalSlabType.NORTH, northOp)
                    .register(VerticalSlabType.EAST, eastOp)
                    .register(VerticalSlabType.SOUTH, southOp)
                    .register(VerticalSlabType.WEST, westOp)
                    .register(VerticalSlabType.DOUBLE, doubleOp)
            )
    }

    /**
     * Registers blockstate and item models for a vertical slab block.
     *
     * @param generator The blockstate model generator.
     * @param vertSlabBlock The vertical slab block.
     * @param fullBlock The full block for the double slab.
     * @param textures The texture map for the slab.
     */
    fun registerVerticalSlab(
        generator: BlockStateModelGenerator,
        vertSlabBlock: Block,
        fullBlock: Block,
        textures: TextureMap
    ) {
        val slabModel: Identifier = VERTICAL_SLAB.upload(vertSlabBlock, textures, generator.modelCollector)
        val fullBlockModel: Identifier = ModelIds.getBlockModelId(fullBlock)
        generator.blockStateCollector.accept(
            createVerticalSlabBlockStates(
                vertSlabBlock,
                slabModel,
                fullBlockModel
            )
        )
        generator.registerParentedItemModel(vertSlabBlock, slabModel)
    }
}