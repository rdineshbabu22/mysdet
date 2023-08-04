package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class FindPivotIndex {
	public int pivotIndex(int[] nums) {
	      int leftsum=0,rightsum=0,previouspivot=0,totalsum=0,pivotindex=0;
	        for (int i=0;i<nums.length;i++){
	        	totalsum=totalsum+nums[i];
	        	System.out.println("Total sum is"+totalsum);
	        }
	        
	        for (int k=0;k<nums.length;k++) {
	        	leftsum=leftsum+previouspivot;
	        	rightsum=totalsum-leftsum-nums[k];
	        	if(leftsum==rightsum) {
	        		pivotindex=k;
	        		break;    	
	        	}
	        	else {
	        		previouspivot=nums[k];
	        		pivotindex=-1;
	        	}
	        }
	        return pivotindex;
	}
	
	@Test
	public void findPivotIndexSc1() {
		Assert.assertEquals(-1, pivotIndex(new int[] {1,2,3}));
	}
	
	@Test
	public void findPivotIndexSc2() {
		Assert.assertEquals(3, pivotIndex(new int[] {1,7,3,6,5,6}));
	}
	@Test
	public void findPivotIndexSc3() {
		Assert.assertEquals(0, pivotIndex(new int[] {2,1,-1}));
	}
}
