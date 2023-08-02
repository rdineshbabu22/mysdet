package sdet.week1.weekday.homework;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTargetElement {
	
	public int[] removeTargetElement(int[] arr,int target) {
		int count=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		int[] copyArry= new int[arr.length-count];
		for (int k=0;k<arr.length;k++) {
			if (arr[k]==target) {
				continue;
			}
			if(k>count)
			{
				copyArry[k-count]=arr[k];	
			}
			else {
				copyArry[k]=arr[k];
			}
			
		}
		
		return copyArry;
		
	}
	
	@Test
	public void returnValue() {

		Assert.assertArrayEquals(new int[] {2},removeTargetElement(new int[] {2,3,3}, 3));	
	}

	@Test
	public void returnValueSc2() {

		Assert.assertArrayEquals(new int[] {2,4},removeTargetElement(new int[] {2,3,3,4}, 3));	
	}
	@Test
	public void returnValueSc3() {

		Assert.assertArrayEquals(new int[] {},removeTargetElement(new int[] {2,2,2,2}, 2));	
	}
	
	public void returnValueSc4() {

		Assert.assertArrayEquals(new int[] {0,4,3},removeTargetElement(new int[] {0,4,2,2,3}, 2));	
	}


}
