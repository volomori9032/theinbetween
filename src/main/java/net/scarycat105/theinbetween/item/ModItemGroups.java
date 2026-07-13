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
            Identifier.of(TheInbetween.MOD_ID, "pink_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_ROCK))
                    .displayName(Text.translatable("Pink Items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_ROCK);
                        entries.add(ModBlocks.COBBLED_PINK_ROCK);
                        entries.add(ModBlocks.OSCRUIM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_OSCRUIM_ORE);
                        entries.add(ModItems.RAW_OSCRUIM_ORE);
                        entries.add(ModItems.OSCRUIM_INGOT);
                        entries.add(ModBlocks.BLOCK_OF_OSCRUIM);


                    }).build());

    public static final ItemGroup ROCK_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheInbetween.MOD_ID, "blue_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLUE_ROCK))
                    .displayName(Text.translatable("Blue Items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLUE_ROCK);
                        entries.add(ModBlocks.COBBLED_BLUE_ROCK);
                        entries.add(ModBlocks.WIND_ORE);
                        entries.add(ModBlocks.DEEPSLATE_WIND_ORE);
                        entries.add(ModItems.RAW_WIND_ORE);
                        entries.add(ModItems.WIND_INGOT);
                        entries.add(ModBlocks.BLOCK_OF_WIND);

                    }).build());

    public static void registerItemGroups() {
        TheInbetween.LOGGER.info("Registering Item Groups for " + TheInbetween.MOD_ID);
    }
}
