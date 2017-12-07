package in.blazingk.evolutionary.nodes.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.blazingk.evolutionary.nodes.BindInt;
import in.blazingk.evolutionary.nodes.Node;
import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public class BindIntTest {

	@Test
	public void shouldBindIntToZero() throws Exception {
		Context con = new Context();
		Node n = new BindInt();
		n.execute(con);
		assertEquals(1, con.count());
		assertEquals(new Value(0), con.get(1));
	}

}
