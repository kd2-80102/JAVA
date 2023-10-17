package solution05.employee;

import java.util.Scanner;

public class Salaried_Employee extends Employee {
	
	private double weekly_salary; 

	@Override
	public void calculateTotalSalary() {
		System.out.println("Salaried Employee Salary - "+(this.weekly_salary));
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter weekly_salary : ");
		this.weekly_salary = new Scanner(System.in).nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.print("Weekly Salary : " + this.weekly_salary);
	}

	@Override
	public String toString() {
		return "Salaried_Employee [weekly_salary=" + weekly_salary + ", toString()=" + super.toString() + "]";
	}


}
