package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class IntegerPalindrimeorNot {
	public boolean verifyIntegerBoolean (int num)
	{
		int quotient=0,reminder=0;
		return true;
	}

	@Test
	
	public void verifySc1() {
		Assert.assertEquals(true, verifyIntegerBoolean(1111));
	}
	@Test
	
	public void verifySc2() {
		Assert.assertEquals(false, verifyIntegerBoolean(1234));
	}
	
@Test
	
	public void verifySc3() {
		Assert.assertEquals(true, verifyIntegerBoolean(12221));
	}
}
