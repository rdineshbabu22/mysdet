package sdet.dsa.twopointer;

import org.junit.Assert;
import org.junit.Test;

public class TwoPointerReturnIndices {

	public int[] returnIndices(int[] nums, int target) {

		int startIndex = 0, endIndex = nums.length - 1;
		int[] oparray = new int[2];

		while (startIndex < endIndex) {
             int sum=nums[startIndex] + nums[endIndex] ;
			if (sum == target) {
				oparray[0] = startIndex;
				oparray[1] = endIndex;
                break;
			}
			if(sum<target) {
			startIndex++;
			}
			else {
			endIndex--;
			}
		}
		
	return oparray;
	}
@Test
public void verifySc1() {
    Assert.assertArrayEquals(new int[] {0,3}, returnIndices(new int[] {2,3,5,7},9));

}

@Test
public void verifySc2() {
    Assert.assertArrayEquals(new int[] {0,4}, returnIndices(new int[] {2,2,3,7,4,6},6));
} 
    @Test
    public void verifySc3() {
        Assert.assertArrayEquals(new int[] {2,4}, returnIndices(new int[] {1,2,3,4,6},9));

}

}
