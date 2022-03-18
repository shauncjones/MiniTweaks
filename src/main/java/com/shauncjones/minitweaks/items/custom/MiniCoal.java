package com.shauncjones.minitweaks.items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;

public class MiniCoal extends Item {

    public MiniCoal(Properties properties){
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, IRecipeType<?> recipeType){
        return 200;
    }

}
