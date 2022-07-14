
package de.jojojux.washthesky.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import de.jojojux.washthesky.init.WashtheskyModTabs;
import de.jojojux.washthesky.init.WashtheskyModItems;

public class WoodenBucketOfWaterItem extends Item {
	public WoodenBucketOfWaterItem() {
		super(new Item.Properties().tab(WashtheskyModTabs.TAB_WASHTHESKY).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(WashtheskyModItems.WOODEN_BUCKET.get());
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
