package sdet.week3.homework.optional;

import org.junit.Test;

import junit.framework.Assert;

public class ValidPerfectSquare {
	
	public boolean isPerfectSquare(int num) {
		int multiplier=0,quotient=0,lowerange=0,upperrange=num;
		int originum=num;
		boolean isPerfectSquare=false;
		if (num==1) {
			isPerfectSquare=true;
		}
		
		do {
			System.out.println("Value of num  is " +num);
			
			quotient=num/2;
			multiplier=quotient*quotient;
			System.out.println("Value of multiplier  is " +multiplier);
			if(multiplier<=originum) {
				lowerange=quotient;
				System.out.println("Value of lower range is " +lowerange);
				break;
				
			}
			upperrange=quotient;
			System.out.println("Value of upper  range is " +upperrange);
			num=num/2;
		} while(multiplier>num);
		
		for (int i=lowerange;i<=upperrange;i++) {
			if(i*i==originum) {
				isPerfectSquare=true;
				break;	
			}
			if (i*i>originum) {
				isPerfectSquare=false;
				break;	
				
			}
		}
		
		return isPerfectSquare;
	}
	
//	@Test
//	public void verifyIsPerfectSquareSc1() {
//		Assert.assertEquals(true, isPerfectSquare(64));
//	}
//	
//	@Test
//	public void verifyIsPerfectSquareSc2() {
//		Assert.assertEquals(true, isPerfectSquare(144));
//	}
//	
//	@Test
//	public void verifyIsPerfectSquareSc3() {
//		Assert.assertEquals(false, isPerfectSquare(168));
//	}
//	@Test
//	public void verifyIsPerfectSquareSc4() {
//		Assert.assertEquals(true, isPerfectSquare(16));
//	}
//	@Test
//	public void verifyIsPerfectSquareSc5() {
//		Assert.assertEquals(false, isPerfectSquare(14));
//	}
	
	@Test
	public void verifyIsPerfectSquareSc16() {
		Assert.assertEquals(true, isPerfectSquare(4));
	}

}
