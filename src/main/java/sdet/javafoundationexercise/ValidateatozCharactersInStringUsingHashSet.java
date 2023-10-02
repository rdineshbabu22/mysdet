package sdet.javafoundationexercise;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class ValidateatozCharactersInStringUsingHashSet {

	public boolean verifyString(String s) {

		HashSet<Character> bool = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {

			bool.add(s.charAt(i));

		}

		if(bool.size()==26) {
			return true;

		}

		return false;

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
