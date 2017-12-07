package in.blazingk.evolutionary.value;

public class Value {

	public Type type;
	public Object value;
	
	public Value (int value){
		this.type = Type.Integer;
		this.value = value;
	}
	
	public Value(boolean value){
		this.type = Type.Boolean;
		this.value = value;
	}
	
	public Value(){
		this.type = Type.None;
	}
	
	public Value(Object value) throws Exception{
		if (value instanceof Integer){
			this.type = Type.Integer;
		}else if (value instanceof Boolean){
			this.type = Type.Boolean;
		}else if (value == null){
			this.type = Type.None;
			return;
		}else{
			throw new Exception("Unknown object type: "+value.getClass());
		}
		this.value = value;
	}
	
	public boolean truthy(){
		return !(this.type == Type.None || (this.type == Type.Boolean && ((Boolean)this.value) == false));
	}
	
	public boolean equals(Object other){
		if (other instanceof Value){
			Value otherVal = (Value) other;
			return otherVal.type == this.type && ((this.type == Type.None) || this.value.equals(otherVal.value));
		}else{
			return false;
		}
	}
	
	public static Value None = new Value();
	
}
