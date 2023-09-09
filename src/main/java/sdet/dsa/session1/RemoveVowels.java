package sdet.dsa.session1;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveVowels {
	
	public String removeVowels(String input) {
	StringBuilder output=new StringBuilder();
		for (int i=0;i<input.length();i++) {
			if((input.charAt(i)=='A')||(input.charAt(i)=='E')||(input.charAt(i)=='I')||(input.charAt(i)=='O')||(input.charAt(i)=='U')
					||(input.charAt(i)=='a')||(input.charAt(i)=='e')||(input.charAt(i)=='i')||(input.charAt(i)=='o')||(input.charAt(i)=='u')) {
				
			}
			
			else {
				output.append(input.charAt(i));
			}
		}
		return output.toString();
	}

	@Test
	
	public void verifySC1() {
		Assert.assertEquals("H tstlf stdnts", removeVowels("Hi testleaf students"));
	}
	
	
}
