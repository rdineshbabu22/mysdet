package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class ProductSignArray {
	   public int arraySign(int[] nums) {
	        double multiplier=1;
	        int output=0;

	for (int i=0; i<nums.length;i++){
	multiplier=multiplier*nums[i];
	}
	
	if(multiplier>0){
	output = 1;

	}
	if (multiplier<0){
	output =-1;
	}

	return output;
	        
	    }
	   
	   @Test
	   public void verifySignOfArray() {
		   Assert.assertEquals(-1, arraySign(new int[] {41,65,14,80,20,10,55, 58 , 24 , 56 , 28 , 86 , 96 , 10 , 3 , 84 , 4 , 41 , 13 , 32 , 42 , 43 , 83 , 78 , 82 , 70 , 15 , -41 }));
	   }

}
