package sdet.javafoundationexercise;

public class CheckIfaStringIsPangram {
	
	public boolean checkIfPangram(String sentence) {
	   int count=0;
       char[] charArray= new char[26];
       for(int i=0;i<sentence.length();i++){
       charArray[sentence.charAt(i)-'a']++;
       }

       for (int i=0;i<charArray.length;i++){
           if(charArray[i]>=1){
               count++;
           }
       }

       if(count==26){
           return true;
       }
       return false;
	}
}
