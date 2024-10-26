package io.github.ghhdevteam.gaisoumod.mpl.block;

import net.minecraft.block.Block;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.block.CompatibleMaterial;
import net.pitan76.mcpitanlib.api.block.ExtendBlock;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static io.github.ghhdevteam.gaisoumod.mpl.MPLGaisouMod._id;
import static io.github.ghhdevteam.gaisoumod.mpl.MPLGaisouMod.mejaRegi;

public class Blocks {

    public static RegistryResult<Block> EXAMPLE_BLOCK;

    public static void init() {
        EXAMPLE_BLOCK = mejaRegi.registerBlock(_id("example_block"), () -> new ExtendBlock(CompatibleBlockSettings.of(CompatibleMaterial.STONE)));
    }
}
