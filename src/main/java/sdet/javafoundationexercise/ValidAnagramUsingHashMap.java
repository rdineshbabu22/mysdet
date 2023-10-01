package sdet.javafoundationexercise;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class ValidAnagramUsingHashMap {

	public boolean isAnagram(String s, String t) {

		HashMap<Character, Integer> smap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> tmap = new HashMap<Character, Integer>();

		if (s.length() == t.length()) {
			for (int i = 0; i < s.length(); i++)

			{

				smap.put(s.charAt(i), smap.getOrDefault((s.charAt(i)), 0)+1);
				tmap.put(t.charAt(i), tmap.getOrDefault((t.charAt(i)), 0)+1);
				

			}
		
			return smap.equals(tmap);
		}

		return false;
	}
	
	@Test
	public void verifySc1() {
		Assert.assertEquals(true, isAnagram("anagram","nagaram"));
	}

}
