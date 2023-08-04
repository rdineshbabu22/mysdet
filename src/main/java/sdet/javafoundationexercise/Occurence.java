package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class Occurence {
	
	public int returnCountOfElementsInArray(int[] nums, int t) {
		int count=0,noElement=-1;
		for (int i=0;i<nums.length;i++) {
			if(t==nums[i]) {
				count++;
			}
		}
		if(count>1) {
			return count;
		}
		return noElement;
		
	}
	
	@Test
	public void returnCountOfElementsInArraySc1() {
		Assert.assertEquals(2, returnCountOfElementsInArray(new int[]{1,1,2,2,3},2));
	}
	
	@Test
	public void returnCountOfElementsInArraySc2() {
		Assert.assertEquals(-1, returnCountOfElementsInArray(new int[]{1,1,2,2,3},4));
	}

}
