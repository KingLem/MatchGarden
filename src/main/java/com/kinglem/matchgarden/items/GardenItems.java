package com.kinglem.matchgarden.items;

import com.kinglem.matchgarden.MatchGarden;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Gigabyte on 5/18/2015.
 */
public final class GardenItems {

    public static Item gardenItem;

    public static final void createItems(){
        GameRegistry.registerItem(gardenItem = new WoodSprite("wood_sprite"), "wood_sprite");

    }
}
