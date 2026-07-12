package net.scarycat105.theinbetween;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import net.scarycat105.theinbetween.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheInbetween implements ModInitializer {
	public static final String MOD_ID = "theinbetween";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
