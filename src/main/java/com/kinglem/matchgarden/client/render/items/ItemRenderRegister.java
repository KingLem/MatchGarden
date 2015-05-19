package com.kinglem.matchgarden.client.render.items;

import com.kinglem.matchgarden.items.GardenItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Gigabyte on 5/18/2015.
 */
public final class ItemRenderRegister {

    public static void registerItemRenderer() {
        reg(GardenItems.woodSprite);
    }

    public static void reg(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(GardenItems.woodSprite, 0, new ModelResourceLocation("matchgarden:wood_sprite", "inventory"));

    }
}
