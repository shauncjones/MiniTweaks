package com.shauncjones.minitweaks.items;

import com.shauncjones.minitweaks.MiniTweaks;
import com.shauncjones.minitweaks.items.custom.MiniCharcoal;
import com.shauncjones.minitweaks.items.custom.MiniCoal;
import com.shauncjones.minitweaks.items.tools.PaxelItem;
import com.shauncjones.minitweaks.lists.FoodLists;
import com.shauncjones.minitweaks.materials.MiniTweaksToolTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MiniTweakItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MiniTweaks.MODID);

    //Items
    public static final RegistryObject<Item> MINICOAL = ITEMS.register("minicoal", () -> new MiniCoal(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> MINICHARCOAL = ITEMS.register("minicharcoal", () -> new MiniCharcoal(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> GOGGLELENS = ITEMS.register("gogglelens", () -> new Item(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));

    //Foods
    public static final RegistryObject<Item> FRIEDEGG = ITEMS.register("friedegg", () -> new Item(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP).food(FoodLists.FriedEgg)));

    //Tools
    public static final RegistryObject<Item> FLINT_SWORD = ITEMS.register("flint_sword", () -> new SwordItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> FLINT_PICKAXE = ITEMS.register("flint_pickaxe", () -> new PickaxeItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> FLINT_AXE = ITEMS.register("flint_axe", () -> new AxeItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> FLINT_SHOVEL = ITEMS.register("flint_shovel", () -> new ShovelItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> FLINT_HOE = ITEMS.register("flint_hoe", () -> new HoeItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    //TODO: Fix PaxelItem code to handle shovel right clicks as well.
    public static final RegistryObject<Item> FLINT_PAXEL = ITEMS.register("flint_paxel", () -> new PaxelItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));

    //Armor
    public static final RegistryObject<Item> NIGHTVISIONGOGGLES = ITEMS.register("item_nightvisiongoggles", () -> new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));

    public static void RegisterPerConfig(){

    }


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
