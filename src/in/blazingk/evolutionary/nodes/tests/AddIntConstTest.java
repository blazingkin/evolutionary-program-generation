package in.blazingk.evolutionary.nodes.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import in.blazingk.evolutionary.nodes.AddIntConst;
import in.blazingk.evolutionary.nodes.Node;
import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public class AddIntConstTest {

	@Test
	public void shouldAddAFixedAmount() throws Exception {
		Context testCon = new Context();
		testCon.set(0, new Value(2));
		Node n = new AddIntConst(0, 2);
		assertEquals(new Value(4), n.execute(testCon));
		assertEquals(new Value(6), n.execute(testCon));
		assertEquals(new Value(8), n.execute(testCon));
	}

}
