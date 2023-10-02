package sdet.dsa.hackerrankassessment;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class MergeTwoArrays {

	public List<Integer> mergeTwoArrays(List<Integer> aOne, List<Integer> aTwo) {

		List<Integer> output = new ArrayList<Integer>();
		int iPointerointer = 0, jPointerointer = 0;

		while ((iPointerointer < aOne.size()) && (jPointerointer < aTwo.size()))

		{
          System.out.println("i Pointer"+iPointerointer+"Value is "+aOne.get(iPointerointer));
          System.out.println(" jPointer"+jPointerointer+"Value is "+aTwo.get(jPointerointer));
			if (aOne.get(iPointerointer) <= aTwo.get(jPointerointer)) {
				output.add(aOne.get(iPointerointer));
				iPointerointer++;
				
			}

			else if (aOne.get(iPointerointer) > aTwo.get(jPointerointer)) {
				System.out.println("Entered esle part");
				output.add(aTwo.get(jPointerointer));
				jPointerointer++;	

			}

		}
		System.out.println("Came out of while loop");
		
		if(iPointerointer<aOne.size()-1) {
			System.out.println("Value of ipointer"+iPointerointer);
			System.out.println("entered array One for lloop");
				for (int i=iPointerointer;i<aOne.size();i++) {
					output.add(aOne.get(i));	
				}
			
		}
			
		
		if(jPointerointer<aTwo.size()-1)
		{
			System.out.println("Value of jpointer"+jPointerointer);
			System.out.println("entered array two for lloop");
			System.out.println("Size of array Two"+aTwo.size());
			for (int i=jPointerointer;i<aTwo.size();i++) {
				
				System.out.println("Value of jpointer"+i);
				System.out.println(aTwo.get(i)+"is value in array 2");
				output.add(aTwo.get(i));	
			}
			System.out.println("Came out of array two for loop");
		}
		System.out.println("going to return");

		return output;

	}
	
	@Test
	
	public void verifyScenario1 () {
		List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(5);
        expectedList.add(5);
        
        List<Integer> inputListOne = new ArrayList<>();
        inputListOne.add(1);
        inputListOne.add(2);
        inputListOne.add(3);
        
        List<Integer> inputListTwo = new ArrayList<>();
        inputListTwo.add(2);
        inputListTwo.add(5);
        inputListTwo.add(5);
        
        
		Assert.assertEquals(expectedList, mergeTwoArrays(inputListOne,inputListTwo));
	}
	
	@Test
	public void verifyScenario2 () {
		List<Integer> expectedList = new ArrayList<>();
        expectedList.add(0);
        expectedList.add(1);
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(5);
        expectedList.add(7);
        expectedList.add(7);
        
        List<Integer> inputListOne = new ArrayList<>();
        inputListOne.add(1);
        inputListOne.add(5);
        inputListOne.add(7);
        inputListOne.add(7);
        
        List<Integer> inputListTwo = new ArrayList<>();
        inputListTwo.add(0);
        inputListTwo.add(1);
        inputListTwo.add(2);
        inputListTwo.add(3);
        
        
		Assert.assertEquals(expectedList, mergeTwoArrays(inputListOne,inputListTwo));
	}

}
