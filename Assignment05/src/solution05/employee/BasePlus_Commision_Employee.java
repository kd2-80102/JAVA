package solution05.employee;

import java.util.Scanner;

public class BasePlus_Commision_Employee extends Employee {
	private double grossSales;
	private double commisionRate;
	private double baseSalary;
	
	@Override
	public void calculateTotalSalary() {
		// TODO Auto-generated method stub
		System.out.println("Total Base Plus Commission Employee Salary - "+(this.commisionRate * this.grossSales)+baseSalary);
		
		
	}

	@Override
	public void acceptData() {
		// TODO Auto-generated method stub
		super.acceptData();
		System.out.print("Enter gross sales : ");
		this.grossSales = new Scanner(System.in).nextDouble();
		System.out.print("Enter comission rate : ");
		this.commisionRate = new Scanner(System.in).nextDouble();
		System.out.print("Enter Base Salary : ");
		this.baseSalary = new Scanner(System.in).nextDouble();
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		System.out.print("gross sales : " + this.grossSales);
		System.out.print("comission rate : " + this.commisionRate);
		System.out.print("Base Salary : " + this.baseSalary);
		
	}

	@Override
	public String toString() {
		return "BasePlus_Commision_Employee [grossSales=" + grossSales + ", commisionRate=" + commisionRate
				+ ", baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
