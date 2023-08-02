package sdet.week1.day1.classroom;

import org.junit.Test;

import junit.framework.Assert;

public class ArrangeCoins {
	
	public int arrangeCoins(int n) {
		int rowcount=1,fullCount=0;
		while (n>=rowcount) {
			n=n-rowcount;
			fullCount++;
		if(n>0){
			rowcount++;	
		}

	}
		return fullCount;
	}
	
	@Test
	public void verifyArrangeCoins()
	{
		Assert.assertEquals(2, arrangeCoins(5));
	}
	@Test
	public void verifyArrangeCoins1()
	{
		Assert.assertEquals(1, arrangeCoins(1));
	}
	@Test
	public void verifyArrangeCoins2()
	{
		Assert.assertEquals(4, arrangeCoins(10));
	}
}
