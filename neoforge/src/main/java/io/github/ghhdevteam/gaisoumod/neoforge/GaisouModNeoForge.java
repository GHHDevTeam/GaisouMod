package io.github.ghhdevteam.gaisoumod.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import io.github.ghhdevteam.gaisoumod.mpl.MPLGaisouMod;

@Mod(MPLGaisouMod.もでぃど)
public class GaisouModNeoForge {
    public GaisouModNeoForge(ModContainer modContainer) {
        IEventBus bus = modContainer.getEventBus();

        new MPLGaisouMod();
    }
}