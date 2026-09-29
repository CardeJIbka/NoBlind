package cardejibka.noblind.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(value = "noblind", dist = Dist.CLIENT)
public class NoBlindClient {
    public static final Logger LOGGER = LoggerFactory.getLogger("noblind");

    public NoBlindClient() {
        LOGGER.info("No Blind loaded on NeoForge");
    }
}