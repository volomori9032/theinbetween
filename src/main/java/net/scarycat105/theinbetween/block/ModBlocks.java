package net.scarycat105.theinbetween.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.scarycat105.theinbetween.TheInbetween;

public class ModBlocks {
    public static final Block BLUE_ROCK_BLOCK = registerBlock(new Block(AbstractBlock.Settings.create().strength(4f)
            .requiresTool().sounds(BlockSoundGroup.STONE)), "blue_rock_block");
    public static final Block PINK_ROCK_BLOCK = registerBlock(new Block(AbstractBlock.Settings.create().strength(4f)
            .requiresTool().sounds(BlockSoundGroup.STONE)), "pink_rock_block");

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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(itemGroup -> {
            itemGroup.add(ModBlocks.BLUE_ROCK_BLOCK);
            itemGroup.add(ModBlocks.PINK_ROCK_BLOCK);
        });
    }
}