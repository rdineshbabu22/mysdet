package sdet.javafoundationexercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DestinationCity {
	public String destCity(List<List<String>> paths) {
      	HashSet<String> allcity = new HashSet<String>();
		HashSet<String> sourcecity = new HashSet<String>();
		
		for (int i = 0; i < paths.size(); i++) {
			List<String> cities = paths.get(i);
			sourcecity.add(cities.get(0));
			allcity.add(cities.get(0));
			allcity.add(cities.get(1));
			
		}
	for (String alccity:allcity){
		System.out.println(alccity);
		if(!(sourcecity.contains(alccity))){
			return alccity;
		}
	}
	
		return "";

	}


}
