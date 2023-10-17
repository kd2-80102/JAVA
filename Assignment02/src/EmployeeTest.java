class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary < 0) {
			//DO NOTHING
		} else {
			this.salary = salary;
		}
	}
	
	public void display() {
		
		double yearlySalary = salary * 12;
		
		System.out.println("Yearly Salary : " + yearlySalary);
		
		yearlySalary = yearlySalary + (yearlySalary * 10 / 100);
		
		System.out.print("Yearly Salary after raise is : " + yearlySalary);
			
		
	}
	
	
}

public class EmployeeTest {
	public static void main(String args[]) {
		
		Employee test1 = new Employee("Mohit","Patil",3000);
		
		test1.display();
		
		
		
		
	}
}
