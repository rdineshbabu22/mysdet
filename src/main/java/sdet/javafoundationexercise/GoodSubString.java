package sdet.javafoundationexercise;

/*Initializse Startpointer=0, endpointer=Startpointer+3
intialize gsCount=0
Iterate through string character by chartcaer using while loop
while loop should get exceuted only if Endpointer is less than length of string
Compare the char v value between that starpoint and endpointe rane
If any value is duplicated  , move to next substirng set
if no duplicate found inceremnt gsCount  by 1
move to next substring
continue until end of while loop
Retrun gsCount
 * 
 * 
 * */

public class GoodSubString {

	public int countGoodSubstrings(String s) {
		

		int count = 0;
		int startPoint = 0, endPoint = startPoint + 3;
		int n = s.length();

		while (endPoint <= n) {
			if (!(s.charAt(startPoint) == s.charAt(startPoint + 1)) && !(s.charAt(startPoint + 1) == s.charAt(startPoint + 2))
					&& !(s.charAt(startPoint) == s.charAt(startPoint + 2))) {
				count++;

			} 
			startPoint++;
			endPoint = startPoint + 3;
		}

		return count;

	}

}
