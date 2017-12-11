package ga.scmc.client.renderer.model;

import com.arisux.mdx.lib.client.Model;

import ga.scmc.entity.living.EntityDarkTemplar;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * darktemplar - TechneToTabulaImporter
 * Created using Tabula 5.1.0
 */
public class ModelDarkTemplar extends Model {
    public ModelRenderer chestUpper;
    public ModelRenderer neck;
    public ModelRenderer abdomen;
    public ModelRenderer shoulders;
    public ModelRenderer cape;
    public ModelRenderer waist;
    public ModelRenderer waistPlate1;
    public ModelRenderer loincloth;
    public ModelRenderer loinclothBack;
    public ModelRenderer legLeft1;
    public ModelRenderer legRight1;
    public ModelRenderer legLeft2;
    public ModelRenderer legLeft3;
    public ModelRenderer legLeft4;
    public ModelRenderer legLeft5;
    public ModelRenderer footLeft;
    public ModelRenderer footLeftUpper;
    public ModelRenderer toeLeftLeft;
    public ModelRenderer toeLeftRight;
    public ModelRenderer toeLeftLeftClaw;
    public ModelRenderer toeLeftRightClaw;
    public ModelRenderer legRight2;
    public ModelRenderer legRight3;
    public ModelRenderer legRight4;
    public ModelRenderer legRight5;
    public ModelRenderer footRight;
    public ModelRenderer footRightUpper;
    public ModelRenderer toeRightRight;
    public ModelRenderer toeRightLeft;
    public ModelRenderer toeRightRightClaw;
    public ModelRenderer toeRightLeftClaw;
    public ModelRenderer shoulderGuardLeft1;
    public ModelRenderer shoulderGuardRight1;
    public ModelRenderer armLeft1;
    public ModelRenderer armRight1;
    public ModelRenderer shoulderGuardLeft2;
    public ModelRenderer shoulderGuardRight2;
    public ModelRenderer lForearm;
    public ModelRenderer lFist;
    public ModelRenderer armLeft2;
    public ModelRenderer bladeLeft1;
    public ModelRenderer bladeLeft2;
    public ModelRenderer bladeLeft3;
    public ModelRenderer rForearm;
    public ModelRenderer rFist;
    public ModelRenderer cape2;
    public ModelRenderer cape3;
    public ModelRenderer head;
    public ModelRenderer headBack;
    public ModelRenderer headBack2;
    public ModelRenderer eyes;
    public ModelRenderer lSkullSlant;
    public ModelRenderer rSkullSlant;
    public ModelRenderer lSkullSlant2;
    public ModelRenderer rSkullSlant2;
    public ModelRenderer faceMask1;
    public ModelRenderer nerveCord1;
    public ModelRenderer faceMask2;
    public ModelRenderer khalaBand;
    public ModelRenderer shape55;
    public ModelRenderer khalaStrand1;
    public ModelRenderer khalaStrand2;
    public ModelRenderer khalaStrand3;
    public ModelRenderer khalaStrand4;
    public ModelRenderer khalaStrand10;
    public ModelRenderer khalaStrand6;
    public ModelRenderer khalaStrand7;
    public ModelRenderer khalaStrand8;
    public ModelRenderer khalaStrand9;
    public ModelRenderer khalaStrand5;

