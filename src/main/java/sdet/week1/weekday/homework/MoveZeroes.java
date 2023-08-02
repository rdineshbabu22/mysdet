package sdet.week1.weekday.homework;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroes {
	
	public int[] moveZeroes (int[] nums) {
		int temp=0;
		for (int i=0;i<nums.length;i++) {
			for (int j=i+1;j<=nums.length-1;j++) {
				if(nums[i]==0) {
					if(!(nums[j]==0)) {
						temp=nums[i];
						nums[i]=nums[j];
						nums[j]=temp;					
					}
				}
			}

	}
		return nums;
	}
	
	@Test
	public void tesMoveZeroesSc1() {
		Assert.assertArrayEquals(new int []{2}, moveZeroes(new int[]{2}));
	}
	@Test
	public void tesMoveZeroesSc2() {
		Assert.assertArrayEquals(new int []{2,1,0}, moveZeroes(new int[]{0,2,1}));
	}
	@Test
	public void tesMoveZeroesSc4() {
		Assert.assertArrayEquals(new int []{1,1,2,4,0,0,0}, moveZeroes(new int[]{1,1,0,0,0,2,4}));
	}
	
	@Test
	public void tesMoveZeroesSc5() {
		Assert.assertArrayEquals(new int []{0,0}, moveZeroes(new int[]{0,0}));
	}
	@Test
	public void tesMoveZeroesSc6() {
		Assert.assertArrayEquals(new int []{4,3,-1,0,0}, moveZeroes(new int[]{0,0,4,3,-1}));
	}
}
