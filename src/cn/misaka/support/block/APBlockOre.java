package cn.misaka.support.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cn.misaka.core.AcademyCraft;


/*
 * 方便写矿物在这里搞一个
 */
public class APBlockOre extends Block{
	
	String BName;
	public APBlockOre(String Blockname,int HarvestLevel){
		super(Material.rock);
		setCreativeTab(AcademyCraft.getModTabs());
		this.setHarvestLevel("pickaxe", HarvestLevel);
		setHardness(4.0F);
		setBlockName(Blockname);
		setBlockTextureName("academy:" + Blockname);
		setStepSound(Block.soundTypePiston);
		BName = Blockname;
		
	}
	
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune){
		return getDrop(this, BName);
	}

	
	public Item getDrop(Block block, String blockname){
		//暂时用不到就不写了
		return Item.getItemFromBlock(block);
	}
}
