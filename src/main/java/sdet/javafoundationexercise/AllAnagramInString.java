package sdet.javafoundationexercise;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AllAnagramInString {

	public List<Integer> findAnagrams(String s, String p) {
		int startIndex = 1, endIndex = p.length(), count = 0;
		List<Integer> al = new ArrayList<Integer>();
		int[] inputValue = new int[26];
		for (int i=0;i<p.length();i++)

		{
			inputValue[s.charAt(i) - 'a'] = 1;
		}
		for (int j = 0; j < p.length(); j++) {
			{
				if (inputValue[p.charAt(j) - 'a'] == 1) {
					count++;
				}
			}

			if (count == p.length()) {
				al.add(0);
			}

		}

		while (startIndex <= s.length() - p.length()) {
			count = 0;
			inputValue[s.charAt(startIndex - p.length()+2) - 'a'] = 0;
			inputValue[s.charAt(startIndex+2) - 'a'] = 1;
			for (int j = 0; j < p.length(); j++) {
				{
					if (inputValue[p.charAt(j) - 'a'] == 1) {
						count++;
					}
				}

				if (count == p.length()) {
					al.add(startIndex);
				}
			}
			startIndex++;
		}
		for(int a : al) {
			System.out.println(a);
		}
		return al;
	

	}
	
//	@Test
//	public void verifySc1() {
//		Assert.assertEquals(new int[] {0,1,2}, findAnagrams("abab","ab").toArray());
//	}
	
	@Test
	public void verifySc2() {
		Assert.assertEquals(new int[] {0,6}, findAnagrams("cbaebabacd","abc").toArray());
	}

}
