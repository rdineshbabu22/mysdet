package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

/***
 * 
 * @author Dinesh Babu
 * Trim the Input string
 * Form a substring from the original string with beginning index as Last index of white speace and ending index as length of array
 * Get the length of substring
 * Return the length of the substring 
 *
 */
public class LengthOfLastWord {
	
	public int lengthOfLastWord(String s) {
		String trimmedString=s.trim();
		String lastWord=trimmedString.substring(trimmedString.lastIndexOf(" ")+1, trimmedString.length());
		int lengthOfLastWord=lastWord.length();
		return lengthOfLastWord;
	}
	
	@Test
	public void returnLengthOfLastWordSc1()
	{
		Assert.assertEquals(5, lengthOfLastWord("   Hello   World   "));
	}

}
