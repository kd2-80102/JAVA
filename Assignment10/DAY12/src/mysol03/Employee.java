package mysol03;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	
    private int id;
    private String name;
    private double salary;
    
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Salary: ");
        this.salary = sc.nextDouble();
    }
    
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if(this.id == other.id)
			return true;
		return false;
	}
	
	
    
    

	
    
    
	
	
	
	
	

}
