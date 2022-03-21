package com.shauncjones.minitweaks.core;

import com.electronwill.nightconfig.core.ConfigSpec;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class MiniTweaksConfig {


    public static class Common {

        //Blocks
        public static ForgeConfigSpec.ConfigValue<Boolean> block_charcoal, block_flint, block_sugar, block_enderpearl, block_glowingglass;

        //Items
        public static ForgeConfigSpec.ConfigValue<Boolean> item_minicoal;
        public static ForgeConfigSpec.ConfigValue<Boolean> item_nightvisiongoggle;

        //Foods
        public static ForgeConfigSpec.ConfigValue<Boolean> food_friedegg, food_eggsandwich, food_scrambledegg, food_breadslice;

        //Tools
        public static ForgeConfigSpec.ConfigValue<Boolean> tools_flint;
        public static ForgeConfigSpec.ConfigValue<Boolean> tools_lapis;
        public static ForgeConfigSpec.ConfigValue<Boolean> tools_emerald;
        public static ForgeConfigSpec.ConfigValue<Boolean> tools_paxels;

        //Armor
        public static ForgeConfigSpec.ConfigValue<Boolean> armor_emerald;

        //Fuels
        public static ForgeConfigSpec.ConfigValue<Boolean> fuel_beds, fuels_doors, fuels_slabs, fuels_stairs, fuels_fence, fuels_boats, fuels_misc;


        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("Blocks");
            this.block_charcoal = builder.define("Load Charcoal Block?", true);
            this.block_flint = builder.define("Load Flint Block?", true);
            this.block_sugar = builder.define("Load Sugar Block?", true);
            this.block_enderpearl = builder.define("Load Ender Pearl Block?", true);
            this.block_glowingglass = builder.define("Load Glowing Glass Block?", true);
            builder.pop();
            builder.push("Items");
            this.item_minicoal = builder.define("Load Mini Coal & Mini Charcoal?", true);
            this.item_nightvisiongoggle = builder.define("Load Night Vision Goggles?",true);
            builder.pop();
            builder.push("Foods");
            this.food_friedegg = builder.define("Load Fried Egg?", true);
            builder.pop();
            builder.push("Tools");
            this.tools_flint = builder.define("Load Flint Tools?", true);
            this.tools_lapis = builder.define("Load Lapis Lazuli Tools?", true);
            this.tools_emerald = builder.define("Load Emerald Tools?", true);
            this.tools_paxels = builder.define("Load Vanilla Paxels?", true);
            builder.pop();
            builder.push("Armor");
            this.armor_emerald = builder.define("Load Emerald Armor?", true);
            builder.pop();
        }
    }

    public static final Common COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;

    static{
        Pair<Common, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON = commonSpecPair.getLeft();
        COMMON_SPEC = commonSpecPair.getRight();
    }

}
