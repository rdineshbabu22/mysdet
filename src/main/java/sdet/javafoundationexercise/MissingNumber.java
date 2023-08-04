package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Pseudo Code - To find missing number in array
 * Pre Condition : n --> Length of Array ; Numbers in each array element are unique; Numbers are between range 0 to n.
 * Step 1: Sort the array in Ascending Order
 * Step 2 : Validate below conditions to find missing number
 * Step 3 : Verify first element of an array is 0 . If its not  return that as missing value
 * Step 4 : Verify last element of array is equal to length of array . If its not  return that as missing value
 * Step 5: Verify if any elements between 0 to n is missing. If difference between next element and previous element equal to 2 . 
 * Return the  missing element 
 * 
 * 
 * ***/

public class MissingNumber {
	
	public int missingNumber(int[] nums) {
		int temp=0,missingNumber=0;
		
		for (int i=0;i<nums.length;i++) {
			for(int j=i+1;j<=nums.length-1;j++) {
				if(nums[j]<nums[i]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					
				}
			}
			
		}
		
		if (!(nums[(nums.length-1)]== nums.length)){
			return nums.length;
			
		}
		else if (!(nums[0]==0)) {
			return 0;
			
		}
		for (int k=1;k<nums.length;k++) {
			if(nums[k]-nums[k-1]==2) {
				missingNumber= k;
			}
		}
		return missingNumber;
	}
	
	@Test
	public void verifyMissingNumberSc1() {
		Assert.assertEquals(5, missingNumber(new int[] {0,1,2,3,4}));
	}
	@Test
	public void verifyMissingNumberSc2() {
		Assert.assertEquals(3, missingNumber(new int[] {0,1,2,4,5}));
	}
	
	@Test
	public void verifyMissingNumberSc3() {
		Assert.assertEquals(0, missingNumber(new int[] {1,2,3,4,5}));
	}

}
