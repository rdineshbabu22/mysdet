package sdet.dsa.stack;

import java.util.Stack;

public class ValidParenthesis {
	
	  public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>()	;
	        
	        for(int i=0;i<s.length();i++) {
	        	if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[') {
	        		stack.push(s.charAt(i));
	        	}
	        	
	        	if((s.charAt(i)=='}' && stack.peek()=='{')||(s.charAt(i)==')'&& stack.peek()==')')||(s.charAt(i)==']'&& stack.peek()==']')) {
	        		stack.pop();
	        	}
	        }
	        
	        if(stack.size()==0) {
	        	return true;
	        	
	        }
	        else {
	        	return false;
	        }
	        
	        }

}
