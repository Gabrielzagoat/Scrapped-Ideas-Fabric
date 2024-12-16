package net.fearnot.scrappedideas.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fearnot.scrappedideas.ScrappedIdeas;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CRAB_LEG = registerItem("crab_leg", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ScrappedIdeas.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ScrappedIdeas.LOGGER.info("Registering Mod Items for " + ScrappedIdeas.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CRAB_LEG);
        });
    }
}
