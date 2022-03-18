package com.shauncjones.minitweaks.blocks;

import com.shauncjones.minitweaks.MiniTweaks;
import com.shauncjones.minitweaks.blocks.custom.CharcoalBlock;
import com.shauncjones.minitweaks.items.MiniTweakGroup;
import com.shauncjones.minitweaks.items.MiniTweakItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class MiniTweakBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MiniTweaks.MODID);

    //public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",() -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)));
    public static final RegistryObject<Block> BLOCK_CHARCOAL = registerBlock("block_charcoal", () -> new CharcoalBlock(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)));
    public static final RegistryObject<Block> BLOCK_FLINT = registerBlock("block_flint", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)));
    public static final RegistryObject<Block> BLOCK_SUGAR = registerBlock("block_sugar", () -> new Block(AbstractBlock.Properties.create(Material.SNOW_BLOCK).harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)));
    public static final RegistryObject<Block> BLOCK_ENDERPEARL = registerBlock("block_enderpearl", () -> new Block(AbstractBlock.Properties.create(Material.SNOW_BLOCK).harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)));
    public static final RegistryObject<Block> BLOCK_GLOWINGGLASS = registerBlock("block_glowingglass", () -> new Block(AbstractBlock.Properties.create(Material.SNOW_BLOCK).harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f).setLightLevel(BlockState -> 15)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        MiniTweakItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(MiniTweakGroup.MINITWEAKSGROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}