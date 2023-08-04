package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class PlusOne {
   public int[] plusOne (int[] digits) {
	int count=0,carryOver=0,addcount=0;
	int [] outputArray;
	for (int i=0; i<digits.length;i++) {
		if (digits[i]==9) {
			count++;
		}
	}
	
	if(count==digits.length) {
		outputArray=new int[digits.length+1];
	}
		else {
		outputArray=new int[digits.length];
	}	
	
	if( outputArray.length==digits.length) {
		count=0;
	}
	else {
		count=1;
	}
	System.out.println("Value of Count is"+ count);
	for (int k=digits.length-1;k>=0;k--) {
		System.out.println("Value of k is"+ k);
		if(addcount!=1)
		{
		
		if(digits[k]+1 >= 10) {
			outputArray[k+count]=0;
			carryOver=1;
			addcount=1;
			if(k==0) {
				outputArray[k+count-1]=carryOver;	
			}

			continue;
			
		}
		else {
			outputArray[k+count]=digits[k]+1;
			System.out.println("Value of sume is"+ outputArray[k+count]);
			addcount=1;
			carryOver=0;
			continue;
			
		}
		}
		
		if(digits[k]+carryOver >= 10) {
			outputArray[k+count]=0;
			carryOver=1;
			if(k==0) {
				outputArray[k+count-1]=carryOver;	
			}

		}
		else {
			outputArray[k+count]=digits[k]+carryOver;
			carryOver=0;
			System.out.println("Value of sum is"+ outputArray[k+count]);
			
		}
		
	}

return outputArray;
	
}
   
   @Test
   public void verifdigitPlusoneSc1()
  {	   Assert.assertArrayEquals(new int[] {1, 1}, plusOne(new int[] {1,0}));
  }
   
   @Test
   public void verifdigitPlusoneSc2()
   {
	   Assert.assertArrayEquals(new int[] {1,1,0,0}, plusOne(new int[] {1,0,9,9}));
   }
   
   @Test
   public void verifdigitPlusoneSc3()
   {
	   Assert.assertArrayEquals(new int[] {1, 0,0,0}, plusOne(new int[] {9,9,9}));
   }
   
   @Test
   public void verifdigitPlusoneSc4()
   {
	   Assert.assertArrayEquals(new int[] {9,9,0}, plusOne(new int[] {9,8,9}));
   }
   
   @Test
   public void verifdigitPlusoneSc5()
   {
	   Assert.assertArrayEquals(new int[] {9,8,7,6,5,4,3,2,1,1}, plusOne(new int[] {9,8,7,6,5,4,3,2,1,0}));
   }
   @Test
   public void verifdigitPlusoneSc6()
   {
	   Assert.assertArrayEquals(new int[] {1,0}, plusOne(new int[] {9}));
   }
   
   
}
