package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class BowlingGame {

	public int isWinner(int[] player1, int[] player2) {
		int pointer = 1, playerOneScore = player1[0], playerTwoScore = player2[0], tenScoreIndexPlayerOne = 0,
				tenScoreIndexPlayerTwo = 0;

		while (pointer < player1.length) {
			System.out.println("Player one Score"+playerOneScore);
			System.out.println("Player two Score"+playerTwoScore);
			
			if (pointer == 1) { 
				System.out.println("Pointer 1 loop");
				if(player1[0]==10) {
				playerOneScore = playerOneScore + (2 * player1[pointer]);
			} else {
				playerOneScore = playerOneScore + player1[pointer];
			}
			}
			
			System.out.println("Player one Score"+playerOneScore);

			if (pointer == 1) {
				if(player2[0] == 10) {
				playerTwoScore = playerTwoScore + (2 * player2[pointer]);
			} else {
				playerTwoScore = playerTwoScore + player2[pointer];
			}
		}
			
			System.out.println("Player two Score"+playerTwoScore);

			if (pointer > 1) {
				
				
					if (player1[pointer - 1] == 10 || player1[pointer - 2] == 10) {
						playerOneScore = playerOneScore + (2 * player1[pointer]);
					}

					else {
						playerOneScore = playerOneScore + player1[pointer];
					}
					
					System.out.println("Player one Score"+playerOneScore);

					if (player2[pointer - 1] == 10 || player2[pointer - 2] == 10) {
						playerTwoScore = playerTwoScore + (2 * player2[pointer]);
					}

					else {
						playerTwoScore = playerTwoScore + player2[pointer];
					}
					
					System.out.println("Player otwo Score"+playerTwoScore);
				

			}
			pointer++;
		}

		System.out.println(playerOneScore);
		System.out.println(playerTwoScore);
		if (playerOneScore > playerTwoScore) {
			return 1;
		} else if (playerTwoScore > playerOneScore) {
			return 2;
		} else {
			return 0;
		}

	}

//	@Test
//	public void verifySc1() {
//		Assert.assertEquals(1, isWinner(new int[] { 4, 10, 7, 9 }, new int[] { 6, 5, 2, 3 }));
//	}
//
//	@Test
//	public void verifySc2() {
//		Assert.assertEquals(2, isWinner(new int[] { 3, 5, 7, 6 }, new int[] { 8, 10, 10, 2 }));
//	}
//
//	@Test
//	public void verifySc3() {
//		Assert.assertEquals(0, isWinner(new int[] { 2, 3 }, new int[] { 4, 1 }));
//	}
//
//	@Test
//	public void verifySc4() {
//		Assert.assertEquals(1, isWinner(new int[] { 0, 4, 7, 2, 0 }, new int[] { 2, 3, 3, 0, 1 }));
//	}
//
//	@Test
//	public void verifySc5() {
//		Assert.assertEquals(2, isWinner(new int[] { 5, 6, 1, 10 }, new int[] { 5, 1, 10, 5 }));
//	}
	
//	@Test
//	public void verifySc6() {
//		Assert.assertEquals(1, isWinner(new int[] {10 }, new int[] {9 }));
//	}
	
	@Test
	public void verifySc7() {
		Assert.assertEquals(0, isWinner(new int[] {10,1 }, new int[] {10,1}));
	}
}
