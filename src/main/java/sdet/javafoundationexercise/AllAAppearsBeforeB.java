package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;
/* 
 * Time Complexity of solution : O(n) 
 * */

public class AllAAppearsBeforeB {
	
	public boolean checkString(String s)
	{
		int lengthOfLastIndexOfA= s.lastIndexOf("a");
		if (lengthOfLastIndexOfA==-1) {
			return true;
		}
		for (int i=lengthOfLastIndexOfA;i>=0;i--) {
			if(s.charAt(i) =='b') {
				return false;
			}
			
		}
		return true;
	}
	
	@Test
	public void verifPresenceOfASc1() {
		Assert.assertEquals(true, checkString("aaabbb"));
	}
	
	@Test
	public void verifPresenceOfASc2() {
		Assert.assertEquals(true, checkString("a"));
	}
	
	@Test
	public void verifPresenceOfASc3() {
		Assert.assertEquals(true, checkString("b"));
	}
	
	@Test
	
	public void verifPresenceOfASc4() {
		Assert.assertEquals(false, checkString("ba"));
	}

}
