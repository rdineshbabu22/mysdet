package sdet.wee4.dailyjava;

import org.junit.Test;

import junit.framework.Assert;

;
public class AlternateDigitSum {
	
 public int alternateDigitSum(int n) {
	 
	 String lenOfInt=Integer.toString(n);
	 int[] digitArray=new int[lenOfInt.length()];
	 int count=0,reminder=0,quotient=n,num=0,sum=0;
	 boolean operatorSymbol=false;
	 while(quotient>0) {
		 quotient=n/10;
		 reminder=n%10;
		 digitArray[count]=reminder;
		 n=quotient;
		 count++;	 
	 }
	 
	 for ( int k=digitArray.length-1;k>=0;k--) {
		 if(operatorSymbol==false) {
			 operatorSymbol=true;
			 num=digitArray[k];
		 }
		 else {
			 operatorSymbol=false;
			 num=-digitArray[k];
		 }
		 
		 
		 sum=sum+num;
	 }
	 return sum;
	        
	    }
 
 @Test
 public void alternateDigitSumSc1() {
	 Assert.assertEquals(6, alternateDigitSum(567));
 }
 @Test
 public void alternateDigitSumSc2() {
	 Assert.assertEquals(-3, alternateDigitSum(997978));
 }
 @Test
 public void alternateDigitSumSc3() {
	 Assert.assertEquals(9, alternateDigitSum(9));
 }
}
