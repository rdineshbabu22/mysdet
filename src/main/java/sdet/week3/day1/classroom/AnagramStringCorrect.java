package sdet.week3.day1.classroom;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class AnagramStringCorrect {
	 public boolean isAnagram(String s, String t) {
		 boolean isAnagram=true;
		   char temp='0';
	        char[] chaS= new char[s.length()];
	        char[] chaT= new char[t.length()];
	        chaS= s.toCharArray();
	        chaT= t.toCharArray();
	        if(chaS.length!=chaT.length) {
	        	return isAnagram=false;
	        }
	        if(s.equals(t) && chaS.length!= 1 && chaT.length!=1 ) {
	        	return isAnagram=false;
	        }
	        Arrays.sort(chaT);
	        Arrays.sort(chaS);
	        
	        for ( int i=0;i<chaT.length;i++){
	        	if(chaS[i]!=chaT[i]){
	        		isAnagram=false;
	        		break;
	        	}
	        }
	        
	       return  isAnagram;
	        	 
	 }
	 
	   @Test
	    public void verifyIfAnagramSc3() {
	    	Assert.assertEquals(true, isAnagram("anagram","nagaram"));
	    }
	 

}
