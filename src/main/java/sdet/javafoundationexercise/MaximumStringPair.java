package sdet.javafoundationexercise;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class MaximumStringPair {
	public int maximumNumberOfStringPairs(String[] words) {

		int pairCount=0;
		Set<String> stringSet= new HashSet<String>();
		char[] chaValue= new char[2];

		for (int i =0;i<words.length;i++){
			if(words[i].charAt(0)<words[i].charAt(1)) {
				chaValue[0]=words[i].charAt(0);
				chaValue[1]=words[i].charAt(1);
				
			} else {
				chaValue[0]=words[i].charAt(1);
				chaValue[1]=words[i].charAt(0);
				
			}
		stringSet.add(new String (chaValue));
		if((stringSet.size())!=(i+1)-pairCount)
		{
		pairCount++;

		}



		}


		return pairCount;


		        
		    }
	
	@Test
	
	public void verifStringPairSc1() {
		Assert.assertEquals(2, maximumNumberOfStringPairs(new String[] {"aa","bb","aa","cc","bb"}));
	}
	@Test
	
	public void verifStringPairSc2() {
		Assert.assertEquals(2, maximumNumberOfStringPairs(new String[] {"cd","ac","dc","ca","zz"}));
	}
	
	@Test
	
	public void verifStringPairSc3() {
		Assert.assertEquals(1, maximumNumberOfStringPairs(new String[] {"ab","ba","cc","ca"}));
	}
@Test
	
	public void verifStringPairSc4() {
		Assert.assertEquals(0, maximumNumberOfStringPairs(new String[] {"ab","aa","cc","ca"}));
	}

@Test
public void verifStringPairSc5() {
	Assert.assertEquals(6, maximumNumberOfStringPairs(new String[] {"hc","wt","qo","kw","ek","ci","ln","is","lm","ox","ze","iy","gr","yi","jf","xd","ch","dw","ue","pi","ua","se","tw","fs","yc","ev","cx","oq","wk","ke"}));
}

}
