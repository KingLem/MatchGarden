package com.kinglem.matchgarden;

import com.kinglem.matchgarden.items.GardenItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Sapphire on 5/18/2015.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        GardenItems.createItems();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
