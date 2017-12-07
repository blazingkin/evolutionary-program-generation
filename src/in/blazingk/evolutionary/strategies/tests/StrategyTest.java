package in.blazingk.evolutionary.strategies.tests;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import in.blazingk.evolutionary.strategies.Decision;
import in.blazingk.evolutionary.strategies.Strategy;

public class StrategyTest {

	@Test
	public void shouldHaveSameNumberOfWeightsAsDecisions() {
		Random r = new Random();
		Strategy s = new Strategy(r);
		assertEquals(Decision.values().length, s.weights.size());
	}
	
	@Test
	public void shouldBeTheSameAsParentIfOneParent(){
		Random r = new Random();
		Strategy parent = new Strategy(r);
		Strategy child = new Strategy(parent);
		for (Decision d : Decision.values()){
			assertEquals(parent.weights.get(d), child.weights.get(d));
		}
	}

}
