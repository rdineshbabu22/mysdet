package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class MergeStringAlternately {
	public String mergeAlternately(String word1, String word2) {
		int wordOneLength = word1.length();
		int wordTwoLength = word2.length();
		String mergeStr="";
		int iteratorValue=0;
		if(wordOneLength>wordTwoLength) {
			iteratorValue=wordOneLength;
		}
		else {
			iteratorValue=wordTwoLength;
		}
		
		for (int i=0;i<iteratorValue;i++) {
			if(i<wordOneLength) {
				mergeStr=mergeStr+word1.charAt(i);
			}
			if(i<wordTwoLength) {
				mergeStr=mergeStr+word2.charAt(i);
			}
		}
		return mergeStr;
		
	}

	@Test
	public void returnMergeStringSc1() {
		Assert.assertEquals("dkianlepsahna", mergeAlternately("dinesh","kalpana"));
	}
	
	@Test
	public void returnMergeStringSc2() {
		Assert.assertEquals("kkdadss", mergeAlternately("kddss","ka"));
	}
}
