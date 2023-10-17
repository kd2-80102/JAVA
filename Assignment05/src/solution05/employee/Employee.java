package solution05.employee;

import java.util.*;

abstract public class Employee {
	private String firstName;
	private String lastName;
	private Double ssn;
	
	abstract public void calculateTotalSalary();
	
	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Name - ");
		this.firstName = scanner.next();
		
		System.out.print("Enter Last name - ");
		this.lastName = scanner.next();
		
		System.out.print("Enter Social Security Number - ");
		this.ssn = scanner.nextDouble();
	}
	
	public void displayData() {
		System.out.println("First Name - "+this.firstName);
		System.out.println("Last name - "+this.lastName);
		System.out.println("Social Security Number - "+this.ssn);

	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
