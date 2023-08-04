package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class BestTimeToBuyandSellStock {
	
	public int maxProfit(int[] prices) {
		
		int realProfit=0,currentProfit=0;
		int buyprice = Integer.MAX_VALUE;
		for (int i=0;i<prices.length;i++)
		{
			if(prices[i]<buyprice) {
				buyprice=prices[i];
			}
			currentProfit=prices[i]-buyprice;
			if(currentProfit>realProfit)
			{
				realProfit=currentProfit;
			}
			
		}

		return realProfit;
			
			
	}
	
	@Test
	public void returnBestTimeToBuyandSellStockSc1() {
		
		Assert.assertEquals(5, maxProfit( new int[] {7,1,5,3,6,4}));
	}
	
	@Test
	public void returnBestTimeToBuyandSellStockSc2() {
		
		Assert.assertEquals(2700, maxProfit( new int[] {500,600,900,3200}));
	}

}
