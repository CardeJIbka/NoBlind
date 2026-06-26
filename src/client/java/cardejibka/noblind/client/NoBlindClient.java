package cardejibka.noblind.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoBlindClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("noblind");

    @Override
    public void onInitializeClient() {
        LOGGER.info("No Blind loaded");
    }
}