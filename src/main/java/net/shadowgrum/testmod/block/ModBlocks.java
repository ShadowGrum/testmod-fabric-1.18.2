package net.shadowgrum.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shadowgrum.testmod.TestMod;
import net.shadowgrum.testmod.item.ModItemGroup;

public class ModBlocks {

    private static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .collidable(true)
                    .strength(5f)
                    .requiresTool()),
            ModItemGroup.TEST_ITEM_GROUP);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        TestMod.LOGGER.info("Registrování blocků.");
    }
}
