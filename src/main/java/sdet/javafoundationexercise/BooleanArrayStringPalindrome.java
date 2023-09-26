package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class BooleanArrayStringPalindrome {
	
	public boolean[] verifyPalindromeString(String s) {
		String[] strArray=s.split(" ");
		boolean[] boolArray = new boolean[strArray.length];
		int count=0;
		for(String inputStr:strArray) {
			System.out.println(inputStr);
			int left=0;
			int right=inputStr.length()-1;
			System.out.println(left);
			System.out.println(right);
			while(left<right) {
				if(inputStr.charAt(left)==inputStr.charAt(right)||inputStr.charAt(left)==inputStr.charAt(right)+32||inputStr.charAt(left)+32==inputStr.charAt(right)) {
					left++;
					right--;
					System.out.println(left);
					System.out.println(right);
				}
				else {
					boolArray[count]=false;
					System.out.println(boolArray[count]);
					break;
				}
				boolArray[count]=true;
				
			}
			count++;
		}
		return boolArray;
	}
	@Test
	public void verifySc1() {
		Assert.assertArrayEquals(new boolean[] {false,false,true}, verifyPalindromeString("hi heelo Tst"));
	}
	
	@Test
	public void verifySc2() {
		Assert.assertArrayEquals(new boolean[] {true,true,true,true,true}, verifyPalindromeString("aa bb cc Dd eE"));
	}

}
