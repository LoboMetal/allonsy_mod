package com.allonsve.allonsymod.itens;

import com.allonsve.allonsymod.AllonsyMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {
    public CustomSword() {
        super(AllonsyMod.myToolMaterial);
        this.setRegistryName("my_sword");
        this.setUnlocalizedName("my_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
