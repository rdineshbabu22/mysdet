package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class ReverseStringCharacters {
	
	public String reverseStr(String s) {
	
		char[] strArray= s.toCharArray();
		char temp='a';
		for (int i=0;i<strArray.length/2;i++) {
			temp=strArray[i];
			strArray[i]=strArray[(strArray.length-1)-i];
			strArray[(strArray.length-1)-i]=temp;
		}
		
		String output=new String(strArray);
		return output;
	}
	
	@Test
	
	public void strReverse() {
		Assert.assertEquals("olleh", reverseStr("hello"));
	}
	
	@Test
	
	public void strReverse2() {
		Assert.assertEquals("iiiiolleh", reverseStr("helloiiii"));
	}

}
