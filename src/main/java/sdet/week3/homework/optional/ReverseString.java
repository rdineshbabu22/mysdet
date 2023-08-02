package sdet.week3.homework.optional;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseString {
	public String reverseString(char[] s) {
	   String output="";
	   for (int i=s.length-1;i>=0;i--) {
		   output=output+s[i];
	   }
	   
	   for (int k=0;k<=output.length()-1;k++) {
		   s[k]=output.charAt(k);
		   System.out.println(s[k]);
	   }
	   return output;
	}
	
	@Test
	public void verifyStrngSc1() {
		Assert.assertEquals("olleh", reverseString(new char[] {'h','e','l','l','o'}));
		
	}

}
