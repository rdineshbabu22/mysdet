package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;
/*
 * Pseudo Code 
inialize paircount=0, pairchecker=0
Iterate through the string character by character
if Character is equal to R incerment pairchecker by 1
if Character is equal to L  decrement  pairchecker by - 1
while iterating through every character compae if pairchecker is 0
If pairchecker is Zero increment pair count by 1
If pair checker is not equal to 0 go to next character in string
Return the paircount
 * 
 * */

public class BalanceString {
	public int balancedStringSplit(String s) {

		int pairCount = 0, pairChecker = 0;

		for (int i = 0; i < s.length(); i++) {

			if (i == 0) {
				if (s.charAt(i) == 'R') {
					pairChecker++;
				}

				if (s.charAt(i) == 'L') {
					pairChecker--;
				}
			}

			if (i > 0)

			{
				if (s.charAt(i) == 'R') {
					pairChecker++;
				}

				if (s.charAt(i) == 'L') {
					pairChecker--;
				}

				if (pairChecker == 0)

				{
					pairCount++;
				}

			}

		}
		return pairCount;

	}
	
	@Test
	
	public void verifySc1() {
		Assert.assertEquals(4,balancedStringSplit("RLRRLLRLRL"));
	}
	
@Test
	
	public void verifySc2() {
		Assert.assertEquals(2,balancedStringSplit("RLRRRLLRLL"));
	}


}
