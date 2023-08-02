package sdet.wee4.dailyjava;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class SelfDividingNumber {
	
	public List<Integer> selfDividingNumbers(int left, int right) {
	int reminder=0,quotient=0,count=0,newnum=0;
	boolean selfDividingNumbers =false;
	ArrayList<Integer> output=new ArrayList<Integer>();
	for (int i=left;i<=right;i++) {
		System.out.println("Initial value of i is  "+i);
		selfDividingNumbers=true;
		newnum=i;
		if (i>=1 && i<=9) {
			System.out.println("Single digit number"+i);
			selfDividingNumbers=true;	
		}
		if(i>=10)
		{
		while(newnum>0 && selfDividingNumbers==true ) {
			System.out.println("Value of newnum "+newnum);
			quotient=newnum/10;
			System.out.println("Value of quotient "+quotient);
			reminder=newnum%10;
			System.out.println("Value of reminder "+reminder);
			if(reminder==0) {
				selfDividingNumbers=false;
				System.out.println(i+ " Not Self diving number "+selfDividingNumbers);
				break;
			}
			if(i%reminder!=0) {
				System.out.println(i+ " Not dividble by  "+reminder);
				
				selfDividingNumbers=false;
				break;
			}
			newnum=quotient;
		}
		System.out.println("Came out of while loop");
		}
		
		if(selfDividingNumbers==true) {
			System.out.println(i+ " is Self diving number" +selfDividingNumbers);
			output.add(i);
		}
	}
	
	for (int k=0;k<output.size();k++) {
		System.out.println(output.get(k));
	}

	
	return output;
	}

	@Test
	public void verifySelfDivingNumberSc1() {
		Assert.assertEquals(new int[] {9}, selfDividingNumbers(1,85));
		
	}
    

}
