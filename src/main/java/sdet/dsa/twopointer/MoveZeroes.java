package sdet.dsa.twopointer;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroes {

	public String moveZeroes(int[] nums) {
		int firstPointer = 0, secondPointer = 1, temp = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println("Start of for loop first Pointer"+firstPointer);
			System.out.println("Start of for loop second Pointer"+secondPointer);

			if (firstPointer == 0 && secondPointer != 0) {
				System.out.println("Shifting zero");
				temp = nums[firstPointer];
				nums[firstPointer] = nums[secondPointer];
				nums[secondPointer] = temp;
				firstPointer++;
				secondPointer++;
				for (int k =0;k<nums.length;k++) {
					System.out.println("Print the value of number in array"+nums[k]);
				}
				continue;

			}

			if (firstPointer == 0 && secondPointer == 0) {
				System.out.println("Two zero");
				secondPointer++;
			}

			if (firstPointer != 0 && secondPointer != 0) {
				System.out.println("Two non zero");
				firstPointer++;
				secondPointer++;

			}
			System.out.println("first Pointer"+firstPointer);
			System.out.println("second Pointer"+secondPointer);

		}
		
		for (int k =0;k<nums.length;k++) {
			System.out.println("Print the value of number in array"+nums[k]);
		}
		
		return "All good";
	}
	
	@Test
	
	public void VerifySc1() {
		Assert.assertEquals("All good", moveZeroes(new int[] {0,1,2,3}));
	}

}
