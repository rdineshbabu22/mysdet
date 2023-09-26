package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class StringPalindromeOrNotClassRoom {
	
	public boolean verifyStrinhBoolean (String s)
	{
		//Approach 1 , 2pointer starting from Middle and traveeling in left and right direction
		int left=0,right=0;
		if(s.length()%2!=0) {
			 left =s.length()/2-1;
			right=s.length()/2+1;
		}
		else {
			left =s.length()/2-1;
			right=s.length()/2;
			
		}
		while(right<s.length()) {
			if(s.charAt(left)==s.charAt(right)){
				right++;
				left--;
				System.out.println("Correct");
				
			}
			else {
				return false;
			}
			
		}
		return true;
		//Approach 1 , 2pointer starting from beginning and ending of arra
	
//		int i=0, j=s.length()-1;
//		while (i<j) {
//			if(s.charAt(i)==s.charAt(j)){
//				i++;
//				j--;
//				
//			}
//			else {
//				return false;
//			}
//					}
//		return true;
	}

	@Test
	
	public void verifySc1() {
		Assert.assertEquals(true, verifyStrinhBoolean("RADAR"));
	}
	@Test
	
	public void verifySc2() {
		Assert.assertEquals(true, verifyStrinhBoolean("MAAAAM"));
	}
}
