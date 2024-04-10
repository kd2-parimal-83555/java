package com.employee.salary;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter Weekly Salary - ");
		weeklySalary = sc.nextDouble();
	}
	 
	@Override
	public String toString() {
		return "Salaried Employee - " + getFirstName()+" "+getLastName() + " Social Security Num - "+ getSSN() + " Weekly Salary - " + weeklySalary; 
	}
	
	@Override
	public void calaculatesalary() {
		double rewardSalary;
		
		rewardSalary = (weeklySalary * 0.10) + weeklySalary;
		
		System.out.print("Total Reward Salary of Salaried Employees = "+rewardSalary);
		
	}
	
}
