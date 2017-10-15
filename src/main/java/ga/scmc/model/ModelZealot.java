package ga.scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * zealot - TechneToTabulaImporter
 * Created using Tabula 5.1.0
 */
public class ModelZealot extends ModelBase {
    public ModelRenderer chestUpper;
    public ModelRenderer arcRight1;
    public ModelRenderer arcRight1_1;
    public ModelRenderer neck;
    public ModelRenderer chestLower;
    public ModelRenderer abdomen;
    public ModelRenderer shoulders;
    public ModelRenderer chestPlate;
    public ModelRenderer waist;
    public ModelRenderer waistPlate1;
    public ModelRenderer legRight1;
    public ModelRenderer legLeft1;
    public ModelRenderer waistPlate2;
    public ModelRenderer legRight2;
    public ModelRenderer legRight3;
    public ModelRenderer legRight4;
    public ModelRenderer legRight5;
    public ModelRenderer footRight;
    public ModelRenderer footRightUpper;
    public ModelRenderer toeRightRight;
    public ModelRenderer toeRightLeft;
    public ModelRenderer legLeft2;
    public ModelRenderer legLeft3;
    public ModelRenderer legLeft4;
    public ModelRenderer legLeft5;
    public ModelRenderer footLeft;
    public ModelRenderer footLeftUpper;
    public ModelRenderer toeLeftLeft;
    public ModelRenderer toeLeftRight;
    public ModelRenderer armLeft1;
    public ModelRenderer armRight1;
    public ModelRenderer lForearm;
    public ModelRenderer lFist;
    public ModelRenderer armLeft2;
    public ModelRenderer bladeLeft1;
    public ModelRenderer bladeLeft2;
    public ModelRenderer bladeLeft3;
    public ModelRenderer rForearm;
    public ModelRenderer rFist;
    public ModelRenderer armRight2;
    public ModelRenderer bladeRight1;
    public ModelRenderer bladeRight2;
    public ModelRenderer bladeRight3;
    public ModelRenderer arcRight2;
    public ModelRenderer arcRight3;
    public ModelRenderer arcRight4;
    public ModelRenderer arcRight5;
    public ModelRenderer arcRight2_1;
    public ModelRenderer arcRight3_1;
    public ModelRenderer arcRight4_1;
    public ModelRenderer arcRight5_1;
    public ModelRenderer head;
    public ModelRenderer mouthIGuess;
    public ModelRenderer headBack;
    public ModelRenderer headBack2;
    public ModelRenderer headTendrilBundle;
    public ModelRenderer eyes;
    public ModelRenderer lSkullSlant;
    public ModelRenderer rSkullSlant;
    public ModelRenderer lSkullSlant2;
    public ModelRenderer rSkullSlant2;
    public ModelRenderer chin;
    public ModelRenderer headTendrilBundle2;
    public ModelRenderer headTendrilBundle3;
    public ModelRenderer headTendrilBundle4;
    public ModelRenderer headTendrilBundle5;
    public ModelRenderer headTendrilBundle6;

