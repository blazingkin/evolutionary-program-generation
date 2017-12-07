package in.blazingk.evolutionary.nodes;

import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public class BindInt implements Node {

	int which;
	public BindInt(int which){
		this.which = which;
	}
	
	@Override
	public String getName() {
		return "Bind new int ("+which+") (to 0)";
	}

	@Override
	public Value execute(Context con) {
		con.set(which, new Value(0));
		return new Value(0);
	}

	
	
	
}
