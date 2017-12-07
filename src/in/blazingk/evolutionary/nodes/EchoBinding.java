package in.blazingk.evolutionary.nodes;

import in.blazingk.evolutionary.IOHandler;
import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public class EchoBinding implements Node {

	int which;
	public EchoBinding(int which){
		this.which = which;
	}
	
	@Override
	public String getName() {
		return "Echo binding ("+which+")";
	}

	@Override
	public Value execute(Context con) {
		try{
			Value v = con.get(which);
			IOHandler.logValue(v);
			return v;
		}catch(Exception e){
			return Value.None;
		}
	}

	
	
	
}
