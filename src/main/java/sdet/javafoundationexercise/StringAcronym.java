package sdet.javafoundationexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Problem Description
 * Given an array of strings words and a string s, determine if s is an acronym of words.
The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order. For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
Return true if s is an acronym of words, and false otherwise.
 * Pseudo Code
Intialize a boolean value outputFlag = false;
Verify Length of string and  siz of  List containing String are equal
If they are not equal return false
If they are true
Iterate through every String in for loop
Compare the character of String at with first character of String element in the list of same index
If they are matching continue loop until end of last element
If last element also matching reurn true
If there is not even one match found any iteration immediately break the loop and return false
 * 
 * */

public class StringAcronym {

	public boolean isAcronym(List<String> words, String s) {

		boolean outputFlag = false;
		
		int sizeOfStringInList = words.size();
		int lengthOfInputSting = s.length();
		int count = 0;

		if (sizeOfStringInList != lengthOfInputSting) {
			return outputFlag;
		}

		else {

			for (String word : words) {
				if ((word.charAt(0)) == (s.charAt(count))) {
					if(count==s.length()-1) {
						return outputFlag=true;	
					}
					count++;
				}

				else {
					break;

				}
                
			}

		}
		return outputFlag;
	}
	
	@Test
	
	public void verifySc1() {
		Assert.assertEquals(true, isAcronym(new ArrayList<String>(Arrays.asList("hi","hello")), "hh"));
	}
	@Test
	
	public void verifySc2() {
		Assert.assertEquals(true, isAcronym(new ArrayList<String>(Arrays.asList("alice","bob","charlie")), "abc"));
	}
	@Test
	
	public void verifySc3() {
		Assert.assertEquals(false, isAcronym(new ArrayList<String>(Arrays.asList("an","apple")), "a"));
	}
	@Test
	
	public void verifySc4() {
		Assert.assertEquals(true, isAcronym(new ArrayList<String>(Arrays.asList("never","gonna","give","up","on","you")), "ngguoy"));
	}

}
