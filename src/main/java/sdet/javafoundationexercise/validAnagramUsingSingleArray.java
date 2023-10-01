package sdet.javafoundationexercise;

public class validAnagramUsingSingleArray {
	public boolean isAnagram(String s, String t) {

		short[] chaArray = new short[26];

		if (s.length() != t.length()) {

			return false;
		}

		else {

			for (int i = 0; i < s.length(); i++) {

				chaArray[s.charAt(i) - 'a']++;
				chaArray[t.charAt(i) - 'a']--;

			}

		}

		for (int i = 0; i < chaArray.length; i++) {

			if (chaArray[i] != 0) {
				return false;
			}
		}

		return true;
	}

}
