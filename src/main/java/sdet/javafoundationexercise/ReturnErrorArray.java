package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class ReturnErrorArray {
	
	public int [] findErrorNums(int nums[])
	{
	int temp=0,Missingvalue=0,duplicateValue=0,count=1;
	int[] outputArray= {0,0};
	int[] correctArray= new int[nums.length];
	for ( int i=0;i<nums.length-1;i++){
	for (int j=i+1;j<nums.length;j++){
	if(nums[i]>nums[j]){
	temp=nums[i];
	nums[i]=nums[j];
	nums[j]=temp;
	}
	if(nums[i]==nums[j]) {
		duplicateValue=nums[j];
	}
	}

	}
	if (nums[0]!=1 ) {
		Missingvalue=1;
	}
	
	if (nums[nums.length-1]!=nums.length ) {
		Missingvalue=nums.length;

	}
	
	for (int l=0;l<nums.length-1;l++) {
		if (nums[l]==nums[l+1]||nums[l]-nums[l+1]==-1 ) {
			continue;
		}
		
		if (nums[l]-nums[l+1]==-2 ) {
			Missingvalue=nums[l]+1;
			break;
		}
		
	
	}


	outputArray[0]=duplicateValue;
	outputArray[1]=Missingvalue;
	return outputArray;
	}
	
	@Test
	public void verifSc1() {
		Assert.assertArrayEquals(new int[] {1,2} ,findErrorNums(new int[] {1,1}) );
	}
	
	@Test
	public void verifSc2() {
		Assert.assertArrayEquals(new int[] {2,1} ,findErrorNums(new int[] {2,2}) );
	}
	
	@Test
	public void verifSc3() {
		Assert.assertArrayEquals(new int[] {2,3} ,findErrorNums(new int[] {1,2,2}) );
	}
	
	@Test
	public void verifSc4() {
		Assert.assertArrayEquals(new int[] {3,2} ,findErrorNums(new int[] {1,3,3}) );
	}
	
	@Test
	public void verifSc5() {
		Assert.assertArrayEquals(new int[] {3,2} ,findErrorNums(new int[] {3,3,4}) );
	}
	
	@Test
	public void verifSc6() {
		Assert.assertArrayEquals(new int[] {4,3} ,findErrorNums(new int[] {1,2,4,4,5}) );
	}
	
	@Test
	public void verifSc7() {
		Assert.assertArrayEquals(new int[] {3,4} ,findErrorNums(new int[] {1,2,3,3,5}) );
	}

	@Test
	public void verifSc9() {
		Assert.assertArrayEquals(new int[] {2,3} ,findErrorNums(new int[] {1,2,2,4}) );
	}
	
	@Test
	public void verifSc10() {
		Assert.assertArrayEquals(new int[] {3,4} ,findErrorNums(new int[] {1,2,5,3,3}) );
	}
	
	@Test
	public void verifSc11() {
		Assert.assertArrayEquals(new int[] {3,1} ,findErrorNums(new int[] {3,2,3,4,6,5}) );
	}

}
