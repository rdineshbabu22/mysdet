package sdet.javafoundationexercise;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class BackSpaceCompare {
	
	  public boolean backspaceCompare(String s, String t) {
		  Stack<Character> sString = new Stack<>();
		  Stack<Character> tString = new Stack<>();
		  
		  for (int i =0;i<s.length();i++) {
			  if(s.charAt(i)=='#') {
				  if(sString.size()==0) {
					  continue;
				  }
				  else {
					  sString.pop();
				  }
			  }
			  else {
				  sString.push(s.charAt(i));
			  }
		  }
		  
		  for (int i =0;i<t.length();i++) {
			  if(t.charAt(i)=='#') {
				  if(tString.size()==0) {
					  continue;
				  }
				  else {
					  tString.pop();
				  }
			  }
			  else {
				  tString.push(t.charAt(i));
			  }
		  }
		  if(sString.size()!=tString.size()) {
			  return false;  
		  }
		  else {
			  
			  for(int i=0;i<sString.size();i++) {
				  if(sString.get(i)!=tString.get(i)) {
					  return false;
				  }
			  }
			  
		  }return true;
	       
	    }
	  @Test
	  public void Sc1() {
		  Assert.assertEquals(true, backspaceCompare("ab#c","ad#c"));
	  }
	  
	  @Test
	  public void Sc2() {
		  Assert.assertEquals(false, backspaceCompare("a#c","b"));
	  }
	  
	  @Test
	  public void Sc3() {
		  Assert.assertEquals(false, backspaceCompare("ab##","bc#d#"));
	  }


}
