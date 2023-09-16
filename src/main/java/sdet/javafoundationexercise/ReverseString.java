package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseString {
	public String reverseWords(String s) {
		StringBuilder reverseStr = new StringBuilder();
		int beginIndex = 0, indexOfSpace = 0;

		while (s.indexOf(' ', beginIndex) != -1)

		{
			System.out.println("Index of space is "+indexOfSpace);
			indexOfSpace = s.indexOf(" ", beginIndex);
			for (int i = indexOfSpace-1; i >= beginIndex; i--)

			{
				reverseStr.append(s.charAt(i));
			}
			reverseStr.append(' ');
			beginIndex = indexOfSpace+1;
			System.out.println("New Begin "+beginIndex);

		}

		if (s.indexOf(' ', beginIndex) == -1) {

			for (int i = s.length() - 1; i >= beginIndex; i--)

			{
				reverseStr.append(s.charAt(i));
			}

		}

		return reverseStr.toString();
	}
	
	@Test
	public void verifySc1() {
		Assert.assertEquals("ih", reverseWords("hi"));
	}
	
	@Test
	public void verifySc2() {
		Assert.assertEquals("ih olleh ", reverseWords("hi hello"));
	}

}
