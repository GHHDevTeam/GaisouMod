package io.github.ghhdevteam.gaisoumod.mpl.item;

import net.pitan76.mcpitanlib.api.item.CreativeTabBuilder;
import net.pitan76.mcpitanlib.api.util.ItemStackUtil;

import static io.github.ghhdevteam.gaisoumod.mpl.GaisouMod._id;
import static io.github.ghhdevteam.gaisoumod.mpl.GaisouMod.registry;

public class ItemGroups {

    public static CreativeTabBuilder EXAMPLE_ITEMS = CreativeTabBuilder.create(_id("example_items"))
            .setIcon(() -> ItemStackUtil.create(Items.EXAMPLE_ITEM.get()));

    public static void init() {
        registry.registerItemGroup(EXAMPLE_ITEMS);
    }
}
