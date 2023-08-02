package sdet.week2.day1.classroom;

import org.junit.Test;

import junit.framework.Assert;

public class HalveStringAlike {
	
	public boolean halvesAreAlike(String s) {
		int lengthOfStrinh=s.length();
		String firstHalfString=s.substring(0, (s.length()/2));
		String secondHalfString=s.substring((s.length()/2),s.length());
		int firstStrVowelCount=0,secondStrVowelCount=0;
		for (int i=0;i<firstHalfString.length();i++) {

			if (firstHalfString.charAt(i)=='a'||firstHalfString.charAt(i)=='e'||firstHalfString.charAt(i)=='i'
					||firstHalfString.charAt(i)=='o'||firstHalfString.charAt(i)=='u'||firstHalfString.charAt(i)=='A'||firstHalfString.charAt(i)=='E'||
					firstHalfString.charAt(i)=='I'||firstHalfString.charAt(i)=='O'||firstHalfString.charAt(i)=='U') {
				firstStrVowelCount++;
				
			}
			if (secondHalfString.charAt(i)=='a'||secondHalfString.charAt(i)=='e'||secondHalfString.charAt(i)=='i'
					||secondHalfString.charAt(i)=='o'||secondHalfString.charAt(i)=='u'||secondHalfString.charAt(i)=='A'||secondHalfString.charAt(i)=='E'||
							secondHalfString.charAt(i)=='I'||secondHalfString.charAt(i)=='O'||secondHalfString.charAt(i)=='U') {
				secondStrVowelCount++;
			
				
			}
		}
		
		if(firstStrVowelCount==secondStrVowelCount) {
			return true;
		}
		return false;
	}

	@Test
	public void verifyHalvesAreAlikeSc1()
	{
		Assert.assertEquals(false, halvesAreAlike("textbook"));
	}
}
