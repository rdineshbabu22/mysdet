package sdet.week3.day1.classroom;

import org.junit.Test;

import junit.framework.Assert;

public class AnagramString {
	    public boolean isAnagram(String s, String t) {
		        boolean anagramFlag=true;
		        char temp='0';
		        char temp1='0';
		        char[] chaS= new char[s.length()];
		        char[] chaT= new char[t.length()];
		        chaS= s.toCharArray();
		        chaT= t.toCharArray();
		        if(chaS.length!=chaT.length) {
		        	return anagramFlag=false;
		        }
		        if(s.equals(t) && chaS.length!= 1 && chaT.length!=1 ) {
		        	return anagramFlag=false;
		        }
		        for ( int i=0;i<chaS.length;i++){
		            for (int j=i+1;j<=chaS.length-1;j++){
		                if(chaS[i]>chaS[j]){
		                    temp=chaS[i];
		                    chaS[i]=chaS[j];
		                    chaS[j]=temp;
		                }
	
		            }                
		            
		        }
		        for (int k=0;k<chaS.length;k++) {
		        	System.out.println("S Array is "+chaS[k]);
		        }
		        
		        for ( int i=0;i<chaT.length;i++){
		        	System.out.println("element in T Array is "+chaT[i]);
		            for (int j=i+1;j<=chaT.length-1;j++){
		            	System.out.println("Next element in T Array is "+chaT[j]);
		                if(chaT[i]>chaT[j]){
		                	temp1=chaT[i];
		                	System.out.println("Value of temp is"+temp1);
		                    chaT[i]=chaT[j];
		                    System.out.println("Value of cha[i] is"+chaT[i]);
		                    chaT[j]=temp1;
		                    System.out.println("Value of cha[j] is"+chaT[j]);
		                }
	
		            }
		        }
		        for (int k=0;k<chaT.length;k++) {
		        	System.out.println("T Array is "+chaT[k]);
		        }
		        
		        for ( int i=0;i<chaT.length;i++){
		        	if(chaS[i]!=chaT[i]){
		        		anagramFlag=false;
		        		break;
		        	}
		        }
		        
		        return anagramFlag;
	    }
	    
	    @Test
	    public void verifyIfAnagram() {
	    	Assert.assertEquals(false, isAnagram("rat","cat"));
	    }
//	    
//	    
	    @Test
	    public void verifyIfAnagramSc2() {
	    	Assert.assertEquals(false, isAnagram("a","ab"));
	    }
//	    
	    
		    @Test
		    public void verifyIfAnagramSc3() {
		    	Assert.assertEquals(false, isAnagram("anagram","anagram"));
		    }
		    
		    @Test
		    public void verifyIfAnagramSc4() {
		    	Assert.assertEquals(true, isAnagram("ab","ba"));
		    }


}
