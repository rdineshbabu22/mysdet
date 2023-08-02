package sdet.week2.weekday.homework;

import org.junit.Test;

import junit.framework.Assert;

public class ReplaceDigitWithCharacter {
	
	public String replaceDigits(String s) {
		String output="";
		
		char[] cha = s.toCharArray();
		for (int i=1;i<cha.length;i=i+2) {
			cha[i]= (char)(cha[i-1]+cha[i]-'0');
		}
		return output=String.valueOf(cha);
	}
	
	@Test
	
	public void verifyReplaceDigitWithCharSc1() {
		Assert.assertEquals("abcde", replaceDigits("a1c1e"));
	}
   
}
