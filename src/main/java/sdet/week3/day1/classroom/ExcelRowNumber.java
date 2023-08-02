package sdet.week3.day1.classroom;

import org.junit.Test;

import junit.framework.Assert;

public class ExcelRowNumber {
	
    public int titleToNumber(String columnTitle) {
        int sum=0,multiplier=1;
        char[] cha=columnTitle.toCharArray();

        for (int i=cha.length-1;i>=0;i--){
            sum=sum+multiplier*(cha[i]-'@');
            multiplier=multiplier*26;
        }

         return sum;  
       }
    
    @Test
    public void verifyExceltitleSc1() {
    	Assert.assertEquals(701, titleToNumber("ZY"));
    }

}
