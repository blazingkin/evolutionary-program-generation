package in.blazingk.evolutionary.nodes;

import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public class ConstIntNode implements Node {

	int value;
	public ConstIntNode(int value){
		this.value = value;
	}
	@Override
	public String getName() {
		return value+"";
	}
	@Override
	public Value execute(Context con) {
		return new Value(value);
	}
	
	
}
