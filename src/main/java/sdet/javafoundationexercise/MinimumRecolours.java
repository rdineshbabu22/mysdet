package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class MinimumRecolours {

	public int minimumRecolors(String blocks, int k) {
		int whiteCount = 0, minOperations = Integer.MAX_VALUE, pointer = 0;

		while (pointer < k) {
			if (blocks.charAt(pointer) == 'W') {
				whiteCount++;
			}
			pointer++;
		}

		minOperations = Math.min(whiteCount, minOperations);

		while (pointer < blocks.length()) {

			if (blocks.charAt(pointer - k) == 'W') {
				whiteCount--;
			}

			if (blocks.charAt(pointer) == 'W') {
				whiteCount++;
			}

			minOperations = Math.min(whiteCount, minOperations);
			pointer++;

		}

		return minOperations;

	}
	
	 @Test
	 
	 public void verifySc1() {
		 Assert.assertEquals(0, minimumRecolors("WBWBBBW",2));
	 }
	 
	 @Test
	 
	 public void verifySc2() {
		 Assert.assertEquals(3, minimumRecolors("WBBWWBBWBW",7));
	 }

}
