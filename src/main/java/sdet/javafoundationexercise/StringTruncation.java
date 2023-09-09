package sdet.javafoundationexercise;

import org.junit.Test;
/*Pseudo code

Initialise beginIndex value as 0
Get the index value of first space and decrment K
Verif the value of K , if k is equal to 0.
Rturn Substring with index from  to index until space found 
If k value is not zero continue finding next space and decrement K
if index of space returns -1 , retrun subsrtirn(0,S.length())
 * */

import junit.framework.Assert;

public class StringTruncation {

	public String truncateSentence(String s, int k) {

		int beginIndex=0,endIndex=0,currentIndexOfSpace=0;

		while (k>0){
		if(s.indexOf(" ",currentIndexOfSpace+1)!=-1)
		{
		currentIndexOfSpace=s.indexOf(" ",currentIndexOfSpace+1);
		k--;
		}

		else{
		currentIndexOfSpace=s.length();
		k--;
		}


		}
        System.out.println(s.substring(beginIndex,currentIndexOfSpace));
		return s.substring(beginIndex,currentIndexOfSpace);
		        
		    }
	
	@Test
	
	public void verifySc1() {

		Assert.assertEquals("Hi Hello", truncateSentence("Hi hello how",2));
	}
	
	
	@Test
	
	public void verifySc2() {

		Assert.assertEquals("Hello how are you", truncateSentence("Hello how are you Contestant",4));
	}

}
