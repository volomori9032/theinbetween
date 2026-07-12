package net.scarycat105.theinbetween.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scarycat105.theinbetween.TheInbetween;
import net.scarycat105.theinbetween.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup ROCK_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheInbetween.MOD_ID, "rock_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BLUE_ROCK))
                    .displayName(Text.translatable("itemgroup.theinbetween.rock_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLUE_ROCK);
                        entries.add(ModItems.PINK_ROCK);

                    }).build());

    public static final ItemGroup ROCK_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheInbetween.MOD_ID, "rock_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLUE_ROCK_BLOCK))
                    .displayName(Text.translatable("itemgroup.theinbetween.rock_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLUE_ROCK_BLOCK);
                        entries.add(ModBlocks.PINK_ROCK_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        TheInbetween.LOGGER.info("Registering Item Groups for " + TheInbetween.MOD_ID);
    }
}
