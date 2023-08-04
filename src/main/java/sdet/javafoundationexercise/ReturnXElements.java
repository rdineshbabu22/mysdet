package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class ReturnXElements {
	
	public int returnXelements(int[] arr) {
		int count=0;
		
		for (int i=0;i<arr.length;i++) {
			for (int k=0;k<arr.length;k++) {
				if((arr[i]+1)==arr[k]) {
					count ++;
				}
				
			}
			
		}
		return count;
		
	}
	
	@Test
	
	public void returnXElementsSc1()
	{
		Assert.assertEquals(2, returnXelements(new int[] {1,1,2}));
	}
	
	@Test
	
	public void returnXElementsSc2()
	{
		Assert.assertEquals(3, returnXelements(new int[] {1,1,2,3}));
	}
	
	@Test
	public void returnXElementsSc3()
	{
		Assert.assertEquals(5, returnXelements(new int[] {-1,0,1,2,3,4}));
	}

}
