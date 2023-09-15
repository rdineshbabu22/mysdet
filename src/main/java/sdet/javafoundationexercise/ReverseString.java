package sdet.javafoundationexercise;

public class ReverseString {
	   public String reverseWords(String s) {

		   char[] reverseCharArray= new char[s.length()];
		   String[] stringArray = s.split("");
		   int count=0;

		   for (int i =0;i<stringArray.length;i++)

		   {

		   reverseCharArray[count]=s.charAt(i);
		   count++;

		   }

		   String output =new String(reverseCharArray);
		   return output;
		           
		       }

}
