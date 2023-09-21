package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityBit {
	public int[] sortArrayByParity(int[] nums) {
		int pointerOne = 0, pointerTwo = nums.length - 1, temp = 0;

		while (pointerOne < pointerTwo) {
			if (((nums[pointerOne] == 1) || (nums[pointerOne]%2)!=0 ) && ((nums[pointerTwo] == 0) || (nums[pointerTwo]%2) == 0))

			{
				System.out.println(nums[pointerOne]);
				System.out.println(nums[pointerTwo]);
				System.out.println("Odd Even");
				temp = nums[pointerOne];
				nums[pointerOne] = nums[pointerTwo];
				nums[pointerTwo] = temp;
				pointerOne++;
				pointerTwo--;
				for(int i=0;i<nums.length;i++) {
					System.out.println("Value of array is"+nums[i]);
					continue;
				}
			}

			if ((nums[pointerOne] == 0 || (nums[pointerOne] % 2) == 0) && ((nums[pointerTwo] == 0 )|| ((nums[pointerTwo] % 2) == 0))) {
				System.out.println(nums[pointerOne]);
				System.out.println(nums[pointerTwo]);
				System.out.println("Even Even");
				pointerOne++;
			}

			if ((nums[pointerOne] == 0 || ((nums[pointerOne] % 2) == 0)) && ((nums[pointerTwo] == 1) || ((nums[pointerTwo] %2) != 0)))

			{
				System.out.println(nums[pointerOne]);
				System.out.println(nums[pointerTwo]);
				System.out.println("Even odd");
				pointerTwo--;
			}

			if (((nums[pointerOne]== 1) || (nums[pointerOne] %2) != 0) && ((nums[pointerTwo] == 1)||((nums[pointerTwo] %2) != 0)))

			{
				System.out.println(nums[pointerOne]);
				System.out.println(nums[pointerTwo]);
				System.out.println("odd odd");

				pointerTwo--;
			}

		}

		return nums;

	}
	
	@Test
	public void verifSc1() {
		Assert.assertArrayEquals(new int[] {4,2,1,3}, sortArrayByParity(new int[] {3,1,2,4}));
	}

}