    public ModelZealot() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.abdomen = new ModelRenderer(this, 0, 59);
        this.abdomen.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.abdomen.addBox(-5.0F, 12.0F, -2.0F, 10, 7, 5, 0.0F);
        this.toeRightLeft = new ModelRenderer(this, 92, 106);
        this.toeRightLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toeRightLeft.addBox(0.5F, 0.9F, -9.6F, 2, 2, 4, 0.0F);
        this.bladeLeft3 = new ModelRenderer(this, 126, 72);
        this.bladeLeft3.mirror = true;
        this.bladeLeft3.setRotationPoint(0.9F, 0.0F, -3.4F);
        this.bladeLeft3.addBox(-0.5F, -1.5F, -12.0F, 1, 3, 12, 0.0F);
        this.legRight4 = new ModelRenderer(this, 92, 53);
        this.legRight4.setRotationPoint(0.0F, -0.9F, 7.0F);
        this.legRight4.addBox(-3.0F, -2.5F, 0.0F, 6, 5, 5, 0.0F);
        this.setRotateAngle(legRight4, -0.27314402793711257F, 0.0F, 0.0F);
        this.armRight2 = new ModelRenderer(this, 126, 21);
        this.armRight2.setRotationPoint(0.0F, 0.0F, 1.4F);
        this.armRight2.addBox(-3.0F, -3.0F, -11.0F, 6, 6, 11, 0.0F);
        this.bladeRight2 = new ModelRenderer(this, 126, 53);
        this.bladeRight2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bladeRight2.addBox(-2.7F, -3.0F, -5.5F, 1, 6, 11, 0.0F);
        this.headBack = new ModelRenderer(this, 166, 18);
        this.headBack.setRotationPoint(0.0F, -1.8F, -2.1F);
        this.headBack.addBox(-2.5F, -5.4F, -0.05F, 5, 6, 2, 0.0F);
        this.setRotateAngle(headBack, -0.6829473363053812F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 166, 0);
        this.head.setRotationPoint(0.0F, -4.0F, 0.7F);
        this.head.addBox(-3.0F, -2.0F, -2.0F, 6, 4, 3, 0.0F);
        this.setRotateAngle(head, -0.8196066167365371F, 0.0F, 0.0F);
        this.legLeft5 = new ModelRenderer(this, 92, 65);
        this.legLeft5.mirror = true;
        this.legLeft5.setRotationPoint(0.0F, 0.6F, 2.8F);
        this.legLeft5.addBox(-2.52F, 0.0F, -2.5F, 5, 14, 5, 0.0F);
        this.setRotateAngle(legLeft5, -0.136659280431156F, -0.091106186954104F, 0.0F);
        this.lForearm = new ModelRenderer(this, 129, 90);
        this.lForearm.mirror = true;
        this.lForearm.setRotationPoint(0.5F, 11.3F, 0.0F);
        this.lForearm.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
        this.setRotateAngle(lForearm, 0.136659280431156F, 0.0F, 0.0F);
        this.footRight = new ModelRenderer(this, 92, 86);
        this.footRight.setRotationPoint(0.0F, 12.1F, 0.2F);
        this.footRight.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 8, 0.0F);
        this.setRotateAngle(footRight, 0.22759093446006054F, 0.091106186954104F, 0.0F);
        this.headTendrilBundle3 = new ModelRenderer(this, 212, 22);
        this.headTendrilBundle3.setRotationPoint(0.0F, -0.3F, 3.1F);
        this.headTendrilBundle3.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(headTendrilBundle3, -0.6373942428283291F, 0.0F, 0.0F);
        this.legRight3 = new ModelRenderer(this, 92, 36);
        this.legRight3.setRotationPoint(-0.7F, 0.2F, 1.0F);
        this.legRight3.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F);
        this.setRotateAngle(legRight3, 0.18203784098300857F, 0.0F, 0.0F);
        this.legLeft2 = new ModelRenderer(this, 92, 23);
        this.legLeft2.mirror = true;
        this.legLeft2.setRotationPoint(0.0F, 14.7F, 0.0F);
        this.legLeft2.addBox(-3.5F, -3.0F, -3.2F, 7, 6, 6, 0.0F);
        this.setRotateAngle(legLeft2, 0.5235987755982988F, 0.136659280431156F, 0.045553093477052F);
        this.headTendrilBundle4 = new ModelRenderer(this, 213, 33);
        this.headTendrilBundle4.setRotationPoint(0.0F, -0.2F, 5.7F);
        this.headTendrilBundle4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(headTendrilBundle4, -0.36425021489121656F, 0.0F, 0.0F);
        this.armLeft2 = new ModelRenderer(this, 126, 21);
        this.armLeft2.mirror = true;
        this.armLeft2.setRotationPoint(0.0F, 0.0F, 1.4F);
        this.armLeft2.addBox(-3.0F, -3.0F, -11.0F, 6, 6, 11, 0.0F);
        this.arcRight1 = new ModelRenderer(this, 50, 60);
        this.arcRight1.setRotationPoint(-12.0F, -29.0F, -6.0F);
        this.arcRight1.addBox(0.0F, 0.0F, 0.0F, 3, 13, 1, 0.0F);
        this.setRotateAngle(arcRight1, 0.5235987901687622F, -0.0F, -0.296705961227417F);
        this.shoulders = new ModelRenderer(this, 0, 0);
        this.shoulders.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulders.addBox(-18.0F, -5.0F, 1.0F, 36, 8, 9, 0.0F);
        this.arcRight2 = new ModelRenderer(this, 50, 76);
        this.arcRight2.setRotationPoint(0.0F, 0.6F, 0.2F);
        this.arcRight2.addBox(0.0F, 0.0F, 0.0F, 3, 12, 1, 0.0F);
        this.setRotateAngle(arcRight2, 1.8151424220741026F, -0.0F, 0.0F);
        this.mouthIGuess = new ModelRenderer(this, 166, 9);
        this.mouthIGuess.setRotationPoint(0.0F, 1.6F, -1.2F);
        this.mouthIGuess.addBox(-1.5F, -0.4F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(mouthIGuess, -0.27314402793711257F, 0.0F, 0.0F);
        this.arcRight5 = new ModelRenderer(this, 50, 122);
        this.arcRight5.setRotationPoint(0.9F, 10.9F, -1.2F);
        this.arcRight5.addBox(-1.5F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(arcRight5, 0.20943951023931953F, -0.0F, 0.27314402793711257F);
        this.headTendrilBundle6 = new ModelRenderer(this, 213, 55);
        this.headTendrilBundle6.setRotationPoint(0.0F, 0.0F, 7.7F);
        this.headTendrilBundle6.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.lSkullSlant2 = new ModelRenderer(this, 200, 5);
        this.lSkullSlant2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lSkullSlant2.addBox(1.4F, -3.3F, 0.2F, 2, 4, 1, 0.0F);
        this.setRotateAngle(lSkullSlant2, -0.7740535232594852F, 0.0F, 0.0F);
        this.headBack2 = new ModelRenderer(this, 166, 27);
        this.headBack2.setRotationPoint(0.0F, -1.0F, -0.8F);
        this.headBack2.addBox(-3.0F, -7.0F, -0.8F, 6, 8, 2, 0.0F);
        this.setRotateAngle(headBack2, -0.7740535232594852F, 0.0F, 0.0F);
        this.legRight1 = new ModelRenderer(this, 92, 0);
        this.legRight1.setRotationPoint(-6.0F, 21.0F, 0.0F);
        this.legRight1.addBox(-3.0F, -2.0F, -3.0F, 6, 15, 6, 0.0F);
        this.setRotateAngle(legRight1, -0.5235987755982988F, 0.136659280431156F, 0.0F);
        this.rFist = new ModelRenderer(this, 134, 110);
        this.rFist.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.rFist.addBox(-2.1F, -2.5F, -4.1F, 5, 5, 5, 0.0F);
        this.setRotateAngle(rFist, 0.0F, -0.40980330836826856F, 0.0F);
        this.toeLeftRight = new ModelRenderer(this, 92, 106);
        this.toeLeftRight.mirror = true;
        this.toeLeftRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toeLeftRight.addBox(-2.5F, 0.9F, -9.6F, 2, 2, 4, 0.0F);
        this.arcRight4_1 = new ModelRenderer(this, 50, 108);
        this.arcRight4_1.mirror = true;
        this.arcRight4_1.setRotationPoint(0.1F, 12.8F, 0.3F);
        this.arcRight4_1.addBox(-3.0F, 0.0F, 0.0F, 3, 12, 1, 0.0F);
        this.setRotateAngle(arcRight4_1, -1.1838568316277536F, -0.0F, 0.045553093477052F);
        this.bladeLeft2 = new ModelRenderer(this, 126, 53);
        this.bladeLeft2.mirror = true;
        this.bladeLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bladeLeft2.addBox(1.7F, -3.0F, -5.5F, 1, 6, 11, 0.0F);
        this.arcRight2_1 = new ModelRenderer(this, 50, 76);
        this.arcRight2_1.mirror = true;
        this.arcRight2_1.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.arcRight2_1.addBox(-3.0F, 0.0F, 0.0F, 3, 12, 1, 0.0F);
        this.setRotateAngle(arcRight2_1, 1.8151424220741026F, -0.0F, 0.0F);
        this.rForearm = new ModelRenderer(this, 129, 90);
        this.rForearm.setRotationPoint(-1.5F, 11.3F, 0.0F);
        this.rForearm.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
        this.setRotateAngle(rForearm, 0.136659280431156F, 0.0F, 0.0F);
        this.toeLeftLeft = new ModelRenderer(this, 92, 106);
        this.toeLeftLeft.mirror = true;
        this.toeLeftLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toeLeftLeft.addBox(0.5F, 0.9F, -9.5F, 2, 2, 4, 0.0F);
        this.eyes = new ModelRenderer(this, 192, 0);
        this.eyes.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyes.addBox(-2.5F, 0.1F, -1.9F, 5, 2, 2, 0.0F);
        this.setRotateAngle(eyes, -1.2747884856566583F, 0.0F, 0.0F);
        this.toeRightRight = new ModelRenderer(this, 92, 106);
        this.toeRightRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toeRightRight.addBox(-2.5F, 0.9F, -9.5F, 2, 2, 4, 0.0F);
        this.neck = new ModelRenderer(this, 189, 21);
        this.neck.setRotationPoint(0.0F, -27.9F, 3.2F);
        this.neck.addBox(-2.5F, -3.2F, -1.4F, 5, 5, 4, 0.0F);
        this.setRotateAngle(neck, 0.6829473363053812F, 0.0F, 0.0F);
        this.waistPlate1 = new ModelRenderer(this, 48, 44);
        this.waistPlate1.setRotationPoint(0.0F, 19.0F, -5.1F);
        this.waistPlate1.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 1, 0.0F);
        this.setRotateAngle(waistPlate1, 0.0F, -0.0F, 0.7853981633974483F);
        this.waistPlate2 = new ModelRenderer(this, 62, 44);
        this.waistPlate2.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.waistPlate2.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
        this.setRotateAngle(waistPlate2, 0.0F, -0.0F, -0.7853981633974483F);
        this.arcRight4 = new ModelRenderer(this, 50, 108);
        this.arcRight4.setRotationPoint(0.1F, 12.8F, 0.3F);
        this.arcRight4.addBox(0.0F, 0.0F, 0.0F, 3, 12, 1, 0.0F);
        this.setRotateAngle(arcRight4, -1.1838568316277536F, -0.0F, 0.045553093477052F);
        this.lFist = new ModelRenderer(this, 134, 110);
        this.lFist.mirror = true;
        this.lFist.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.lFist.addBox(-3.1F, -2.5F, -4.1F, 5, 5, 5, 0.0F);
        this.setRotateAngle(lFist, 0.0F, 0.40980330836826856F, 0.0F);
        this.chin = new ModelRenderer(this, 178, 11);
        this.chin.setRotationPoint(0.0F, 1.8F, -0.3F);
        this.chin.addBox(-1.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(chin, -0.22759093446006054F, 0.0F, 0.0F);
        this.legRight5 = new ModelRenderer(this, 92, 65);
        this.legRight5.setRotationPoint(0.0F, 0.6F, 2.8F);
        this.legRight5.addBox(-2.48F, 0.0F, -2.5F, 5, 14, 5, 0.0F);
        this.setRotateAngle(legRight5, -0.136659280431156F, 0.091106186954104F, 0.0F);
        this.headTendrilBundle5 = new ModelRenderer(this, 213, 44);
        this.headTendrilBundle5.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.headTendrilBundle5.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.footLeft = new ModelRenderer(this, 92, 86);
        this.footLeft.mirror = true;
        this.footLeft.setRotationPoint(0.0F, 12.1F, 0.2F);
        this.footLeft.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 8, 0.0F);
        this.setRotateAngle(footLeft, 0.22759093446006054F, -0.091106186954104F, 0.0F);
        this.legLeft4 = new ModelRenderer(this, 92, 53);
        this.legLeft4.mirror = true;
        this.legLeft4.setRotationPoint(0.0F, -0.9F, 7.0F);
        this.legLeft4.addBox(-3.0F, -2.5F, 0.0F, 6, 5, 5, 0.0F);
        this.setRotateAngle(legLeft4, -0.27314402793711257F, 0.0F, 0.0F);
        this.rSkullSlant2 = new ModelRenderer(this, 200, 5);
        this.rSkullSlant2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rSkullSlant2.addBox(-3.4F, -3.3F, 0.2F, 2, 4, 1, 0.0F);
        this.setRotateAngle(rSkullSlant2, -0.7740535232594852F, 0.0F, 0.0F);
        this.armRight1 = new ModelRenderer(this, 126, 1);
        this.armRight1.setRotationPoint(-13.0F, 0.0F, 5.1F);
        this.armRight1.addBox(-4.0F, 0.0F, -3.0F, 5, 13, 5, 0.0F);
        this.setRotateAngle(armRight1, 0.18203784098300857F, -0.0F, 0.17453292519943295F);
        this.chestLower = new ModelRenderer(this, 0, 43);
        this.chestLower.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chestLower.addBox(-7.0F, 8.2F, 0.0F, 14, 5, 9, 0.0F);
        this.legLeft3 = new ModelRenderer(this, 92, 36);
        this.legLeft3.mirror = true;
        this.legLeft3.setRotationPoint(0.7F, 0.2F, 1.0F);
        this.legLeft3.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F);
        this.setRotateAngle(legLeft3, 0.18203784098300857F, 0.0F, 0.0F);
        this.arcRight3_1 = new ModelRenderer(this, 50, 91);
        this.arcRight3_1.mirror = true;
        this.arcRight3_1.setRotationPoint(0.0F, 11.4F, 0.7F);
        this.arcRight3_1.addBox(-3.0F, 0.0F, 0.0F, 3, 14, 1, 0.0F);
        this.setRotateAngle(arcRight3_1, -1.3203415791337103F, -0.0F, 0.0F);
        this.chestPlate = new ModelRenderer(this, 48, 52);
        this.chestPlate.setRotationPoint(0.0F, 9.8F, -3.0F);
        this.chestPlate.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 1, 0.0F);
        this.setRotateAngle(chestPlate, 0.38781215979314F, -0.3605850234620285F, 0.737750674818003F);
        this.headTendrilBundle2 = new ModelRenderer(this, 210, 13);
        this.headTendrilBundle2.setRotationPoint(0.0F, 0.3F, 3.3F);
        this.headTendrilBundle2.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(headTendrilBundle2, -0.5009094953223726F, 0.0F, 0.0F);
        this.footLeftUpper = new ModelRenderer(this, 92, 99);
        this.footLeftUpper.mirror = true;
        this.footLeftUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.footLeftUpper.addBox(-2.0F, -0.9F, -5.0F, 4, 2, 4, 0.0F);
        this.waist = new ModelRenderer(this, 0, 73);
        this.waist.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.waist.addBox(-7.0F, 17.5F, -4.0F, 14, 5, 9, 0.0F);
        this.chestUpper = new ModelRenderer(this, 0, 18);
        this.chestUpper.setRotationPoint(0.0F, -23.3F, 0.0F);
        this.chestUpper.addBox(-12.0F, 0.0F, -3.0F, 24, 9, 14, 0.0F);
        this.rSkullSlant = new ModelRenderer(this, 191, 6);
        this.rSkullSlant.mirror = true;
        this.rSkullSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rSkullSlant.addBox(-3.5F, -0.5F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(rSkullSlant, -0.36425021489121656F, 0.0F, -0.40980330836826856F);
        this.footRightUpper = new ModelRenderer(this, 92, 99);
        this.footRightUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.footRightUpper.addBox(-2.0F, -0.9F, -5.0F, 4, 2, 4, 0.0F);
        this.armLeft1 = new ModelRenderer(this, 126, 0);
        this.armLeft1.mirror = true;
        this.armLeft1.setRotationPoint(14.0F, 0.0F, 5.1F);
        this.armLeft1.addBox(-2.0F, 0.0F, -2.0F, 5, 13, 5, 0.0F);
        this.setRotateAngle(armLeft1, 0.18203784098300857F, -0.0F, -0.17453292519943295F);
        this.headTendrilBundle = new ModelRenderer(this, 210, 2);
        this.headTendrilBundle.setRotationPoint(0.0F, -1.6F, 1.8F);
        this.headTendrilBundle.addBox(-1.5F, -0.9F, -0.7F, 3, 3, 5, 0.0F);
        this.setRotateAngle(headTendrilBundle, 0.091106186954104F, 0.0F, 0.0F);
        this.lSkullSlant = new ModelRenderer(this, 191, 6);
        this.lSkullSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lSkullSlant.addBox(1.5F, -0.5F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(lSkullSlant, -0.36425021489121656F, 0.0F, 0.40980330836826856F);
        this.legRight2 = new ModelRenderer(this, 92, 23);
        this.legRight2.setRotationPoint(0.0F, 14.7F, 0.0F);
        this.legRight2.addBox(-3.5F, -3.0F, -3.0F, 7, 6, 6, 0.0F);
        this.setRotateAngle(legRight2, 0.5235987755982988F, -0.136659280431156F, -0.045553093477052F);
        this.legLeft1 = new ModelRenderer(this, 92, 0);
        this.legLeft1.mirror = true;
        this.legLeft1.setRotationPoint(6.0F, 21.0F, 0.0F);
        this.legLeft1.addBox(-3.0F, -2.0F, -3.0F, 6, 15, 6, 0.0F);
        this.setRotateAngle(legLeft1, -0.5235987755982988F, -0.136659280431156F, 0.0F);
        this.bladeLeft1 = new ModelRenderer(this, 126, 40);
        this.bladeLeft1.mirror = true;
        this.bladeLeft1.setRotationPoint(3.0F, 0.0F, -8.1F);
        this.bladeLeft1.addBox(0.0F, -2.0F, -3.5F, 2, 4, 7, 0.0F);
        this.arcRight3 = new ModelRenderer(this, 50, 91);
        this.arcRight3.setRotationPoint(0.0F, 11.4F, 0.7F);
        this.arcRight3.addBox(0.0F, 0.0F, 0.0F, 3, 14, 1, 0.0F);
        this.setRotateAngle(arcRight3, -1.3203415791337103F, -0.0F, 0.0F);
        this.arcRight1_1 = new ModelRenderer(this, 50, 60);
        this.arcRight1_1.mirror = true;
        this.arcRight1_1.setRotationPoint(12.0F, -29.0F, -6.0F);
        this.arcRight1_1.addBox(-3.0F, 0.0F, 0.0F, 3, 13, 1, 0.0F);
        this.setRotateAngle(arcRight1_1, 0.5235987755982988F, -0.0F, 0.296705972839036F);
        this.bladeRight1 = new ModelRenderer(this, 126, 40);
        this.bladeRight1.setRotationPoint(-3.0F, 0.0F, -8.1F);
        this.bladeRight1.addBox(-2.0F, -2.0F, -3.5F, 2, 4, 7, 0.0F);
        this.bladeRight3 = new ModelRenderer(this, 126, 72);
        this.bladeRight3.setRotationPoint(-0.9F, 0.0F, -3.4F);
        this.bladeRight3.addBox(-0.5F, -1.5F, -12.0F, 1, 3, 12, 0.0F);
        this.arcRight5_1 = new ModelRenderer(this, 50, 122);
        this.arcRight5_1.mirror = true;
        this.arcRight5_1.setRotationPoint(-0.9F, 10.9F, -1.2F);
        this.arcRight5_1.addBox(-2.5F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(arcRight5_1, 0.20943951023931953F, -0.0F, -0.31869712141416456F);
        this.chestUpper.addChild(this.abdomen);
        this.footRight.addChild(this.toeRightLeft);
        this.bladeLeft1.addChild(this.bladeLeft3);
        this.legRight3.addChild(this.legRight4);
        this.rForearm.addChild(this.armRight2);
        this.bladeRight1.addChild(this.bladeRight2);
        this.head.addChild(this.headBack);
        this.neck.addChild(this.head);
        this.legLeft4.addChild(this.legLeft5);
        this.armLeft1.addChild(this.lForearm);
        this.legRight5.addChild(this.footRight);
        this.headTendrilBundle2.addChild(this.headTendrilBundle3);
        this.legRight2.addChild(this.legRight3);
        this.legLeft1.addChild(this.legLeft2);
        this.headTendrilBundle3.addChild(this.headTendrilBundle4);
        this.lForearm.addChild(this.armLeft2);
        this.chestUpper.addChild(this.shoulders);
        this.arcRight1.addChild(this.arcRight2);
        this.head.addChild(this.mouthIGuess);
        this.arcRight4.addChild(this.arcRight5);
        this.headTendrilBundle5.addChild(this.headTendrilBundle6);
        this.head.addChild(this.lSkullSlant2);
        this.head.addChild(this.headBack2);
        this.waist.addChild(this.legRight1);
        this.rForearm.addChild(this.rFist);
        this.footLeft.addChild(this.toeLeftRight);
        this.arcRight3_1.addChild(this.arcRight4_1);
        this.bladeLeft1.addChild(this.bladeLeft2);
        this.arcRight1_1.addChild(this.arcRight2_1);
        this.armRight1.addChild(this.rForearm);
        this.footLeft.addChild(this.toeLeftLeft);
        this.head.addChild(this.eyes);
        this.footRight.addChild(this.toeRightRight);
        this.waist.addChild(this.waistPlate1);
        this.waistPlate1.addChild(this.waistPlate2);
        this.arcRight3.addChild(this.arcRight4);
        this.lForearm.addChild(this.lFist);
        this.mouthIGuess.addChild(this.chin);
        this.legRight4.addChild(this.legRight5);
        this.headTendrilBundle4.addChild(this.headTendrilBundle5);
        this.legLeft5.addChild(this.footLeft);
        this.legLeft3.addChild(this.legLeft4);
        this.head.addChild(this.rSkullSlant2);
        this.shoulders.addChild(this.armRight1);
        this.chestUpper.addChild(this.chestLower);
        this.legLeft2.addChild(this.legLeft3);
        this.arcRight2_1.addChild(this.arcRight3_1);
        this.chestUpper.addChild(this.chestPlate);
        this.headTendrilBundle.addChild(this.headTendrilBundle2);
        this.footLeft.addChild(this.footLeftUpper);
        this.abdomen.addChild(this.waist);
        this.head.addChild(this.rSkullSlant);
        this.footRight.addChild(this.footRightUpper);
        this.shoulders.addChild(this.armLeft1);
        this.head.addChild(this.headTendrilBundle);
        this.head.addChild(this.lSkullSlant);
        this.legRight1.addChild(this.legRight2);
        this.waist.addChild(this.legLeft1);
        this.armLeft2.addChild(this.bladeLeft1);
        this.arcRight2.addChild(this.arcRight3);
        this.armRight2.addChild(this.bladeRight1);
        this.bladeRight1.addChild(this.bladeRight3);
        this.arcRight4_1.addChild(this.arcRight5_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    	super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f4, entity);
        this.arcRight1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.neck.offsetX, this.neck.offsetY, this.neck.offsetZ);
        GlStateManager.translate(this.neck.rotationPointX * f5, this.neck.rotationPointY * f5, this.neck.rotationPointZ * f5);
        GlStateManager.scale(1.5D, 1.5D, 1.5D);
        GlStateManager.translate(-this.neck.offsetX, -this.neck.offsetY, -this.neck.offsetZ);
        GlStateManager.translate(-this.neck.rotationPointX * f5, -this.neck.rotationPointY * f5, -this.neck.rotationPointZ * f5);
        this.neck.render(f5);
        GlStateManager.popMatrix();
        this.chestUpper.render(f5);
        this.arcRight1_1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
		// super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks,
		// netHeadYaw, headPitch, scaleFactor, entityIn);
		head.rotateAngleX = par5 * 0.017453292F + 5.5F;
	    head.rotateAngleY = par4 * 0.0017453292F;
		legLeft1.rotateAngleX = MathHelper.sin(par1 * 0.8662F) * 1 * par2 - 0.5F;
		legLeft2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1 * par2 + 0.5F;
		armLeft1.rotateAngleX = MathHelper.cos(par1 * 0.8662F + (float) Math.PI) * 0.5F * par2;
		legRight1.rotateAngleX = MathHelper.cos(par1 * 0.8662F) * 1 * par2 - 0.5F;
		legRight2.rotateAngleX = MathHelper.sin(par1 * 0.6662F) * 1 * par2 + 0.5F;
		armRight1.rotateAngleX = MathHelper.sin(par1 * 0.8662F + (float) Math.PI) * 0.5F * par2;
	}
}
