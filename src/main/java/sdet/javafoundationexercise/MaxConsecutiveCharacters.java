package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;
/*
 * Pseudo Code
Initialize left=0,right=0,maxValue=0
if  value of left element equal to right element increment right to 1
If maxvalue greater than right-left+1 , maxvalue= right-left+1
if  value of left element  not equal to right element  reset left to right and right to right+1
 * Time Complexity : O(n)
 * Space complexity : O(1)
 * 
 * 
 * */

public class MaxConsecutiveCharacters {
	public int maxPower(String s) {
		int left = 0, right = 0, maxValue = 0;

		while (right < s.length())

		{
			if (s.charAt(left) == s.charAt(right)) {
				maxValue = Math.max(maxValue, right - left + 1);
				right++;
			}

			else {
				left = right;
				right = right + 1;

			}
		}
		return maxValue;
  
	    }
	
	@Test
	
	public void verifySc1() {
		Assert.assertEquals(2, maxPower("leetcode"));
	}

}
