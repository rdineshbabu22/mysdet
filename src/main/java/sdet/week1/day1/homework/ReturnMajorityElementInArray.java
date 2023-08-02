package sdet.week1.day1.homework;

import java.lang.reflect.Array;

import org.junit.Test;

import junit.framework.Assert;

public class ReturnMajorityElementInArray {
	
	public int returnMajoityElement (int[] nums) {
		
		int majority;
			 majority = ((nums.length)/2)+1;
		
		int maxvalue;
		for (int i=0;i<nums.length;i++) {
			int  count=0;	
			for (int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count = count+1;
					
				}
			}
			
			if(count >= majority) {
				maxvalue =nums[i];
				return  maxvalue;
			}
		}
		return 0;
		
	
	}
	
	@Test
	public void returMajorityOfElementInEvenSizeArray0() {
		
		Assert.assertEquals(0, returnMajoityElement( new int[] {1,1,2,2,1,1,1,2,3,4}));
		
}
	
	@Test
	public void returMajorityOfElementInEvenSizeAs1() {
		
		Assert.assertEquals(1, returnMajoityElement( new int[] {1,1,2,2,1,1,1,2,3,1}));
		
}
	
	@Test
	public void returMajorityOfElementInEvenSizeAs2() {
		
		Assert.assertEquals(2, returnMajoityElement( new int[] {4,2,2,2,2,2,2,2,3,1}));
		
}
	@Test
	public void returMajorityOfElementInOddSizeArrayAs2() {
		
		Assert.assertEquals(2, returnMajoityElement( new int[] {4,2,2,2,2,2,2,2,3,1,2}));
		
}
	@Test
	public void returMajorityOfElementInOddSizeArrayAs0() {
		
		Assert.assertEquals(0,returnMajoityElement( new int[] {4,5,1,3,2}));
		
}
	@Test
	public void returMajorityOfElementInOddSizeArrayAs3(){
		
		Assert.assertEquals(3, returnMajoityElement( new int[] {3,2,3}));
		
}

}
