package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class CandiesDistribution {
	
	  public int distributeCandies(int[] candyType) {
		  
		  int totalCandies=candyType.length; // n=6
		  int maxCandies=totalCandies/2; // n=3
		  int initialDiffTypeCandies=0,aliceDifCandies=0;
		  
		  for(int i=0;i<candyType.length-1;i++)
		  {
			  int equalCounter=0,temp;
			  for(int j=i+1;j<=candyType.length-1;j++) 
			  {
				  
				  if(candyType[i]==candyType[j]) {
					  equalCounter++;
					  temp=candyType[i+equalCounter];
					  candyType[i+equalCounter]=candyType[j];
					  candyType[j]=temp;
					  				  
				  }
				  
				 
			  }
			  i=i+equalCounter;
			  initialDiffTypeCandies++;
		  }
		  
		  if(!(candyType[candyType.length-1]==(candyType[candyType.length-2]))){
			  initialDiffTypeCandies++;
		  }
		  
		  if(initialDiffTypeCandies>=maxCandies) {
			  
			  aliceDifCandies=maxCandies;
			  
		  }
		  else {
			  aliceDifCandies=initialDiffTypeCandies;
			  
		  }
		  
	        return aliceDifCandies;
	    }
	  
		 @Test
		 public void distributeCandiesSc1() {
			 Assert.assertEquals(4, distributeCandies(new int[] {1,1,5,2,2,3,3,4}));
		 }
		 
		 @Test
		 public void distributeCandiesSc2() {
			 Assert.assertEquals(3, distributeCandies(new int[] {1,1,1,2,3,3}));
		 }
		 @Test
		 public void distributeCandiesSc3() {
			 Assert.assertEquals(1, distributeCandies(new int[] {1,1,1,1,1,1}));
		 }
		 
		 @Test
		 public void distributeCandiesSc4() {
			 Assert.assertEquals(2, distributeCandies(new int[] {1,1,3,4}));
		 }
		 
		 @Test
		 public void distributeCandiesSc5() {
			 Assert.assertEquals(2, distributeCandies(new int[] {1,1,1,1,1,5}));
		 }

}
