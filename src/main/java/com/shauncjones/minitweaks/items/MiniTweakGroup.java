package com.shauncjones.minitweaks.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MiniTweakGroup {

    public static final ItemGroup MINITWEAKSGROUP = new ItemGroup("minitweaksgroup") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(MiniTweakItems.MINICOAL.get());
        }
    };

}
