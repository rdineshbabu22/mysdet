package sdet.wee4.dailyjava;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCodeMoneyBank {
	
	public int totalMoney(int n) {
		int sum=0,temp=0,count=1,itr=0;
		for (int i=1;i<=n;i++) {
			System.out.println("Value of i is "+i);
			if(i%7==1 && (i/7)>=1) {
				System.out.println("Value of i is "+i);
				count++;
				temp=count;
				itr=count;
			}
			else {
				itr++;
				System.out.println("Value of itr is "+itr);
				temp=itr;	
				
			}
			sum=sum+temp;
			System.out.println("Value of sum is "+sum);
			System.out.println("Value of temp is "+temp);
			
		}
		return sum;
	}

	@Test
	public void verifyBankOutputSc1() {
		Assert.assertEquals(10, totalMoney(4));
	}
	@Test
	public void verifyBankOutputSc2() {
		Assert.assertEquals(1, totalMoney(1));
	}
	@Test
	public void verifyBankOutputSc3() {
		Assert.assertEquals(96, totalMoney(20));
	}
}
