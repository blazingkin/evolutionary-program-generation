package in.blazingk.evolutionary;

import java.util.ArrayList;

import in.blazingk.evolutionary.value.Value;

public class IOHandler {

	public static ArrayList<Value> log = new ArrayList<Value>();
	
	public static void logValue(Value v){
		log.add(v);
	}
	
	public static void cleanup(){
		log.clear();
	}
	
}
