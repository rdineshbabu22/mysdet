package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class VerifyGiveNumberIsPrime {
	
	public boolean verifyNumberIsPrime(int number)
	{
		if(number==2) {
			return true;
		}
		if(number==1) {
			return false;
		}
			
		if(number>2)
		{

		for (int i=2;i<=number-1;i++) {
			if(number%i==0) {
				return false;
			}
		}
		
		}
		return true;
	}
	
	@Test
	public void verifPrimeOrNot4() {
		Assert.assertEquals(false, verifyNumberIsPrime(4));
	}
	
	@Test
	public void verifPrimeOrNot17() {
		Assert.assertEquals(true, verifyNumberIsPrime(17));
	}
	@Test
	public void verifPrimeOrNot3() {
		Assert.assertEquals(true, verifyNumberIsPrime(3));
	}
	
	@Test
	public void verifPrimeOrNot5() {
		Assert.assertEquals(true, verifyNumberIsPrime(5));
	}
	@Test
	public void verifPrimeOrNot6() {
		Assert.assertEquals(false, verifyNumberIsPrime(6));
	}
	@Test
	public void verifPrimeOrNot7() {
		Assert.assertEquals(true, verifyNumberIsPrime(7));
	}
	@Test
	public void verifPrimeOrNot8() {
		Assert.assertEquals(false, verifyNumberIsPrime(8));
	}
	@Test
	public void verifPrimeOrNot1() {
		Assert.assertEquals(false, verifyNumberIsPrime(1));
	}
	@Test
	public void verifPrimeOrNot2() {
		Assert.assertEquals(true, verifyNumberIsPrime(2));
	}


}
