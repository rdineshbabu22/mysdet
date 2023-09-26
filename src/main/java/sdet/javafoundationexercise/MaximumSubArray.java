package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class MaximumSubArray {
	 public int maxSubArray(int[] nums) {
		 
		 int maxSumEndingNow=0,maxSoFar=Integer.MIN_VALUE,i=0;

		 while(i<nums.length){

		 maxSumEndingNow=maxSumEndingNow+nums[i];
		 maxSoFar=Math.max(maxSumEndingNow,maxSoFar);
		 if(maxSumEndingNow<0)
		 {
		 maxSumEndingNow=0;
		 }

		 i++;
		 }
		 return maxSoFar;
	        
	    }
	 
	 @Test
	 
	 public void verifySc1() {
		 Assert.assertEquals(23, maxSubArray(new int[] {5,4,-1,7,8}));
	 }
	 
	 @Test
	 
	 public void verifySc2() {
		 Assert.assertEquals(6, maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	 }

}
