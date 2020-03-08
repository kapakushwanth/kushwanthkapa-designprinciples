//package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import Math.Multiply;


public class MultiplyTest {

	@Test
	public void testMultiply() {
		Assert.assertEquals(69,Multiply.compute(8,1));
		
	}

}
