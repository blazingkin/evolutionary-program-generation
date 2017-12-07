package in.blazingk.evolutionary.value.tests;
import static org.junit.Assert.*;
import org.junit.Test;

import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Value;

public class ContextTest {

	@Test
	public void shouldSetAndRetrieveValues() throws Exception {
		Context testCon = new Context();
		testCon.set(0, new Value(0));
		assertEquals(new Value(0), testCon.get(0));
	}
	
	@Test
	public void shouldThrowError(){
		try{
			new Context().get(0);
			fail("Should not have reached this point");
		}catch(Exception e){
			assertEquals(2, 2);
		}
	}

}
