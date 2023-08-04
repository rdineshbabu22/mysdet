package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class Maximum69Number {
	   public int maximum69Number (int num) {
		   
		   String inputnum=Integer.toString(num);
		   String outputnum="";
		   int outputnumber=0;
		   char[] cha=inputnum.toCharArray();
		   for (int k=0;k<cha.length;k++) {
			   if (cha[k]=='6') {
				   cha[k]='9';
				   break;
			   }
		   }
		   outputnum = outputnum.valueOf(cha);
		   outputnumber=Integer.parseInt(outputnum);
		   return outputnumber;   
	    }
	   
	@Test
	public void verifyMax69NumberSc1() {
		Assert.assertEquals(9996, maximum69Number(9966));
	}

}
