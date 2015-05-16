package com.kinglem.matchgarden;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * Created by King Lem on 5/16/2015.
 */
@Mod(modid = MatchGarden.MODID, name = MatchGarden.MODNAME, version = MatchGarden.VERSION)
public class MatchGarden {
    public static final String MODID = "matchgarden";
    public static final String MODNAME = "Lem's Match Garden";
    public static final String VERSION = "0.0.1";

    @Instance(value = MatchGarden.MODID)
    public static MatchGarden instance;


    @EventHandler
    public void preInit(FMLInitializationEvent event){

    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void postInit(FMLInitializationEvent event){

    }
}
