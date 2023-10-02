package sdet.dsa.hackerrankassessment;

import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayQueries {

	public int[] reversearrayQueries(int[] array, int[][] operations)

	{
		int temp = 0, count = 0, startIndex = 0, endIndex = 0;
		while (count < operations.length) {
			startIndex = operations[count][0];
			endIndex = operations[count][1];
			while (startIndex < endIndex) {
				temp = array[startIndex];
				array[startIndex] = array[endIndex];
				array[endIndex] = temp;
				startIndex++;
				endIndex--;
			}
			count++;

		}

		return array;

	}
	
	@Test
	public void verifySc1() {
		Assert.assertArrayEquals(new int[] {9, 1, 7, 3, 5, 4, 6, 2, 8, 0}, reversearrayQueries(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, new int[][] {{0, 9},{4, 5},{3, 6},{2, 7},{1, 8},{0,9}}));
	}
	
	@Test
	public void verifySc2() {
		Assert.assertArrayEquals(new int[] {2,1,3}, reversearrayQueries(new int[] {1,2,3}, new int[][] {{0, 2},{1,2},{0,2}}));
	}
	

	@Test
	public void verifySc3() {
		Assert.assertArrayEquals(new int[] {5,5,2,1}, reversearrayQueries(new int[] {5,2,5,1}, new int[][] {{1, 2},{1,1}}));
	}

}
