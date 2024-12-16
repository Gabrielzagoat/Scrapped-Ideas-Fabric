package net.fearnot.scrappedideas;

import net.fabricmc.api.ModInitializer;

import net.fearnot.scrappedideas.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScrappedIdeas implements ModInitializer {
	public static final String MOD_ID = "scrappedideas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}