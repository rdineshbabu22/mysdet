package sdet.javafoundationexercise;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

/*Pseudo
Create new ArrayList of Type Character
Iterate through the Input String character by character
If the value of Character not equal to I . Add I in the array list
If the value of Character  equal to i. Reverse  the array list
Continue same until end of all characters in  the String
Convert character Arraylist to String
 * 
 * 
 * 
 * */

public class FaultyKeyboard {

	public String finalString(String s)

	{
		char[] cha = new char[s.length()];
		ArrayList<Character> al = new ArrayList<Character>();
		char temp = ' ';
		int icount = 0;
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'i') {
				al.add(s.charAt(i));
			} else if (s.charAt(i) == 'i') {
				for (int k = 0; k < al.size() / 2; k++) {
					temp = al.get(k);
					al.set(k, al.get(al.size() - 1 - k));
					al.set(al.size() - 1 - k, temp);
				}

			}

		}

		for (int k = 0; k < al.size(); k++) {
			output = output + al.get(k);
		}
		return output;
	}
//@Test
//
//public void verifySc1() {
//
//Assert.assertEquals(new String("hello"), finalString(new String("hello")));
//}

	@Test
	public void verifySc2() {

		Assert.assertEquals(new String("eh"), finalString(new String("hei")));
	}

	@Test
	public void verifySc3() {

		Assert.assertEquals(new String("he"), finalString(new String("heii")));
	}

	@Test
	public void verifySc4() {

		Assert.assertEquals(new String("hel"), finalString(new String("heiil")));
	}

	@Test
	public void verifySc5() {

		Assert.assertEquals(new String("leho"), finalString(new String("heiilio")));
	}
}