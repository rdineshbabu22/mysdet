package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class StringShuffle {
	
	 public String restoreString(String s, int[] indices){

		 char[] orderedCharArray = new char[s.length()];
		 

		 for (int i=0;i<s.length();i++){
		 orderedCharArray [indices[i]]=s.charAt(i);
		 }

		 String output= String.valueOf(orderedCharArray);
		   return output;
		 }
		@Test

		public void verifySc1() {
			Assert.assertEquals("leetcode", restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
		}
		
}
