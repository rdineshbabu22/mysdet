package sdet.week2.day1.classroom;

import org.junit.Test;

import junit.framework.Assert;

public class ShuffleString {
	   public String restoreString(String s, int[] indices) {
		   int temp=0 ;
		   char tempchar=0;
		 char[] cha= s.toCharArray();
		 
		 for (int i=0;i<indices.length;i++) {
			 for (int j=i+1;j<=indices.length-1;j++) {
				 
				 if(indices[i]>indices[j]) {
					 temp= indices[i];
					 indices[i]=indices[j];
					 indices[j]=temp;
					 tempchar=cha[i];
					 cha[i]=cha[j];
					 cha[j]=tempchar;
					 
				 }
			 }
			 
		 }
		  String s1= String.valueOf(cha);
		   return s1;  
	    }
	   
	   @Test

	   public void isBooleanSc3() {
	   	Assert.assertEquals("lohihel", restoreString("hellohi",new int[] {4,5,6,0,1,2,3}));
	   }
	   
}
