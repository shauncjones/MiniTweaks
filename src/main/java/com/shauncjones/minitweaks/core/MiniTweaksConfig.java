package com.shauncjones.minitweaks.core;

import com.electronwill.nightconfig.core.ConfigSpec;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class MiniTweaksConfig {


    public static class Common {

        //Blocks
        public static ForgeConfigSpec.ConfigValue<Boolean> block_charcoal;
        public static ForgeConfigSpec.ConfigValue<Boolean> block_flint;
        public static ForgeConfigSpec.ConfigValue<Boolean> block_sugar;
        public static ForgeConfigSpec.ConfigValue<Boolean> block_enderpearl;
        public static ForgeConfigSpec.ConfigValue<Boolean> block_glowingglass;

        //Items
        public static ForgeConfigSpec.ConfigValue<Boolean> item_minicoal;

        //Foods
        public static ForgeConfigSpec.ConfigValue<Boolean> food_friedegg;


        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("Blocks");
            //Blocks
            this.block_charcoal = builder.define("Load Charcoal Block?", true);
            this.block_flint = builder.define("Load Flint Block?", true);
            this.block_sugar = builder.define("Load Sugar Block?", true);
            this.block_enderpearl = builder.define("Load Ender Pearl Block?", true);
            this.block_glowingglass = builder.define("Load Glowing Glass Block?", true);
            builder.pop();
            builder.push("Items");
            //Items
            this.item_minicoal = builder.define("Load Mini Coal & Mini Charcoal?", true);
            builder.pop();
            builder.push("Foods");
            //Foods
            this.food_friedegg = builder.define("Load Fried Egg?", true);
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
