package sdet.week3.day1.classroom;

public class AnagramStringNew {
	public boolean isAnagram(String s, String t) {
		boolean isAnagram=true;
		int fromindexs=0,fromindext=0,charinSCount=0,charinTCount=0;
		if(s.length()!=t.length()) {
			isAnagram=false;
		}
		
		for (int i =0;i<s.length();i++) {
			if (t.indexOf(s.charAt(i))==-1) {
				isAnagram=false;
			}
			
			while(fromindexs!=-1) {
				fromindexs=s.indexOf(s.charAt(i),fromindexs);
				charinSCount++;
				
			}
            while(fromindext!=-1) {
            	fromindext=t.indexOf(s.charAt(i),fromindexs);
            	charinTCount++;
				
			}
            
            if(charinTCount!=charinSCount) {
            	isAnagram=false;
            }
		}
		
		return isAnagram;
	}
	
}
