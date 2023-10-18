package sdet.javafoundationexercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class BaseBallGame {
	
	  public int calPoints(String[] operations) {
		  
		  Stack<Integer> queue = new Stack<>();

		  int sum=0,pointer=0;
		  while(pointer<operations.length){

		  if(operations[pointer] =="+"){
			  if(queue.size()>1) {
			 queue.add(queue.elementAt(queue.size()-1)+queue.elementAt(queue.size()-2));
			 System.out.println("Peek Value in Queue"+queue.peek());
             sum=sum+queue.peek();
			  }
			  
			  if(queue.size()==1) {
					 queue.add(queue.elementAt(queue.size()-1));
		             sum=sum+queue.peek();
					  }
			  
			  if(queue.size()==0) {
					 queue.add(0);
		             sum=sum+queue.peek();
					  }
		  }

		  else if(operations[pointer] =="C"){
			  
			  if(queue.size()==0) {
				  continue;
			  }else {
				  sum=sum-queue.peek();
				  queue.pop();
				  
			  }

		  }
		   else if(operations[pointer] =="D"){
			  queue.add(queue.peek()*2);
              sum=sum+queue.peek();	  

		  }
		   else{
			  queue.add(Integer.parseInt(operations[pointer]));
              sum=sum+queue.peek();

		  }
		  pointer++;

		  }
		  
		  return sum;
	        
	    }
	  
	  @Test
	  public void testSc1() {
	  Assert.assertEquals(5, calPoints(new String[] {"3","2"}));
  }
	  
	  @Test
	  public void testSc2() {
		  Assert.assertEquals(15, calPoints(new String[] {"3","2","+","5"}));
	  }
	  
	  @Test
	  public void testSc3() {
		  Assert.assertEquals(30, calPoints(new String[] {"5","2","C","D","+"}));
	  }
	  
	  
	  @Test
	  public void testSc4() {
		  Assert.assertEquals(27, calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
	  }
	  
	  
	  @Test
	  public void testSc5() {
		  Assert.assertEquals(0, calPoints(new String[] {"1","C"}));
	  }

}
