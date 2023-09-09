package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

/*Pseudo code

Calculate the count of words in Sentences[i] using space as delimiter
Calculate the length of sentences array
If length of Sentence array is 1 .  (i.e) there is only once sentence ,  return the count of word
If length of Sentence array is greater tha  1 .  Compare count of word of first String element with next string element
Store greater value in variable maxWordCount
Compare maxWordCount value with next element in array till end of loop and return maxWordCount value
 * 
 * 
 * */

public class MaximumNumberOfWords {
	
	  public int mostWordsFound(String[] sentences) {
	        
		  int maxwordcount=0;

		  for (int i=0;i<sentences.length;i++)
		  {
		  if(sentences[i].split(" ").length>maxwordcount)
		  {
		  maxwordcount=sentences[i].split(" ").length;
				  
		  }

		  }

		  return maxwordcount;
	    }
@Test
public void verifySc1() {
	Assert.assertEquals(3, mostWordsFound(new String[] {"Hello bhai how","hi","hi hi"}));
}

@Test
public void verifySc2() {
	Assert.assertEquals(6, mostWordsFound(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
}

@Test
public void verifySc23() {
	Assert.assertEquals(3, mostWordsFound(new String[] {"please wait", "continue to fight", "continue to win"}));
}
}
