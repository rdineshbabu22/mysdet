package sdet.javafoundationexercise;

import org.junit.Assert;
import org.junit.Test;

public class StraightLine {
	 public boolean checkStraightLine(int[][] coordinates) {
		 boolean allXCoOrdinatesElementsSame=false,allYCoOrdinatesElementsSame=false,straightLineCoOrdinates=false;
		 int xCount=1, yCount=1,currentslope=0,previouslope=0,xCoOrdinate=1,yCoOrdinate=1;
		 
		 if(coordinates.length==2) {
			 System.out.println(coordinates.length);
			 straightLineCoOrdinates= true;
		 }
		 else {
			 for (int i=0; i<coordinates.length-1;i++) {
				 if(coordinates[i][0]==coordinates[i+1][0]) {
					 System.out.println("Value of X element is"+coordinates[i][0]+coordinates[i+1][0]);
					 xCount++; 
				 }
				
			 }
			 if(xCount==coordinates.length) {
				 System.out.println("Count of X similar elements"+xCount);
				 allXCoOrdinatesElementsSame=true;
			 }
			 
			 for (int i=0; i<coordinates.length-1;i++) {
				 if(coordinates[i][1]==coordinates[i+1][1]) {
					 System.out.println("Value of Y element is"+coordinates[i][1]+coordinates[i+1][1]);
					 yCount++; 
				 }
			 }
			 if(yCount==coordinates.length) {
				 System.out.println("Count of Y similar elements"+yCount);
				 allYCoOrdinatesElementsSame=true;
			 }
			 
			 if(allYCoOrdinatesElementsSame==true || allXCoOrdinatesElementsSame==true)
			 {
				return straightLineCoOrdinates=true;
				 
			 }
			 
			 for (int k=0; k<coordinates.length-1;k++) {
				 xCoOrdinate=coordinates[k][0]-coordinates[k+1][0];
				 yCoOrdinate=coordinates[k][1]-coordinates[k+1][1];
				 if(xCoOrdinate==0||yCoOrdinate==0) {
					 straightLineCoOrdinates=false;
					 break; 
				 }
				 currentslope=(yCoOrdinate/xCoOrdinate);
				 if(previouslope==0) {
					 previouslope=currentslope;
				 }
				 System.out.println("Currentl Slope is"+currentslope);
				 System.out.println("PRevious Slope is"+previouslope);
				 if(currentslope!=previouslope) {
					 straightLineCoOrdinates=false;
					 break;
				 }
				 else {
					 straightLineCoOrdinates= true;
				 }
			 }
			
			 
			 
		 }
		 return straightLineCoOrdinates;
	}
	    
	 
	 
	 @Test
	 public void verifyStraightLneSc1() {
		 Assert.assertEquals(true, checkStraightLine(new int[][] {{1,1},{2,3}}));
	 }
	 
	 @Test
	 public void verifyStraightLneSc2() {
		 Assert.assertEquals(true, checkStraightLine(new int[][] {{1,1},{1,3},{1,5}}));
	 }
	 
	 @Test
	 public void verifyStraightLneSc3() {
		 Assert.assertEquals(true, checkStraightLine(new int[][] {{1,4},{2,4},{4,4}}));
	 }
	 
	 
	 @Test
	 public void verifyStraightLneSc4() {
		 Assert.assertEquals(false, checkStraightLine(new int[][] {{1,1},{2,2},{3,4},{4,5}}));
	 }
	 
	 @Test
	 public void verifyStraightLneSc5() {
		 Assert.assertEquals(true, checkStraightLine(new int[][] {{1,2},{3,4},{4,5},{5,6}}));
	 }
	 @Test
	 public void verifyStraightLneSc6() {
		 Assert.assertEquals(false, checkStraightLine(new int[][] {{1,1},{2,2},{2,0}}));
	 }
	 
}
