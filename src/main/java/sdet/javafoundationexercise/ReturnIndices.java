package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class ReturnIndices {
	
	   public int[] twoSum(int[] nums, int target) {
		   
		   for (int i=0;i<nums.length-1;i++)
		   {
			   for (int j =i+1;j<nums.length;j++) {
				   if (nums[i]+nums[j]==target){
					   return new int[] {i,j};
				   }

			   }
		   }
		   return new int[] {-1,-1};
	        
	    }
	   
	  @Test
	 public void retrunIndices()
	 {
		 Assert.assertArrayEquals(new int[] {0,1}, twoSum(new int[] {2,7,11,15},9));
	 }

}
