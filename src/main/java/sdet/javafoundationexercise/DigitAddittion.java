package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class DigitAddittion {

	public int addDigits(int num) {
		boolean b;
		int sum=0;
		if (num>=10) {
		 b = true;
		}
		else {
			return num;
		}

		while (b== true) {
			int quotient=0,reminder=0;
			sum=0;
			
		while (num>=10) {
			quotient=num/10;
			reminder=num%10;
			num=num/10;
			if(num>=10) {
				sum=sum+reminder;
			}
			else {
				sum=sum+quotient+reminder;			
			}
			
		}
		
		   if (!(sum>=10)) {
				
				b=false;	
		}
		   else {
			   num=sum;
		   }
		
		
		}

		return sum;
	}
	
//	@Test
//	public void returnSumSc1() {
//		Assert.assertEquals(1, addDigits(13456));
//		
//	}
//	@Test
//	public void returnSumSc2() {
//		Assert.assertEquals(2, addDigits(38));
//		
//	}
//	@Test
//	public void returnSumSc3() {
//		Assert.assertEquals(0, addDigits(0));
//		
//	}
//	@Test
//	public void returnSumSc4() {
//		Assert.assertEquals(1, addDigits(10));
//		
//	}
	@Test
	public void returnSumSc45() {
		Assert.assertEquals(1, addDigits(100));
		
	}
}
