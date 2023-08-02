package sdet.week1.weekday.homework;

import org.junit.Assert;
import org.junit.Test;

public class SortedSquares {
	
	public int[] sortedSquares(int[] nums) {
		int maxvalue= Integer.MAX_VALUE;
		int temp=0;
		// Square the Array
		for( int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*nums[i];
		}
		
		// Find the minimu value in array and position of the minimum value Array
				for( int i=0;i<nums.length;i++) {
					{
						for (int j=i+1;j<=nums.length-1;j++) {
							if(nums[i]>nums[j]) {
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
	public void sotedSquaresSc1() {
		Assert.assertArrayEquals(new int []{0,1,1,4,4,16,36}, sortedSquares(new int[]{-2,-1,0,1,2,4,6}));
	}
	@Test
	public void sotedSquaresSc2() {
		Assert.assertArrayEquals(new int []{0,0,0}, sortedSquares(new int[]{0,0,0}));
	}


}
