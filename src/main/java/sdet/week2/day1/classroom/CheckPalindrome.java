package sdet.week2.day1.classroom;

import org.junit.Test;

import junit.framework.Assert;

public class CheckPalindrome {
	
public boolean isPalindrome(String s) {
	boolean palindrome =false;
	int equalcount=0;
String a= s;
//Covert to lower case
String lowercase=s.toLowerCase();
System.out.println("Value of string in lower case is "+s);
//Trim all Non- Alphanumeric characters
String newstr=lowercase.replaceAll("[^a-zA-Z0-9]", "");
char[] str= newstr.toCharArray();
char[] reverstr = new char[str.length];

for (int k=str.length-1;k>=0;k--) {
	
	reverstr[(str.length-1)-k]=str[k];
	int i=k-(str.length-1);

	
}
for (int i=0;i<str.length;i++ ) {
		
		if(str[i]==reverstr[i]) {
			equalcount++;
		}
		else {
			palindrome=false;
		}
		
}

if (equalcount==str.length) {
	return true;
}
else {
	return false;
}
	
}

@Test
public void isBooleanSc1() {
	Assert.assertEquals(true, isPalindrome("Dad"));
}

@Test

public void isBooleanSc2() {
	Assert.assertEquals(false, isPalindrome("race a car"));
}
@Test

public void isBooleanSc3() {
	Assert.assertEquals(true, isPalindrome("ab_a"));
}

}
