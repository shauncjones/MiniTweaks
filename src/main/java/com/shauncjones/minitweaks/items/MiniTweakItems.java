package com.shauncjones.minitweaks.items;

import com.shauncjones.minitweaks.MiniTweaks;
import com.shauncjones.minitweaks.blocks.custom.CharcoalBlock;
import com.shauncjones.minitweaks.core.MiniTweaksConfig;
import com.shauncjones.minitweaks.items.custom.MiniCharcoal;
import com.shauncjones.minitweaks.items.custom.MiniCoal;
import com.shauncjones.minitweaks.items.tools.PaxelItem;
import com.shauncjones.minitweaks.lists.FoodLists;
import com.shauncjones.minitweaks.materials.MiniTweaksToolTiers;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MiniTweakItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MiniTweaks.MODID);

    //Items
    public static RegistryObject<Item> MINICOAL;
    public static RegistryObject<Item> MINICHARCOAL;
    public static final RegistryObject<Item> GOGGLELENS = ITEMS.register("gogglelens", () -> new Item(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));

    //Foods
    public static final RegistryObject<Item> FRIEDEGG = ITEMS.register("friedegg", () -> new Item(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP).food(FoodLists.FriedEgg)));

    //Tools
    //Flint Tools
    public static final RegistryObject<Item> FLINT_SWORD = ITEMS.register("flint_sword", () -> new SwordItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> FLINT_PICKAXE = ITEMS.register("flint_pickaxe", () -> new PickaxeItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> FLINT_AXE = ITEMS.register("flint_axe", () -> new AxeItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> FLINT_SHOVEL = ITEMS.register("flint_shovel", () -> new ShovelItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> FLINT_HOE = ITEMS.register("flint_hoe", () -> new HoeItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    //TODO: Fix PaxelItem code to handle shovel right clicks as well.
    public static final RegistryObject<Item> FLINT_PAXEL = ITEMS.register("flint_paxel", () -> new PaxelItem(MiniTweaksToolTiers.FLINT, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));

    //Lapis Tools
    public static final RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword", () -> new SwordItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () -> new PickaxeItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe", () -> new AxeItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new ShovelItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe", () -> new HoeItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    //TODO: Fix PaxelItem code to handle shovel right clicks as well.
    public static final RegistryObject<Item> LAPIS_PAXEL = ITEMS.register("lapis_paxel", () -> new PaxelItem(MiniTweaksToolTiers.LAPIS, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));

    //Emerald Tools
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    //TODO: Fix PaxelItem code to handle shovel right clicks as well.
    public static final RegistryObject<Item> EMERALD_PAXEL = ITEMS.register("emerald_paxel", () -> new PaxelItem(MiniTweaksToolTiers.EMERALD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));

    //Vanilla Paxels
    public static final RegistryObject<Item> STONE_PAXEL = ITEMS.register("stone_paxel", () -> new PaxelItem(ItemTier.STONE, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> IRON_PAXEL = ITEMS.register("iron_paxel", () -> new PaxelItem(ItemTier.IRON, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> GOLD_PAXEL = ITEMS.register("gold_paxel", () -> new PaxelItem(ItemTier.GOLD, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> DIAMOND_PAXEL = ITEMS.register("diamond_paxel", () -> new PaxelItem(ItemTier.DIAMOND, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    public static final RegistryObject<Item> NETHERITE_PAXEL = ITEMS.register("netherite_paxel", () -> new PaxelItem(ItemTier.NETHERITE, 1, 2f, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));

    //Armor
    //public static final RegistryObject<Item> NIGHTVISIONGOGGLES = ITEMS.register("item_nightvisiongoggles", () -> new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));

    public static void RegisterPerConfig(){
        MiniTweaks.LOGGER.info("MiniTweaks: Filtering Items from Config.");
        if(MiniTweaksConfig.COMMON.item_minicoal.get()){
            MINICOAL = ITEMS.register("minicoal", () -> new MiniCoal(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
            MINICHARCOAL = ITEMS.register("minicharcoal", () -> new MiniCharcoal(new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
        }

    }


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
