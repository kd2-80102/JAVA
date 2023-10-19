package mysol03;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int difference = Integer.compare(e1.getId(), e2.getId());
		return difference;
	}
}

public class EmployeeMain {

	static int menu() {
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee by ID");
		System.out.println("3. Find Employee by ID");
		System.out.println("4. Sort Employees by ID");
		System.out.println("5. Edit Employee by ID");
		System.out.println("6. Display All Employees");
		System.out.println("0. Exit");
		System.out.print("Enter your choice = ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------------------------------------");

		return choice;
	}

	public static void main(String[] args) 
	{
		
		
		int choice, index, count = 0;
		Employee key;
		String isbn;
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Employee> employeeList = new LinkedList<>();
		
		Employee emp;
		
		while ((choice = menu()) != 0) 
		{
			switch (choice) 
			{
			case 1:
				// Add Employee
				emp = new Employee(0, "", 0.0);
				emp.accept();
				employeeList.add(emp);
				break;
			case 2:
				// Delete Employee by ID
				System.out.print("Enter Employee ID to delete: ");
				int idToDelete = sc.nextInt();
				employeeList.remove(idToDelete);
				break;
			case 3:
                // Find Employee by ID
				System.out.print("Enter Employee ID to find: ");
                int idToFind = sc.nextInt();
                Employee keyToCompare = new Employee(0, "", 0.0);
                
                keyToCompare.setId(idToFind);
                
                int indexToCompare = employeeList.indexOf(keyToCompare);
                
                if(indexToCompare == -1) {
                	System.out.println("Employee NOT FOUND !!!!!!!!");
                	}
                else {
                	System.out.println("Employee FOUND at index : " + indexToCompare);
                }
                break;
                
            case 4:
                // Sort Employees by ID
//            	Employee empSort = new Employee(0, "", 0.0);
            	employeeList.sort(new EmployeeComparator());
            	System.out.println("Sorted Employee List By Empid");
            	for ( Employee emp1 : employeeList) {
            		System.out.println(emp1);
            	}
            case 5:
                // Edit Employee by ID
            	System.out.println("Enter emp id to be modified: ");
            	int id = sc.nextInt();
            	Employee keyToCompare1 = new Employee(0, "", 0.0);
            	keyToCompare1.setId(id);
            	int indexToCompare1 = employeeList.indexOf(keyToCompare1);
            	if(indexToCompare1 == -1)
            	System.out.println("Employee not found.");
            	else {
            	Employee oldEmp = employeeList.get(indexToCompare1);
            	System.out.println("Employee Found: " + oldEmp);
            	System.out.println("Enter new information for the Employee");
            	Employee newEmp = new Employee(0, "", 0.0);
            	newEmp.accept();
            	employeeList.set(indexToCompare1, newEmp);
            	}
            case 6:
                // Display All Employees
                System.out.println("List of Employees:");
                for (Employee emp6 : employeeList) {
                    System.out.println(emp6);
                }
                break;

            case 0:
                System.out.println("Exiting the program.");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;     
   
	}

}
	}
	}
