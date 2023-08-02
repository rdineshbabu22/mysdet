package sdet.week1.day2.classroom;

import org.junit.Assert;
import org.junit.Test;

public class MatchesCount {
	
public int numberOfMatches(int n) {
	
	int matches =0,totalmatches=0;
	
	while (n>1) {
		
		
		
		if (n%2==0) {
			matches=n/2;
			n=n/2;
		
		}
		
		else {
			matches = (n-1)/2;
			n = ((n-1)/2)+1;
			
		
		}
		
		totalmatches=totalmatches+matches;
	}
        return totalmatches;
    }

@Test
public void numberOfMatchesOdd()
{
	Assert.assertEquals(6, numberOfMatches(7));
}

@Test
public void numberOfMatchesEven()
{
	Assert.assertEquals(13, numberOfMatches(14));
}


}
