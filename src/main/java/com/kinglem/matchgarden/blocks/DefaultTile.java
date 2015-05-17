package com.kinglem.matchgarden.blocks;

/**
 * Created by Gigabyte on 5/16/2015.
 */
public class DefaultTile implements Behavior{

    private static DefaultTile instance = null;
    private String texture = "defaultTexture";

    protected DefaultTile(){

    }

    public static DefaultTile getInstance(){
        if(instance == null){
            instance = new DefaultTile();
        }

        return instance;
    }

    public void update(){

    }
}
