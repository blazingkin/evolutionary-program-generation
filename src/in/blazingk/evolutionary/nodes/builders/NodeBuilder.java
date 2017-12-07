package in.blazingk.evolutionary.nodes.builders;

import java.util.Random;

import in.blazingk.evolutionary.nodes.Node;
import in.blazingk.evolutionary.strategies.Strategy;

public interface NodeBuilder {

	public Node build(Strategy s, Random r);
	
	
}
