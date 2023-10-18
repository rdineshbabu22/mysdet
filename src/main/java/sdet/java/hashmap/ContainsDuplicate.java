/*Declare a hashmap
Iterate through the elements of array one by one
Store value of array as key in hashp and index as value of hashmap
Compare current Index - already stored index
compare the calculateddiff with value of target
calculateddiff<target
Return true
else Return False
 * 
 * 
 * 
 * 
 * 
 * */



package sdet.java.hashmap;

import java.util.HashMap;

public class ContainsDuplicate {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pointer = 0;

		while (pointer < nums.length)

		{
			if (map.containsKey(nums[pointer]))

			{
				Math.abs(pointer-map.get(nums[pointer]));

				if (Math.abs(pointer-map.get(nums[pointer])) <= k)

				{

					return true;
				}

				else {

					map.put(nums[pointer], pointer);
				}

			}

			else {

				map.put(nums[pointer], pointer);
			}

			pointer++;
		}

		return false;

	}

}
