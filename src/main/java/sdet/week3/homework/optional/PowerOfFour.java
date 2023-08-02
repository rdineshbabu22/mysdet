package sdet.week3.homework.optional;

public class PowerOfFour {
	public boolean isPowerOfFour(int n) {
		int reminder=0,quotient=0;
		if (n==1) {
			return true;
		}
		if (n<1) {
			return false;
		}
		
		while (n>1) {
			reminder=n%4;
			quotient=n/4;
			n=quotient;
			if(reminder!=0) {
				return false;
			}
			if((reminder==0 && quotient==1)) {
				return true;
			}
			
		}
		return false;
		
	}

}
