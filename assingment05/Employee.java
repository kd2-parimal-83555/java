package com.employee.salary;

import java.util.Scanner;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private int SSN;
	
	public abstract void calaculatesalary();
	
	public Employee()
	{
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public Employee(String firstName, String lastName, int sSN) {
//		super();
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
	}

	public void acceptData(Scanner sc)
	{
		System.out.println("Enter First Name - ");
		firstName = sc.next();
		System.out.println("Enter Last Name - ");
		lastName = sc.next();
		System.out.println("Enter Social Security Number - ");
		SSN= sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "First Name - " + firstName + "Last Name - " + lastName + " Social Security Num - " +SSN;
	}
}

