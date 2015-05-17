package com.kinglem.matchgarden;

import com.kinglem.matchgarden.blocks.Behavior;
import com.kinglem.matchgarden.blocks.DefaultTile;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.ref.Reference;

/**
 * Created by Gigabyte on 5/16/2015.
 */
public class TileBlock extends Block{
    private final String NAME = "tileBlock";

    private Behavior behavior;

    public TileBlock(){
        super(Material.wood);
        GameRegistry.registerBlock(this, NAME);
        setUnlocalizedName(MatchGarden.MODID + "_" + NAME);
        setCreativeTab(CreativeTabs.tabBlock);

        setBehavior(DefaultTile.getInstance());
    }

    public String getName(){
        return NAME;
    }

    public void setBehavior(Behavior behavior){
        this.behavior = behavior;

    }
}
