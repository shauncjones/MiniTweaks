package com.shauncjones.minitweaks.items;

import com.shauncjones.minitweaks.MiniTweaks;
import com.shauncjones.minitweaks.core.MiniTweaksConfig;
import com.shauncjones.minitweaks.items.armor.MiniTweaksArmorItem;
import com.shauncjones.minitweaks.items.armor.MiniTweaksArmorMaterial;
import com.shauncjones.minitweaks.items.custom.MiniCharcoal;
import com.shauncjones.minitweaks.items.custom.MiniCoal;
import com.shauncjones.minitweaks.items.tools.PaxelItem;
import com.shauncjones.minitweaks.lists.FoodLists;
import com.shauncjones.minitweaks.items.tools.MiniTweaksToolTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MiniTweakItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MiniTweaks.MODID);

    //Items
    public static RegistryObject<Item> MINICOAL, MINICHARCOAL, GOGGLELENS, KNIFE;

    //Foods
    public static RegistryObject<Item> FRIEDEGG, EGGSANDWICH, SCRAMBLEDEGG, BREADSLICE, TOAST;

    //Tools
    //Flint Tools
    //TODO: Fix PaxelItem code to handle shovel right clicks as well.
    public static RegistryObject<Item> FLINT_SWORD, FLINT_PICKAXE, FLINT_AXE, FLINT_SHOVEL, FLINT_HOE, FLINT_PAXEL;
    //Lapis Tools
    public static RegistryObject<Item> LAPIS_SWORD, LAPIS_PICKAXE, LAPIS_AXE, LAPIS_SHOVEL, LAPIS_HOE, LAPIS_PAXEL;
    //Emerald Tools
    public static RegistryObject<Item> EMERALD_SWORD, EMERALD_PICKAXE, EMERALD_AXE, EMERALD_SHOVEL, EMERALD_HOE, EMERALD_PAXEL;
    //Vanilla Paxels
    public static RegistryObject<Item> STONE_PAXEL, IRON_PAXEL, GOLD_PAXEL, DIAMOND_PAXEL, NETHERITE_PAXEL;

    //Armor
    public static RegistryObject<Item> EMERALD_HELMET, EMERALD_CHESTPLATE, EMERALD_LEGGINGS, EMERALD_BOOTS;
    public static RegistryObject<Item> GOGGLES;


    public static void RegisterPerConfig(){
        MiniTweaks.LOGGER.info("MiniTweaks: Filtering Items from Config.");
        if(MiniTweaksConfig.COMMON.item_minicoal.get()){
            MINICOAL = ITEMS.register("minicoal", () -> new MiniCoal(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            MINICHARCOAL = ITEMS.register("minicharcoal", () -> new MiniCharcoal(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
        }
        /*if(MiniTweaksConfig.COMMON.item_nightvisiongoggle.get()){
            GOGGLELENS = ITEMS.register("gogglelens", () -> new Item(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            GOGGLES = ITEMS.register("goggles_helmet", () -> new MiniTweaksArmorItem(MiniTweaksArmorMaterial.GOGGLES, EquipmentSlotType.HEAD, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
        }*/
        if(MiniTweaksConfig.COMMON.food_friedegg.get()){
            FRIEDEGG = ITEMS.register("friedegg", () -> new Item(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP).food(FoodLists.FriedEgg)));
        }
        if(MiniTweaksConfig.COMMON.tools_flint.get()){
            FLINT_SWORD = ITEMS.register("flint_sword", () -> new SwordItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            FLINT_PICKAXE = ITEMS.register("flint_pickaxe", () -> new PickaxeItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            FLINT_AXE = ITEMS.register("flint_axe", () -> new AxeItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            FLINT_SHOVEL = ITEMS.register("flint_shovel", () -> new ShovelItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            FLINT_HOE = ITEMS.register("flint_hoe", () -> new HoeItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            FLINT_PAXEL = ITEMS.register("flint_paxel", () -> new PaxelItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
        }
        if(MiniTweaksConfig.COMMON.tools_lapis.get()){
            LAPIS_SWORD = ITEMS.register("lapis_sword", () -> new SwordItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () -> new PickaxeItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            LAPIS_AXE = ITEMS.register("lapis_axe", () -> new AxeItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new ShovelItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            LAPIS_HOE = ITEMS.register("lapis_hoe", () -> new HoeItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            LAPIS_PAXEL = ITEMS.register("lapis_paxel", () -> new PaxelItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
        }
        if(MiniTweaksConfig.COMMON.tools_emerald.get()){
            EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            EMERALD_PAXEL = ITEMS.register("emerald_paxel", () -> new PaxelItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
        }
        if(MiniTweaksConfig.COMMON.tools_paxels.get()){
            STONE_PAXEL = ITEMS.register("stone_paxel", () -> new PaxelItem(ItemTier.STONE, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            IRON_PAXEL = ITEMS.register("iron_paxel", () -> new PaxelItem(ItemTier.IRON, 2, 1f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            GOLD_PAXEL = ITEMS.register("gold_paxel", () -> new PaxelItem(ItemTier.GOLD, 2, 1f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            DIAMOND_PAXEL = ITEMS.register("diamond_paxel", () -> new PaxelItem(ItemTier.DIAMOND, 4, 1f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            NETHERITE_PAXEL = ITEMS.register("netherite_paxel", () -> new PaxelItem(ItemTier.NETHERITE, 6, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
        }
        if(MiniTweaksConfig.COMMON.armor_emerald.get()){
            EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(MiniTweaksArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(MiniTweaksArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(MiniTweaksArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(MiniTweaksArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
        }

    }


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
