package net.pearadise.pearexpansion.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidFillable;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class VerticalSlabBlock extends Block implements FluidFillable {
    public static final BooleanProperty SINGLE = BooleanProperty.of("single");

    /**
     * Property indicating if the block is waterlogged.
     */
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    /**
     * Property representing the horizontal facing direction of the slab.
     */
    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;

    /**
     * Voxel shape for a slab facing north (occupies the north half of the block).
     */
    public static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);

    /**
     * Voxel shape for a slab facing south (occupies the south half of the block).
     */
    public static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);

    /**
     * Voxel shape for a slab facing west (occupies the west half of the block).
     */
    public static final VoxelShape WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);

    /**
     * Voxel shape for a slab facing east (occupies the east half of the block).
     */
    public static final VoxelShape EAST_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    /**
     * Constructs a new {@code VerticalSlabBlock} with the specified settings.
     *
     * @param settings the block settings to use (copied from a template block)
     */
    public VerticalSlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SINGLE, FACING, WATERLOGGED);
    }

    protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        boolean type = state.get(SINGLE);
        Direction direction = state.get(FACING);

        if (!type) return VoxelShapes.fullCube();

        return switch (direction) {
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case NORTH -> NORTH_SHAPE;
            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.getSidesShape(state, world, pos);
    }

    /**
     * Returns the collision shape of the block for entity collision.
     *
     * <p>
     * The collision shape determines how entities interact with the block.
     * </p>
     *
     * @param state   the current block state
     * @param world   the block view
     * @param pos     the block position
     * @param context the shape context
     * @return the collision voxel shape
     */
    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.getSidesShape(state, world, pos);
    }

    /**
     * Determines if the block can be replaced by another slab during placement.
     *
     * <p>
     * Allows replacing a single slab with a double slab if the placement context is valid.
     * Only allows replacement if the player is placing the same slab type and is targeting the correct side.
     * </p>
     *
     * @param state   the current block state
     * @param context the item placement context
     * @return {@code true} if the block can be replaced, {@code false} otherwise
     */
    @Override
    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        Direction direction = state.get(FACING);
        if (context.getStack().isOf(this.asItem()) && state.get(SINGLE)) {
            if (context.canReplaceExisting()) {
                return context.getSide().getOpposite() == direction;
            }
        }
        return false;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos pos = ctx.getBlockPos();
        Direction playerFacing = ctx.getHorizontalPlayerFacing();
        BlockState existing = ctx.getWorld().getBlockState(pos);

        BlockState base = Objects.requireNonNull(super.getPlacementState(ctx));

        if (existing.isOf(this) && existing.get(FACING) == ctx.getSide().getOpposite() && existing.get(SINGLE)) {
            return base.with(SINGLE, false).with(WATERLOGGED, false).with(FACING, existing.get(FACING));
        }

        FluidState fluidAtPos = ctx.getWorld().getFluidState(pos);
        boolean waterPresent = fluidAtPos.isOf(Fluids.WATER);

        double hitX = ctx.getHitPos().x - pos.getX();
        double hitZ = ctx.getHitPos().z - pos.getZ();

        BlockState resultBase = base.with(WATERLOGGED, waterPresent);

        if (playerFacing == Direction.NORTH && hitZ > 0.5) {
            return resultBase.with(FACING, Direction.SOUTH).with(SINGLE, true);
        } else if (playerFacing == Direction.SOUTH && hitZ < 0.5) {
            return resultBase.with(FACING, Direction.NORTH).with(SINGLE, true);
        } else if (playerFacing == Direction.WEST && hitX > 0.5) {
            return resultBase.with(FACING, Direction.EAST).with(SINGLE, true);
        } else if (playerFacing == Direction.EAST && hitX < 0.5) {
            return resultBase.with(FACING, Direction.WEST).with(SINGLE, true);
        } else {
            return resultBase.with(FACING, playerFacing).with(SINGLE, true);
        }
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (!state.get(SINGLE)) return false;
        if (!fluidState.isOf(Fluids.WATER)) return false;
        world.setBlockState(pos, state.with(WATERLOGGED, true), 3);
        try {
            world.scheduleFluidTick(pos, Fluids.WATER, 5);
        } catch (Throwable ignored) {
        }
        return true;
    }

    @Override
    public boolean canFillWithFluid(@Nullable LivingEntity filler, BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.get(SINGLE) && fluid == Fluids.WATER;
    }
}