    public ModelDarkTemplar() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.footLeft = new ModelRenderer(this, 92, 86);
        this.footLeft.mirror = true;
        this.footLeft.setRotationPoint(0.0F, 12.1F, 0.2F);
        this.footLeft.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 8, 0.0F);
        this.setRotation(footLeft, 0.5009094953223726F, -0.091106186954104F, -0.091106186954104F);
        this.khalaStrand7 = new ModelRenderer(this, 161, 37);
        this.khalaStrand7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaStrand7.addBox(0.0F, 1.4F, 15.5F, 1, 1, 4, 0.0F);
        this.setRotation(khalaStrand7, 0.4553564018453205F, 0.0F, -0.18203784098300857F);
        this.khalaStrand9 = new ModelRenderer(this, 161, 37);
        this.khalaStrand9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaStrand9.addBox(0.0F, -7.0F, 15.5F, 1, 1, 4, 0.0F);
        this.setRotation(khalaStrand9, -0.18203784098300857F, 0.0F, 0.0F);
        this.faceMask1 = new ModelRenderer(this, 161, 52);
        this.faceMask1.setRotationPoint(0.0F, 0.8F, -0.92F);
        this.faceMask1.addBox(-3.5F, -0.1F, -1.5F, 7, 6, 2, 0.0F);
        this.setRotation(faceMask1, 0.045553093477052F, 0.0F, 0.0F);
        this.rForearm = new ModelRenderer(this, 129, 90);
        this.rForearm.setRotationPoint(-1.5F, 11.3F, 0.0F);
        this.rForearm.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
        this.setRotation(rForearm, 0.7740535232594852F, 0.0F, 0.0F);
        this.footRightUpper = new ModelRenderer(this, 92, 99);
        this.footRightUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.footRightUpper.addBox(-2.0F, -3.0F, -4.9F, 4, 2, 4, 0.0F);
        this.setRotation(footRightUpper, 0.40980330836826856F, 0.0F, 0.0F);
        this.chestUpper = new ModelRenderer(this, 0, 18);
        this.chestUpper.setRotationPoint(0.0F, -25.1F, 0.0F);
        this.chestUpper.addBox(-7.5F, 2.8F, 0.0F, 15, 9, 9, 0.0F);
        this.khalaBand = new ModelRenderer(this, 159, 44);
        this.khalaBand.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaBand.addBox(-2.5F, -3.0F, 4.8F, 5, 5, 1, 0.0F);
        this.bladeLeft1 = new ModelRenderer(this, 126, 40);
        this.bladeLeft1.mirror = true;
        this.bladeLeft1.setRotationPoint(3.0F, 0.0F, -5.5F);
        this.bladeLeft1.addBox(0.0F, -2.0F, -3.5F, 2, 4, 4, 0.0F);
        this.shoulderGuardLeft2 = new ModelRenderer(this, 161, 102);
        this.shoulderGuardLeft2.mirror = true;
        this.shoulderGuardLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulderGuardLeft2.addBox(-0.4F, -5.0F, -3.0F, 1, 10, 6, 0.0F);
        this.lForearm = new ModelRenderer(this, 129, 90);
        this.lForearm.mirror = true;
        this.lForearm.setRotationPoint(0.5F, 11.3F, 0.0F);
        this.lForearm.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
        this.setRotation(lForearm, 0.136659280431156F, 0.0F, 0.0F);
        this.armLeft1 = new ModelRenderer(this, 126, 0);
        this.armLeft1.mirror = true;
        this.armLeft1.setRotationPoint(8.0F, 0.0F, 4.0F);
        this.armLeft1.addBox(-2.0F, 0.0F, -2.0F, 5, 13, 5, 0.0F);
        this.setRotation(armLeft1, 0.18203784098300857F, -0.0F, -0.40980330836826856F);
        this.lSkullSlant = new ModelRenderer(this, 191, 6);
        this.lSkullSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lSkullSlant.addBox(1.5F, -0.5F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotation(lSkullSlant, -0.36425021489121656F, 0.0F, 0.40980330836826856F);
        this.rSkullSlant = new ModelRenderer(this, 191, 6);
        this.rSkullSlant.mirror = true;
        this.rSkullSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rSkullSlant.addBox(-3.5F, -0.5F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotation(rSkullSlant, -0.36425021489121656F, 0.0F, -0.40980330836826856F);
        this.loincloth = new ModelRenderer(this, 225, 0);
        this.loincloth.setRotationPoint(0.0F, 19.3F, -3.91F);
        this.loincloth.addBox(-5.0F, 0.0F, -0.1F, 10, 11, 0, 0.0F);
        this.legRight1 = new ModelRenderer(this, 92, 0);
        this.legRight1.setRotationPoint(-6.0F, 21.0F, 0.0F);
        this.legRight1.addBox(-2.5F, -2.0F, -3.0F, 5, 15, 6, 0.0F);
        this.setRotation(legRight1, -0.4553564018453205F, 0.136659280431156F, 0.0F);
        this.abdomen = new ModelRenderer(this, 0, 59);
        this.abdomen.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.abdomen.addBox(-5.0F, 11.6F, -2.2F, 10, 6, 5, 0.0F);
        this.toeLeftRightClaw = new ModelRenderer(this, 92, 114);
        this.toeLeftRightClaw.setRotationPoint(-1.5F, 1.5F, -9.2F);
        this.toeLeftRightClaw.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotation(toeLeftRightClaw, 0.5462880558742251F, 0.0F, 0.0F);
        this.shape55 = new ModelRenderer(this, 0, 0);
        this.shape55.setRotationPoint(-0.5F, 0.3F, -10.6F);
        this.shape55.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotation(shape55, -0.22759093446006054F, 0.0F, 0.0F);
        this.armLeft2 = new ModelRenderer(this, 126, 21);
        this.armLeft2.mirror = true;
        this.armLeft2.setRotationPoint(0.0F, 0.0F, 1.4F);
        this.armLeft2.addBox(-3.0F, -3.0F, -11.0F, 6, 6, 11, 0.0F);
        this.khalaStrand3 = new ModelRenderer(this, 161, 37);
        this.khalaStrand3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaStrand3.addBox(0.0F, -6.0F, 15.5F, 1, 1, 4, 0.0F);
        this.setRotation(khalaStrand3, -0.14922565104551516F, 0.136659280431156F, -0.4553564018453205F);
        this.legRight3 = new ModelRenderer(this, 92, 36);
        this.legRight3.setRotationPoint(-0.7F, 0.2F, 1.0F);
        this.legRight3.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F);
        this.setRotation(legRight3, -0.18203784098300857F, 0.0F, 0.0F);
        this.toeRightRight = new ModelRenderer(this, 92, 106);
        this.toeRightRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toeRightRight.addBox(-2.5F, 0.9F, -9.5F, 2, 2, 4, 0.0F);
        this.waist = new ModelRenderer(this, 0, 73);
        this.waist.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.waist.addBox(-6.0F, 17.5F, -4.0F, 12, 5, 8, 0.0F);
        this.toeLeftLeftClaw = new ModelRenderer(this, 92, 114);
        this.toeLeftLeftClaw.setRotationPoint(1.5F, 1.5F, -9.2F);
        this.toeLeftLeftClaw.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotation(toeLeftLeftClaw, 0.5462880558742251F, 0.0F, 0.0F);
        this.footLeftUpper = new ModelRenderer(this, 92, 99);
        this.footLeftUpper.mirror = true;
        this.footLeftUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.footLeftUpper.addBox(-2.0F, -3.0F, -4.9F, 4, 2, 4, 0.0F);
        this.setRotation(footLeftUpper, 0.40980330836826856F, 0.0F, 0.0F);
        this.legLeft2 = new ModelRenderer(this, 92, 23);
        this.legLeft2.mirror = true;
        this.legLeft2.setRotationPoint(0.0F, 14.7F, 0.0F);
        this.legLeft2.addBox(-3.5F, -3.0F, -3.2F, 7, 6, 6, 0.0F);
        this.setRotation(legLeft2, 0.5235987755982988F, 0.136659280431156F, 0.045553093477052F);
        this.toeLeftRight = new ModelRenderer(this, 92, 106);
        this.toeLeftRight.mirror = true;
        this.toeLeftRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toeLeftRight.addBox(-2.5F, 0.9F, -9.6F, 2, 2, 4, 0.0F);
        this.shoulderGuardRight1 = new ModelRenderer(this, 161, 73);
        this.shoulderGuardRight1.setRotationPoint(-11.8F, -1.8F, 5.0F);
        this.shoulderGuardRight1.addBox(0.0F, -5.5F, -5.0F, 2, 11, 10, 0.0F);
        this.setRotation(shoulderGuardRight1, 0.0F, 0.0F, 0.7285004297824331F);
        this.armRight1 = new ModelRenderer(this, 126, 0);
        this.armRight1.setRotationPoint(-7.0F, 0.6F, 4.0F);
        this.armRight1.addBox(-4.0F, 0.0F, -3.0F, 5, 13, 5, 0.0F);
        this.setRotation(armRight1, 0.36425021489121656F, -0.0F, 0.27314402793711257F);
        this.bladeLeft3 = new ModelRenderer(this, 126, 72);
        this.bladeLeft3.mirror = true;
        this.bladeLeft3.setRotationPoint(0.9F, 0.0F, -3.4F);
        this.bladeLeft3.addBox(-0.8F, -1.5F, -13.4F, 1, 3, 14, 0.0F);
        this.cape2 = new ModelRenderer(this, 197, 57);
        this.cape2.mirror = true;
        this.cape2.setRotationPoint(0.1F, 12.9F, 0.0F);
        this.cape2.addBox(-14.0F, 0.0F, 0.0F, 28, 15, 0, 0.0F);
        this.setRotation(cape2, -0.136659280431156F, 0.0F, 0.0F);
        this.nerveCord1 = new ModelRenderer(this, 63, 53);
        this.nerveCord1.setRotationPoint(0.0F, 0.0F, 1.6F);
        this.nerveCord1.addBox(-2.0F, -2.5F, 0.0F, 4, 4, 6, 0.0F);
        this.setRotation(nerveCord1, 0.36425021489121656F, -0.0F, 0.0F);
        this.legLeft4 = new ModelRenderer(this, 92, 53);
        this.legLeft4.mirror = true;
        this.legLeft4.setRotationPoint(0.0F, -0.9F, 7.0F);
        this.legLeft4.addBox(-2.0F, -2.2F, 1.9F, 4, 4, 3, 0.0F);
        this.setRotation(legLeft4, -0.27314402793711257F, 0.0F, 0.0F);
        this.shoulderGuardLeft1 = new ModelRenderer(this, 161, 73);
        this.shoulderGuardLeft1.mirror = true;
        this.shoulderGuardLeft1.setRotationPoint(11.9F, -1.8F, 5.0F);
        this.shoulderGuardLeft1.addBox(-2.0F, -5.5F, -5.0F, 2, 11, 10, 0.0F);
        this.setRotation(shoulderGuardLeft1, 0.0F, 0.0F, -0.7285004297824331F);
        this.eyes = new ModelRenderer(this, 192, 0);
        this.eyes.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyes.addBox(-2.5F, 0.1F, -1.9F, 5, 2, 2, 0.0F);
        this.setRotation(eyes, -1.2747884856566583F, 0.0F, 0.0F);
        this.toeRightLeftClaw = new ModelRenderer(this, 92, 114);
        this.toeRightLeftClaw.mirror = true;
        this.toeRightLeftClaw.setRotationPoint(1.5F, 1.5F, -9.2F);
        this.toeRightLeftClaw.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotation(toeRightLeftClaw, 0.5462880558742251F, 0.0F, 0.0F);
        this.toeRightRightClaw = new ModelRenderer(this, 92, 114);
        this.toeRightRightClaw.mirror = true;
        this.toeRightRightClaw.setRotationPoint(-1.5F, 1.5F, -9.2F);
        this.toeRightRightClaw.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotation(toeRightRightClaw, 0.5462880558742251F, 0.0F, 0.0F);
        this.shoulderGuardRight2 = new ModelRenderer(this, 161, 102);
        this.shoulderGuardRight2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulderGuardRight2.addBox(-0.6F, -5.0F, -3.0F, 1, 10, 6, 0.0F);
        this.headBack2 = new ModelRenderer(this, 166, 27);
        this.headBack2.setRotationPoint(0.0F, -1.0F, -0.8F);
        this.headBack2.addBox(-3.0F, -7.0F, -0.8F, 6, 8, 2, 0.0F);
        this.setRotation(headBack2, -0.7740535232594852F, 0.0F, 0.0F);
        this.footRight = new ModelRenderer(this, 92, 86);
        this.footRight.setRotationPoint(0.0F, 12.1F, 0.2F);
        this.footRight.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 8, 0.0F);
        this.setRotation(footRight, 0.5009094953223726F, 0.091106186954104F, 0.091106186954104F);
        this.khalaStrand1 = new ModelRenderer(this, 161, 37);
        this.khalaStrand1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaStrand1.addBox(1.6F, -3.3F, 15.5F, 1, 1, 4, 0.0F);
        this.setRotation(khalaStrand1, 0.136659280431156F, -0.20123646275494617F, 0.0F);
        this.khalaStrand6 = new ModelRenderer(this, 161, 37);
        this.khalaStrand6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaStrand6.addBox(0.0F, 0.0F, 16.5F, 1, 1, 4, 0.0F);
        this.setRotation(khalaStrand6, 0.36128315516282616F, 0.0F, 0.0F);
        this.khalaStrand10 = new ModelRenderer(this, 174, 37);
        this.khalaStrand10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaStrand10.addBox(0.0F, -3.5F, 15.5F, 2, 2, 6, 0.0F);
        this.setRotation(khalaStrand10, 0.136659280431156F, -0.045553093477052F, 0.0F);
        this.shoulders = new ModelRenderer(this, 0, 0);
        this.shoulders.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulders.addBox(-12.0F, -1.6F, 0.5F, 24, 6, 8, 0.0F);
        this.legLeft1 = new ModelRenderer(this, 92, 0);
        this.legLeft1.mirror = true;
        this.legLeft1.setRotationPoint(6.0F, 21.0F, 0.0F);
        this.legLeft1.addBox(-2.5F, -2.0F, -3.0F, 5, 15, 6, 0.0F);
        this.setRotation(legLeft1, -0.4553564018453205F, -0.136659280431156F, 0.0F);
        this.neck = new ModelRenderer(this, 189, 21);
        this.neck.setRotationPoint(0.0F, -26.4F, 3.2F);
        this.neck.addBox(-2.5F, -3.2F, -1.4F, 5, 5, 4, 0.0F);
        this.setRotation(neck, 0.6829473363053812F, 0.0F, 0.0F);
        this.lFist = new ModelRenderer(this, 134, 110);
        this.lFist.mirror = true;
        this.lFist.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.lFist.addBox(-3.1F, -2.5F, -4.1F, 5, 5, 5, 0.0F);
        this.setRotation(lFist, 0.0F, 0.40980330836826856F, 0.0F);
        this.lSkullSlant2 = new ModelRenderer(this, 200, 5);
        this.lSkullSlant2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lSkullSlant2.addBox(1.4F, -3.3F, 0.2F, 2, 4, 1, 0.0F);
        this.setRotation(lSkullSlant2, -0.7740535232594852F, 0.0F, 0.0F);
        this.khalaStrand8 = new ModelRenderer(this, 161, 37);
        this.khalaStrand8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaStrand8.addBox(-3.3F, 0.0F, 15.5F, 1, 1, 4, 0.0F);
        this.setRotation(khalaStrand8, 0.31869712141416456F, 0.18203784098300857F, 0.27314402793711257F);
        this.rFist = new ModelRenderer(this, 134, 110);
        this.rFist.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.rFist.addBox(-2.1F, -2.5F, -4.1F, 5, 5, 5, 0.0F);
        this.setRotation(rFist, 0.0F, -0.136659280431156F, 0.0F);
        this.bladeLeft2 = new ModelRenderer(this, 126, 53);
        this.bladeLeft2.mirror = true;
        this.bladeLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bladeLeft2.addBox(1.2F, -3.0F, -4.6F, 1, 6, 6, 0.0F);
        this.headBack = new ModelRenderer(this, 166, 18);
        this.headBack.setRotationPoint(0.0F, -1.8F, -2.1F);
        this.headBack.addBox(-2.5F, -5.4F, -0.05F, 5, 6, 2, 0.0F);
        this.setRotation(headBack, -0.6829473363053812F, 0.0F, 0.0F);
        this.toeRightLeft = new ModelRenderer(this, 92, 106);
        this.toeRightLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toeRightLeft.addBox(0.5F, 0.9F, -9.6F, 2, 2, 4, 0.0F);
        this.legLeft3 = new ModelRenderer(this, 92, 36);
        this.legLeft3.mirror = true;
        this.legLeft3.setRotationPoint(0.7F, 0.2F, 1.0F);
        this.legLeft3.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F);
        this.setRotation(legLeft3, -0.18203784098300857F, 0.0F, 0.0F);
        this.legRight4 = new ModelRenderer(this, 92, 53);
        this.legRight4.setRotationPoint(0.0F, -0.9F, 7.0F);
        this.legRight4.addBox(-2.0F, -2.2F, 1.9F, 4, 4, 3, 0.0F);
        this.setRotation(legRight4, -0.27314402793711257F, 0.0F, 0.0F);
        this.legRight5 = new ModelRenderer(this, 92, 65);
        this.legRight5.setRotationPoint(0.0F, 0.6F, 2.8F);
        this.legRight5.addBox(-2.08F, 0.0F, -2.5F, 4, 14, 5, 0.0F);
        this.setRotation(legRight5, -0.136659280431156F, 0.091106186954104F, 0.0F);
        this.cape = new ModelRenderer(this, 197, 44);
        this.cape.mirror = true;
        this.cape.setRotationPoint(0.0F, -1.9F, 8.5F);
        this.cape.addBox(-14.0F, 0.0F, 0.0F, 28, 13, 0, 0.0F);
        this.setRotation(cape, 0.18203784098300857F, 0.0F, 0.0F);
        this.legLeft5 = new ModelRenderer(this, 92, 65);
        this.legLeft5.mirror = true;
        this.legLeft5.setRotationPoint(0.0F, 0.6F, 2.8F);
        this.legLeft5.addBox(-2.02F, 0.0F, -2.5F, 4, 14, 5, 0.0F);
        this.setRotation(legLeft5, -0.136659280431156F, -0.091106186954104F, 0.0F);
        this.faceMask2 = new ModelRenderer(this, 161, 62);
        this.faceMask2.setRotationPoint(0.0F, 5.6F, 0.0F);
        this.faceMask2.addBox(-2.5F, 0.0F, -1.2F, 5, 7, 1, 0.0F);
        this.setRotation(faceMask2, 0.091106186954104F, 0.0F, 0.0F);
        this.rSkullSlant2 = new ModelRenderer(this, 200, 5);
        this.rSkullSlant2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rSkullSlant2.addBox(-3.4F, -3.3F, 0.2F, 2, 4, 1, 0.0F);
        this.setRotation(rSkullSlant2, -0.7740535232594852F, 0.0F, 0.0F);
        this.waistPlate1 = new ModelRenderer(this, 48, 44);
        this.waistPlate1.setRotationPoint(0.0F, 20.0F, -4.3F);
        this.waistPlate1.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 1, 0.0F);
        this.setRotation(waistPlate1, 0.0F, -0.0F, 0.7853981633974483F);
        this.cape3 = new ModelRenderer(this, 197, 72);
        this.cape3.mirror = true;
        this.cape3.setRotationPoint(0.1F, 15.0F, 0.0F);
        this.cape3.addBox(-14.0F, 0.0F, 0.0F, 28, 10, 0, 0.0F);
        this.head = new ModelRenderer(this, 166, 0);
        this.head.setRotationPoint(0.0F, -4.0F, 0.7F);
        this.head.addBox(-3.0F, -2.0F, -2.0F, 6, 4, 3, 0.0F);
        this.setRotation(head, -0.8196066167365371F, 0.0F, 0.0F);
        this.khalaStrand5 = new ModelRenderer(this, 161, 37);
        this.khalaStrand5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaStrand5.addBox(3.3F, 0.4F, 15.5F, 1, 1, 4, 0.0F);
        this.setRotation(khalaStrand5, 0.27314402793711257F, -0.22759093446006054F, -0.22759093446006054F);
        this.loinclothBack = new ModelRenderer(this, 225, 0);
        this.loinclothBack.mirror = true;
        this.loinclothBack.setRotationPoint(0.0F, 19.3F, 4.11F);
        this.loinclothBack.addBox(-5.0F, 0.0F, -0.1F, 10, 11, 0, 0.0F);
        this.khalaStrand4 = new ModelRenderer(this, 161, 37);
        this.khalaStrand4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaStrand4.addBox(0.0F, -7.0F, 15.5F, 1, 1, 4, 0.0F);
        this.setRotation(khalaStrand4, -0.17226399717184032F, -0.08970992355250852F, 0.22759093446006054F);
        this.legRight2 = new ModelRenderer(this, 92, 23);
        this.legRight2.setRotationPoint(0.0F, 14.7F, 0.0F);
        this.legRight2.addBox(-3.5F, -3.0F, -3.2F, 7, 6, 6, 0.0F);
        this.setRotation(legRight2, 0.5235987755982988F, -0.136659280431156F, -0.045553093477052F);
        this.toeLeftLeft = new ModelRenderer(this, 92, 106);
        this.toeLeftLeft.mirror = true;
        this.toeLeftLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toeLeftLeft.addBox(0.5F, 0.9F, -9.5F, 2, 2, 4, 0.0F);
        this.khalaStrand2 = new ModelRenderer(this, 161, 37);
        this.khalaStrand2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.khalaStrand2.addBox(0.0F, 0.0F, 16.5F, 1, 1, 4, 0.0F);
        this.setRotation(khalaStrand2, 0.36425021489121656F, 0.0F, 0.18203784098300857F);
        this.legLeft5.addChild(this.footLeft);
        this.shape55.addChild(this.khalaStrand7);
        this.shape55.addChild(this.khalaStrand9);
        this.head.addChild(this.faceMask1);
        this.armRight1.addChild(this.rForearm);
        this.footRight.addChild(this.footRightUpper);
        this.nerveCord1.addChild(this.khalaBand);
        this.armLeft2.addChild(this.bladeLeft1);
        this.shoulderGuardLeft1.addChild(this.shoulderGuardLeft2);
        this.armLeft1.addChild(this.lForearm);
        this.shoulders.addChild(this.armLeft1);
        this.head.addChild(this.lSkullSlant);
        this.head.addChild(this.rSkullSlant);
        this.waist.addChild(this.loincloth);
        this.waist.addChild(this.legRight1);
        this.chestUpper.addChild(this.abdomen);
        this.toeLeftRight.addChild(this.toeLeftRightClaw);
        this.nerveCord1.addChild(this.shape55);
        this.lForearm.addChild(this.armLeft2);
        this.shape55.addChild(this.khalaStrand3);
        this.legRight2.addChild(this.legRight3);
        this.footRight.addChild(this.toeRightRight);
        this.abdomen.addChild(this.waist);
        this.toeLeftLeft.addChild(this.toeLeftLeftClaw);
        this.footLeft.addChild(this.footLeftUpper);
        this.legLeft1.addChild(this.legLeft2);
        this.footLeft.addChild(this.toeLeftRight);
        this.shoulders.addChild(this.shoulderGuardRight1);
        this.shoulders.addChild(this.armRight1);
        this.bladeLeft1.addChild(this.bladeLeft3);
        this.cape.addChild(this.cape2);
        this.head.addChild(this.nerveCord1);
        this.legLeft3.addChild(this.legLeft4);
        this.shoulders.addChild(this.shoulderGuardLeft1);
        this.head.addChild(this.eyes);
        this.toeRightLeft.addChild(this.toeRightLeftClaw);
        this.toeRightRight.addChild(this.toeRightRightClaw);
        this.shoulderGuardRight1.addChild(this.shoulderGuardRight2);
        this.head.addChild(this.headBack2);
        this.legRight5.addChild(this.footRight);
        this.shape55.addChild(this.khalaStrand1);
        this.shape55.addChild(this.khalaStrand6);
        this.shape55.addChild(this.khalaStrand10);
        this.chestUpper.addChild(this.shoulders);
        this.waist.addChild(this.legLeft1);
        this.lForearm.addChild(this.lFist);
        this.head.addChild(this.lSkullSlant2);
        this.shape55.addChild(this.khalaStrand8);
        this.rForearm.addChild(this.rFist);
        this.bladeLeft1.addChild(this.bladeLeft2);
        this.head.addChild(this.headBack);
        this.footRight.addChild(this.toeRightLeft);
        this.legLeft2.addChild(this.legLeft3);
        this.legRight3.addChild(this.legRight4);
        this.legRight4.addChild(this.legRight5);
        this.chestUpper.addChild(this.cape);
        this.legLeft4.addChild(this.legLeft5);
        this.faceMask1.addChild(this.faceMask2);
        this.head.addChild(this.rSkullSlant2);
        this.waist.addChild(this.waistPlate1);
        this.cape2.addChild(this.cape3);
        this.neck.addChild(this.head);
        this.shape55.addChild(this.khalaStrand5);
        this.waist.addChild(this.loinclothBack);
        this.shape55.addChild(this.khalaStrand4);
        this.legRight1.addChild(this.legRight2);
        this.footLeft.addChild(this.toeLeftLeft);
        this.shape55.addChild(this.khalaStrand2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    	this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.chestUpper.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.neck.offsetX, this.neck.offsetY, this.neck.offsetZ);
        GlStateManager.translate(this.neck.rotationPointX * f5, this.neck.rotationPointY * f5, this.neck.rotationPointZ * f5);
        GlStateManager.scale(1.5D, 1.5D, 1.5D);
        GlStateManager.translate(-this.neck.offsetX, -this.neck.offsetY, -this.neck.offsetZ);
        GlStateManager.translate(-this.neck.rotationPointX * f5, -this.neck.rotationPointY * f5, -this.neck.rotationPointZ * f5);
        this.neck.render(f5);
        GlStateManager.popMatrix();
        if(entity instanceof EntityDarkTemplar) {
        	if(((EntityDarkTemplar)entity).canSheathBlades()) {
        		this.bladeLeft3.isHidden = false;
        	}else {
        		this.bladeLeft3.isHidden = true;
        	}
        }
    }
	
	@Override
   	public void render(Object obj) {
       	EntityLivingBase base = (EntityLivingBase) obj;
       	head.rotateAngleX = headPitch(obj) * 0.017453292F + 5.5F;
	    head.rotateAngleY = headYaw(obj) * 0.0017453292F;
	    legLeft1.rotateAngleX = MathHelper.sin(swingProgress(obj) * 0.8662F) * 1 * swingProgressPrev(obj) - 0.5F;
		legLeft2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1 * swingProgressPrev(obj) + 0.5F;
		armLeft1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.8662F + (float) Math.PI) * 0.5F * swingProgressPrev(obj);
		legRight1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.8662F) * 1 * swingProgressPrev(obj) - 0.5F;
		legRight2.rotateAngleX = MathHelper.sin(swingProgress(obj) * 0.6662F) * 1 * swingProgressPrev(obj) + 0.5F;
		armRight1.rotateAngleX = MathHelper.sin(swingProgress(obj) * 0.8662F + (float) Math.PI) * 0.5F * swingProgressPrev(obj);
		if(obj instanceof EntityDarkTemplar) {
        	if(((EntityDarkTemplar)obj).canSheathBlades()) {
        		this.lForearm.rotateAngleX = (float) Math.toRadians(15);
        		this.rForearm.rotateAngleX = (float) Math.toRadians(15);
        	}else {
        		this.lForearm.rotateAngleX = (float) Math.toRadians(65);
        		this.rForearm.rotateAngleX = (float) Math.toRadians(65);
        	}
        }
   	}
}
