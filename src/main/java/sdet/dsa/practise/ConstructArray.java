package sdet.dsa.practise;

public class ConstructArray {
	
	 public String[][] constructEmployeeArray(String[] name, String[] age) {
		
		 String[][] employee = new String[name.length][2];
		 
		 for (int i=0;i<name.length;i++) {
			 employee[i][0]=name[i];
			 employee[i][1]=age[i];
			 System.out.println("Name Value in Employeee Array is"+employee[i][0]);
			 System.out.println("Name Value in Employeee Array is"+employee[i][1]);
			 
		 }
		 return employee;
		 
	 }
	 
	
	 

}
