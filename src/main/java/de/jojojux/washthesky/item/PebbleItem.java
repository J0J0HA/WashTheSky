
package de.jojojux.washthesky.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import de.jojojux.washthesky.init.WashtheskyModTabs;

public class PebbleItem extends Item {
	public PebbleItem() {
		super(new Item.Properties().tab(WashtheskyModTabs.TAB_WASHTHESKY).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
