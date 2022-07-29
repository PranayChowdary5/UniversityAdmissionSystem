package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class showpassword {

	@Test
	public void test() {

		JUnitTest test= new JUnitTest();
		int output= test.square(5);
		assertEquals(25,output);
	}

}
