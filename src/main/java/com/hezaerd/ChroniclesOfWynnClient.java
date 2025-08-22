package com.hezaerd;

import net.fabricmc.api.ClientModInitializer;

public class ChroniclesOfWynnClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        try {
            ModLib.LOGGER.info("Initializing " + ModLib.MOD_NAME + " Client");

            // Client Initialization

            ModLib.LOGGER.info("Successfully initialized " + ModLib.MOD_NAME + " Client");
        } catch (Exception e) {
            ModLib.LOGGER.error("An error occurred during client initialization", e);
        }
    }
}
