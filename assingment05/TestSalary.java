package test.employee.salary;

import java.util.Scanner;

import com.employee.salary.*;

public class TestSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		Employee e;
		
		System.out.println("Enter Which Employee Salary Calculation is Need to be Done");
		System.out.println("0. Exit");
		System.out.println("1. Salaried Employee");
		System.out.println("2. Hourly Employee");
		System.out.println("3. Commisiion Employee");
		System.out.println("4. Base Plus Commission Employee");
		System.out.println("5. Reward Salaried Commission Employees");
		System.out.println("Enter Your Choice - ");
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 0 : 
				System.out.println("Thank You For Using our App !!!");
				break;
			
			case 1 : 
				e = new SalariedEmployee();
				e.acceptData(sc);
				System.out.println(e.toString());
				break;
				
			case 2 : 
				e = new HourlyEmployee();
				e.acceptData(sc);
				System.out.println(e.toString());
				e.calaculatesalary();
				break;
				
			case 3 : 
				e = new CommissionEmployee();
				e.acceptData(sc);
				System.out.println(e.toString());
				e.calaculatesalary();
				break;
				
			case 4 : 
				e = new BasePlusCommBaseSalary();
				e.acceptData(sc);
				System.out.println(e.toString());
				e.calaculatesalary();
				break;
		
			case 5 : 
				CommissionEmployee c = new BasePlusCommBaseSalary();
				BasePlusCommBaseSalary b = (BasePlusCommBaseSalary) c;
				
				b.acceptData(sc);
				System.out.println(b.toString());
				b.reward();
				break;
				
		}

	}

}
