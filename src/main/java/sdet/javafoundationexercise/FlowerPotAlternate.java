package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

/*
 * 1) Did I understand the problem? Yes 
*  A) Ask for an example !
*  B) Re-confirm the input, output
*  C) Are there any constraints?

2) Derive your test data

*  - Minimal 3 test data set
*  - Positive, Edge, Negative
*  - Validate with your interviewer !!
* - Confirm the constraint

3) Do I know how to solve this?

*  - Ask for time (15 sec - 60 sec)
*  = Create trust and transparency

4) Ask for hints, if you do not understand !!

*  Put it nicely
*  Never leave a big silence between you and interviewer
*  Sorry, I could not make it? Can i have another question?

*  Tip: Sorry, I do not know the approach. But making a note of it !!
*  I will go back and work on this today.

5) Do I know alternate solutions? No

*  Yes, How many?
*  No (It is okay to have one solution)

6) If you know more than one, then do this. Skip

*   Explain the approaches 
*   What O Notations (Space and Time Complexity)
*   Which solution is better and why?
*   Ask interviewer which approach to apply?

7. Start with Psuedo code

Basic english (keywords)
Step by step approach
Test the pseudo code written


Pseudo Code :
Calculate the length of the array
Count the values of 1 in the array
Take sum of Count of 1 element in array + n value 
Calculate expected1 = Arryleneth/2 (Even) 0r Arraylength+1/2  (Odd)
Compare sum value and expectted 1value 
IF its greater that Output will be false 
If its lesser or equal then follow below steps
Start comparing value of first element in array next element (handle Zero conditiom)
both should not be equal 
increment iterator
Current element and next element are not equal
Minus the value of n--




Verify if Sum of N valu
)Read the value of elements in the arra

8. Implement the code 

Most of the interviewers ask you to use Notepad
Keep talking while solving 

9. Test against different test data set

Confirm it is working for each test data set

10. Debug them to solve it !

Use breakpoints, watch, variables to confirm what is wrong
Fix and run and finally Summarize
 * 
 * 
 * Dry Code 
 * 
 * public boolean placeFlow
 * 
 * 
 * 
 * 
 * Pseudo Code :
Calculate the length of the array
Count the values of 1 in the array
Take sum of Count of 1 element in array + n value 
Calculate expected1 = Arryleneth/2 (Even) 0r Arraylength+1/2  (Odd)
Compare sum value and expectted 1value 
IF its greater that Output will be false 
If its lesser or equal then follow below steps
Start comparing value of first element in array next element (handle Zero conditiom)
both should not be equal 
increment iterator
Current element and next element are not equal
Minus the value of n--
 * 
 * */

public class FlowerPotAlternate {
	public boolean flowerBed(int[] flowerbed, int n) {
		
		int expectedOne=0,countOfOneInArray=0,oneCounter=0;
		boolean previousFlag=false;
		
		if(n==0) {
			return true;
		}
		
		for (int i=0;i<flowerbed.length;i++) {
			if (flowerbed[i]==1) {
				oneCounter++;
			}
			
		}
		System.out.println("Total numebe of 1 present n array"+oneCounter);
		if (flowerbed.length==1 && flowerbed[0]==0 && n==1) {
			return true;
		}
		if (flowerbed.length>1 && flowerbed.length%2==0) {
			expectedOne=flowerbed.length/2;
			if((n+oneCounter)>expectedOne){
				return false;
			}
//			else if((n+oneCounter)<expectedOne){
//				return true;
//			}
		}
		
		if (flowerbed.length>1 && flowerbed.length%2!=0  ) {
			expectedOne=(flowerbed.length+1)/2;
			if((n+oneCounter)>expectedOne){
				return false;
			}
//			else if((n+oneCounter)<expectedOne){
//				return true;
//			}
		}
		
//		if (flowerbed.length>1 && flowerbed.length%2!=0 && flowerbed[0]==0 ) {
//			expectedOne=(flowerbed.length-1)/2;
//			if((n+oneCounter)>expectedOne){
//				return false;
//			}
//			else if((n+oneCounter)<expectedOne){
//				return true;
//			}
//		
//		}
		
		if ((n+oneCounter)<= expectedOne) {
			
			for (int i =0;i<flowerbed.length-1;i++) {
				if(flowerbed[i]==0 && flowerbed[i+1]==0 && previousFlag ==false) {
					flowerbed[i]=1;
					n--;
					if(n==0) {
						System.out.println(n);
						return true;
					}
					previousFlag=true;
				}
				
				if((flowerbed[i]!= flowerbed[i+1]) && previousFlag ==false) {
					if(flowerbed[i]==1) {
						previousFlag=true;
					}
				}
				
				if((flowerbed[i]!= flowerbed[i+1]) && previousFlag ==true) {
					if(flowerbed[i]==0) {
						previousFlag=false;
					}
					
				}
				
				if(flowerbed[i]==0 && flowerbed[i+1]==0 && previousFlag ==true && n!=0) {
					if ((i+1)!=flowerbed.length-1) {
						previousFlag=false;
						
					}else {
						flowerbed[i+1]=1;
						n--;
						if (n==0) {
						return true;
						}
					}
					
				}
				
			}
			
		}
			
		return false;
		
	}
	
	@Test
	public void verifySc1() {
		Assert.assertEquals(true, flowerBed(new int[] {0},1));

	}
		
	
	@Test
	public void verifySc2() {
		Assert.assertEquals(true, flowerBed(new int[] {1},0));
	}
	@Test
	public void verifySc3() {
		Assert.assertEquals(false, flowerBed(new int[] {1},1));
	}
	@Test
	public void verifySc4() {
		Assert.assertEquals(true, flowerBed(new int[] {0},0));
	}
	@Test
	public void verifySc5() {
		Assert.assertEquals(true, flowerBed(new int[] {0,0},1));
	}
	
	@Test
	public void verifySc6() {
		Assert.assertEquals(false, flowerBed(new int[] {0,1},1));
	}

	@Test
	public void verifySc7() {
		Assert.assertEquals(false, flowerBed(new int[] {1,0},1));
	}
	
	@Test
	public void verifySc8() {
		Assert.assertEquals(true, flowerBed(new int[] {1,0},0));

}
	
	@Test
	public void verifySc9() {
		Assert.assertEquals(true, flowerBed(new int[] {1,0,0},1));

}
	@Test
	public void verifySc10() {
		Assert.assertEquals(true, flowerBed(new int[] {1,0,0,0,1},1));

}
	@Test
	public void verifySc11() {
		Assert.assertEquals(false, flowerBed(new int[] {1,0,0,0,1},2));

}
	@Test
	public void verifySc12() {
		Assert.assertEquals(false, flowerBed(new int[] {0,1,0},1));
	}
	
	@Test
	public void verifySc14() {
		Assert.assertEquals(false, flowerBed(new int[] {1,0,1},1));
	}
	@Test
	public void verifySc15() {
		Assert.assertEquals(false, flowerBed(new int[] {1,0,1,0,0,1,0},1));
	}
	@Test
	public void verifySc16() {
		Assert.assertEquals(false, flowerBed(new int[] {1,0,1,0,0,1,0},1));
	}
	
	@Test
	public void verifySc17() {
		Assert.assertEquals(true, flowerBed(new int[] {0,0,1,0,1},1));
	}
	@Test
	public void verifySc18() {
		Assert.assertEquals(false, flowerBed(new int[] {0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0},17));
	}
	
	@Test
	public void verifySc19() {
		Assert.assertEquals(true, flowerBed(new int[] {0,0,1,0,0},1));
	}
}

