package sdet.dsa.practise;

import java.util.Arrays;

public class ArrayAnalyse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int[] primaryArray = {1,2,3};
	        int[] secondaryArray = primaryArray;
	        secondaryArray[2] = 5;
	        System.out.println(primaryArray);
	        System.out.println(secondaryArray);
	        System.out.println(Arrays.toString(primaryArray));
	        System.out.println(Arrays.toString(secondaryArray));

	}

}
