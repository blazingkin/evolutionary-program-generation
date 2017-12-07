package in.blazingk.evolutionary.value;

import java.util.HashMap;

public class Context {

	private HashMap<Integer, Value> locals = new HashMap<Integer, Value>();
	public Context parent = null;
	public Context(Context parent){
		this.parent = parent;
	}
	
	public int count(){
		return locals.size();
	}
	
	public Value get(int i) throws Exception{
		if (locals.containsKey(i)){
			return locals.get(i);
		}else if (parent != null){
			return parent.get(i);
		}
		throw new Exception("Could not find a binding for "+i);
	}
	
	public Value set(int i, Value v){
		locals.put(i, v);
		return v;
	}
	
	
}
