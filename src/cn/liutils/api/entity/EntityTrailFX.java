package cn.liutils.api.entity;

import java.util.LinkedList;


import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * Entity尾迹渲染类。
 * 
 * @author WeAthFolD
 * 
 */
public class EntityTrailFX extends Entity {

	private LinkedList<SamplePoint> samples = new LinkedList();
	private Entity linkedEntity;
	private String texNormal, texEnd;
	private boolean doesRenderEnd, hasLight;
	private int decayTime, sampleFreq;
	private double width;

	public EntityTrailFX(World par1World, Entity par2LinkedEntity) {
		super(par1World);
		this.linkedEntity = par2LinkedEntity;
		texNormal = texEnd = "";
		doesRenderEnd = false;
		decayTime = 20;
		sampleFreq = 2;
		this.posX = linkedEntity.posX;
		this.posY = linkedEntity.posY;
		this.posZ = linkedEntity.posZ;
		this.width = 0.5;
		this.ignoreFrustumCheck = true;
	}
	
	public EntityTrailFX setHasLight(boolean b) {
		this.hasLight = b;
		return this;
	}
	
	public boolean getHasLight() {
		return hasLight;
	}

	public EntityTrailFX setTrailWidth(double w) {
		width = w;
		return this;
	}

	public EntityTrailFX setTextures(String n, String e) {
		texNormal = n;
		texEnd = e;
		return this;
	}

	public EntityTrailFX setDoesRenderEnd(boolean b) {
		doesRenderEnd = b;
		return this;
	}

	public EntityTrailFX setDecayTime(int time) {
		decayTime = time;
		return this;
	}

	public EntityTrailFX setSampleFreq(int freq) {
		sampleFreq = freq;
		return this;
	}

	@Override
	protected void entityInit() {
	}

	@Override
	public void onUpdate() {
		if (posX == 0 && posY == 0 && posZ == 0) {
			posX = linkedEntity.posX;
			posY = linkedEntity.posY;
			posZ = linkedEntity.posZ;
		}

		if (this.ticksExisted % sampleFreq == 0) {
			if (ticksExisted > 2 * decayTime)
				samples.removeFirst();
			if (linkedEntity.isDead) {
				if (samples.size() <= 0)
					this.setDead();
				return;
			}
			samples.offer(new SamplePoint(linkedEntity.posX - posX,
					linkedEntity.posY - posY, linkedEntity.posZ - posZ,
					ticksExisted));
		}
	}

	public String getTexNormal() {
		return texNormal;
	}

	public String getTexEnd() {
		return texEnd;
	}

	public double getTrailWidth() {
		return width;
	}

	public int getDecayTime() {
		return this.decayTime;
	}

	public Boolean doesRenderEnd() {
		return doesRenderEnd;
	}

	public LinkedList<SamplePoint> getSamplePoints() {
		return (LinkedList<SamplePoint>) samples.clone();
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
	}

}