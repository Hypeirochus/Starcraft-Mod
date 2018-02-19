package com.hypeirochus.scmc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hypeirochus.scmc.capabilities.CapabilityHandler;
import com.hypeirochus.scmc.capabilities.Color;
import com.hypeirochus.scmc.capabilities.ColorStorage;
import com.hypeirochus.scmc.capabilities.IColor;
import com.hypeirochus.scmc.capabilities.IShield;
import com.hypeirochus.scmc.capabilities.Shield;
import com.hypeirochus.scmc.capabilities.ShieldStorage;
import com.hypeirochus.scmc.command.CommandDimension;
import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.events.GuiRenderEventHandler;
import com.hypeirochus.scmc.events.StarcraftEventHandler;
import com.hypeirochus.scmc.handlers.EntityHandler;
import com.hypeirochus.scmc.handlers.GuiHandler;
import com.hypeirochus.scmc.handlers.KeybindingHandler;
import com.hypeirochus.scmc.handlers.RenderHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.handlers.WavefrontModelHandler;
import com.hypeirochus.scmc.log.LogRegistry;
import com.hypeirochus.scmc.network.NetworkHandler;
import com.hypeirochus.scmc.proxy.CommonProxy;
import com.hypeirochus.scmc.recipes.OreDictionaryHandler;
import com.hypeirochus.scmc.recipes.SmeltingRecipes;
import com.hypeirochus.scmc.registry.Registry;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * The main Starcraft Mod class. Registers and sets everything into motion when the game starts up.
 * 
 * @author Hypeirochus
 * @author Ocelot
 */
@Mod(modid = Starcraft.MOD_ID, acceptedMinecraftVersions = "[1.12][1.12.2]", useMetadata = true, guiFactory = "com.hypeirochus.scmc.config.StarcraftConfigGuiFactory")
public class Starcraft {

	public static final String MOD_ID = "starcraft";
	public static final String RL_BASE = MOD_ID + ":";
	public static final String UN_BASE = MOD_ID + "_";

	/** The mod's instance. Used for GUI stuff. */
	@Instance(MOD_ID)
	public static Starcraft instance;

	/** The common proxy instance */
	@SidedProxy(clientSide = "com.hypeirochus.scmc.proxy.ClientProxy", serverSide = "com.hypeirochus.scmc.proxy.ServerProxy")
	public static CommonProxy proxy;

	private static Logger logger;
	private static LogRegistry logRegistry = new LogRegistry();

	static {
		FluidRegistry.enableUniversalBucket();
	}

	/** Pre Initialization **/
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();

		MinecraftForge.EVENT_BUS.register(new Registry());

		StarcraftConfig.pre(event);
		NetworkHandler.pre(event);
		// FluidHandler.pre(event);
		SoundHandler.pre(event);
		// WorldGenerationHandler.pre(event);
		// EntityHandler.pre(event);

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			StarcraftConfig.clientPre(event);
			WavefrontModelHandler.pre(event);
			RenderHandler.pre(event);
			KeybindingHandler.pre(event);
		}
	}

	/** Initialization **/
	@EventHandler
	public void init(FMLInitializationEvent event) {
		EntityHandler.init(event);
		OreDictionaryHandler.init(event);
		SmeltingRecipes.init(event);
		GuiHandler.init(event);

		CapabilityManager.INSTANCE.register(IColor.class, new ColorStorage(), Color::new);
		CapabilityManager.INSTANCE.register(IShield.class, new ShieldStorage(), Shield::new);

		MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
		MinecraftForge.EVENT_BUS.register(new StarcraftEventHandler());

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			MinecraftForge.EVENT_BUS.register(new GuiRenderEventHandler());
			getLogRegistry().init(event);
		}
	}

	/** Post Initialization **/
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
		}
	}

	@EventHandler
	public static void onServerStartingEvent(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandDimension());
	}

	public static Logger logger() {
		if (logger == null)
			logger = LogManager.getLogger(MOD_ID);
		return logger;
	}

	public static LogRegistry getLogRegistry() {
		if (logRegistry == null)
			logRegistry = new LogRegistry();
		return logRegistry;
	}
}