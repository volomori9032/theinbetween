package net.scarycat105.theinbetween.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.scarycat105.theinbetween.TheInbetween;

public class ModBlocks {
    public static final Block BLUE_ROCK = registerBlock(new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)),
            "blue_rock");

    public static final Block PINK_ROCK = registerBlock(new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)),
            "pink_rock");

    public static final Block COBBLED_BLUE_ROCK = registerBlock(new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)),
            "cobbled_blue_rock");

    public static final Block COBBLED_PINK_ROCK = registerBlock(new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)),
            "cobbled_pink_rock");

    public static final Block WIND_ORE = registerBlock(new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)),
            "wind_ore");

    public static final Block OSCRUIM_ORE = registerBlock(new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)),
            "oscruim_ore");

    public static final Block DEEPSLATE_WIND_ORE = registerBlock(new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)),
            "deepslate_wind_ore");

    public static final Block DEEPSLATE_OSCRUIM_ORE = registerBlock(new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)),
            "deepslate_oscruim_ore");


    private static Block registerBlock(Block block, String name) {
        registerBlockItem(block, name);
        return Registry.register(Registries.BLOCK, Identifier.of(TheInbetween.MOD_ID, name), block);
    }

    private static void registerBlockItem(Block block, String name) {
        Registry.register(Registries.ITEM, Identifier.of(TheInbetween.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TheInbetween.LOGGER.info("Registering Mod Blocks for " + TheInbetween.MOD_ID);
    }
}