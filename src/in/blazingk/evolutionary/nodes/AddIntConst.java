package in.blazingk.evolutionary.nodes;

import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Type;
import in.blazingk.evolutionary.value.Value;

public class AddIntConst implements Node {

	private int which, howMuch;
	public AddIntConst(int which, int howMuch){
		this.which = which;
		this.howMuch = howMuch;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Add "+howMuch+" to "+which;
	}

	@Override
	public Value execute(Context con) {
		try{
			Value v = con.get(which);
			if (v.type != Type.Integer){
				return v;
			}
			int val = (int) v.value;
			con.set(which, new Value(val + howMuch));
			return con.get(which);
		}catch (Exception e){
			con.set(which, new Value(howMuch));
			return new Value(howMuch);
		}
	}

	
	
	
}
