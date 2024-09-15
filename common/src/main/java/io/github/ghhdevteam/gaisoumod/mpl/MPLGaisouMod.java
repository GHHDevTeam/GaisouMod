package io.github.ghhdevteam.gaisoumod.mpl;

import io.github.ghhdevteam.gaisoumod.mpl.block.Blocks;
import io.github.ghhdevteam.gaisoumod.mpl.item.ItemGroups;
import io.github.ghhdevteam.gaisoumod.mpl.item.Items;
import net.pitan76.mcpitanlib.api.CommonModInitializer;
import net.pitan76.mcpitanlib.api.registry.v2.CompatRegistryV2;
import net.pitan76.mcpitanlib.api.util.CompatIdentifier;

public class MPLGaisouMod extends CommonModInitializer {
    public static final String MOD_ID = "gaisoumod";
    public static final String MOD_NAME = "外装MOD";

    public static MPLGaisouMod INSTANCE;
    public static CompatRegistryV2 registry;

    @Override
    public void init() {
        INSTANCE = this;
        registry = super.registry;

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
        return CompatIdentifier.of(MOD_ID, path);
    }

    @Override
    public String getId() {
        return MOD_ID;
    }

    @Override
    public String getName() {
        return MOD_NAME;
    }
}