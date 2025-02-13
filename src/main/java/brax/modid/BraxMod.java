package brax.modid;

import brax.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BraxMod implements ModInitializer {
	public static final String MOD_ID = "brax-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("BraxMod Initialized!");
		ModItems.registerModItems();
	}
}