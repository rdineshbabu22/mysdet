package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class PrimeNumber {
 public int countPrimes(int n) {
	 int primecount=1,beginvalue=0;
	 Boolean primeboolean=false;
	 if (n<=2) {
		 return 0;
	 }
	 
	 if(n%2==0) {
		beginvalue=n-1; 
	 }else
		 beginvalue=n-2;
	 
	 
	 for (int i=beginvalue;i>=3;i=i-2) {
		 if(i==2) {
			 primecount++;
		 }
		 for (int k=1;k<=i;k++) {
			 if(k!=1 && k!=i) {
				 if((i%k)==0) {
					 primeboolean=false;
					 break;
				 }
				 else {
					 primeboolean=true;
				 }
			 }
			
		 }
		 
		 if(primeboolean==true) {
			 primecount++;
		 }
		 
	 }
	 return primecount;
 }
 
 @Test
 public void verifyNoOfPrimeSc1() {
	 Assert.assertEquals(4, countPrimes(10));
 }
 @Test
 public void verifyNoOfPrimeSc2() {
	 Assert.assertEquals(5, countPrimes(13));
 }
 @Test
 public void verifyNoOfPrimeSc3() {
	 Assert.assertEquals(5, countPrimes(13));
 }
 @Test
 public void verifyNoOfPrimeSc4() {
	 Assert.assertEquals(0, countPrimes(2));
 }
 @Test
 public void verifyNoOfPrimeSc5() {
	 Assert.assertEquals(0, countPrimes(1));
 }
 @Test
 public void verifyNoOfPrimeSc6() {
	 Assert.assertEquals(0, countPrimes(0));
 }
}
