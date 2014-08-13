/**
 * Copyright (C) Lambda-Innovation, 2013-2014
 * This code is open-source. Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer. 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 */
package cn.misaka.ability.client.render.entity;

import org.lwjgl.opengl.GL11;

import cn.liutils.api.client.util.RenderUtils;
import cn.misaka.ability.entity.fx.EntityArcFX;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;

/**
 * @author WeAthFolD
 *
 */
public class RenderArcAnim extends Render {
	
	int rate = 2;
	float halfHeight = 0.5F;
	float ratio = 5F;
	boolean disableLight = true;
	
	
	public RenderArcAnim setRate(int rt) {
		rate = rt;
		return this;
	}
	
	public RenderArcAnim setHalfHeight(float f) {
		halfHeight = f;
		return this;
	}
	
	public RenderArcAnim setRatio(float f) {
		ratio = f;
		return this;
	}
	
	public RenderArcAnim setDisableLight(boolean b) {
		disableLight = b;
		return this;
	}

	@Override
	public void doRender(Entity var1, double var2, double var4, double var6,
			float var8, float var9) {
		
		EntityArcFX arc = (EntityArcFX) var1;
		int frame = (var1.ticksExisted / rate) % arc.texture.length;
		halfHeight = .8F;
		rate = 2;
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor4f(1F, 1F, 1F, .8F);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glDisable(GL11.GL_CULL_FACE);
		if(disableLight)
			GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glPushMatrix(); {
			if(disableLight)
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
			RenderUtils.loadTexture(arc.texture[frame]);
			double len = ((EntityArcFX)var1).length;
			Vec3 v1 = RenderUtils.newV3(0, -halfHeight, 0),
				v2 = RenderUtils.newV3(0, halfHeight, 0),
				v3=	RenderUtils.newV3(len, halfHeight, 0),
				v4 = RenderUtils.newV3(len, -halfHeight, 0),
				v5 = RenderUtils.newV3(0, 0, -halfHeight),
				v6 = RenderUtils.newV3(0, 0, halfHeight),
				v7=	RenderUtils.newV3(len, 0, -halfHeight),
				v8 = RenderUtils.newV3(len, 0, -halfHeight);
			Tessellator t = Tessellator.instance;
			double ul = len / ratio / (2 * halfHeight);
			
			GL11.glTranslated(var2, var4, var6);
			GL11.glRotatef(var1.rotationYaw + 90F, 0F, -1F, 0F);
			GL11.glRotatef(var1.rotationPitch, 0F, 0F, -1F);
			
			t.startDrawingQuads();
			if(disableLight)
				t.setBrightness(15728880);
			RenderUtils.addVertex(v1, 0, 0);
			RenderUtils.addVertex(v2, 0, 1);
			RenderUtils.addVertex(v3, ul, 1);
			RenderUtils.addVertex(v4, ul, 0);
			
			RenderUtils.addVertex(v5, 0, 0);
			RenderUtils.addVertex(v6, 0, 1);
			RenderUtils.addVertex(v7, ul, 1);
			RenderUtils.addVertex(v8, ul, 0);
			t.draw();
		} GL11.glPopMatrix();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glEnable(GL11.GL_CULL_FACE);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return null;
	}

}
