package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfArray {
	
	public int[] intersection(int[] nums1, int[] nums2) {
		
		int[] sortedFirstArray;
		int[] intersectionArray;
		int[] finalIntersectionArray;
		int nonzeroLength=0;
		int temp=0,itr=0;
		Boolean moveBoolean=false;
			
		if(nums1.length<=nums2.length) {
			 intersectionArray= new int[nums1.length];
			 
			 for (int i=0;i<nums1.length;i++) {
				 
					 for (int j=i+1;j<=nums1.length-1;j++) {
						 if(nums1[i]>nums1[j]) {
							temp=nums1[i];
							nums1[i]=nums1[j];
							nums1[j]=temp;
						 }
					 }	 	 
			 }
			 for (int k=0;k<nums1.length;k++) {
				 System.out.println("Sorted array is"+nums1[k]);
			 }
				 
				 //Sorting of one array completed
				 for (int k =0;k<nums1.length;k++) {
					 for (int l =0;l<=nums2.length-1;l++) {
						 if(k!=nums1.length-1) {
							 if(nums1[k]==nums1[k+1]) {
								 continue;
							 }
						 }
						 if(nums1[k]==nums2[l]) {
							 
							 intersectionArray[itr]=nums1[k];
							 itr++;
							 moveBoolean=true;
							 break;
						 }
					 }
					 
				 }
				 
				 for (int k=0;k<intersectionArray.length;k++) {
					 System.out.println("Interscetion array is"+intersectionArray[k]);
				 }		 
			
	}
		else {
			 for (int p=0;p<nums2.length;p++) {
				 System.out.println("num2 array is"+nums2[p]);
			 }
			intersectionArray= new int[nums2.length];
			 for (int k=0;k<nums2.length;k++) {
				 for (int l=k+1;l<=nums2.length-1;l++) {
					 if(nums2[k]>nums2[l]) {
						temp=nums2[k];
						nums2[k]=nums2[l];
						nums2[l]=temp;
						
					 }
				 }
					  
				 }
			 for (int k=0;k<nums2.length;k++) {
				 System.out.println("Sorted array is"+nums2[k]);
			 }
			//Sorting of one array completed
			 
			 for (int k =0;k<nums2.length;k++) {
				 for (int l =0;l<=nums1.length-1;l++) {
					 if(k!=nums2.length-1) {
						 if(nums2[k]==nums2[k+1]) {
							 continue;
						 }
					 }
					 if(nums2[k]==nums1[l]) {
						 
						 intersectionArray[itr]=nums2[k];
						 itr++;
						 moveBoolean=true;
						 break;
						 
					 }
				 }
				 
			 }
			 for (int k=0;k<intersectionArray.length;k++) {
				 System.out.println("Interscetion array is"+intersectionArray[k]);
			 }
			 
			 
		}
		if(moveBoolean==false) {
			finalIntersectionArray = new int[] {};
			return finalIntersectionArray;
		}
	int zerocount=0;
		for (int i =intersectionArray.length-1;i>0;i--) {
			if(intersectionArray[i-1]==0 && intersectionArray[i]==0) {
				zerocount++;
			}
			if(intersectionArray[i-1]!=0 && intersectionArray[i]==0) {
				zerocount++;
				break;
			}
			
		}
		nonzeroLength=intersectionArray.length-zerocount;
		
		finalIntersectionArray = new int[nonzeroLength];
		for (int i=0;i<nonzeroLength;i++) {		
			finalIntersectionArray[i]=intersectionArray[i];	
			
  }
		 for (int k=0;k<finalIntersectionArray.length;k++) {
			 System.out.println("Final Interscetion array is"+intersectionArray[k]);
		 }
		return finalIntersectionArray;
	}
	

	@Test
	public void verifyIntersectionArraySc1() {
		Assert.assertArrayEquals(new int[] {4,9},intersection(new int[] {4,9,0},new int[] {4,9,1} ));
	}
	

	@Test
	public void verifyIntersectionArraySc2() {
		Assert.assertArrayEquals(new int[] {4,9},intersection(new int[] {4,9,5},new int[] {9,4,9,8,4} ));
	}
	
	@Test
	public void verifyIntersectionArraySc3() {
		Assert.assertArrayEquals(new int[] {-1,0,4,9},intersection(new int[] {-1,0,4,9,5},new int[] {-2,-1,1,0,9,4,9,8,4} ));
	}
	
	@Test
	public void verifyIntersectionArraySc4() {
		Assert.assertArrayEquals(new int[] {2},intersection(new int[] {1,2,2,1},new int[] {2,2} ));
	}
	@Test
	public void verifyIntersectionArraySc5() {
		Assert.assertArrayEquals(new int[] {1},intersection(new int[] {2,6,2,9,1},new int[] {7,1} ));
	}
	
	@Test
	public void verifyIntersectionArraySc6() {
		Assert.assertArrayEquals(new int[] {1},intersection(new int[] {2,6,2,9,1},new int[] {7,1} ));
	}
	
	@Test
	public void verifyIntersectionArraySc7() {
		Assert.assertArrayEquals(new int[] {},intersection(new int[] {2,6,2,9,1},new int[] {7} ));
	}
}
	
