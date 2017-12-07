package in.blazingk.evolutionary.nodes;

import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public class BlockNode implements Node {

	Node[] nodes;
	public BlockNode(Node... nodes){
		this.nodes = nodes;
	}
	
	@Override
	public String getName() {
		return "Block";
	}

	@Override
	public Value execute(Context con) {
		Context blockContext = new Context(con);
		for (int i = 0; i < nodes.length - 1; i++){
			nodes[i].execute(blockContext);
		}
		return nodes[nodes.length - 1].execute(blockContext);
	}

}
