package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class ArithmeticTriplet {
	public int arithmeticTriplets(int[] nums, int diff) {

		int tripletCount = 0, iPointer = 0, jPointer = iPointer + 1, kPointer = jPointer + 1;

		while (jPointer < nums.length - 1)

		{

			if (nums[jPointer] - nums[iPointer] < diff) {
				jPointer++;
				continue;
			}

			if (nums[jPointer] - nums[iPointer] > diff) {
				iPointer++;
				jPointer = iPointer + 1;
				continue;
			}

			if (nums[jPointer] - nums[iPointer] == diff) {
				iPointer++;
				kPointer = jPointer + 1;

				while (kPointer < nums.length)

				{
					if (nums[kPointer] - nums[jPointer] < diff) {
						kPointer++;
						continue;
					}

					if (nums[kPointer] - nums[jPointer] > diff) {
						jPointer++;
						break;
					}

					if (nums[kPointer] - nums[jPointer] == diff) {
						jPointer = iPointer + 1;
						tripletCount++;
						break;
					}

				}
			}
		}
		return tripletCount;
	}
	
	@Test
	public void verifySc1 () {
		Assert.assertEquals(2, arithmeticTriplets(new int[] {0,1,4,6,7,10},3));
	}
	
	public void verifySc2 () {
		Assert.assertEquals(2, arithmeticTriplets(new int[] {0,1,4,6,7,10},3));
	}
}
