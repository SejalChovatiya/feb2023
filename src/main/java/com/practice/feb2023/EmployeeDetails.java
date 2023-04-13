package com.practice.feb2023;

public class EmployeeDetails {
	
		 public static void main(String[] args) {
			 Employee e1 = new Employee(12, "BBB", 30, 12000);
			 Employee e2 = new Employee(11, "AAA", 32, 15000);
			 
			 e1.setSalary(10000);
			 e2.setSalary(13000);
			 
			 int tax1 = Employee.canculateTax(e1.getSalary());
			 int tax2 = Employee.canculateTax(e2.getSalary());
			 
			 System.out.println(e1.id + " " + e1.name + " " + e1.age + " " + e1.salary + " " + tax1);
			 System.out.println(e2.id + " " + e2.name + " " + e1.age + " " + e2.salary + " " + tax2);
		 }
	 
}
