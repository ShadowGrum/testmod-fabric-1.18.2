package net.shadowgrum.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.shadowgrum.testmod.TestMod;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TEST_ITEM = registerItem("test_item",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.TEST_ITEM_GROUP) //jinak ItemGroup.--- //groupa pod kterou to bude zařazeno ve hře
                    .maxDamage(100)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registrování itemů pro "+TestMod.MOD_ID);
    }
}
