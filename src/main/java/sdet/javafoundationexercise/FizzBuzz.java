package sdet.javafoundationexercise;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static List<String> fizzBuzz(int n) {

		List<String> alString = new ArrayList<String>();

		for (int i = 0; i <= n; i++) {
			if ((i % 3) != 0 && (i % 5) != 0) {
				alString.add(Integer.toString(i));

			}

			if ((i % 3) == 0 && (i % 5) == 0) {
				alString.add("FizzBuzz");

			}

			if ((i % 3) == 0 && (i % 5) != 0) {
				alString.add("Fizz");

			}

			if ((i % 3) != 0 && (i % 5) == 0) {
				alString.add("Buzz");

			}
		}
		return alString;

	}

}
