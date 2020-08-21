package com.allonsve.allonsymod;

import com.allonsve.allonsymod.itens.CustomSword;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = AllonsyMod.MODID, name = AllonsyMod.NAME, version = AllonsyMod.VERSION)
public class AllonsyMod {
    public static final String MODID = "allonsymod";
    public static final String NAME = "Allons-y Mod";
    public static final String VERSION = "1.12.2-1.0.0-SNAPSHOT";

    private static Logger logger;

    public static Item.ToolMaterial myToolMaterial;
    public static Item mySword;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        myToolMaterial = EnumHelper.addToolMaterial("MATERIAL NAME", 4, 10000, 20.0F, 100.0F, 30);

        mySword = new CustomSword();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
