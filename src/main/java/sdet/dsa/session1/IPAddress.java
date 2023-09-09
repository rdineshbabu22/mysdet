package sdet.dsa.session1;

import java.util.ArrayList;

import org.junit.Test;
import org.testng.Assert;

public class IPAddress {
	
	public String returnIPAddress(String s) {
		String ouput="";
		
		ArrayList<Character> al=new ArrayList<Character>();
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)=='.') {
				ouput=ouput+'[';
				ouput=ouput+'.';
				ouput=ouput+']';
			}
			else {
				ouput=ouput+s.charAt(i);
			}
			
		}
	
		System.out.println(ouput);
		return ouput;
	}
	
	@Test
	
	public void VerifyOutputSc1() {
		Assert.assertEquals("1[.]1[.]1[.]1",returnIPAddress( "1.1.1.1"));
	}

}
