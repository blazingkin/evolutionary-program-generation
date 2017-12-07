package in.blazingk.evolutionary.value.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import in.blazingk.evolutionary.value.Type;
import in.blazingk.evolutionary.value.Value;

public class ValueTest {

	@Test
	public void testTypeAssignment(){
		assertEquals(Type.Integer, new Value(1).type);
		assertEquals(Type.Boolean, new Value(false).type);
		assertEquals(Type.None, new Value().type);
	}
	
	@Test
	public void valuesShouldBeEqual(){
		Assert.assertTrue(new Value(1).equals(new Value(1)));
		Assert.assertFalse(new Value(2).equals(new Value(0)));
		Assert.assertFalse(new Value(false).equals(new Value(2)));
		Assert.assertTrue(new Value().equals(Value.None));
	}
	
	

}
