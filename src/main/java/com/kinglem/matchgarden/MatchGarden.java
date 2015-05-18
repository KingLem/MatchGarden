package com.kinglem.matchgarden;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by King Lem on 5/16/2015.
 */
@Mod(modid = MatchGarden.MODID, name = MatchGarden.MODNAME, version = MatchGarden.VERSION)
public class MatchGarden {
    public static final String MODID = "matchgarden";
    public static final String MODNAME = "Lem's Match Garden";
    public static final String VERSION = "0.0.1";

    public static com.kinglem.matchgarden.TileBlock block;

    @Instance(value = MatchGarden.MODID)
    public static MatchGarden INSTANCE;

    @SidedProxy(clientSide="com.kinglem.matchgarden.ClientProxy", serverSide="com.kinglem.matchgarden.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        this.proxy.preInit(event);
        //event handler registry
        FMLCommonHandler.instance().bus().register(INSTANCE);
        MinecraftForge.EVENT_BUS.register(INSTANCE);

        //Register the TileBlock
        block = new com.kinglem.matchgarden.TileBlock();

        GameRegistry.registerBlock(block, "Garden Tile");

        //Register items

        //@TODO: Sprites
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        this.proxy.init(event);
        //Register recipes

        //@TODO: TileBlock recipe
        //@TODO: Statue catalyst
        //@TODO: Defensive item catalyst
        //@TODO: Reservoir catalyst
        //@TODO: Advanced tree catalyst
        //@TODO: Relay catalyst
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        this.proxy.postInit(event);

    }
}
