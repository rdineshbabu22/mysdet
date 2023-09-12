package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class HeightIndices {
	public int heightChecer(int[] heights)

	{
		int temp = 0, indicesCount = 0;
		int[] expectedInput = new int[heights.length];
		for (int i = 0; i < heights.length; i++) {
			expectedInput[i] = heights[i];
		}

		for (int i = 0; i < heights.length - 1; i++) {
			for (int j = i+1; j < heights.length; j++) {

				if (heights[i] > heights[j]) {
					temp = heights[j];
					heights[j] = heights[i];
					heights[i] = temp;

				}

			}
		}

		for (int k = 0; k < heights.length; k++) {
			System.out.println(heights[k]);
			if (heights[k] != expectedInput[k]) {
				indicesCount++;
			}
		}
		return indicesCount;
	}
	
	@Test
	
	public void verifySc1() {
		Assert.assertEquals(4, heightChecer(new int[] {4,3,2,1}));
	}
	
	@Test
	
	public void verifySc2() {
		Assert.assertEquals(3, heightChecer(new int[] {1,1,4,2,1,3}));
	}
	
	@Test
	
	public void verifySc3() {
		Assert.assertEquals(0, heightChecer(new int[] {1,2,3,4}));
	}

}
