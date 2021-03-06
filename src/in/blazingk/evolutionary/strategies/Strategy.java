package in.blazingk.evolutionary.strategies;

import java.util.HashMap;
import java.util.Random;

import in.blazingk.evolutionary.nodes.Node;
import in.blazingk.evolutionary.nodes.builders.Builder;

public class Strategy {

	public HashMap<Decision, Double> weights = new HashMap<Decision, Double>();
	
	/* Randomly generated */
	public Strategy(Random r){
		for (Decision d : Decision.values()){
			weights.put(d, r.nextDouble());
		}
	}
	
	/* Evolve with parents */
	public Strategy(Strategy... parents){
		for (Decision d : Decision.values()){
			double sum = 0d;
			for (Strategy s : parents){
				sum += s.weights.get(d);
			}
			weights.put(d, sum / parents.length);
		}
	}
	
	public double getWeight(Decision d){
		return weights.get(d);
	}
	
	public Node generateTree(Random r){
		return Builder.Generic.builder.build(this, r);
	}
	
}
