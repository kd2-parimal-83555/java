package com.employee.salary;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	
	private double wages;
	private int hrs;
	
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter Wage - ");
		wages = sc.nextDouble();
		System.out.println("Enter Hours Worked - ");
		hrs = sc.nextInt();
	}
	
	@Override
	public String toString() {
		
		return "Salaried Employee - " + getFirstName()+" "+getLastName() + "Social Security Num - "+ getSSN() + " Hourly Wage  - " + wages + "Hours Worked - "+hrs; 

	}
	
	@Override
	public void calaculatesalary() {
		double totalSalary=0;
		if(hrs <= 40)
		{
			totalSalary = wages * hrs;
		}
		else if(hrs > 40)
		{
			totalSalary = 40 * wages + (hrs - 40) * wages * 1.5;
		}
		System.out.println("============================================");
		System.out.print("Total Salary of Hourly Employee = "+totalSalary);
		System.out.println("============================================");
	}
	
	
	
}
