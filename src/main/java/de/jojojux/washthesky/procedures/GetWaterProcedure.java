package de.jojojux.washthesky.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import java.util.Random;

import de.jojojux.washthesky.init.WashtheskyModItems;

public class GetWaterProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if ((ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(WashtheskyModItems.WOODEN_BUCKET_WATER.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(WashtheskyModItems.DIRT_CRUMBS.get());
				_setstack.setCount((int) Mth.nextDouble(new Random(), 1, 10));
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
