package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class ChessColour {
	
	public boolean squareIsWhite(String coordinates) {
		if((coordinates.charAt(0)%2==0 &&coordinates.charAt(1)%2==0) || (coordinates.charAt(0)%2!=0 &&coordinates.charAt(1)%2!=0)) {
			return false;
		}
		
		return true;
	}
	
	@Test
	public void verifyChessColourSc1() {
	Assert.assertEquals(false, squareIsWhite("a1"));	
	}
	
	@Test
	public void verifyChessColourSc2() {
		Assert.assertEquals(false, squareIsWhite("d6"));	
		}
	@Test
	
	public void verifyChessColourSc3() {
		Assert.assertEquals(true, squareIsWhite("b5"));	
		}
	@Test
	
	public void verifyChessColourSc4() {
		Assert.assertEquals(true, squareIsWhite("c4"));	
		}


}
