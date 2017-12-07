package in.blazingk.evolutionary.strategies;

import java.util.HashMap;
import java.util.Random;

public class Strategy {

	public HashMap<Decision, Double> weights = new HashMap<Decision, Double>();
	
	/* Randomly generated */
	public Strategy(Random r){
		for (Decision d : Decision.values()){
			weights.put(d, r.nextDouble());
		}
	}
	
}
