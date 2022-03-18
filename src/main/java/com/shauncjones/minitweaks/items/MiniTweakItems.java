package com.shauncjones.minitweaks.items;

import com.shauncjones.minitweaks.MiniTweaks;
import com.shauncjones.minitweaks.core.MiniTweaksConfig;
import com.shauncjones.minitweaks.items.custom.MiniCharcoal;
import com.shauncjones.minitweaks.items.custom.MiniCoal;
import com.shauncjones.minitweaks.lists.FoodLists;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MiniTweakItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MiniTweaks.MODID);

    public static final RegistryObject<Item> MINICOAL = ITEMS.register("minicoal",
            () -> new MiniCoal(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> MINICHARCOAL = ITEMS.register("minicharcoal",
            () -> new MiniCharcoal(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));

    public static final RegistryObject<Item> FRIEDEGG = ITEMS.register("friedegg",
            () -> new Item(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP).food(FoodLists.FriedEgg)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
