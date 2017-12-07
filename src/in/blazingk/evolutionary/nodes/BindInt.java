package in.blazingk.evolutionary.nodes;

import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public class BindInt implements Node {

	@Override
	public String getName() {
		return "Bind new int (to 0)";
	}

	@Override
	public Value execute(Context con) {
		con.set(con.count() + 1, new Value(0));
		return new Value(0);
	}

	
	
	
}
