package net.pearadise.pearexpansion.block

import com.mojang.serialization.MapCodec
import com.mojang.serialization.codecs.RecordCodecBuilder
import net.minecraft.block.BlockState
import net.minecraft.block.Degradable
import net.minecraft.block.Oxidizable
import net.minecraft.server.world.ServerWorld
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.random.Random

/**
 * Block for vertical copper slabs that can oxidize over time.
 *
 * Supports weathering behavior like vanilla copper blocks.
 *
 * @constructor Creates an oxidizable vertical slab block.
 * @param oxidationLevel The current oxidation state of the block.
 * @param settings Block settings.
 */
class OxidizableVerticalSlabBlock(
    private val oxidationLevel: Oxidizable.OxidationLevel,
    settings: Settings
) : VerticalSlabBlock(settings), Oxidizable, Degradable<Oxidizable.OxidationLevel> {

    /**
     * Returns the codec for serialization.
     */
    override fun getCodec(): MapCodec<out OxidizableVerticalSlabBlock> = CODEC

    /**
     * Handles random ticking for oxidation.
     *
     * @param state The current block state.
     * @param world The server world.
     * @param pos The block position.
     * @param random The random instance.
     */
    override fun randomTick(state: BlockState, world: ServerWorld, pos: BlockPos, random: Random) {
        tickDegradation(state, world, pos, random)
    }

    /**
     * Checks if the block should receive random ticks for oxidation.
     *
     * @param state The current block state.
     * @return True if the block can oxidize further, false otherwise.
     */
    override fun hasRandomTicks(state: BlockState): Boolean =
        Oxidizable.getIncreasedOxidationBlock(state.block).isPresent

    /**
     * Gets the current oxidation level of the block.
     *
     * @return The [Oxidizable.OxidationLevel] of this block.
     */
    override fun getDegradationLevel(): Oxidizable.OxidationLevel = oxidationLevel

    companion object {
        /**
         * Codec for serializing and deserializing this block.
         */
        val CODEC: MapCodec<OxidizableVerticalSlabBlock> = RecordCodecBuilder.mapCodec { instance ->
            instance.group(
                Oxidizable.OxidationLevel.CODEC.fieldOf("weathering_state")
                    .forGetter(OxidizableVerticalSlabBlock::getDegradationLevel),
                createSettingsCodec()
            ).apply(instance, ::OxidizableVerticalSlabBlock)
        }
    }
}