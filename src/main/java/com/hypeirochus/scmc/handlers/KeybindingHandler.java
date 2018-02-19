package com.hypeirochus.scmc.handlers;

import org.lwjgl.input.Keyboard;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeybindingHandler {

	public static final String STARCRAFT_CATEGORY = "key.categories." + Starcraft.MOD_ID;

	public static KeyBinding toggleMarineVisor;

	public static void pre(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new KeyEventHandler());

		toggleMarineVisor = new KeyBinding("key.terran.marinevisor.toggle", Keyboard.KEY_V, STARCRAFT_CATEGORY);

		ClientRegistry.registerKeyBinding(toggleMarineVisor);
	}

	private static class KeyEventHandler {

		@SubscribeEvent
		public void onKeyInput(InputEvent.KeyInputEvent event) {
			if (KeybindingHandler.toggleMarineVisor.isPressed()) {
				// GuiRenderEventHandler.renderHelmetOverlay = !GuiRenderEventHandler.renderHelmetOverlay;
			}
		}
	}
}