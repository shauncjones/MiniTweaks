package com.shauncjones.minitweaks;

import com.shauncjones.minitweaks.blocks.MiniTweakBlocks;
import com.shauncjones.minitweaks.core.MiniTweaksConfig;
import com.shauncjones.minitweaks.core.MiniTweaksFuelHandler;
import com.shauncjones.minitweaks.items.MiniTweakItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MiniTweaks.MODID)
public class MiniTweaks
{

    public static final String MODID = "minitweaks";
    public static final Logger LOGGER = LogManager.getLogger();

    private IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public MiniTweaks() {
        LOGGER.info("MiniTweaks: Loading MiniTweaks Version 1.16.5-0.0.1.4");

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        //Register config
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MiniTweaksConfig.COMMON_SPEC);

        //Register items & blocks based on config
        MiniTweakBlocks.RegisterPerConfig();
        MiniTweakItems.RegisterPerConfig();
        LOGGER.info("MiniTweals: Loaded Configs");

        MiniTweakItems.register(eventBus);
        MiniTweakBlocks.register(eventBus);

        LOGGER.info("MiniTweaks: Loaded " + MiniTweakItems.ITEMS.getEntries().size() + " items & " + MiniTweakBlocks.BLOCKS.getEntries().size() + " blocks.");


        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(MiniTweaksFuelHandler.instance);
    }

    private void clientSetup(final FMLClientSetupEvent event){
        RenderTypeLookup.setRenderLayer(MiniTweakBlocks.BLOCK_GLOWINGGLASS.get(), RenderType.getCutout());
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void enqueueIMC(final InterModEnqueueEvent event) {

    }

    private void processIMC(final InterModProcessEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }

    @SubscribeEvent()
    public static void onClientSetupEvent(FMLClientSetupEvent event) {

    }

}
