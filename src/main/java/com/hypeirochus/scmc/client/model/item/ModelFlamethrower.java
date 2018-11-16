package com.hypeirochus.scmc.client.model.item;

import com.hypeirochus.api.client.render.model.Model;
import com.hypeirochus.scmc.Starcraft;
import com.ocelot.api.utils.ModelUtils;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Flame Thrower - SCMCDevTeam Created using Tabula 5.1.0
 */
public class ModelFlamethrower extends Model
{

	public static final ResourceLocation TEXTURE = new ResourceLocation(Starcraft.MOD_ID, "textures/models/flamethrower.png");

	public ModelRenderer main1;
	public ModelRenderer main2;
	public ModelRenderer main3;
	public ModelRenderer main4;
	public ModelRenderer main5;
	public ModelRenderer main6;
	public ModelRenderer main7;
	public ModelRenderer main8;
	public ModelRenderer main9;
	public ModelRenderer main12;
	public ModelRenderer main14;
	public ModelRenderer main15;
	public ModelRenderer main16;
	public ModelRenderer main17;
	public ModelRenderer main18;
	public ModelRenderer main19;
	public ModelRenderer main20;
	public ModelRenderer main21;
	public ModelRenderer main22;
	public ModelRenderer main23;
	public ModelRenderer main24;
	public ModelRenderer main25;
	public ModelRenderer main26;
	public ModelRenderer main27;
	public ModelRenderer main28;
	public ModelRenderer main29;
	public ModelRenderer main30;
	public ModelRenderer main31;

