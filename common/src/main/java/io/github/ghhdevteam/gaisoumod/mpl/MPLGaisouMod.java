package io.github.ghhdevteam.gaisoumod.mpl;

import io.github.ghhdevteam.gaisoumod.mpl.block.Blocks;
import io.github.ghhdevteam.gaisoumod.mpl.item.ItemGroups;
import io.github.ghhdevteam.gaisoumod.mpl.item.Items;
import net.pitan76.mcpitanlib.api.CommonModInitializer;
import net.pitan76.mcpitanlib.api.registry.v2.CompatRegistryV2;
import net.pitan76.mcpitanlib.api.util.CompatIdentifier;

public class MPLGaisouMod extends CommonModInitializer {
    public static final String もでぃど = "gaisoumod";
    public static final String おなまえ = "外装MOD";

    public static MPLGaisouMod INSTA;
    public static CompatRegistryV2 mejaRegi;

    @Override
    public void init() {
        // かかうじゃ
        INSTA = this;
        mejaRegi = super.registry;

        ItemGroups.init();
        Blocks.init();
        Items.init();
    }

    // ----
    /**
     * @param path The path of the id
     * @return The id
     */
    public static CompatIdentifier _id(String path) {
        return CompatIdentifier.of(もでぃど, path);
    }

    @Override
    public String getId() {
        return もでぃど;
    }

    @Override
    public String getName() {
        return おなまえ;
    }
}