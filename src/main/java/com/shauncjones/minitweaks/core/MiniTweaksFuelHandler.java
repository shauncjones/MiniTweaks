package com.shauncjones.minitweaks.core;

import com.shauncjones.minitweaks.blocks.MiniTweakBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MiniTweaksFuelHandler {

    public static final MiniTweaksFuelHandler instance = new MiniTweaksFuelHandler();

    public MiniTweaksFuelHandler(){

    }

    @SubscribeEvent
    public void onFurnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
        ItemStack fuelStack = event.getItemStack();
        Item fuel = fuelStack.getItem();

        if(fuel == MiniTweakBlocks.BLOCK_CHARCOAL.get().asItem())
            event.setBurnTime(16000);

    }

}
