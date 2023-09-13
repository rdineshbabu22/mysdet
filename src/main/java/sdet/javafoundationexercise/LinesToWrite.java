package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class LinesToWrite {
	public int[] numberOfLines(int[] widths, String s) {

		int linesUsed = 1, cumulativePixel = 0;

		for (int i = 0; i < s.length(); i++) {
			System.out.println("value of i"+i);

			if (cumulativePixel + widths[s.charAt(i) - 'a'] <= 100) {

				cumulativePixel = cumulativePixel + widths[s.charAt(i) - 'a'];
				System.out.println("value of cumulativePixel"+cumulativePixel);

			}

			else if (cumulativePixel + widths[s.charAt(i) - 'a'] > 100) {

				linesUsed++;
				System.out.println("value of linesUsed"+linesUsed);
				cumulativePixel = widths[s.charAt(i) - 'a'];

			}

		}

		return new int[] { linesUsed, cumulativePixel };

	}

	@Test

	public void verifySc1() {
		Assert.assertArrayEquals(new int[] {2,20}, numberOfLines(new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"abcdefghijkl"));
	}
	
	@Test

	public void verifySc2() {
		Assert.assertArrayEquals(new int[] {2,4}, numberOfLines(new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"bbbcccdddaaa"));
	}

}
