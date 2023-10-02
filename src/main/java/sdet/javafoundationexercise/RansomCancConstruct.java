package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class RansomCancConstruct {
	public boolean canConstruct(String ransomNote, String magazine) {

		short[] chaArray = new short[26];


			for (int i = 0; i < magazine.length(); i++) {

				chaArray[magazine.charAt(i) - 'a']++;

			}
			
			for (int i = 0; i < ransomNote.length(); i++) {

				chaArray[ransomNote.charAt(i) - 'a']--;

			}

		

		for (int i = 0; i < ransomNote.length(); i++) {

			if (chaArray[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}

		}

		return true;
	}
	
	@Test 
	public void verifySc1() {
		Assert.assertEquals(true, canConstruct("aa","aab"));
	}
	
	@Test 
	public void verifySc2() {
		Assert.assertEquals(false, canConstruct("a","b"));
	}
	
	@Test 
	public void verifySc3() {
		Assert.assertEquals(true, canConstruct("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
	}
}
