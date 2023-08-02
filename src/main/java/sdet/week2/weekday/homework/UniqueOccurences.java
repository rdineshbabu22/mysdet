package sdet.week2.weekday.homework;

import org.junit.Assert;
import org.junit.Test;

public class UniqueOccurences {
	
	public boolean uniqueOccurence(int[] arr) {
		int[] occurenceArray= new int[arr.length];
		int temp =0,count=1,itr=0;
		if(arr.length==1)
		{
			return true;
		}
		
		
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int k=0;k<=arr.length-2;k++) {
			if (arr[k]==arr[k+1]) {
				count++;
				if (k==arr.length-2) {
					occurenceArray[itr]=count;
				}
		    continue;
		}
			else {
				occurenceArray[itr]=count;
				itr++;
				if(k==arr.length-2) {
					occurenceArray[itr]=1;
				}
				count=1;
			}
	}
	for (int k=0; k<occurenceArray.length;k++) {
		if(occurenceArray[k]!=0) {
			for (int l=k+1; l<=occurenceArray.length-1;l++)
			if(occurenceArray[k]==occurenceArray[l]) {
				return false;
			}
		}
	}
	return true;
	
	}

	
	@Test
	public void arraySortedSc1() {
		Assert.assertEquals(true, uniqueOccurence(new int[] {1,2,2,1,1,3}));
	}
	
	@Test
	public void arraySortedSc2() {
		Assert.assertEquals(false, uniqueOccurence(new int[] {1,2}));
	}
	
	@Test
	public void arraySortedSc3() {
		Assert.assertEquals(true, uniqueOccurence(new int[] {1}));
	}
	@Test
	public void arraySortedSc4() {
		Assert.assertEquals(true, uniqueOccurence(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
	}
	
	@Test
	public void arraySortedSc5() {
		Assert.assertEquals(false, uniqueOccurence(new int[] {26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16}));
	}
}
