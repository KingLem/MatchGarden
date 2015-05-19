package com.kinglem.matchgarden.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Gigabyte on 5/18/2015.
 */
public class WoodSprite extends Item {

    public WoodSprite(String unlocalizedName){
        super();

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}