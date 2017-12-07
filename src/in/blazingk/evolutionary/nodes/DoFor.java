package in.blazingk.evolutionary.nodes;

import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public class DoFor implements Node {

	Node block;
	int numLoops;
	public DoFor(Node block, int howManyTimes){
		this.block = block;
		numLoops = howManyTimes;
	}
	
	@Override
	public String getName() {
		return "DoFor ("+numLoops+")";
	}

	@Override
	public Value execute(Context con) {
		Context blockCon = new Context(con);
		for (int i = 0; i < numLoops - 1; i++){
			block.execute(blockCon);
		}
		return block.execute(blockCon);
	}

	
	
	
}
