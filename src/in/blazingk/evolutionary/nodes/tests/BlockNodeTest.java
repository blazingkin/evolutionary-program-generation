package in.blazingk.evolutionary.nodes.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.blazingk.evolutionary.nodes.AddIntConst;
import in.blazingk.evolutionary.nodes.BindInt;
import in.blazingk.evolutionary.nodes.BlockNode;
import in.blazingk.evolutionary.nodes.ConstIntNode;
import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public class BlockNodeTest {

	@Test
	public void shouldReturnLastValueInBlock() {
		BlockNode bn = new BlockNode(new ConstIntNode(3), new ConstIntNode(5));
		assertEquals(new Value(5), bn.execute(new Context()));
	}
	
	@Test
	public void shouldExecuteAllInBlock(){
		BlockNode bn = new BlockNode(new BindInt(0), new AddIntConst(0, 2));
		assertEquals(new Value(2), bn.execute(new Context()));
	}

}
