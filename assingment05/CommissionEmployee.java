package com.employee.salary;

import java.util.Scanner;

public class CommissionEmployee extends Employee {

	private int grossSales;
	private int comm;
	
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter Gross Sales - ");
		grossSales = sc.nextInt();
		System.out.println("Enter Commission Rate - ");
		comm = sc.nextInt();

	}
	
	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	@Override
	public String toString() {
		return "Salaried Employee - " + getFirstName()+" "+getLastName() + "Social Security Num - "+ getSSN() + " Gross Sales - " + grossSales + "Commission Rate - " + comm; 

	}

	@Override
	public void calaculatesalary() {
		double totalSalary;
		totalSalary = comm * grossSales;
		System.out.println("============================================");
		System.out.print("Total Salary of Hourly Employee = "+totalSalary);
		System.out.println("============================================");
		
	}
}
