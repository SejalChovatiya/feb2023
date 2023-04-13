package com.practice.feb2023;

public class Employee {
	int id;
	String name;
	int age;
	int salary;


	public Employee(int i, String n, int age, int salary) {
		this.id = i;
		this.name = n;
		this.age = age;
		this.salary = salary;
		System.out.println("Employee Detail :");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary * 13 / 100;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static int canculateTax(int salary) {
		return salary * 13 / 100;
	}

}
