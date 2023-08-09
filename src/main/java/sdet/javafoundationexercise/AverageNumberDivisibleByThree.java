package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class AverageNumberDivisibleByThree {
	public int averageValue(int[] nums) {
		int averageValue=0,sum=0,count=0;
		
		for (int i=0;i<nums.length;i++) {
			if(nums[i]>1 && nums[i]%2==0 && nums[i]%3==0) {
				System.out.println("Value of is"+nums[i]);
				sum=sum+nums[i];
				count++;
			}
			
		}
	if(count >=1){
			averageValue=sum/count;	
		}
	else {
		averageValue=0;
	}
		
		return averageValue;
	}
	
	
	@Test
	public void verifyAvgSc1() {
		Assert.assertEquals(9, averageValue(new int[] {1,3,6,10,12,15}));
	}
	
	@Test
	public void verifyAvgSc2() {
		Assert.assertEquals(0, averageValue(new int[] {1,3,9,10}));
	}

}
