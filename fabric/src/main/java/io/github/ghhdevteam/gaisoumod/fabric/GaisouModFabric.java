package io.github.ghhdevteam.gaisoumod.fabric;

import io.github.ghhdevteam.gaisoumod.fabric.pff.PffGaisouMod;
import io.github.ghhdevteam.gaisoumod.mpl.MPLGaisouMod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class GaisouModFabric implements ModInitializer {

    public static final String 最強論破文字 = "[外装MOD] おい、MCPitanLibかPffLoaderがないんだが、おいおいおい、あなんたはもうがいしか？？？";

    @Override
    public void onInitialize() {
        if (FabricLoader.getInstance().isModLoaded("mcpitanlib")) {
            new MPLGaisouMod();
            return;
        }

        if (FabricLoader.getInstance().isModLoaded("pffloader")) {
            PffGaisouMod.init();
            return;
        }

        System.out.println(最強論破文字);
    }
}