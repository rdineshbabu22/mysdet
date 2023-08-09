package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;
/*
 * Pseudo Code
 * Step 1 : Input : String array
 * step 2: Out put should return count of passenger who are strictly greater than 60
 * Step 3 :Initialize counter variable with initial value as 0
 * Step 4 :Get substring of index starting from 11 ,13 to get Age
 * Step 5 :Convert String to integer
 * Step 6 :if Age > 60 , increase counter
 * */


public class SeniorCitizen {

	public int countSeniorCitizens(String[] details) {
		int count=0;
		for (int i=0;i<details.length;i++) {
			String age = details[i].substring(11, 13);
			int agenumber=Integer.parseInt(age);
			if (agenumber>60) {
				count++;
				
			}
			
		}
		return count;
	}
	
	@Test
	public void verifySeniorCitizenSc1() {
		Assert.assertEquals(2, countSeniorCitizens(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
	}
	
	@Test
	public void verifySeniorCitizenSc2() {
		Assert.assertEquals(0, countSeniorCitizens(new String[] {"7868190130M2022","5303914400F1211","9273338290F4010"}));
	}
	
}
