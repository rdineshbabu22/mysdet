package sdet.javafoundationexercise;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class SingleNumberUsingHashSet {
	
	public int singleNumber(int[] nums) {
		int k=0;
		ArrayList <Integer> output = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i =0;i<nums.length;i++) {
			if (set.contains(nums[i])){
				set.remove(nums[i]);
			}
			else {
				set.add(nums[i]);
			}
		}
		for (Integer i : set) {
			 k = i;
		}
		
		return k;
	}
	
	@Test 
	public void verifySc1() {
		Assert.assertEquals(1, singleNumber(new int[] {1,2,2,3,3}));
	}
	
	@Test 
	public void verifySc2() {
		Assert.assertEquals(2, singleNumber(new int[] {2}));
	}
	
	@Test 
	public void verifySc3() {
		Assert.assertEquals(4, singleNumber(new int[] {2,2,4}));
	}

}
