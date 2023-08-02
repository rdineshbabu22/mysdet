package sdet.week3.homework.optional;

import org.junit.Test;

import junit.framework.Assert;

public class ProductOfThreeNumbers {
	
	  public int maximumProduct(int[] nums) {
		  int temp=0,product=0;
		  for (int i=0;i<nums.length;i++) {
			  for(int j= i+1;j<=nums.length-1;j++) {
				  if(nums[i]<nums[j]) {
					  temp=nums[j];
					  nums[j]=nums[i];
					  nums[i]=temp;
				  }
			  }
			
		  }
		  for (int i=0;i<nums.length;i++) {
			  System.out.println(nums[i]);
		  }
		  
		  return  product=nums[0]*nums[1]*nums[2];
	        
	    }
	  
//	  @Test
//	  public void verifyProductSc1() {
//		  Assert.assertEquals(24, maximumProduct(new int[] {1,2,3,4}));
//	  }
	  
	  
	  @Test
	  public void verifyProductSc2() {
		  Assert.assertEquals(24, maximumProduct(new int[] {-100,-98,-1,2,3,4}));
	  }

}
