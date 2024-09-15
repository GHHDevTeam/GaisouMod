package io.github.ghhdevteam.gaisoumod.fabric;

import io.github.ghhdevteam.gaisoumod.mpl.GaisouMod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class GaisouModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        if (FabricLoader.getInstance().isModLoaded("mcpitanlib")) {
            new GaisouMod();
        }



    }
}