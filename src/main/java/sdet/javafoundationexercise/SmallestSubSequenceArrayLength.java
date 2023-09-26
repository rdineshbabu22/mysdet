package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class SmallestSubSequenceArrayLength {
	
	public int verifySmallestSubSequenceArrayLength(int[] nums, int threshold) {
		int smallSize=0,startPointer=0;
		for (int i =1 ;i<nums.length;i++) {
			int sum=0;
			
			while(startPointer<i) {
				sum=sum+nums[startPointer];
				startPointer++;
			}
			System.out.println("Sum is"+sum);
			if(sum>=threshold) {
				smallSize=i;
				return smallSize;
			}
			
			while(startPointer<nums.length) {
				sum=sum+nums[startPointer]-nums[startPointer-i];
				if(sum>=threshold) {
					smallSize=i;
					return smallSize;
				}
				startPointer++;
			}
			
		}
		
		return smallSize;
		
	}
	
	@Test
	public void verifSc1() {
		Assert.assertEquals(3, verifySmallestSubSequenceArrayLength(new int[] {1,2,3,4,5},10));
	}

}
