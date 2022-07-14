
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.jojojux.washthesky.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class WashtheskyModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == WashtheskyModItems.WOODEN_BUCKET.get())
			event.setBurnTime(1600);
	}
}
