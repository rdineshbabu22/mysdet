package sdet.javafoundationexercise;

import org.junit.Test;

import junit.framework.Assert;

public class DivisorOfThree  {
    public boolean isThree(int n) {

    boolean divisorOfThree=true;
int count=2;

if(n<=2){
 divisorOfThree=false;
}

if(n>=3){

for (int i=2 ;i<=(n/2);i++){

if(n%i==0){
count++;
}

if(count>3){
 divisorOfThree=false;
break;

}

}
if(count<=2){
 divisorOfThree=false;
}
        
    }
    return divisorOfThree;
}
    
	@Test
	public void verifyIsDivisor() {
		Assert.assertEquals(true, isThree(9));
	}
	@Test
	public void verifyIsDivisorSc2() {
		Assert.assertEquals(false, isThree(2));
	}
}

