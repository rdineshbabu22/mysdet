package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class SubArrayGreaterthanEqualtoThreshold {

	public int numOfSubarrays(int[] arr, int k, int threshold) {
		System.out.println("Value is"+(1/2));
		int count = 0, startPointer = 0, sum=0;
		
		while (startPointer<k) {
			sum=sum+arr[startPointer];
			startPointer++;	
		}
		
		if(sum/k>=threshold) {
       	 count++;
        }

		while (startPointer < arr.length)

		{

			sum=sum+arr[startPointer]-arr[startPointer-k];
		
		 if(sum/k>=threshold) {
        	 count++;
         }

			startPointer++;

		}
		
		return count;

	}
	
	@Test
	
	public void verifySc1() {
		Assert.assertEquals(3, numOfSubarrays(new int[] {2,2,2,2,5,5,5,8},3,4));
	}
	
	@Test
	
	public void verifySc2() {
		Assert.assertEquals(6, numOfSubarrays(new int[] {11,13,17,23,29,31,7,5,2,3},3,5));
	}

}
