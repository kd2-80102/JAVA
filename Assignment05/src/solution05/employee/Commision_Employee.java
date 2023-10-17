package solution05.employee;

import java.util.Scanner;

public class Commision_Employee extends Employee {
	private double grossSales;
	private double commisionRate;

	@Override
	public void calculateTotalSalary() {
		System.out.println("Total Commision Employee Salary - "+(this.commisionRate * this.grossSales));
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter gross sales : ");
		this.grossSales = new Scanner(System.in).nextDouble();
		System.out.print("Enter comission rate : ");
		this.commisionRate = new Scanner(System.in).nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.print("gross sales : " + this.grossSales);
		System.out.print("comission rate : " + this.commisionRate);
		
	}

	@Override
	public String toString() {
		return "Commision_Employee [grossSales=" + grossSales + ", commisionRate=" + commisionRate + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
