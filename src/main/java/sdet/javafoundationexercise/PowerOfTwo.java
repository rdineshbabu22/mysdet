package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfTwo {
	public boolean isPowerOfTwo(int n)
	{
		int count = 0;
		if(n<=0) {
			return false;
		}
		else {		
		
	while (n%2==0) {
		n=n/2;
	
	}
	if (n==1)
	{
	return true;
}
	else {
		return false;
		
	}
	}
	}
	
	@Test
	public void checkPowerOfTwo()
	{
		Assert.assertEquals(true, isPowerOfTwo(16));
	}
	
	@Test
	public void checkPowerOfTwoSC2()
	{
		Assert.assertEquals(false, isPowerOfTwo(20));
	}
}
