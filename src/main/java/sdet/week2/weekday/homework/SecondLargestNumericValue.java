package sdet.week2.weekday.homework;

import org.junit.Test;

import junit.framework.Assert;

public class SecondLargestNumericValue {
	
	public int secondHighest(String s) {
	
		char temp='0';
		int count=0,secondLargestValue=0;
		String noWords=s.replaceAll("[a-z]", "");
		char[] numValueInString=noWords.toCharArray();
		for (int i=0;i<numValueInString.length;i++) {
			for (int j=i+1;j<=numValueInString.length-1;j++) {
				if(numValueInString[i]>numValueInString[j]) {
					temp=numValueInString[i];
					numValueInString[i]=numValueInString[j];
					numValueInString[j]=temp;
					count++;
				}
			}
			
		}
		if(numValueInString.length==1 ||numValueInString.length==0) {
			return -1;
		}
		
		if(numValueInString.length>1) {
			for (int i=numValueInString.length-1;i>0;i--) {
				if(numValueInString[i-1]<numValueInString[i]) {
					secondLargestValue = numValueInString[i-1]-'0';
					break;
				}else {
					secondLargestValue=-1;
				}
			}	
			
		}
	
	 
	 return secondLargestValue;
	}
	
	@Test
	public void verifySecondLargestNumberSc1() {
		Assert.assertEquals(3,secondHighest("adafsihgnzxvc12342132"));
	}
//	
	@Test
	public void verifySecondLargestNumberSc2() {
		Assert.assertEquals(-1,secondHighest("adafsihgnzxvc22"));
	}
//	
	@Test
	public void verifySecondLargestNumberSc3() {
		Assert.assertEquals(-1,secondHighest("adafsihgnzxvc"));
	}
	
	@Test
	public void verifySecondLargestNumberSc4() {
		Assert.assertEquals(0,secondHighest("ck011"));
	}
	
	@Test
	public void verifySecondLargestNumberSc5() {
		Assert.assertEquals(0,secondHighest("770ck"));
	}
	

}
