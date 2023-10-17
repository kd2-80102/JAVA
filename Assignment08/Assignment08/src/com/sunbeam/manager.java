package com.sunbeam;


import java.util.Scanner;

public class manager extends employee{
		private double bonus;

		public manager() {
	        this.designation = "Manager";
	        this.bonus = 0;
	    }
		public manager(int id, float sal, float bonus) {
	    	this.bonus = bonus;
	    }
		@Override
		public double calculateTotalSalary() {
			// TODO Auto-generated method stub
			//System.out.println("The Total Salary of Manager is :" + sal + this.bonus);
			return (sal + this.bonus);
		}
		@Override
		public void accept()
	    {
			super.accept();
	        System.out.println("Enter bonus : ");
	        this.bonus= new Scanner(System.in).nextFloat();
	    }
		@Override
		public void display()
	    {
	        System.out.println("----------------------");
			super.display();
	        System.out.println(" Bonus : "+this.bonus);
	    }
		public double getBonus()
	    {
	        return this.bonus;
	    }
		public void setBonus(float bonus)
	    {
	        this.bonus = bonus;
	    }
}
