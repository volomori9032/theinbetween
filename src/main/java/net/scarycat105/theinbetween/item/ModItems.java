package net.scarycat105.theinbetween.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scarycat105.theinbetween.TheInbetween;
import net.scarycat105.theinbetween.item.custom.ChiselItem;


public class ModItems {

    public static final Item RAW_WIND_ORE = register(new Item(new Item.Settings()), "raw_wind_ore");
    public static final Item RAW_OSCRUIM_ORE = register(new Item(new Item.Settings()), "raw_oscruim_ore");
    public static final Item WIND_INGOT = register(new Item(new Item.Settings()), "wind_ingot");
    public static final Item OSCRUIM_INGOT = register(new Item(new Item.Settings()), "oscruim_ingot");

    public static final Item CHISEL = register(new ChiselItem(new Item.Settings().maxDamage(32)), "chisel");

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(TheInbetween.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);
    }

    public class Items implements ModInitializer {
        @Override
        public void onInitialize() {
            ModItems.initialize();
        }
    }

    private static void initialize() {
    }


    public static void registerModItems() {
        TheInbetween.LOGGER.info("Registering Mod Items for " + TheInbetween.MOD_ID);
    }

}
