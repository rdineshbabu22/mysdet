package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class DigitCountDigitValue {
	public boolean digitCount(String num) {

		boolean digiCountFlag = false;
		int beginIndex = 0, expectedCount = 0, actualCount = 0;
		int expectedValue='0';
		for (int i = 0; i < num.length(); i++) {
			expectedCount = num.charAt(i)-'0';
			expectedValue = i;
			while (num.indexOf(i+'0', beginIndex) != -1) {
				actualCount++;
				beginIndex = num.indexOf(i+'0', beginIndex) + 1;
			}

			if (expectedCount == actualCount) {
				digiCountFlag = true;
			}

			else {
				digiCountFlag = false;
				break;
			}
			actualCount = 0;
			beginIndex = 0;

		}

		return digiCountFlag;

	}
	
	@Test
	
	public void verifySc1() {
		Assert.assertEquals(true, digitCount("1210"));
	}
	
	@Test
	
	public void verifySc2() {
		Assert.assertEquals(true, digitCount("1210"));
	}

}
