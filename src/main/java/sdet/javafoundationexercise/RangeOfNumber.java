package sdet.javafoundationexercise;

import java.util.ArrayList;
import java.util.List;

public class RangeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		summarRanges(new int[] {1,2});
//		summarRanges(new int[] {1,4});
//		summarRanges(new int[] {1});
//		summarRanges(new int[] {4});
		summarRanges(new int[] {1,2,3,4,5});

	}
	
	public static  List<String> summarRanges(int[] nums){
		
		ArrayList<String> al = new ArrayList<String> ();
		
		int lowerRange=0, upperRange=0;
		boolean continuousFlag= false;
		if(nums.length==1) {
			al.add(String.valueOf(nums[0]));
		}
		
		for (int i=0;i<nums.length-1;i++) {
			
			if((i+1)==(nums.length-1)) {
				if(continuousFlag==true) {
					if((i+1)-i==1) {
						al.add(String.valueOf(nums[i])+"->"+String.valueOf(nums[i+1]));
					}
					else {
						al.add(String.valueOf(nums[i]));
						al.add(String.valueOf(nums[i+1]));
						
					}
					
					
				}
			
			}
			
			if((i+1)<(nums.length-1)) {
				if(continuousFlag==false) {
					lowerRange=nums[i];	
				}
				
				if((i+1)-i==1) {
					continuousFlag=true;
				}
				else {
					al.add(String.valueOf(lowerRange)+"->"+String.valueOf(nums[i]));
					continuousFlag=false;
				}
			}
			
		}
		for (String each:al) {
			System.out.println(each);
		}
		return al;
	}

}
