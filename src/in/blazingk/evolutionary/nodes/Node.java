package in.blazingk.evolutionary.nodes;

import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public interface Node {

	public String getName();
	public Value execute(Context con);
	
}
