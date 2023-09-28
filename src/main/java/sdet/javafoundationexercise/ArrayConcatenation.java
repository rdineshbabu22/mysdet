package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class ArrayConcatenation {

	public long findTheArrayConcVal(int[] nums) {

		int i = 0, j = nums.length - 1,mf = 1;
		long sum = 0,quotient = 0;
		while (i < j)

		{
			quotient = nums[j];
			mf = 1;
			while (quotient > 0)

			{
				quotient = quotient / 10;
				mf = mf * 10;
			}

			sum = sum + (nums[i] * mf) + nums[j];

			i++;
			j--;
		}

		if (nums.length % 2 != 0) {
			sum = sum + nums[i];
		}

		return sum;

	}
	
	@Test
	public void verifySc1() {
		Assert.assertEquals(596,findTheArrayConcVal(new int[] {7,52,2,4}));
	}
	
	@Test
	public void verifySc2() {
		Assert.assertEquals(596,findTheArrayConcVal(new int[] {7,52,2,4}));
	}
	
	@Test
	public void verifySc3() {
		Assert.assertEquals(74300,findTheArrayConcVal(new int[] {7,52,2,4}));
	}

}
