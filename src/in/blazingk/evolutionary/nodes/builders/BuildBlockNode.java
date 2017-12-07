package in.blazingk.evolutionary.nodes.builders;

import java.util.Random;

import in.blazingk.evolutionary.Settings;
import in.blazingk.evolutionary.nodes.BlockNode;
import in.blazingk.evolutionary.nodes.Node;
import in.blazingk.evolutionary.strategies.Strategy;

public class BuildBlockNode implements NodeBuilder {

	@Override
	public Node build(Strategy s, Random r) {
		int length = r.nextInt(Settings.maxBlockLength);
		Node[] instr = new Node[length];
		for (int i = 0; i < length; i++){
			instr[i] = Builder.Generic.builder.build(s, r);
		}
		return new BlockNode(instr);
	}

}
