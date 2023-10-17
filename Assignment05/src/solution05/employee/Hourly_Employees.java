package solution05.employee;

import java.util.Scanner;

public class Hourly_Employees extends Employee {
	
	private double wage;
	private double hours;

	@Override
	public void calculateTotalSalary() {
		if (hours <= 40) 
			System.out.println("Total Hourly Empolyee Salary - "+ wage * hours);
		else if (hours > 40)
		{
			System.out.println("Total Hourly Empolyee Salary - "+ 40 * wage + (hours - 40 ) * wage * 1.5);
		}	
		
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter hourly wage : ");
		this.wage = new Scanner(System.in).nextDouble();
		System.out.print("Enter hours worked : ");
		this.hours = new Scanner(System.in).nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.print("hourly wage : " + this.wage);
		System.out.print("hourly worked : " + this.hours);
		
	}

	@Override
	public String toString() {
		return "Hourly_Employees [wage=" + wage + ", hours=" + hours + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
