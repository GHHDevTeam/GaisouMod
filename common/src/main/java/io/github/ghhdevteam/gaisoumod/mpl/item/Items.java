package io.github.ghhdevteam.gaisoumod.mpl.item;

import net.minecraft.item.Item;
import io.github.ghhdevteam.gaisoumod.mpl.block.Blocks;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.ItemUtil;

import static io.github.ghhdevteam.gaisoumod.mpl.GaisouMod._id;
import static io.github.ghhdevteam.gaisoumod.mpl.GaisouMod.registry;

public class Items {

    public static final CompatibleItemSettings STANDARD_ITEM_SETTINGS = CompatibleItemSettings.of()
            .addGroup(ItemGroups.EXAMPLE_ITEMS);

    public static RegistryResult<Item> EXAMPLE_ITEM;
    public static RegistryResult<Item> EXAMPLE_BLOCK;

    public static void init() {
        EXAMPLE_ITEM = registry.registerItem(_id("example_item"), () -> new ExampleItem(STANDARD_ITEM_SETTINGS));
        EXAMPLE_BLOCK = registry.registerItem(_id("example_block"), () -> ItemUtil.ofBlock(Blocks.EXAMPLE_BLOCK.getOrNull(), STANDARD_ITEM_SETTINGS));
    }
}
