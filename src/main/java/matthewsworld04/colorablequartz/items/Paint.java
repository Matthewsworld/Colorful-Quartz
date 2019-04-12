package matthewsworld04.colorablequartz.items;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class Paint extends ItemBase {

	public Paint(String name) {
		super(name);
		
		setNoRepair();
		setMaxDamage(63);
		setMaxStackSize(1);
	}
	
    @Override
    public boolean hasContainerItem(ItemStack itemStack)
    {
             return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
         // copy the item to make stuff do stuff
         ItemStack returnItem = new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage()+1);
  
         // check for enchantment because paint can certainly be enchanted
         if (itemStack.isItemEnchanted())
         {
              NBTTagCompound nbtcompound = itemStack.getTagCompound();
              returnItem.setTagCompound(nbtcompound);
         }        

         return returnItem;
    }
}