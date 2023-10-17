package solution05.employee;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee;
		
		employee = new Salaried_Employee();
		employee.acceptData();
		employee.displayData();
		
		employee = new Hourly_Employees();
		employee.acceptData();
		employee.displayData();
		
		employee = new Commision_Employee();
		employee.acceptData();
		employee.displayData();
		
		employee = new BasePlus_Commision_Employee();
		employee.acceptData();
		employee.displayData();
		
		

	}

}
