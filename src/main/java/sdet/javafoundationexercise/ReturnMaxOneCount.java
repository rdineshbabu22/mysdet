package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

/*Problem Description :- Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * Leet Code # 485
 * 
 * PseudoCode
intalize maxOneCount=0,currentOneCount=0,pointer=0
Iterate through the element one by one
if consectuive ones are found increment currentOneCount to 1
If any value of  found
Verify currentOneCount>maxOneCount 
if Yes assign maxOneCount =currentOneCount
IF not do nothng
reset currentOneCount value to zero and proceed to next continuer iteration until pointer is less than length of array
 * Time Complexity : O(n)
 * Space Complexity :O(1)
 *
 * */

public class ReturnMaxOneCount {
	public int findMaxConsecutiveOnes(int[] nums) {

		int maxOneCount = 0;
		int left=0,right=0;

//		while (pointer < nums.length) {
//
//			if (nums[pointer] == 1)
//
//			{
//
//				currentOneCount++;
//			}
//
//			else {
//				if (currentOneCount > maxOneCount)
//					maxOneCount = currentOneCount;
//				currentOneCount = 0;
//			}
//			pointer++;
//
//		}
//
//		if (currentOneCount > maxOneCount) {
//			maxOneCount = currentOneCount;
//		}
		
		while(right<nums.length) {
			if(nums[left]==nums[right] && nums[left]==1 && nums[right]==1) {
				maxOneCount=Math.max(maxOneCount, right-left+1);
						right++;
			}
			else {
				left=right+1;
				right=left;
			}
		}

		return maxOneCount;

	}

	@Test
	public void verifySc1() {
		Assert.assertEquals(3, findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
	}
	
	@Test
	public void verifySc2() {
		Assert.assertEquals(2, findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0,1 }));
	}
	
	@Test
	public void verifySc3() {
		Assert.assertEquals(0, findMaxConsecutiveOnes(new int[] { 0, 0}));
	}


}
