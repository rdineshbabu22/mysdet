package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class ReturnUniqueArrayElement {
	 public int singleNumber(int[] nums) {
			int temp=0;
			 if(nums.length==1) {
				 return nums[0];
			 }
			 
			 for(int i=0;i<nums.length-2;i++) {
				 boolean b= false;
				  for(int j=i+1;j<=nums.length-1;j++){
					 if(nums[i]==nums[j])
					 {
						 temp=nums[i+1];
						 nums[i+1]=nums[j];
						 nums[j] = temp;
							 i=i+1;
							 break;
						 	
					
					 }
					 else { 
						 if(j==nums.length-1&&i==nums.length-3) {

							 temp=nums[i];
							 nums[i]=nums[j];
							 nums[j] = temp;
							 
						 }
						 else {

						      if (j==nums.length-1) {
						    	  nums[nums.length-1]=nums[i];
						    	   b =true;
						    	  break;
						    	  
						      }
								 
							 }
							 
						 }
					 
				
						 
					 }
					 if(b==true) {
						 break;
					 }
					 }
					

			 return nums[nums.length-1];
			 }
			 
		 
	 @Test
	 public void returnSingleArrayValue() {
		 Assert.assertEquals(4, singleNumber(new int[] {1,1,5,2,2,3,3,4,5}));
	 }
	 
	 @Test
	 public void returnSingleArrayValueSc2() {
		 Assert.assertEquals(2, singleNumber(new int[] {1,1,5,5,2,3,3}));
	 }
	 @Test
	 public void returnSingleArrayValueSc3() {
		 Assert.assertEquals(2, singleNumber(new int[] {1,1,2,3,3}));
	 }
	 
	 @Test
	 public void returnSingleArrayValueSc4() {
		 Assert.assertEquals(3, singleNumber(new int[] {1,1,3}));
	 }


}
