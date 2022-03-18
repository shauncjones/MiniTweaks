package com.shauncjones.minitweaks.blocks.custom;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class GlowingGlassBlock extends Block {

    public GlowingGlassBlock() {
        super(Block.Properties.create(Material.ROCK).zeroHardnessAndResistance().sound(SoundType.GLASS).notSolid().setLightLevel(BlockState -> 15));
    }

    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {

        return 0.2f;

    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {

        return false;

    }

    @Override
    public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {

        return 1;

    }

    //@Override
    //@SuppressWarnings("deprecation")
    //public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
//
    //    return adjacentBlockState.isIn(this) ? true : super.isSideInvisible(state, adjacentBlockState, side);
//
    //}

}
