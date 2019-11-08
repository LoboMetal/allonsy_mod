package tk.lobometalurgico.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.lobometalurgico.AllonsyMod;
import tk.lobometalurgico.init.ModItems;
import tk.lobometalurgico.util.IHasModel;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        AllonsyMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
