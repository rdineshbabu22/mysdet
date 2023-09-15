package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class StringReverse {
	
	 public String reverseWords(String s) {
	StringBuilder build = new StringBuilder();
	build.append('c');
	 return build.toString();
	 
	 
	 }
	 @Test

		public void verifySc1() {
			Assert.assertEquals("c", reverseWords("codeleet"));
		}
}
