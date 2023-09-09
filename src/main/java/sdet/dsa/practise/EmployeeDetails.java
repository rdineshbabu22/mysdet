package sdet.dsa.practise;

import java.util.ArrayList;

public class EmployeeDetails {
	
	EmployeeDetails(String name,int age){
		this.name=name;
		this.age=age;
	}
	
String name ;
int age;

public static void main (String[] args){
	
	EmployeeDetails e1 = new EmployeeDetails("Dinesh",33);
	EmployeeDetails e2 = new EmployeeDetails("Suresh",34);
	EmployeeDetails e3 = new EmployeeDetails("Ganesh",35);
	
	EmployeeDetails[] employee = {e1,e2,e3};
	
	for (EmployeeDetails emp:employee) {
		System.out.println(emp.age);
		System.out.println(emp.name);
	}
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(20);
	al.add(30);
	System.out.println(al.get(2));
	
}

}



