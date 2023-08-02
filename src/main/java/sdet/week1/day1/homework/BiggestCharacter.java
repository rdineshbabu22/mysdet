package sdet.week1.day1.homework;

import org.junit.Test;

import junit.framework.Assert;

public class BiggestCharacter {
	
	public char findBiggestcharacter(char[] cha,char value ) {
		
		for ( int i = 0;i<cha.length;i++)
		{
			if(cha[i]>value)
			{
				value=cha[i];
			    return value;
		}

		
	}
		return value;
	}
	
	
	@Test
	public void returCharacterTargetHasOneofSmallestValue() {
		
		Assert.assertEquals('h', findBiggestcharacter( new char[] {'b','d','h'}, 'e'));
		
}
	@Test
	public void returCharacterTargetHasLargestValue() {
		
		Assert.assertEquals('i', findBiggestcharacter( new char[] {'b','d','h'}, 'i'));
		
}
	
	@Test
	public void returCharacterTargetHasLeastValue() {
		
		Assert.assertEquals('b', findBiggestcharacter( new char[] {'b','d','h'}, 'a'));
		
}

}
