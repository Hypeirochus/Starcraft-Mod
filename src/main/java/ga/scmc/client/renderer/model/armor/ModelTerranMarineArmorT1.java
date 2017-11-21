package ga.scmc.client.renderer.model.armor;

import ga.scmc.client.renderer.model.IArmorItem;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHandSide;
import ocelot.api.utils.ModelUtils;

/**
 * sc2Marine - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelTerranMarineArmorT1 extends ModelArmorBase implements IArmorItem {

	public ModelRenderer lInsignia;
	public ModelRenderer rInsignia;
	public ModelRenderer lInsignia2;
	public ModelRenderer rInsignia2;
	public ModelRenderer lHandGuard;
	public ModelRenderer rHandGuard;
	public ModelRenderer chestplate_rShoulderPad;
	public ModelRenderer chestplate_rArmGuard01;
	public ModelRenderer chestplate_rGloves01;
	public ModelRenderer chestplate_rGloves02;
	public ModelRenderer chestplate_rShoulderFlange;
	public ModelRenderer chestplate_rArmGuard02;
	public ModelRenderer chestplate_rArmGuard03;
	public ModelRenderer chestplate_rArmGuard04;
	public ModelRenderer boots_rBoot01;
	public ModelRenderer leggings_rLegGuard01;
	public ModelRenderer leggings_rThighGuard;
	public ModelRenderer boots_rBoot02;
	public ModelRenderer boots_rBoot03;
	public ModelRenderer boots_rBoot04;
	public ModelRenderer boots_rBoot05;
	public ModelRenderer boots_rBoot06;
	public ModelRenderer leggings_rLegGuard02;
	public ModelRenderer leggings_rLegGuard03;
	public ModelRenderer helmet_casing;
	public ModelRenderer helmet_visor01;
	public ModelRenderer helmet_visor02;
	public ModelRenderer leggings_codpiece;
	public ModelRenderer chestplate_chest01;
	public ModelRenderer chestplate_chest02;
	public ModelRenderer leggings_buttGuard;
	public ModelRenderer chestplate_chest03;
	public ModelRenderer chestplate_chest04;
	public ModelRenderer chestplate_neckGuard;
	public ModelRenderer chestplate_lVent02;
	public ModelRenderer chestplate_rVent02;
	public ModelRenderer chestplate_headGuard;
	public ModelRenderer chestplate_lShoulderPad;
	public ModelRenderer chestplate_lArmGuard01;
	public ModelRenderer chestplate_lGloves01;
	public ModelRenderer chestplate_lGloves02;
	public ModelRenderer chestplate_lShoulderFlange;
	public ModelRenderer chestplate_lArmGuard02;
	public ModelRenderer chestplate_lArmGuard03;
	public ModelRenderer chestplate_lArmGuard04;
	public ModelRenderer boots_lBoot01;
	public ModelRenderer leggings_lLegGuard01;
	public ModelRenderer leggings_lThighGuard;
	public ModelRenderer boots_lBoot02;
	public ModelRenderer boots_lBoot03;
	public ModelRenderer boots_lBoot04;
	public ModelRenderer boots_lBoot05;
	public ModelRenderer boots_lBoot06;
	public ModelRenderer leggings_lLegGuard02;
	public ModelRenderer leggings_lLegGuard03;

	public ModelTerranMarineArmorT1(float modelSize) {
		super(modelSize, 128, 128);
		this.chestplate_rArmGuard03 = new ModelRenderer(this, 116, 8);
		this.chestplate_rArmGuard03.mirror = true;
		this.chestplate_rArmGuard03.setRotationPoint(-0.4F, 1.7F, 0.5F);
		this.chestplate_rArmGuard03.addBox(-2.0F, 0.0F, -0.35F, 4, 3, 2, 0.0F);
		this.boots_rBoot01 = new ModelRenderer(this, 0, 36);
		this.boots_rBoot01.mirror = true;
		this.boots_rBoot01.setRotationPoint(0.0F, 11.5F, 0.0F);
		this.boots_rBoot01.addBox(-2.5F, -0.9F, -4.7F, 5, 1, 5, 0.0F);
		this.chestplate_headGuard = new ModelRenderer(this, 90, 101);
		this.chestplate_headGuard.setRotationPoint(0.0F, -6.6F, 2.0F);
		this.chestplate_headGuard.addBox(-5.0F, -4.0F, -3.0F, 10, 5, 6, 0.0F);
		this.setRotateAngle(chestplate_headGuard, 0.136659280431156F, 0.0F, 0.0F);
		this.chestplate_rArmGuard04 = new ModelRenderer(this, 89, 8);
		this.chestplate_rArmGuard04.mirror = true;
		this.chestplate_rArmGuard04.setRotationPoint(-0.7F, 1.7F, 0.0F);
		this.chestplate_rArmGuard04.addBox(2.0F, 0.0F, -2.01F, 1, 3, 4, 0.0F);
		this.leggings_rLegGuard03 = new ModelRenderer(this, 56, 44);
		this.leggings_rLegGuard03.mirror = true;
		this.leggings_rLegGuard03.setRotationPoint(0.0F, 1.0F, -1.9F);
		this.leggings_rLegGuard03.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 1, 0.0F);
		this.setRotateAngle(leggings_rLegGuard03, 0.136659280431156F, -0.136659280431156F, 0.7853981633974483F);
		this.chestplate_rGloves01 = new ModelRenderer(this, 64, 12);
		this.chestplate_rGloves01.mirror = true;
		this.chestplate_rGloves01.setRotationPoint(-2.9F, 8.1F, -0.1F);
		this.chestplate_rGloves01.addBox(-1.0F, 0.0F, -2.0F, 1, 3, 4, 0.0F);
		this.setRotateAngle(chestplate_rGloves01, 0.0F, 0.0F, -0.5009094953223726F);
		this.lInsignia2 = new ModelRenderer(this, 0, 99);
		this.lInsignia2.setRotationPoint(8.51F, -0.3F, 0.0F);
		this.lInsignia2.addBox(0.0F, -7.0F, -7.0F, 1, 14, 14, 0.0F);
		this.setRotateAngle(lInsignia2, 0.0F, 0.0F, -0.40980330836826856F);
		this.chestplate_chest03 = new ModelRenderer(this, 91, 19);
		this.chestplate_chest03.setRotationPoint(0.0F, -0.5F, -2.75F);
		this.chestplate_chest03.addBox(-1.5F, -0.3F, -2.0F, 3, 2, 1, 0.0F);
		this.setRotateAngle(chestplate_chest03, -0.18203784098300857F, 0.0F, 0.0F);
		this.helmet_visor01 = new ModelRenderer(this, 60, 75);
		this.helmet_visor01.setRotationPoint(0.0F, -7.7F, -1.6F);
		this.helmet_visor01.addBox(-3.5F, 0.0F, -3.0F, 7, 4, 3, 0.0F);
		this.setRotateAngle(helmet_visor01, -0.18203784098300857F, 0.0F, 0.0F);
		this.chestplate_lShoulderFlange = new ModelRenderer(this, 87, 0);
		this.chestplate_lShoulderFlange.setRotationPoint(4.4F, 1.8F, 0.0F);
		this.chestplate_lShoulderFlange.addBox(-0.5F, -0.1F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(chestplate_lShoulderFlange, 0.0F, 0.0F, 0.36425021489121656F);
		this.chestplate_lArmGuard01 = new ModelRenderer(this, 102, 0);
		this.chestplate_lArmGuard01.setRotationPoint(1.0F, 3.6F, 0.0F);
		this.chestplate_lArmGuard01.addBox(-2.5F, -0.3F, -2.5F, 5, 2, 5, 0.0F);
		this.boots_lBoot05 = new ModelRenderer(this, 0, 54);
		this.boots_lBoot05.setRotationPoint(0.0F, 1.1F, 3.6F);
		this.boots_lBoot05.addBox(-2.49F, -1.4F, -2.7F, 5, 1, 3, 0.0F);
		this.boots_rBoot03 = new ModelRenderer(this, 22, 36);
		this.boots_rBoot03.setRotationPoint(0.0F, 0.0F, -3.8F);
		this.boots_rBoot03.addBox(-2.1F, -1.0F, 0.0F, 4, 1, 3, 0.0F);
		this.setRotateAngle(boots_rBoot03, 0.4553564018453205F, 0.0F, 0.0F);
		this.helmet_visor02 = new ModelRenderer(this, 60, 84);
		this.helmet_visor02.setRotationPoint(0.0F, 3.0F, -0.16F);
		this.helmet_visor02.addBox(-3.5F, 0.04F, -3.01F, 7, 4, 3, 0.0F);
		this.setRotateAngle(helmet_visor02, 0.31869712141416456F, 0.0F, 0.0F);
		this.boots_lBoot03 = new ModelRenderer(this, 22, 36);
		this.boots_lBoot03.setRotationPoint(0.0F, 0.0F, -3.8F);
		this.boots_lBoot03.addBox(-1.9F, -1.0F, 0.0F, 4, 1, 3, 0.0F);
		this.setRotateAngle(boots_lBoot03, 0.4553564018453205F, 0.0F, 0.0F);
		this.chestplate_chest04 = new ModelRenderer(this, 91, 24);
		this.chestplate_chest04.setRotationPoint(0.0F, 0.9F, -3.0F);
		this.chestplate_chest04.addBox(-1.5F, -0.3F, -2.0F, 3, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_chest04, 0.091106186954104F, 0.0F, 0.0F);
		this.chestplate_lGloves01 = new ModelRenderer(this, 64, 12);
		this.chestplate_lGloves01.setRotationPoint(2.9F, 8.1F, -0.1F);
		this.chestplate_lGloves01.addBox(0.0F, 0.0F, -2.0F, 1, 3, 4, 0.0F);
		this.setRotateAngle(chestplate_lGloves01, 0.0F, 0.0F, 0.5009094953223726F);
		this.chestplate_rArmGuard02 = new ModelRenderer(this, 101, 8);
		this.chestplate_rArmGuard02.mirror = true;
		this.chestplate_rArmGuard02.setRotationPoint(-0.4F, 1.7F, 0.3F);
		this.chestplate_rArmGuard02.addBox(-2.0F, 0.0F, -2.45F, 4, 3, 3, 0.0F);
		this.rInsignia2 = new ModelRenderer(this, 31, 99);
		this.rInsignia2.setRotationPoint(-8.51F, -0.3F, 0.0F);
		this.rInsignia2.addBox(-1.0F, -7.0F, -7.0F, 1, 14, 14, 0.0F);
		this.setRotateAngle(rInsignia2, 0.0F, 0.0F, 0.40980330836826856F);
		this.leggings_lThighGuard = new ModelRenderer(this, 42, 53);
		this.leggings_lThighGuard.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_lThighGuard.addBox(-2.5F, -1.0F, -2.5F, 5, 5, 5, 0.0F);
		this.boots_rBoot02 = new ModelRenderer(this, 0, 45);
		this.boots_rBoot02.mirror = true;
		this.boots_rBoot02.setRotationPoint(0.0F, 0.6F, -0.3F);
		this.boots_rBoot02.addBox(-2.49F, -1.0F, -4.6F, 5, 1, 5, 0.0F);
		this.chestplate_lGloves02 = new ModelRenderer(this, 77, 12);
		this.chestplate_lGloves02.setRotationPoint(-0.8F, 8.9F, -1.1F);
		this.chestplate_lGloves02.addBox(-0.5F, -0.8F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(chestplate_lGloves02, 0.0F, 0.0F, -0.5009094953223726F);
		this.chestplate_rShoulderPad = new ModelRenderer(this, 63, 0);
		this.chestplate_rShoulderPad.mirror = true;
		this.chestplate_rShoulderPad.setRotationPoint(0.6F, 0.0F, 0.0F);
		this.chestplate_rShoulderPad.addBox(-5.0F, -3.0F, -3.0F, 5, 5, 6, 0.0F);
		this.setRotateAngle(chestplate_rShoulderPad, 0.0F, 0.0F, 0.31869712141416456F);
		this.leggings_rLegGuard02 = new ModelRenderer(this, 44, 44);
		this.leggings_rLegGuard02.mirror = true;
		this.leggings_rLegGuard02.setRotationPoint(-1.9F, 2.0F, 0.0F);
		this.leggings_rLegGuard02.addBox(-1.0F, -2.5F, -2.0F, 1, 4, 4, 0.0F);
		this.chestplate_neckGuard = new ModelRenderer(this, 90, 39);
		this.chestplate_neckGuard.setRotationPoint(0.0F, -0.5F, -0.7F);
		this.chestplate_neckGuard.addBox(-5.5F, -6.0F, -3.0F, 11, 7, 8, 0.0F);
		this.setRotateAngle(chestplate_neckGuard, -0.136659280431156F, 0.0F, 0.0F);
		this.leggings_codpiece = new ModelRenderer(this, 63, 58);
		this.leggings_codpiece.setRotationPoint(0.0F, 11.7F, -0.5F);
		this.leggings_codpiece.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
		this.setRotateAngle(leggings_codpiece, 0.22759093446006054F, 0.0F, 0.0F);
		this.leggings_buttGuard = new ModelRenderer(this, 66, 36);
		this.leggings_buttGuard.setRotationPoint(0.0F, 10.2F, -0.1F);
		this.leggings_buttGuard.addBox(-4.5F, 0.0F, -2.0F, 9, 2, 5, 0.0F);
		this.leggings_lLegGuard01 = new ModelRenderer(this, 44, 34);
		this.leggings_lLegGuard01.setRotationPoint(0.0F, 4.7F, 0.0F);
		this.leggings_lLegGuard01.addBox(-2.5F, 0.0F, -2.5F, 5, 4, 5, 0.0F);
		this.leggings_lLegGuard03 = new ModelRenderer(this, 56, 44);
		this.leggings_lLegGuard03.mirror = true;
		this.leggings_lLegGuard03.setRotationPoint(0.0F, 1.0F, -1.9F);
		this.leggings_lLegGuard03.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 1, 0.0F);
		this.setRotateAngle(leggings_lLegGuard03, 0.136659280431156F, -0.136659280431156F, 0.7853981633974483F);
		this.chestplate_lArmGuard03 = new ModelRenderer(this, 116, 8);
		this.chestplate_lArmGuard03.setRotationPoint(0.4F, 1.7F, 0.5F);
		this.chestplate_lArmGuard03.addBox(-2.0F, 0.0F, -0.35F, 4, 3, 2, 0.0F);
		this.boots_lBoot02 = new ModelRenderer(this, 0, 45);
		this.boots_lBoot02.setRotationPoint(0.0F, 0.6F, -0.3F);
		this.boots_lBoot02.addBox(-2.49F, -1.0F, -4.6F, 5, 1, 5, 0.0F);
		this.leggings_rThighGuard = new ModelRenderer(this, 42, 53);
		this.leggings_rThighGuard.mirror = true;
		this.leggings_rThighGuard.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_rThighGuard.addBox(-2.5F, -1.0F, -2.5F, 5, 5, 5, 0.0F);
		this.boots_rBoot06 = new ModelRenderer(this, 17, 51);
		this.boots_rBoot06.mirror = true;
		this.boots_rBoot06.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.boots_rBoot06.addBox(-2.52F, 0.8F, -2.5F, 5, 2, 5, 0.0F);
		this.chestplate_lArmGuard02 = new ModelRenderer(this, 101, 8);
		this.chestplate_lArmGuard02.setRotationPoint(0.4F, 1.7F, 0.3F);
		this.chestplate_lArmGuard02.addBox(-2.0F, 0.0F, -2.45F, 4, 3, 3, 0.0F);
		this.rHandGuard = new ModelRenderer(this, 100, 115);
		this.rHandGuard.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.rHandGuard.addBox(-2.9F, 8.2F, -1.99F, 4, 2, 4, 0.0F);
		this.setRotateAngle(rHandGuard, 0.0F, 0.0F, 0.10000736613927509F);
		this.chestplate_rShoulderFlange = new ModelRenderer(this, 87, 0);
		this.chestplate_rShoulderFlange.mirror = true;
		this.chestplate_rShoulderFlange.setRotationPoint(-4.4F, 1.8F, 0.0F);
		this.chestplate_rShoulderFlange.addBox(-0.5F, -0.1F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(chestplate_rShoulderFlange, 0.0F, 0.0F, -0.36425021489121656F);
		this.boots_rBoot04 = new ModelRenderer(this, 22, 43);
		this.boots_rBoot04.mirror = true;
		this.boots_rBoot04.setRotationPoint(0.0F, -1.3F, 0.8F);
		this.boots_rBoot04.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 3, 0.0F);
		this.setRotateAngle(boots_rBoot04, -0.7740535232594852F, 0.0F, 0.0F);
		this.chestplate_chest01 = new ModelRenderer(this, 59, 21);
		this.chestplate_chest01.setRotationPoint(0.0F, 1.7F, 0.5F);
		this.chestplate_chest01.addBox(-5.0F, -0.9F, -4.5F, 10, 5, 8, 0.0F);
		this.rInsignia = new ModelRenderer(this, 0, 83);
		this.rInsignia.setRotationPoint(-6.5F, 0.6F, -2.81F);
		this.rInsignia.addBox(-7.5F, -7.0F, -1.0F, 14, 14, 1, 0.0F);
		this.setRotateAngle(rInsignia, 0.0F, 0.0F, 0.40980330836826856F);
		this.helmet_casing = new ModelRenderer(this, 83, 70);
		this.helmet_casing.setRotationPoint(0.0F, 0.1F, 0.1F);
		this.helmet_casing.addBox(-4.5F, -9.0F, -4.6F, 9, 9, 9, 0.0F);
		this.lInsignia = new ModelRenderer(this, 0, 65);
		this.lInsignia.setRotationPoint(6.8F, 0.5F, -2.81F);
		this.lInsignia.addBox(-7.5F, -7.0F, -1.0F, 14, 14, 1, 0.0F);
		this.setRotateAngle(lInsignia, 0.0F, 0.0F, -0.40980330836826856F);
		this.chestplate_lVent02 = new ModelRenderer(this, 85, 91);
		this.chestplate_lVent02.setRotationPoint(3.3F, -8.8F, 3.0F);
		this.chestplate_lVent02.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(chestplate_lVent02, -0.8196066167365371F, 0.4553564018453205F, 0.27314402793711257F);
		this.boots_lBoot04 = new ModelRenderer(this, 22, 43);
		this.boots_lBoot04.setRotationPoint(0.0F, -1.3F, 0.8F);
		this.boots_lBoot04.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 3, 0.0F);
		this.setRotateAngle(boots_lBoot04, -0.7740535232594852F, 0.0F, 0.0F);
		this.chestplate_rVent02 = new ModelRenderer(this, 85, 91);
		this.chestplate_rVent02.mirror = true;
		this.chestplate_rVent02.setRotationPoint(-3.3F, -8.8F, 3.0F);
		this.chestplate_rVent02.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(chestplate_rVent02, -0.8196066167365371F, -0.4553564018453205F, -0.27314402793711257F);
		this.boots_lBoot06 = new ModelRenderer(this, 17, 51);
		this.boots_lBoot06.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.boots_lBoot06.addBox(-2.48F, 0.8F, -2.5F, 5, 2, 5, 0.0F);
		this.lHandGuard = new ModelRenderer(this, 100, 115);
		this.lHandGuard.mirror = true;
		this.lHandGuard.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.lHandGuard.addBox(-1.1F, 8.2F, -1.99F, 4, 2, 4, 0.0F);
		this.setRotateAngle(lHandGuard, 0.0F, 0.0F, -0.10000736613927509F);
		this.leggings_rLegGuard01 = new ModelRenderer(this, 44, 34);
		this.leggings_rLegGuard01.mirror = true;
		this.leggings_rLegGuard01.setRotationPoint(0.0F, 4.7F, 0.0F);
		this.leggings_rLegGuard01.addBox(-2.5F, 0.0F, -2.5F, 5, 4, 5, 0.0F);
		this.chestplate_lShoulderPad = new ModelRenderer(this, 63, 0);
		this.chestplate_lShoulderPad.setRotationPoint(-0.6F, 0.0F, 0.0F);
		this.chestplate_lShoulderPad.addBox(0.0F, -3.0F, -3.0F, 5, 5, 6, 0.0F);
		this.setRotateAngle(chestplate_lShoulderPad, 0.0F, 0.0F, -0.31869712141416456F);
		this.boots_rBoot05 = new ModelRenderer(this, 0, 54);
		this.boots_rBoot05.mirror = true;
		this.boots_rBoot05.setRotationPoint(0.0F, 1.1F, 3.6F);
		this.boots_rBoot05.addBox(-2.49F, -1.4F, -2.7F, 5, 1, 3, 0.0F);
		this.chestplate_rGloves02 = new ModelRenderer(this, 77, 12);
		this.chestplate_rGloves02.mirror = true;
		this.chestplate_rGloves02.setRotationPoint(0.8F, 8.9F, -1.1F);
		this.chestplate_rGloves02.addBox(-0.5F, -0.8F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(chestplate_rGloves02, 0.0F, 0.0F, 0.5009094953223726F);
		this.chestplate_chest02 = new ModelRenderer(this, 82, 57);
		this.chestplate_chest02.setRotationPoint(0.0F, 0.0F, -0.5F);
		this.chestplate_chest02.addBox(-4.5F, 0.0F, -3.0F, 9, 2, 7, 0.0F);
		this.boots_lBoot01 = new ModelRenderer(this, 0, 36);
		this.boots_lBoot01.setRotationPoint(0.0F, 11.4F, 0.0F);
		this.boots_lBoot01.addBox(-2.5F, -0.9F, -4.7F, 5, 1, 5, 0.0F);
		this.chestplate_rArmGuard01 = new ModelRenderer(this, 102, 0);
		this.chestplate_rArmGuard01.mirror = true;
		this.chestplate_rArmGuard01.setRotationPoint(-1.0F, 3.6F, 0.0F);
		this.chestplate_rArmGuard01.addBox(-2.5F, -0.3F, -2.5F, 5, 2, 5, 0.0F);
		this.chestplate_lArmGuard04 = new ModelRenderer(this, 89, 8);
		this.chestplate_lArmGuard04.setRotationPoint(-0.3F, 1.7F, 0.0F);
		this.chestplate_lArmGuard04.addBox(-2.0F, 0.0F, -2.01F, 1, 3, 4, 0.0F);
		this.leggings_lLegGuard02 = new ModelRenderer(this, 44, 44);
		this.leggings_lLegGuard02.setRotationPoint(1.9F, 2.0F, 0.0F);
		this.leggings_lLegGuard02.addBox(0.0F, -2.5F, -2.0F, 1, 4, 4, 0.0F);
		this.chestplate_rArmGuard01.addChild(this.chestplate_rArmGuard03);
		this.rLeg.addChild(this.boots_rBoot01);
		this.chestplate_neckGuard.addChild(this.chestplate_headGuard);
		this.chestplate_rArmGuard01.addChild(this.chestplate_rArmGuard04);
		this.leggings_rLegGuard01.addChild(this.leggings_rLegGuard03);
		this.rArm.addChild(this.chestplate_rGloves01);
		this.chestplate_chest01.addChild(this.chestplate_chest03);
		this.head.addChild(this.helmet_visor01);
		this.chestplate_lShoulderPad.addChild(this.chestplate_lShoulderFlange);
		this.lArm.addChild(this.chestplate_lArmGuard01);
		this.boots_lBoot01.addChild(this.boots_lBoot05);
		this.boots_rBoot01.addChild(this.boots_rBoot03);
		this.helmet_visor01.addChild(this.helmet_visor02);
		this.boots_lBoot01.addChild(this.boots_lBoot03);
		this.chestplate_chest01.addChild(this.chestplate_chest04);
		this.lArm.addChild(this.chestplate_lGloves01);
		this.chestplate_rArmGuard01.addChild(this.chestplate_rArmGuard02);
		this.lLeg.addChild(this.leggings_lThighGuard);
		this.boots_rBoot01.addChild(this.boots_rBoot02);
		this.lArm.addChild(this.chestplate_lGloves02);
		this.rArm.addChild(this.chestplate_rShoulderPad);
		this.leggings_rLegGuard01.addChild(this.leggings_rLegGuard02);
		this.chestplate_chest01.addChild(this.chestplate_neckGuard);
		this.body.addChild(this.leggings_codpiece);
		this.body.addChild(this.leggings_buttGuard);
		this.lLeg.addChild(this.leggings_lLegGuard01);
		this.leggings_lLegGuard01.addChild(this.leggings_lLegGuard03);
		this.chestplate_lArmGuard01.addChild(this.chestplate_lArmGuard03);
		this.boots_lBoot01.addChild(this.boots_lBoot02);
		this.rLeg.addChild(this.leggings_rThighGuard);
		this.boots_rBoot01.addChild(this.boots_rBoot06);
		this.chestplate_lArmGuard01.addChild(this.chestplate_lArmGuard02);
		this.chestplate_rShoulderPad.addChild(this.chestplate_rShoulderFlange);
		this.boots_rBoot01.addChild(this.boots_rBoot04);
		this.body.addChild(this.chestplate_chest01);
		this.head.addChild(this.helmet_casing);
		this.chestplate_chest01.addChild(this.chestplate_lVent02);
		this.boots_lBoot01.addChild(this.boots_lBoot04);
		this.chestplate_chest01.addChild(this.chestplate_rVent02);
		this.boots_lBoot01.addChild(this.boots_lBoot06);
		this.rLeg.addChild(this.leggings_rLegGuard01);
		this.lArm.addChild(this.chestplate_lShoulderPad);
		this.boots_rBoot01.addChild(this.boots_rBoot05);
		this.rArm.addChild(this.chestplate_rGloves02);
		this.body.addChild(this.chestplate_chest02);
		this.lLeg.addChild(this.boots_lBoot01);
		this.rArm.addChild(this.chestplate_rArmGuard01);
		this.chestplate_lArmGuard01.addChild(this.chestplate_lArmGuard04);
		this.leggings_lLegGuard01.addChild(this.leggings_lLegGuard02);
	}
	
	@Override
	protected void renderArmorModelExtras(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
	}

	@Override
	public void renderHelmet(TransformType type, Entity entity, float scale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);
		switch (type) {
		case FIRST_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 24, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case FIRST_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 24, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case FIXED:
			GlStateManager.rotate(180, 0, 1, 0);
			GlStateManager.translate(0, scale * 28, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case GROUND:
			GlStateManager.scale(0.55, 0.55, 0.55);
			GlStateManager.translate(0, scale * 45, 0);
			break;
		case GUI:
			ModelUtils.rotateDefaultBlockGui();
			GlStateManager.translate(0, scale * 31, 0);
			GlStateManager.rotate(90, 0, 1, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case HEAD:
			break;
		case NONE:
			break;
		case THIRD_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 25, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case THIRD_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 25, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		}

		this.head.render(scale);

		GlStateManager.popMatrix();
	}

	@Override
	public void renderChestplate(TransformType type, Entity entity, float scale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);

		switch (type) {
		case FIRST_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 18, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		case FIRST_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 18, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		case FIXED:
			GlStateManager.rotate(180, 0, 1, 0);
			GlStateManager.translate(0, scale * 24, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		case GROUND:
			GlStateManager.scale(0.55, 0.55, 0.55);
			GlStateManager.translate(0, scale * 30, 0);
			break;
		case GUI:
			ModelUtils.rotateDefaultBlockGui();
			GlStateManager.translate(0, scale * 27, 0);
			GlStateManager.rotate(90, 0, 1, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		case HEAD:
			break;
		case NONE:
			break;
		case THIRD_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 18, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		case THIRD_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 18, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		}

		this.body.render(scale);
		this.lArm.render(scale);
		this.rArm.render(scale);

		GlStateManager.popMatrix();
	}

	@Override
	public void renderLeggings(TransformType type, Entity entity, float scale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);

		switch (type) {
		case FIRST_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.LEFT);
			break;
		case FIRST_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.RIGHT);
			break;
		case FIXED:
			break;
		case GROUND:
			GlStateManager.translate(0, scale * 6, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case GUI:
			GlStateManager.translate(0, scale * 12, 0);
			ModelUtils.rotateDefaultBlockGui();
			GlStateManager.rotate(90, 0, 1, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case HEAD:
			break;
		case NONE:
			break;
		case THIRD_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.LEFT);
			break;
		case THIRD_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.RIGHT);
			break;
		}

		this.lLeg.render(scale);
		this.rLeg.render(scale);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderBoots(TransformType type, Entity entity, float scale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);

		switch (type) {
		case FIRST_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.LEFT);
			GlStateManager.translate(scale * -4, scale * 12, 0);
			break;
		case FIRST_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.RIGHT);
			GlStateManager.translate(scale * -4, scale * 12, 0);
			break;
		case FIXED:
			GlStateManager.translate(scale * -4, scale * 13, 0);
			break;
		case GROUND:
			GlStateManager.translate(scale * -4, scale * 15, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case GUI:
			GlStateManager.translate(scale * -2, scale * 15, 0);
			ModelUtils.rotateDefaultBlockGui();
			GlStateManager.rotate(90, 0, 1, 0);
			break;
		case HEAD:
			break;
		case NONE:
			break;
		case THIRD_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.LEFT);
			GlStateManager.translate(scale * -4, scale * 12, 0);
			break;
		case THIRD_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.RIGHT);
			GlStateManager.translate(scale * -4, scale * 12, 0);
			break;
		}

		this.boots_lBoot01.render(scale);
		GlStateManager.translate(scale * 6, scale * 12, 0);
		this.boots_lBoot02.render(scale);
		this.boots_lBoot03.render(scale);
		this.boots_lBoot04.render(scale);
		this.boots_lBoot05.render(scale);
		this.boots_lBoot06.render(scale);
		GlStateManager.popMatrix();
	}
}