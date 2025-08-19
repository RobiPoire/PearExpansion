package net.pearadise.pearexpansion.block

import com.mojang.serialization.MapCodec
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.ShapeContext
import net.minecraft.block.Waterloggable
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.ai.pathing.NavigationType
import net.minecraft.fluid.Fluid
import net.minecraft.fluid.FluidState
import net.minecraft.fluid.Fluids
import net.minecraft.item.ItemPlacementContext
import net.minecraft.item.ItemStack
import net.minecraft.registry.tag.FluidTags
import net.minecraft.state.StateManager
import net.minecraft.state.property.BooleanProperty
import net.minecraft.state.property.EnumProperty
import net.minecraft.state.property.Properties
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.math.random.Random
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView
import net.minecraft.world.WorldAccess
import net.minecraft.world.WorldView
import net.minecraft.world.tick.ScheduledTickView
import net.pearadise.pearexpansion.block.enums.VerticalSlabType
import net.pearadise.pearexpansion.state.ModProperties

/**
 * Block for vertical slabs with waterlogging support.
 *
 * Handles placement, merging, waterlogging, and shape logic for vertical slabs.
 *
 * @constructor Creates a vertical slab block with the given settings.
 * @param settings Block settings.
 */
open class VerticalSlabBlock(settings: Settings) : Block(settings), Waterloggable {

    init {
        // Set default state: facing north and not waterlogged
        defaultState = defaultState.with(TYPE, VerticalSlabType.NORTH).with(WATERLOGGED, false)
    }

    /**
     * Returns the codec for serialization.
     */
    override fun getCodec(): MapCodec<out VerticalSlabBlock> = CODEC

    /**
     * Checks if the block has sided transparency.
     *
     * @param state The block state.
     * @return True if not double slab, false otherwise.
     */
    override fun hasSidedTransparency(state: BlockState): Boolean =
        state[TYPE] != VerticalSlabType.DOUBLE

