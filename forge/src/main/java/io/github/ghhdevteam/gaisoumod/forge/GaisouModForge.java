package io.github.ghhdevteam.gaisoumod.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import io.github.ghhdevteam.gaisoumod.mpl.GaisouMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GaisouMod.MOD_ID)
public class GaisouModForge {
    public GaisouModForge() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        EventBuses.registerModEventBus(GaisouMod.MOD_ID, bus);
        new GaisouMod();
    }
}