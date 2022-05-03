package net.shadowgrum.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.shadowgrum.testmod.TestMod;

public class ModItemGroup {
    public static final ItemGroup TEST_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "test_item_group"),
            () -> new ItemStack(ModItems.TEST_ITEM));
}
