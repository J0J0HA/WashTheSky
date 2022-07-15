
package de.jojojux.washthesky.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import de.jojojux.washthesky.world.inventory.GUIConverterMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GUIConverterScreen extends AbstractContainerScreen<GUIConverterMenu> {
	private final static HashMap<String, Object> guistate = GUIConverterMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GUIConverterScreen(GUIConverterMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 186;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("washthesky:textures/washing_machine_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("washthesky:textures/arrows3.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + -1, 0, 0, 150, 100, 150, 100);

		RenderSystem.setShaderTexture(0, new ResourceLocation("washthesky:textures/screenshot_2021-12-20_011132.png"));
		this.blit(ms, this.leftPos + 5, this.topPos + 7, 0, 0, 21, 20, 21, 20);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Washing Machine", 50, 11, -12829636);
		this.font.draw(poseStack, "IN", 14, 20, -12829636);
		this.font.draw(poseStack, "OUT OUT", 137, 20, -12829636);
		this.font.draw(poseStack, "OUT", 138, 49, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
