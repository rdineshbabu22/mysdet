package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class SubStingContainsAllThreeCharacters {

	public int numberOfSubstrings(String s) {
		int minRange = 3, maxRange = s.length(), matchCount = 0;
		for (int i = minRange; i <= maxRange; i++) {
			int startPointer = 0, aCount = 0, bCount = 0, cCount = 0;
			while (startPointer < i) {
				if (s.charAt(startPointer) == 'a') {
					aCount++;
				}
				if (s.charAt(startPointer) == 'b') {
					bCount++;
				}
				if (s.charAt(startPointer) == 'c') {
					cCount++;
				}
				
				startPointer++;
			}
			if (aCount >= 1 && bCount >= 1 && cCount >= 1) {
				matchCount++;
			}
			while (startPointer < s.length()) {
				if (s.charAt(startPointer - i) == 'a') {
					aCount--;
				}
				if (s.charAt(startPointer - i) == 'b') {
					bCount--;
				}

				if (s.charAt(startPointer - i) == 'c') {
					cCount--;
				}

				if (s.charAt(startPointer) == 'a') {
					aCount++;
				}
				if (s.charAt(startPointer) == 'b') {
					bCount++;
				}
				if (s.charAt(startPointer) == 'c') {
					cCount++;
				}
				if (aCount >= 1 && bCount >= 1 && cCount >= 1) {
					matchCount++;
				}
				startPointer++;
			}

		}

		return matchCount;

	}
	
	@Test
	public void verifySc1() {
		Assert.assertEquals(3, numberOfSubstrings("aaacb"));
	}
	@Test
	public void verifySc2() {
		Assert.assertEquals(10, numberOfSubstrings("abcabc"));
	}
	}


