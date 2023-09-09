package sdet.javafoundationexercise;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;



/**
 * Pseudo Code
Sort the array in Ascending order
Get the length of array
pair element 
Start for loop i= 0 and increment I by 2 till end of n
Calculate sum of all the values

Dry Code 
public int arrayPairSum(int[] nums)
{

in temp=0,sum=;
for (int i =0;i<nums.length<i++){

for (int j=i+1;j<nums.length-1;j++){
if(nums[i]>nums[j]){
nums[i]=temp;
nums[j]=nums[i];
nums[j]=temp;
}

}

for(int k=0;k<nums.length;k+2)
{

sum=sum+nums[k];
}

return sum;
}
 *
 */

public class ArrayPartitoning {
	public int arrayPairSum(int[] nums)
	{

	int temp=0,sum=0;	
	Arrays.sort(nums);

	for(int k=0;k<nums.length;k=k+2)
	{
		System.out.println("In for loop");
sum=sum+nums[k];
	}

	
	System.out.println(sum);
	return sum;
	}
	
	@Test
	
	public void verifySc1() {
		Assert.assertEquals(4, arrayPairSum(new int[] {1,4,2,3}));
	}

}
