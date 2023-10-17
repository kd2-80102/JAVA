package com.sunbeam;

import java.util.Scanner;

public class salesman extends employee{
	private double comm;

		public salesman() {
	        this.designation = "Salesman";
	        this.comm = 0.0;
	    }
		public salesman(int id, double sal, double comm) {
			super();
	        this.comm = comm;
	    }
		
		@Override
		public double calculateTotalSalary() {
			// TODO Auto-generated method stub
			//System.out.println("The Total Salary of Salesman is  : " + sal + this.comm );
			return (sal + this.comm);
		}
		@Override
		public void acceptData(){
	        super.accept();
	        System.out.println("Enter commision : ");
	        this.comm= new Scanner(System.in).nextFloat();
	        
	    }
		@Override
		public void display()
	    {	
	        System.out.println("----------------------");
	        super.display();
	        System.out.println(" Commision : "+this.comm);
	    }
		public double getComm()
	    {
	        return this.comm;
	    }
		public void setComm(double comm)
	    {
	        this.comm = comm;
	    }
}

