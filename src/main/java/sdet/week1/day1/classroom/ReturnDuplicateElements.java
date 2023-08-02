package sdet.week1.day1.classroom;

import org.junit.Test;

import junit.framework.Assert;

public class ReturnDuplicateElements {
	
	public boolean containsDuplicate(int[] nums) {
		for (int i=0;i<nums.length;i++) {
			for(int j=i+1;j<=nums.length-1;j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
				
			}
		}
		return false;
	}
	
	@Test
	public void verifyDuplicateElementsInArray() {
		Assert.assertEquals(true, containsDuplicate(new int[]{1,1,2,2,3}));
	}

}
