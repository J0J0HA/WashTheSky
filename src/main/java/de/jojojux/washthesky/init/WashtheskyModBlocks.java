
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.jojojux.washthesky.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import de.jojojux.washthesky.block.SVBCMTConverterBlock;
import de.jojojux.washthesky.block.CompostBlock;
import de.jojojux.washthesky.block.BlockRubbleBlock;
import de.jojojux.washthesky.WashtheskyMod;

public class WashtheskyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WashtheskyMod.MODID);
	public static final RegistryObject<Block> WASHING_MACHINE = REGISTRY.register("washing_machine", () -> new SVBCMTConverterBlock());
	public static final RegistryObject<Block> RUBBLE = REGISTRY.register("rubble", () -> new BlockRubbleBlock());
	public static final RegistryObject<Block> COMPOST = REGISTRY.register("compost", () -> new CompostBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SVBCMTConverterBlock.registerRenderLayer();
		}
	}
}
