package sdet.week2.day1.homework;

import org.junit.Test;

import junit.framework.Assert;

public class FirstPalindromeString {
	public String firstPalindrome(String[] words) {
		
		int lengthOfArrat=words.length;
		String reverseString="";
		String orgString="";
		String emptyString="";
		for (int i=0;i<words.length;i++) {
			 orgString= words[i];
			 reverseString="";
			for (int j=orgString.length()-1;j>=0;j--) {
				 reverseString=reverseString+orgString.charAt(j);	
			}
			if(reverseString.equals(orgString)) {
				return orgString;
			}
		}
		
		return emptyString;
	}
	
	@Test
	public void verifyFirstPalindromeSc1() {
		Assert.assertEquals("ada", firstPalindrome(new String[] {"abc","car","ada","racecar","cool"}));
	}
	
	@Test
	public void verifyFirstPalindromeSc2() {
		Assert.assertEquals("racecar", firstPalindrome(new String[] {"notapalindrome","racecar"}));
	}
	
	@Test
	public void verifyFirstPalindromeSc3() {
		Assert.assertEquals("", firstPalindrome(new String[] {"def","ghi"}));
	}
	@Test
	public void verifyFirstPalindromeSc4() {
		Assert.assertEquals("f", firstPalindrome(new String[] {"f","ghi"}));
	}
	@Test
	public void verifyFirstPalindromeSc5() {
		Assert.assertEquals("&", firstPalindrome(new String[] {"def","&"}));
	}
	
	@Test
	public void verifyFirstPalindromeSc6() {
		Assert.assertEquals("", firstPalindrome(new String[] {"def",""}));
	}

}
