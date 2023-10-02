package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class ValidateatozCharactersInString {

	public boolean verifyString(String s) {

		short[] chaArray = new short[26];

		for (int i = 0; i < s.length(); i++) {

			chaArray[s.charAt(i) - 'a']++;

		}

		for (int i = 0; i < chaArray.length; i++) {

			if (chaArray[i] == 0) {
				return false;
			}

		}

		return true;

	}
	
	@Test 
	public void verifySc1() {
		Assert.assertEquals(false, verifyString("aab"));
	}
	
	@Test 
	public void verifySc2() {
		Assert.assertEquals(true, verifyString("abcdefghijklmnopqrstuvwxyz"));
	}
}
