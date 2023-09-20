package sdet.dsa.twopointer;

import org.junit.Test;
import org.testng.Assert;


public class ConsecutiveSum {

	public int returnMaxSum(int nums[], int k) {
		int beginIndex = 0, endIndex = beginIndex + k;
		int highSum = Integer.MIN_VALUE, tempsum = 0;

		while (endIndex < nums.length) {
			tempsum=0;
            System.out.println("");
			for (int i = beginIndex; i <= endIndex; i++)

			{
				tempsum = tempsum + nums[i];
			}
			System.out.println("Temporary sum"+tempsum);

			if (tempsum > highSum)

			{

				highSum = tempsum;

			}
			System.out.println("high sum"+highSum);

			beginIndex++;
			endIndex=beginIndex + k;;

		}
		return highSum;
	}
	
	@Test
	
	public void scenario1() {
		Assert.assertEquals(15, returnMaxSum(new int[] {1,2,3,4,5,6},3));
		
	}

}
