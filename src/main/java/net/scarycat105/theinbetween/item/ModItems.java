package net.scarycat105.theinbetween.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scarycat105.theinbetween.TheInbetween;


public class ModItems {

    public static final Item FLOATING_ROCK = register(new Item(new Item.Settings()), "floating_rock");
    public static final Item PURPLE_FLOATING_ROCK = register(new Item(new Item.Settings()), "purple_floating_rock");


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

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(itemGroup -> {
            itemGroup.add(ModItems.FLOATING_ROCK);
            itemGroup.add(ModItems.PURPLE_FLOATING_ROCK);
        });
    }
}
