package com.employee.salary;

import java.util.Scanner;

public class BasePlusCommBaseSalary extends CommissionEmployee {
	
	private double baseSalary;
	
	@Override
	public String toString() {
		
		return "Salaried Employee - " + getFirstName()+" "+getLastName() + "Social Security Num - "+ getSSN() + " Gross Sales - " + getGrossSales() + "Commission Rate - " + getComm() + "Base Salary - " + baseSalary; 

	}
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter Base Salary - ");
		baseSalary = sc.nextDouble(); 
	}
	
	@Override
	public void calaculatesalary() {
		double totalSalary;
		totalSalary = (getComm() * getGrossSales()) + baseSalary;
		System.out.println("==========================================");
		System.out.print("Total Salary of Hourly Employee = "+totalSalary);
		System.out.println("==========================================");
	}
	
	public void reward()
	{
double rewardSalary;
		
		rewardSalary = (getComm() * getGrossSales()) + (baseSalary*0.10)+baseSalary;
		
		System.out.print("Total Reward Salary of Salaried Employees = "+rewardSalary);
		
	}
}
