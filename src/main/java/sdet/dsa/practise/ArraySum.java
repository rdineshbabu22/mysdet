package sdet.dsa.practise;

import org.junit.Assert;
import org.junit.Test;

public class ArraySum {
	
	public int[] arrayCalculation (int[] arr1, int [] arr2) {
		int sum=0;
		int[] oparray=new int[arr1.length];
		for (int i=0;i<arr1.length;i++) {
			sum=0;
			
			for (int j=0;j<arr2.length;j++) {
				if (i==j) {
					continue;
				}
				
				sum+=arr2[j];
				
			}
			
			oparray[i]=sum-arr1[i];
		}
		return oparray;
	}
	
@Test
public void verifyArrayCalculationSc1() {
	Assert.assertArrayEquals(new int[] {11,9,7,5}, arrayCalculation(new int[] {1,2,3,4}, new int[] {2,3,4,5}));
}
}
