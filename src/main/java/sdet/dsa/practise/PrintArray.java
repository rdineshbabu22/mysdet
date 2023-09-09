package sdet.dsa.practise;

import org.junit.Assert;
import org.junit.Test;

public class PrintArray {
	
	public void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for (int eachelemt: arr) {
			System.out.println(eachelemt);
		}
	}


}
