package ga.scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * hydraliskSpike - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelHydraliskSpike extends ModelBase {
    public ModelRenderer spike01;
    public ModelRenderer spike02;
    public ModelRenderer flange01;
    public ModelRenderer spike03;
    public ModelRenderer flange02;
    public ModelRenderer flange09;
    public ModelRenderer flange03;
    public ModelRenderer flange05;
    public ModelRenderer flange06;
    public ModelRenderer flange07;
    public ModelRenderer flange08;
    public ModelRenderer flange04;
    public ModelRenderer flange10;
    public ModelRenderer flange11;
    public ModelRenderer flange12;

    public ModelHydraliskSpike() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.flange05 = new ModelRenderer(this, 0, 5);
        this.flange05.setRotationPoint(0.0F, 0.2F, -3.6F);
        this.flange05.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange05, -0.31869712141416456F, 0.31869712141416456F, 0.7853981633974483F);
        this.flange12 = new ModelRenderer(this, 0, 5);
        this.flange12.setRotationPoint(0.0F, 0.2F, 4.4F);
        this.flange12.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange12, -0.31869712141416456F, 0.31869712141416456F, 0.7853981633974483F);
        this.flange11 = new ModelRenderer(this, 0, 0);
        this.flange11.setRotationPoint(0.0F, -0.1F, 4.6F);
        this.flange11.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange11, 0.31869712141416456F, -0.31869712141416456F, 0.7853981633974483F);
        this.flange04 = new ModelRenderer(this, 0, 0);
        this.flange04.setRotationPoint(0.0F, -0.1F, 1.8F);
        this.flange04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange04, 0.31869712141416456F, -0.31869712141416456F, 0.7853981633974483F);
        this.flange06 = new ModelRenderer(this, 0, 5);
        this.flange06.setRotationPoint(0.0F, 0.2F, -1.6F);
        this.flange06.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange06, -0.31869712141416456F, 0.31869712141416456F, 0.7853981633974483F);
        this.spike02 = new ModelRenderer(this, 0, 11);
        this.spike02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike02.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F);
        this.flange10 = new ModelRenderer(this, 0, 5);
        this.flange10.setRotationPoint(0.0F, 0.2F, 3.3F);
        this.flange10.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange10, -0.31869712141416456F, 0.31869712141416456F, 0.7853981633974483F);
        this.spike03 = new ModelRenderer(this, 26, 0);
        this.spike03.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike03.addBox(-0.5F, -0.5F, -5.4F, 1, 1, 13, 0.0F);
        this.flange09 = new ModelRenderer(this, 0, 0);
        this.flange09.setRotationPoint(0.0F, -0.1F, 3.3F);
        this.flange09.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange09, 0.31869712141416456F, -0.31869712141416456F, 0.7853981633974483F);
        this.flange02 = new ModelRenderer(this, 0, 0);
        this.flange02.setRotationPoint(0.0F, 0.1F, -2.1F);
        this.flange02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange02, 0.31869712141416456F, -0.31869712141416456F, 0.7853981633974483F);
        this.spike01 = new ModelRenderer(this, 9, 0);
        this.spike01.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike01.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 9, 0.0F);
        this.flange03 = new ModelRenderer(this, 0, 0);
        this.flange03.setRotationPoint(0.0F, -0.3F, 0.1F);
        this.flange03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange03, 0.31869712141416456F, -0.31869712141416456F, 0.7853981633974483F);
        this.flange01 = new ModelRenderer(this, 0, 0);
        this.flange01.setRotationPoint(0.0F, -0.1F, -3.6F);
        this.flange01.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange01, 0.31869712141416456F, -0.31869712141416456F, 0.7853981633974483F);
        this.flange07 = new ModelRenderer(this, 0, 5);
        this.flange07.setRotationPoint(0.0F, 0.4F, 0.1F);
        this.flange07.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange07, -0.31869712141416456F, 0.31869712141416456F, 0.7853981633974483F);
        this.flange08 = new ModelRenderer(this, 0, 5);
        this.flange08.setRotationPoint(0.0F, 0.2F, 1.9F);
        this.flange08.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(flange08, -0.31869712141416456F, 0.31869712141416456F, 0.7853981633974483F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange05.offsetX, this.flange05.offsetY, this.flange05.offsetZ);
        GlStateManager.translate(this.flange05.rotationPointX * f5, this.flange05.rotationPointY * f5, this.flange05.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 0.7D, 0.7D);
        GlStateManager.translate(-this.flange05.offsetX, -this.flange05.offsetY, -this.flange05.offsetZ);
        GlStateManager.translate(-this.flange05.rotationPointX * f5, -this.flange05.rotationPointY * f5, -this.flange05.rotationPointZ * f5);
        this.flange05.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange12.offsetX, this.flange12.offsetY, this.flange12.offsetZ);
        GlStateManager.translate(this.flange12.rotationPointX * f5, this.flange12.rotationPointY * f5, this.flange12.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.flange12.offsetX, -this.flange12.offsetY, -this.flange12.offsetZ);
        GlStateManager.translate(-this.flange12.rotationPointX * f5, -this.flange12.rotationPointY * f5, -this.flange12.rotationPointZ * f5);
        this.flange12.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange11.offsetX, this.flange11.offsetY, this.flange11.offsetZ);
        GlStateManager.translate(this.flange11.rotationPointX * f5, this.flange11.rotationPointY * f5, this.flange11.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.flange11.offsetX, -this.flange11.offsetY, -this.flange11.offsetZ);
        GlStateManager.translate(-this.flange11.rotationPointX * f5, -this.flange11.rotationPointY * f5, -this.flange11.rotationPointZ * f5);
        this.flange11.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange04.offsetX, this.flange04.offsetY, this.flange04.offsetZ);
        GlStateManager.translate(this.flange04.rotationPointX * f5, this.flange04.rotationPointY * f5, this.flange04.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.flange04.offsetX, -this.flange04.offsetY, -this.flange04.offsetZ);
        GlStateManager.translate(-this.flange04.rotationPointX * f5, -this.flange04.rotationPointY * f5, -this.flange04.rotationPointZ * f5);
        this.flange04.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange06.offsetX, this.flange06.offsetY, this.flange06.offsetZ);
        GlStateManager.translate(this.flange06.rotationPointX * f5, this.flange06.rotationPointY * f5, this.flange06.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 0.7D, 0.7D);
        GlStateManager.translate(-this.flange06.offsetX, -this.flange06.offsetY, -this.flange06.offsetZ);
        GlStateManager.translate(-this.flange06.rotationPointX * f5, -this.flange06.rotationPointY * f5, -this.flange06.rotationPointZ * f5);
        this.flange06.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.spike02.offsetX, this.spike02.offsetY, this.spike02.offsetZ);
        GlStateManager.translate(this.spike02.rotationPointX * f5, this.spike02.rotationPointY * f5, this.spike02.rotationPointZ * f5);
        GlStateManager.scale(1.3D, 1.3D, 1.0D);
        GlStateManager.translate(-this.spike02.offsetX, -this.spike02.offsetY, -this.spike02.offsetZ);
        GlStateManager.translate(-this.spike02.rotationPointX * f5, -this.spike02.rotationPointY * f5, -this.spike02.rotationPointZ * f5);
        this.spike02.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange10.offsetX, this.flange10.offsetY, this.flange10.offsetZ);
        GlStateManager.translate(this.flange10.rotationPointX * f5, this.flange10.rotationPointY * f5, this.flange10.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 0.5D, 0.5D);
        GlStateManager.translate(-this.flange10.offsetX, -this.flange10.offsetY, -this.flange10.offsetZ);
        GlStateManager.translate(-this.flange10.rotationPointX * f5, -this.flange10.rotationPointY * f5, -this.flange10.rotationPointZ * f5);
        this.flange10.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.spike03.offsetX, this.spike03.offsetY, this.spike03.offsetZ);
        GlStateManager.translate(this.spike03.rotationPointX * f5, this.spike03.rotationPointY * f5, this.spike03.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 0.5D, 1.1D);
        GlStateManager.translate(-this.spike03.offsetX, -this.spike03.offsetY, -this.spike03.offsetZ);
        GlStateManager.translate(-this.spike03.rotationPointX * f5, -this.spike03.rotationPointY * f5, -this.spike03.rotationPointZ * f5);
        this.spike03.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange09.offsetX, this.flange09.offsetY, this.flange09.offsetZ);
        GlStateManager.translate(this.flange09.rotationPointX * f5, this.flange09.rotationPointY * f5, this.flange09.rotationPointZ * f5);
        GlStateManager.scale(0.6D, 0.6D, 0.6D);
        GlStateManager.translate(-this.flange09.offsetX, -this.flange09.offsetY, -this.flange09.offsetZ);
        GlStateManager.translate(-this.flange09.rotationPointX * f5, -this.flange09.rotationPointY * f5, -this.flange09.rotationPointZ * f5);
        this.flange09.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange02.offsetX, this.flange02.offsetY, this.flange02.offsetZ);
        GlStateManager.translate(this.flange02.rotationPointX * f5, this.flange02.rotationPointY * f5, this.flange02.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.flange02.offsetX, -this.flange02.offsetY, -this.flange02.offsetZ);
        GlStateManager.translate(-this.flange02.rotationPointX * f5, -this.flange02.rotationPointY * f5, -this.flange02.rotationPointZ * f5);
        this.flange02.render(f5);
        GlStateManager.popMatrix();
        this.spike01.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange03.offsetX, this.flange03.offsetY, this.flange03.offsetZ);
        GlStateManager.translate(this.flange03.rotationPointX * f5, this.flange03.rotationPointY * f5, this.flange03.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 0.9D, 0.8D);
        GlStateManager.translate(-this.flange03.offsetX, -this.flange03.offsetY, -this.flange03.offsetZ);
        GlStateManager.translate(-this.flange03.rotationPointX * f5, -this.flange03.rotationPointY * f5, -this.flange03.rotationPointZ * f5);
        this.flange03.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange01.offsetX, this.flange01.offsetY, this.flange01.offsetZ);
        GlStateManager.translate(this.flange01.rotationPointX * f5, this.flange01.rotationPointY * f5, this.flange01.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.flange01.offsetX, -this.flange01.offsetY, -this.flange01.offsetZ);
        GlStateManager.translate(-this.flange01.rotationPointX * f5, -this.flange01.rotationPointY * f5, -this.flange01.rotationPointZ * f5);
        this.flange01.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange07.offsetX, this.flange07.offsetY, this.flange07.offsetZ);
        GlStateManager.translate(this.flange07.rotationPointX * f5, this.flange07.rotationPointY * f5, this.flange07.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.flange07.offsetX, -this.flange07.offsetY, -this.flange07.offsetZ);
        GlStateManager.translate(-this.flange07.rotationPointX * f5, -this.flange07.rotationPointY * f5, -this.flange07.rotationPointZ * f5);
        this.flange07.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.flange08.offsetX, this.flange08.offsetY, this.flange08.offsetZ);
        GlStateManager.translate(this.flange08.rotationPointX * f5, this.flange08.rotationPointY * f5, this.flange08.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 0.7D, 0.7D);
        GlStateManager.translate(-this.flange08.offsetX, -this.flange08.offsetY, -this.flange08.offsetZ);
        GlStateManager.translate(-this.flange08.rotationPointX * f5, -this.flange08.rotationPointY * f5, -this.flange08.rotationPointZ * f5);
        this.flange08.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
