package sdet.javafoundationexercise;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;
import org.testng.Assert;

public class RansomeCanConstructUsingconcurrentHashMap {
	
	public class RansomeCanCosntructUsingHashMap {
		
		public boolean canConstruct(String ransomNote, String magazine) {
			ConcurrentHashMap<Character, Integer> commonmap = new ConcurrentHashMap<Character, Integer>();
			
			if(ransomNote.length()>magazine.length()) {
				return false;
			}
			for (int i = 0; i < magazine.length(); i++) {

				commonmap.put(magazine.charAt(i), commonmap.getOrDefault((magazine.charAt(i)), 0)+1);

			}
			
			for (int i = 0; i < ransomNote.length(); i++) {
				
				if(commonmap.get(ransomNote.charAt(i))==1) {
					commonmap.remove(ransomNote.charAt(i));
				}

				commonmap.put(ransomNote.charAt(i), commonmap.getOrDefault((ransomNote.charAt(i)), 0)-1);

			}
			
			for (Map.Entry<Character, Integer> map:commonmap.entrySet()) {
				if(map.getValue()<0) {
					return false;
				}
			}
			return true;

		}
		
		@Test 
		public void verifySc1() {
			Assert.assertEquals(true, canConstruct("aa","aab"));
		}
		
		@Test 
		public void verifySc2() {
			Assert.assertEquals(false, canConstruct("a","b"));
		}
		
		@Test 
		public void verifySc3() {
			Assert.assertEquals(true, canConstruct("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
		}
		

	}

}
