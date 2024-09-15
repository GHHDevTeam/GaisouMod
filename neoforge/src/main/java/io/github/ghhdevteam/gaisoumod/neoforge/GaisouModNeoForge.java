package io.github.ghhdevteam.gaisoumod.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import io.github.ghhdevteam.gaisoumod.mpl.GaisouMod;

@Mod(GaisouMod.MOD_ID)
public class GaisouModNeoForge {
    public GaisouModNeoForge(ModContainer modContainer) {
        IEventBus bus = modContainer.getEventBus();

        new GaisouMod();
    }
}