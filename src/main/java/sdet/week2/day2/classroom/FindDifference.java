package sdet.week2.day2.classroom;

import org.junit.Test;

import junit.framework.Assert;

public class FindDifference {
	 public char findTheDifference(String s, String t) {
		 
		 int tsum=0;
		 int ssum=0,diff=0;
		 
		 for (int i=0;i<s.length();i++) {
			 ssum=ssum+s.charAt(i);
		 }
		 
		 for (int i=0;i<t.length();i++) {
			 tsum=tsum+t.charAt(i);
		 }
	        diff= tsum-ssum;
	        char c = (char)diff;
	        return c;

	    }
	 
	 @Test
	 
	 public void findTheDiffChar() {
		 Assert.assertEquals('g', findTheDifference("abdc","cdgab"));
	 }
	 
}
