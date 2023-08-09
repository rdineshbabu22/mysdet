package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;
/**Pseudo Code
 * Step1 : Initialize counter variable with value as 0 to calculate stones count.
 * Step2 : Verify String jewels contains each char sequence present in String stones
 * Step 3: Increment the counter value for every match found
 * Step 4 :Return the counter value at end of preogram
 * 
 * @author ulasd
 *
 */

public class JewelsAndStones {
	
	public int numStonesInJewels(String jewels , String stones) {
		int stonesCounter=0;

		for ( int i=0;i<stones.length();i++) {
			if (jewels.contains(stones.substring(i, i+1))) {
				stonesCounter++;
			}
		
		}
		return stonesCounter;
	}

	@Test
	public void verifyStonesInJewlesSc1() {
		Assert.assertEquals(3, numStonesInJewels("aA","aAAbbb"));
	}
	
	@Test
	public void verifyStonesInJewlesSc2() {
		Assert.assertEquals(0, numStonesInJewels("zz","ZZZ"));
	}
}