	public ModelFlamethrower()
	{
		ModelUtils.enableBackCull();
		this.textureWidth = 200;
		this.textureHeight = 200;
		this.main14 = new ModelRenderer(this, 85, 30);
		this.main14.setRotationPoint(-11.5F, 7.5F, -3.0F);
		this.main14.addBox(0.0F, 0.0F, 0.0F, 8, 5, 1, 0.0F);
		this.main19 = new ModelRenderer(this, 130, 20);
		this.main19.setRotationPoint(-9.5F, 8.5F, 3.5F);
		this.main19.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
		this.main2 = new ModelRenderer(this, 0, 50);
		this.main2.setRotationPoint(-22.0F, 10.0F, -2.0F);
		this.main2.addBox(0.0F, 0.0F, 0.0F, 7, 2, 5, 0.0F);
		this.setRotation(main2, 0.0F, 0.0F, -0.6373942428283291F);
		this.main29 = new ModelRenderer(this, 40, 50);
		this.main29.setRotationPoint(-16.0F, 15.0F, -1.0F);
		this.main29.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotation(main29, 0.0F, 0.0F, -0.41887902047863906F);
		this.main5 = new ModelRenderer(this, 25, 64);
		this.main5.setRotationPoint(-16.5F, 5.85F, -2.0F);
		this.main5.addBox(0.0F, 0.0F, 0.0F, 16, 4, 5, 0.0F);
		this.main22 = new ModelRenderer(this, 0, 12);
		this.main22.setRotationPoint(-11.5F, 15.0F, -7.5F);
		this.main22.addBox(0.0F, 0.0F, 0.0F, 8, 4, 4, 0.0F);
		this.main17 = new ModelRenderer(this, 50, 10);
		this.main17.setRotationPoint(-3.5F, 7.5F, -3.0F);
		this.main17.addBox(0.0F, 0.0F, 0.0F, 8, 5, 1, 0.0F);
		this.setRotation(main17, 0.0F, 0.0F, 0.6981317007977318F);
		this.main8 = new ModelRenderer(this, 150, 40);
		this.main8.setRotationPoint(12.0F, 8.6F, -1.0F);
		this.main8.addBox(0.0F, 0.0F, 0.0F, 11, 3, 3, 0.0F);
		this.main4 = new ModelRenderer(this, 0, 20);
		this.main4.setRotationPoint(-19.0F, 8.0F, -2.0F);
		this.main4.addBox(0.0F, 0.0F, 0.0F, 31, 4, 5, 0.0F);
		this.main15 = new ModelRenderer(this, 85, 15);
		this.main15.setRotationPoint(-11.5F, 7.5F, 3.0F);
		this.main15.addBox(0.0F, 0.0F, 0.0F, 8, 5, 1, 0.0F);
		this.main16 = new ModelRenderer(this, 85, 0);
		this.main16.setRotationPoint(-3.5F, 7.5F, 3.0F);
		this.main16.addBox(0.0F, 0.0F, 0.0F, 8, 5, 1, 0.0F);
		this.setRotation(main16, 0.0F, 0.0F, 0.6981317007977318F);
		this.main27 = new ModelRenderer(this, 5, 0);
		this.main27.setRotationPoint(-11.4F, 7.1F, 3.0F);
		this.main27.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
		this.setRotation(main27, 0.0F, 0.0F, 0.3665191429188092F);
		this.main31 = new ModelRenderer(this, 55, 50);
		this.main31.setRotationPoint(-17.5F, 13.5F, -2.0F);
		this.main31.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
		this.setRotation(main31, 0.0F, 0.0F, 0.41887902047863906F);
		this.main6 = new ModelRenderer(this, 70, 56);
		this.main6.setRotationPoint(-13.5F, 12.5F, -3.0F);
		this.main6.addBox(0.0F, 0.0F, 0.0F, 28, 6, 7, 0.0F);
		this.main9 = new ModelRenderer(this, 90, 40);
		this.main9.setRotationPoint(9.6F, 17.5F, -1.0F);
		this.main9.addBox(0.0F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
		this.main1 = new ModelRenderer(this, 0, 60);
		this.main1.setRotationPoint(-22.0F, 12.0F, -2.0F);
		this.main1.addBox(0.0F, 0.0F, 0.0F, 5, 11, 5, 0.0F);
		this.main3 = new ModelRenderer(this, 0, 36);
		this.main3.setRotationPoint(-22.0F, 10.0F, -2.0F);
		this.main3.addBox(0.0F, 0.0F, 0.0F, 34, 4, 5, 0.0F);
		this.main20 = new ModelRenderer(this, 150, 0);
		this.main20.setRotationPoint(-11.5F, 7.0F, -7.5F);
		this.main20.addBox(0.0F, 0.0F, 0.0F, 8, 4, 4, 0.0F);
		this.main7 = new ModelRenderer(this, 150, 60);
		this.main7.setRotationPoint(-0.5F, 5.8F, -2.0F);
		this.main7.addBox(0.0F, 0.0F, 0.0F, 5, 3, 5, 0.0F);
		this.setRotation(main7, 0.0F, 0.0F, 0.5462880558742251F);
		this.main24 = new ModelRenderer(this, 36, 0);
		this.main24.setRotationPoint(-6.0F, 11.5F, -6.5F);
		this.main24.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		this.main26 = new ModelRenderer(this, 20, 0);
		this.main26.setRotationPoint(-11.4F, 7.1F, -3.0F);
		this.main26.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
		this.setRotation(main26, 0.0F, 0.0F, 0.3665191429188092F);
		this.main12 = new ModelRenderer(this, 110, 10);
		this.main12.setRotationPoint(20.0F, 7.5F, -2.0F);
		this.main12.addBox(0.0F, 0.0F, 0.0F, 6, 5, 5, 0.0F);
		this.main28 = new ModelRenderer(this, 30, 50);
		this.main28.setRotationPoint(-16.0F, 13.0F, -1.0F);
		this.main28.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
		this.main23 = new ModelRenderer(this, 48, 0);
		this.main23.setRotationPoint(-11.5F, 14.5F, -7.0F);
		this.main23.addBox(0.0F, 0.0F, 0.0F, 8, 5, 3, 0.0F);
		this.main25 = new ModelRenderer(this, 25, 0);
		this.main25.setRotationPoint(-10.0F, 11.5F, -6.5F);
		this.main25.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		this.main21 = new ModelRenderer(this, 150, 20);
		this.main21.setRotationPoint(-11.5F, 6.5F, -7.0F);
		this.main21.addBox(0.0F, 0.0F, 0.0F, 8, 5, 3, 0.0F);
		this.main18 = new ModelRenderer(this, 130, 0);
		this.main18.setRotationPoint(-9.5F, 8.5F, -4.5F);
		this.main18.addBox(0.0F, 0.0F, 0.0F, 4, 9, 2, 0.0F);
		this.main30 = new ModelRenderer(this, 40, 50);
		this.main30.setRotationPoint(-14.0F, 14.0F, -2.0F);
		this.main30.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
		this.setRotation(main30, 0.0F, 0.0F, -0.41887902047863906F);
		ModelUtils.disableCull();
	}

	@Override
	public void render(Entity entity, float swing, float swingPrev, float idle, float headYaw, float headPitch, float scale)
	{
		this.main14.render(scale);
		this.main19.render(scale);
		this.main2.render(scale);
		this.main29.render(scale);
		this.main5.render(scale);
		this.main22.render(scale);
		this.main17.render(scale);
		this.main8.render(scale);
		this.main4.render(scale);
		this.main15.render(scale);
		this.main16.render(scale);
		this.main27.render(scale);
		this.main31.render(scale);
		this.main6.render(scale);
		this.main9.render(scale);
		this.main1.render(scale);
		this.main3.render(scale);
		this.main20.render(scale);
		this.main7.render(scale);
		this.main24.render(scale);
		this.main26.render(scale);
		this.main12.render(scale);
		this.main28.render(scale);
		this.main23.render(scale);
		this.main25.render(scale);
		this.main21.render(scale);
		this.main18.render(scale);
		this.main30.render(scale);
	}
}