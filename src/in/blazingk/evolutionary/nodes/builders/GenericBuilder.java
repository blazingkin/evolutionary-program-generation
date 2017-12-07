package in.blazingk.evolutionary.nodes.builders;

import java.util.Random;

import in.blazingk.evolutionary.nodes.Node;
import in.blazingk.evolutionary.strategies.Strategy;

public class GenericBuilder implements NodeBuilder {

	@Override
	public Node build(Strategy s, Random r) {
		for (Builder b : Builder.values()){
			if (r.nextDouble() < s.getWeight(b.threshold)){
				return b.builder.build(s, r);
			}
		}
		return build(s, r);
	}
	
}
