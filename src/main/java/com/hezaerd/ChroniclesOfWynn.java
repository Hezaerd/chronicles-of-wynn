package com.hezaerd;

import net.fabricmc.api.ModInitializer;

public class ChroniclesOfWynn implements ModInitializer {
	@Override
	public void onInitialize() {
		try {
			ModLib.LOGGER.info("Initializing " + ModLib.MOD_NAME);
			
			// Initialization
			
			ModLib.LOGGER.info("Successfully initialized " + ModLib.MOD_NAME);
		} catch (Exception e) {
			ModLib.LOGGER.error("An error occurred during initialization", e);
		}
	}
}