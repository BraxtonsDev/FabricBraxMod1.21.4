package brax.modid.item;

import brax.modid.BraxMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems
{
    public static final Item AUTO_ROD = registerItem("auto_rod", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BraxMod.MOD_ID,"auto_rod")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BraxMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BraxMod.LOGGER.info("Registering Mod Items For " + BraxMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(AUTO_ROD);
        });
    }
}
