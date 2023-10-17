/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
package com.sunbeam;

import java.util.Scanner;

abstract public class employee {

		protected int id;
		protected double sal;
		protected String designation;
		
		abstract public double calculateTotalSalary();
	
		public employee() {
		     this(0,0);
		}
		public employee(int id, double sal) {
	        this.id = id;
	        this.sal = sal;
		}
		public void accept() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter id - ");
			this.id = scanner.nextInt();
			
			System.out.print("Enter sal - ");
			this.sal = scanner.nextDouble();
			
			System.out.print("Enter designation - ");
			this.designation = scanner.next();
			
	        
	    }
		public void display() {
			System.out.println("id - "+this.id);
			System.out.println("sal - "+this.sal);
			System.out.println("designation - "+this.designation);

		}
	    public int getId() {
	        return this.id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public double getSal() {
	        return this.sal;
	    }
	    public void setSal(int sal) {
	        this.sal = sal;
	    }
	    public String getDesignation() {
	        return this.designation;
	    }
	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }

		public void acceptData() {
			// TODO Auto-generated method stub
			
		}
	    
}