    /**
     * Adds block properties to the state manager.
     *
     * @param builder The state manager builder.
     */
    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(TYPE, WATERLOGGED)
    }

    /**
     * Gets the outline shape for the block.
     *
     * @param state The block state.
     * @param world The block view.
     * @param pos The block position.
     * @param context The shape context.
     * @return The voxel shape for the current slab type.
     */
    override fun getOutlineShape(
        state: BlockState,
        world: BlockView,
        pos: BlockPos,
        context: ShapeContext
    ): VoxelShape =
        when (state[TYPE]) {
            VerticalSlabType.NORTH -> NORTH_SHAPE
            VerticalSlabType.SOUTH -> SOUTH_SHAPE
            VerticalSlabType.WEST -> WEST_SHAPE
            VerticalSlabType.EAST -> EAST_SHAPE
            VerticalSlabType.DOUBLE -> VoxelShapes.fullCube()
        }

    /**
     * Checks if the given side is opposite to the current slab type.
     *
     * @param type The current slab type.
     * @param side The side being checked.
     * @return True if opposite, false otherwise.
     */
    private fun isOppositeSide(type: VerticalSlabType, side: Direction): Boolean =
        when (type) {
            VerticalSlabType.NORTH -> side == Direction.SOUTH
            VerticalSlabType.SOUTH -> side == Direction.NORTH
            VerticalSlabType.WEST -> side == Direction.EAST
            VerticalSlabType.EAST -> side == Direction.WEST
            VerticalSlabType.DOUBLE -> false
        }

    /**
     * Gets the block state for placement.
     *
     * Handles merging slabs and waterlogging.
     *
     * @param ctx The item placement context.
     * @return The new block state, or null if placement is not allowed.
     */
    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? {
        val pos = ctx.blockPos
        val world = ctx.world
        val existing = world.getBlockState(pos)

        if (existing.isOf(this)) {
            val currentType = existing[TYPE]
            // If existing is a single slab and we clicked the opposite side, merge into double slab
            if (currentType != VerticalSlabType.DOUBLE && isOppositeSide(currentType, ctx.side)) {
                return existing.with(TYPE, VerticalSlabType.DOUBLE).with(WATERLOGGED, false)
            }
            // Otherwise keep existing (no change)
            return existing
        }

        // Normal placement: consider waterlogging
        val fluidState = world.getFluidState(pos)
        val base = defaultState.with(WATERLOGGED, fluidState.isIn(FluidTags.WATER))
        val type = getSlabTypeForPlacement(ctx, pos)
        return base.with(TYPE, type)
    }

    /**
     * Determines the slab type based on placement context.
     *
     * @param ctx The item placement context.
     * @param blockPos The block position.
     * @return The [VerticalSlabType] for placement.
     */
    private fun getSlabTypeForPlacement(ctx: ItemPlacementContext, blockPos: BlockPos): VerticalSlabType {
        val playerFacing = ctx.horizontalPlayerFacing
        val hitX = ctx.hitPos.x - blockPos.x
        val hitZ = ctx.hitPos.z - blockPos.z

        // Player is facing north or south
        if (playerFacing == Direction.NORTH || playerFacing == Direction.SOUTH) {
            return if (hitZ > 0.5) VerticalSlabType.SOUTH else VerticalSlabType.NORTH
        }

        // Player is facing east or west
        if (playerFacing == Direction.EAST || playerFacing == Direction.WEST) {
            return if (hitX > 0.5) VerticalSlabType.EAST else VerticalSlabType.WEST
        }

        // Fallback (should not happen)
        return VerticalSlabType.NORTH
    }

    /**
     * Checks if the block can be replaced by another slab.
     *
     * @param state The current block state.
     * @param context The item placement context.
     * @return True if replacement is allowed, false otherwise.
     */
    override fun canReplace(state: BlockState, context: ItemPlacementContext): Boolean {
        val stack: ItemStack = context.stack
        val type = state[TYPE]

        // Not replaceable if already double or wrong item
        if (type == VerticalSlabType.DOUBLE || !stack.isOf(this.asItem())) return false

        // Only allow replacement when player is explicitly trying to replace existing block (clicking)
        return context.canReplaceExisting()
    }

    /**
     * Gets the fluid state for the block.
     *
     * @param state The block state.
     * @return The fluid state (water if waterlogged, else default).
     */
    override fun getFluidState(state: BlockState): FluidState =
        if (state[WATERLOGGED]) Fluids.WATER.getStill(false) else super.getFluidState(state)

    /**
     * Tries to fill the block with fluid.
     *
     * @param world The world access.
     * @param pos The block position.
     * @param state The block state.
     * @param fluidState The fluid state to fill with.
     * @return True if filled, false otherwise.
     */
    override fun tryFillWithFluid(
        world: WorldAccess,
        pos: BlockPos,
        state: BlockState,
        fluidState: FluidState
    ): Boolean =
        state[TYPE] != VerticalSlabType.DOUBLE && super.tryFillWithFluid(world, pos, state, fluidState)

    /**
     * Checks if the block can be filled with fluid.
     *
     * @param filler The entity filling the block.
     * @param world The block view.
     * @param pos The block position.
     * @param state The block state.
     * @param fluid The fluid to fill with.
     * @return True if it can be filled, false otherwise.
     */
    override fun canFillWithFluid(
        filler: LivingEntity?,
        world: BlockView,
        pos: BlockPos,
        state: BlockState,
        fluid: Fluid
    ): Boolean = state[TYPE] != VerticalSlabType.DOUBLE && super.canFillWithFluid(
        filler,
        world,
        pos,
        state,
        fluid
    )

    /**
     * Updates the block state when a neighbor changes.
     *
     * Schedules a water tick if waterlogged.
     *
     * @param state The current block state.
     * @param world The world view.
     * @param tickView The scheduled tick view.
     * @param pos The block position.
     * @param direction The direction of the neighbor.
     * @param neighborPos The neighbor's position.
     * @param neighborState The neighbor's state.
     * @param random The random instance.
     * @return The updated block state.
     */
    override fun getStateForNeighborUpdate(
        state: BlockState,
        world: WorldView,
        tickView: ScheduledTickView,
        pos: BlockPos,
        direction: Direction,
        neighborPos: BlockPos,
        neighborState: BlockState,
        random: Random
    ): BlockState {
        if (state[WATERLOGGED]) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world))
        }
        return super.getStateForNeighborUpdate(
            state,
            world,
            tickView,
            pos,
            direction,
            neighborPos,
            neighborState,
            random
        )
    }

    /**
     * Checks if entities can pathfind through the block.
     *
     * @param state The block state.
     * @param type The navigation type.
     * @return True if water pathfinding is allowed, false otherwise.
     */
    override fun canPathfindThrough(state: BlockState, type: NavigationType): Boolean =
        type == NavigationType.WATER && state.fluidState.isIn(FluidTags.WATER)

    companion object {
        /** Property for the slab type (direction or double). */
        val TYPE: EnumProperty<VerticalSlabType> = ModProperties.VERTICAL_SLAB_TYPE

        /** Property for waterlogging. */
        val WATERLOGGED: BooleanProperty = Properties.WATERLOGGED

        /** Codec for serialization. */
        val CODEC: MapCodec<VerticalSlabBlock> = createCodec(::VerticalSlabBlock)

        /** Shape for north-facing slab. */
        val NORTH_SHAPE: VoxelShape = createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0)

        /** Shape for south-facing slab. */
        val SOUTH_SHAPE: VoxelShape = createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0)

        /** Shape for west-facing slab. */
        val WEST_SHAPE: VoxelShape = createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0)

        /** Shape for east-facing slab. */
        val EAST_SHAPE: VoxelShape = createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0)
    }
}
