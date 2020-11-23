package net.mlavan303.electricalengineeringmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {

	public static final Block OR_GATE = register("or_gate", new OrGate(AbstractBlock.Properties.create(Material.ROCK)));

	private static Block register(String string, OrGate orGate) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
