package com.shauncjones.minitweaks.core;

import com.electronwill.nightconfig.core.ConfigSpec;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class MiniTweaksConfig {


    public static class Common
    {
        private static final boolean defaultMiniCoal = true;

        public static ForgeConfigSpec.ConfigValue<Boolean> minicoal;


        public Common(ForgeConfigSpec.Builder builder)
        {
            builder.push("category1");
            this.minicoal = builder.define("Load Mini Coal & Mini Charcoal?", defaultMiniCoal);
            builder.pop();
        }
    }

    public static final Common COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;

    static //constructor
    {
        Pair<Common, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON = commonSpecPair.getLeft();
        COMMON_SPEC = commonSpecPair.getRight();
    }

}
