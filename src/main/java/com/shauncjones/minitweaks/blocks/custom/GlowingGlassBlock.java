package com.shauncjones.minitweaks.blocks.custom;


import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import org.spongepowered.asm.mixin.MixinEnvironment;

public class GlowingGlassBlock extends BreakableBlock {


    public GlowingGlassBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, IBlockReader world, BlockPos pos){
        return true;
    }

    public boolean isOpaqueCube() {
        return false;
    }
    public boolean notSolid() {
        return true;
    }

}
