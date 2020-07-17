package io.github.scmcmod.client.gui;

import java.awt.Color;

import com.google.common.collect.ImmutableList;

import io.github.scmcmod.blocks.metablocks.BlockNeosteel.NeosteelMetalType;
import io.github.scmcmod.blocks.metablocks.BlockParisteel.ParisteelMetalType;
import io.github.scmcmod.client.gui.element.LarvaOption;
import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.handlers.ArmorHandler;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.handlers.ToolHandler;
import io.github.scmcmod.handlers.WeaponHandler;
import io.github.scmcmod.init.StarCraftBlocks;
import io.github.scmcmod.items.ItemMagazine;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GuiLists
{

	public static final ImmutableList<Product>[] TRADES;
	public static final ImmutableList<LarvaOption> LARVA_OPTIONS;

	public static final int HIGHLIGHT_COLOR = new Color(246, 255, 0, 60).getRGB();
	public static final int NO_FUNDS_COLOR = new Color(200, 50, 0, 60).getRGB();

	static
	{
		TRADES = new ImmutableList[6];

		ImmutableList.Builder<Product> tab0 = ImmutableList.builder();
		tab0.add(new Product(new ItemStack(ItemHandler.C14_GAUSS_RIFLE_PARTS, 1, 0), 11, 6));
		tab0.add(new Product(new ItemStack(ItemHandler.C14_GAUSS_RIFLE_PARTS, 1, 1), 11, 6));
		tab0.add(new Product(new ItemStack(ItemHandler.C14_GAUSS_RIFLE_PARTS, 1, 2), 11, 6));
		tab0.add(new Product(ItemMagazine.getDefaultStack(MetaHandler.BulletMagazineType.C14.getID()), 6, 0));
		tab0.add(new Product(ItemMagazine.getDefaultStack(MetaHandler.BulletMagazineType.FLAMETHROWER.getID()), 8, 0));
		tab0.add(new Product(new ItemStack(Items.GUNPOWDER, 1, 0), 3, 0));
		tab0.add(new Product(new ItemStack(ItemHandler.INGOT, 1, 0), 1, 0));
		tab0.add(new Product(new ItemStack(ItemHandler.INGOT, 1, 1), 2, 0));
		tab0.add(new Product(new ItemStack(ItemHandler.INGOT, 1, 2), 3, 1));
		tab0.add(new Product(new ItemStack(ItemHandler.INGOT, 1, 3), 5, 3));
		tab0.add(new Product(new ItemStack(ItemHandler.DUST, 1, MetaHandler.DustType.CARBON.getID()), 1, 0));
		tab0.add(new Product(new ItemStack(ItemHandler.DUST, 1, MetaHandler.DustType.IRON.getID()), 2, 0));
		tab0.add(new Product(new ItemStack(ItemHandler.DUST, 1, MetaHandler.DustType.STEEL.getID()), 2, 1));
		tab0.add(new Product(new ItemStack(ItemHandler.GAS_CONTAINER, 1, MetaHandler.ContainerType.TERRAN.getID()), 1, 0));
		TRADES[0] = tab0.build();

		ImmutableList.Builder<Product> tab1 = ImmutableList.builder();
		tab1.add(new Product(new ItemStack(StarCraftBlocks.GAS_COLLECTOR, 1, 1), 64, 16));
		TRADES[1] = tab1.build();

		ImmutableList.Builder<Product> tab2 = ImmutableList.builder();
		for (int i = 0; i < ParisteelMetalType.values().length; i++)
			tab2.add(new Product(new ItemStack(StarCraftBlocks.PARISTEEL_METAL, 16, i), 10, 0));
		for (int i = 0; i < NeosteelMetalType.values().length; i++)
			tab2.add(new Product(new ItemStack(StarCraftBlocks.NEOSTEEL_METAL, 16, i), 10, 0));
		tab2.add(new Product(new ItemStack(StarCraftBlocks.TERRAN_WARNING_TAPE, 16, 0), 10, 0));
		TRADES[2] = tab2.build();

		ImmutableList.Builder<Product> tab3 = ImmutableList.builder();
		tab3.add(new Product(new ItemStack(ItemHandler.C14_GAUSS_RIFLE, 1, 0), 30, 15));
		tab3.add(new Product(new ItemStack(ItemHandler.FLAMETHROWER, 1, 0), 30, 15));
		tab3.add(new Product(new ItemStack(WeaponHandler.BALISONG, 1, 0), 16, 0));
		tab3.add(new Product(new ItemStack(WeaponHandler.MILITARY_KNIFE, 1, 0), 10, 1));
		tab3.add(new Product(new ItemStack(WeaponHandler.MONOMOLECULAR_BLADE, 1, 0), 32, 8));
		tab3.add(new Product(new ItemStack(WeaponHandler.COPPER_SWORD, 1, 0), 2, 0));
		tab3.add(new Product(new ItemStack(WeaponHandler.TITANIUM_SWORD, 1, 0), 3, 0));
		tab3.add(new Product(new ItemStack(WeaponHandler.STEEL_SWORD, 1, 0), 4, 0));
		TRADES[3] = tab3.build();

		ImmutableList.Builder<Product> tab4 = ImmutableList.builder();
		tab4.add(new Product(new ItemStack(ArmorHandler.COPPER_HELMET, 1, 0), 7, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.COPPER_CHESTPLATE, 1, 0), 10, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.COPPER_LEGGINGS, 1, 0), 8, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.COPPER_BOOTS, 1, 0), 6, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.TITANIUM_HELMET, 1, 0), 10, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.TITANIUM_CHESTPLATE, 1, 0), 16, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.TITANIUM_LEGGINGS, 1, 0), 14, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.TITANIUM_BOOTS, 1, 0), 8, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.STEEL_HELMET, 1, 0), 5, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.STEEL_CHESTPLATE, 1, 0), 8, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.STEEL_LEGGINGS, 1, 0), 7, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.STEEL_BOOTS, 1, 0), 5, 0));

		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_HELMET, 1, 0), 8, 4));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_CHESTPLATE, 1, 0), 16, 8));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_LEGGINGS, 1, 0), 12, 6));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_BOOTS, 1, 0), 8, 4));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_HELMET, 1, 0), 12, 8));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_CHESTPLATE, 1, 0), 20, 12));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_LEGGINGS, 1, 0), 16, 10));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_BOOTS, 1, 0), 12, 8));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_HELMET, 1, 0), 16, 12));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_CHESTPLATE, 1, 0), 24, 16));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_LEGGINGS, 1, 0), 20, 14));
		tab4.add(new Product(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_BOOTS, 1, 0), 16, 12));
		TRADES[4] = tab4.build();

		ImmutableList.Builder<Product> tab5 = ImmutableList.builder();
		tab5.add(new Product(new ItemStack(ToolHandler.COPPER_PICKAXE, 1, 0), 4, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.COPPER_AXE, 1, 0), 4, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.COPPER_SHOVEL, 1, 0), 4, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.COPPER_HOE, 1, 0), 4, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.TITANIUM_PICKAXE, 1, 0), 8, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.TITANIUM_AXE, 1, 0), 8, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.TITANIUM_SHOVEL, 1, 0), 8, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.TITANIUM_HOE, 1, 0), 8, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.STEEL_PICKAXE, 1, 0), 12, 2));
		tab5.add(new Product(new ItemStack(ToolHandler.STEEL_AXE, 1, 0), 12, 2));
		tab5.add(new Product(new ItemStack(ToolHandler.STEEL_SHOVEL, 1, 0), 12, 2));
		tab5.add(new Product(new ItemStack(ToolHandler.STEEL_HOE, 1, 0), 12, 2));
		TRADES[5] = tab5.build();

		ImmutableList.Builder<LarvaOption> larvaOptions = ImmutableList.builder();
		larvaOptions.add(new LarvaOption(0, 50, 0).setTooltip(I18n.format("entity.starcraft.drone.name")));
		larvaOptions.add(new LarvaOption(1, 100, 0).setTooltip(I18n.format("entity.starcraft.overlord.name")));
		larvaOptions.add(new LarvaOption(new LarvaOption(2, 50, 0).setTooltip(I18n.format("entity.starcraft.zerglingSC2.name")), new LarvaOption(3, 50, 0).setTooltip(I18n.format("entity.starcraft.zerglingSwarmling.name")),
				new LarvaOption(4, 50, 0).setTooltip(I18n.format("entity.starcraft.zerglingRaptor.name"))));
		larvaOptions.add(new LarvaOption(5, 75, 25).setTooltip(I18n.format("entity.starcraft.roach.name")));
		larvaOptions.add(new LarvaOption(6, 100, 50).setTooltip(I18n.format("entity.starcraft.hydralisk.name")));
		larvaOptions.add(new LarvaOption(7, 100, 150).setTooltip(I18n.format("entity.starcraft.infestor.name")));
		larvaOptions.add(new LarvaOption(8, 100, 75).setTooltip(I18n.format("entity.starcraft.swarmHost.name")));
		larvaOptions.add(new LarvaOption(9, 100, 100).setTooltip(I18n.format("entity.starcraft.mutalisk.name")));
		LARVA_OPTIONS = larvaOptions.build();

		// LOGS = new ArrayList<List<String>>();
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.protoss1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.protoss2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.protoss3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.protoss4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.protoss5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.protoss6.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.zerg1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.zerg2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.zerg3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.zerg4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.zerg5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.egonstetmann.zerg6.txt")));
		//
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.acropolis.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.artofwar.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.backwoods.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.bengalaas.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.brokenmesa.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.charsurface.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.chausara.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.driftingplatforms.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.heimdalliv.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.polarisprime.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.scantid.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.shakurasterrain.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.uileliv.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.untamedwilds.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.weatherpatterns.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.wotanii.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.zenn.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.general.zephyrcove.txt")));
		//
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.legacy.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.alliance.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.warpgates.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.asari.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.overview.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.rassidan.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.tenarsis.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.eldritchspring.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.protossproverb.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.gardenofaiur.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.provinggrounds.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.summerstorms.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.templartraining.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.protoss.elderlands.txt")));
		//
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.aarenruth.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.alanjohnson.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.baziothurgood.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.bianari.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.biggame.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.bunkercommandii.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.confederatecorpad.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.corporalmaxredius.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.edmundduke.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.enigma.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.francismccauly.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.frontier.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.gemini.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.gpssurveyreport.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.korhalscorching.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.marine219xms87632.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.matthewmurdoch.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.mcalester.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.newgauntlet.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.newstation.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.nidhoggiii.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.normangoodfellow.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.norrisbailey.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.northvssouth.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.novasquad.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.rebellions.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.remotemining.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.richardwalker.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.rileybullhorn.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.robertolamas.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.spacestations.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.summeriastation.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.terranorigin.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.uedchar.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.uedcommandantlog.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.uednamingcommittee.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.urangolenko.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.terran.wildlifeservices.txt")));
		//
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.zerg.overview.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.zerg.eruption.txt")));
		//
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.aiur0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.braxis0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.char0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.kaldir0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.korhal0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.marsara0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.moria0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.newfolsom0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.phaeton0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.shiloh0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.tarsonis0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.umoja0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.planets.xt39323.txt")));
		//
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.archon0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.archon1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.archon2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.archon3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.adept0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.carrier0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.carrier1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.carrier2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.carrier3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.colossus0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.colossus1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.colossus2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.colossus3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.darktemplar0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.darktemplar1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.darktemplar2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.darktemplar3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.disruptor0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.hightemplar0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.hightemplar1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.hightemplar2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.hightemplar3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.immortal0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.immortal1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.immortal2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.immortal3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.mothership0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.mothership1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.mothership2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.mothership3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.mothershipcore0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.mothershipcore1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.mothershipcore2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.mothershipcore3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.mothershipcore4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.observer0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.observer1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.observer2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.observer3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.oracle0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.oracle1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.oracle2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.oracle3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.oracle4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.phoenix0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.phoenix1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.phoenix2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.phoenix3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.phoenix4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.probe0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.probe1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.probe2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.probe3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.sentry0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.sentry1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.sentry2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.sentry3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.sentry4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.stalker0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.stalker1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.stalker2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.stalker3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.tempest0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.tempest1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.tempest2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.tempest3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.voidray0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.voidray1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.voidray2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.voidray3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.voidray4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.warpprism0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.warpprism1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.warpprism2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.warpprism3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.zealot0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.zealot1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.zealot2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.zealot3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.zealot4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.protoss.zealot5.txt")));
		//
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.banshee0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.banshee1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.banshee2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.banshee3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.banshee4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.battlecruiser0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.battlecruiser1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.battlecruiser2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.battlecruiser3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.battlecruiser4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.battlecruiser5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.cyclone0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.ghost0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.ghost1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.ghost2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.ghost3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.ghost4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellbat0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellbat1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellbat2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellbat3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellbat4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellbat5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellion0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellion1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellion2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellion3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellion4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.hellion5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.liberator0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.marauder0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.marauder1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.marauder2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.marauder3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.marauder4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.marine0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.marine1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.marine2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.marine3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.marine4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.medivac0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.medivac1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.medivac2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.medivac3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.medivac4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.raven0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.raven1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.raven2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.raven3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.raven4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.reaper0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.reaper1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.reaper2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.reaper3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.reaper4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.reaper5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.scv0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.scv1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.scv2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.scv3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.scv4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.scv5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.siegetank0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.siegetank1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.siegetank2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.siegetank3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.siegetank4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.thor0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.thor1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.thor2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.thor3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.thor4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.viking0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.viking1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.viking2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.viking3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.viking4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.viking5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.widowmine0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.widowmine1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.widowmine2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.widowmine3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.terran.widowmine4.txt")));
		//
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.baneling0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.baneling1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.baneling2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.baneling3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.baneling4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.broodlord0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.broodlord1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.broodlord2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.broodlord3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.broodlord4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.corruptor0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.corruptor1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.corruptor2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.corruptor3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.corruptor4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.drone0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.drone1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.drone2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.drone3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.drone4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.hydralisk0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.hydralisk1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.hydralisk2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.hydralisk3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.hydralisk4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.infestor0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.infestor1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.infestor2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.infestor3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.infestor4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.infestor5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.larva0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.larva1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.larva2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.larva3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.larva4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.lurker0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.mutalisk0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.mutalisk1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.mutalisk2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.mutalisk3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.mutalisk4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.mutalisk5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.nydusworm0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.nydusworm1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.nydusworm2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.nydusworm3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.nydusworm4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.nydusworm5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overlord0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overlord1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overlord2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overlord3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overlord4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overlord5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overseer0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overseer1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overseer2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overseer3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.overseer4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.queen0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.queen1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.queen2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.queen3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.queen4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.ravager0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.roach0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.roach1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.roach2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.roach3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.roach4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.roach5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.swarmhost0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.swarmhost1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.swarmhost2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.swarmhost3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.swarmhost4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.ultralisk0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.ultralisk1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.ultralisk2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.ultralisk3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.ultralisk4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.ultralisk5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.viper0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.viper1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.viper2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.viper3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.viper4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.viper5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.zergling0.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.zergling1.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.zergling2.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.zergling3.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.zergling4.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.zergling5.txt")));
		// LOGS.add(Utils.loadTextFromFile(new ResourceLocation(SCConstants.MODID +
		// "texts/logs/log.science.zerg.zergling6.txt")));

	}

	public static class Product
	{

		private ItemStack stack;
		private int mineralCost;
		private int vespeneCost;

		public Product(ItemStack stack, int mineralCost, int vespeneCost)
		{
			this.stack = stack;
			this.mineralCost = mineralCost;
			this.vespeneCost = vespeneCost;
		}

		public ItemStack getStack()
		{
			return stack;
		}

		public int getMineralCost()
		{
			return mineralCost;
		}

		public int getVespeneCost()
		{
			return vespeneCost;
		}
	}
}
