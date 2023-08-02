package sdet.week1.weekday.homework;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfThree {
	
	 public boolean isPowerOfThree(int n) {
		 int quotient=0, reminder=0;
		 
		 if(n<0) {
			 return false;
		 }
		 	 if(n==1) {
		 		 return true;
		 	 }
		 while (n>1) {
			 
			 quotient=n/3;
			 reminder=n%3;
			 n=quotient;			 
			 if(reminder>=1) {
				 return false;
			 }
			 if((quotient==1&&reminder==0) ) {
				 return true;
			 }
			 
			 
		 }
		 return false;
	 }
	 
	 @Test
	 public void returnPowerOfThreeSc1() {
		 Assert.assertEquals(true, isPowerOfThree(243));
	 }

	 @Test
	 public void returnPowerOfThreeSc2() {
		 Assert.assertEquals(true, isPowerOfThree(1));
	 }
	 @Test
	 public void returnPowerOfThreeSc3() {
		 Assert.assertEquals(false, isPowerOfThree(0));
	 }
	 
	 @Test
	 public void returnPowerOfThreeSc4() {
		 Assert.assertEquals(false, isPowerOfThree(-3));
	 }
	 
	 @Test
	 public void returnPowerOfThreeSc5() {
		 Assert.assertEquals(false, isPowerOfThree(6));
	 }
	 @Test
	 public void returnPowerOfThreeSc6() {
		 Assert.assertEquals(false, isPowerOfThree(18));
	 }
	 
	 @Test
 public void returnPowerOfThreeSc7() {
		 Assert.assertEquals(false, isPowerOfThree(19684));
	 }

	 
}
