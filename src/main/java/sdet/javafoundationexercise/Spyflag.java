package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class Spyflag {
	
	public boolean verifySpyFlag(int num){
		int product=1,sum=0;
		boolean spyFlag=false;
		String number=Integer.toString(num);
		char[] cha=new char[number.length()];
		cha =number.toCharArray();
		for(int i= 0;i<cha.length;i++){

		product=product*(cha[i]-'0');
		sum=sum+(cha[i]-'0');

		}

		if(product==sum)
		{
		spyFlag=true;
		}

		return spyFlag;
		}
	
	
	@Test
	public void verifySpyFlagSc1() {
		Assert.assertEquals(true, verifySpyFlag(1));
	}
	
	@Test
	public void verifySpyFlagSc2() {
		Assert.assertEquals(true, verifySpyFlag(9));
	}

	@Test
	public void verifySpyFlagSc3() {
		Assert.assertEquals(true, verifySpyFlag(123));
	}
	@Test
	public void verifySpyFlagSc4() {
		Assert.assertEquals(false, verifySpyFlag(1234));
	}
}
