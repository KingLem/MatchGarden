package com.kinglem.matchgarden.items;

import com.kinglem.matchgarden.MatchGarden;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Gigabyte on 5/18/2015.
 */
public final class GardenItems {

    public static Item woodSprite;

    public static void init() {
        woodSprite = new Item().setUnlocalizedName("wood_sprite").setCreativeTab(CreativeTabs.tabMaterials);
    }

    public static final void registerItems(){
        GameRegistry.registerItem(woodSprite, woodSprite.getUnlocalizedName());

    }
}
