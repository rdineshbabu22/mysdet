package sdet.dsa.practise;

import org.junit.Assert;
import org.junit.Test;


public class ArraySort {
	
	public int[] sortArray(int[] arr) {
		int temp=0,count=0;
		for (int i=0; i< arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					count++;
				}
			}
		}
		System.out.println("Value of iteration"+count);
		
		return arr;
	}
	
	@Test
	public void verifySortArraySc1() {
		Assert.assertArrayEquals(new int[] {1,2,3,4,5,6}, sortArray(new int[] {6,5,4,3,2,1}));
	}

}
