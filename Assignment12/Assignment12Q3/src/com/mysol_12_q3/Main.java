package com.mysol_12_q3;

import java.util.Scanner;

@FunctionalInterface
interface Arithmetic {
	double calc(double a1,double a2);
}

public class Main {
	

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
	}
	
	static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.Perform Addition");
		System.out.println("2.Perform Substraction ");
		System.out.println("3.Perform Multiplication");
		System.out.println("4.Perform Division");
		System.out.print("Enter the Choice : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		int choice;
		
		
		Scanner sc = new Scanner(System.in);
		
		while((choice = menu()) != 0)
		{
			int num1,num2;
			switch (choice) {
			case 1://ADD
				System.out.print("Enter the first number: ");
                num1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                num2 = sc.nextInt();
                calculate(num1, num2, (a, b) -> a + b);
			case 2://
				System.out.print("Enter the first number: ");
                num1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                num2 = sc.nextInt();
                calculate(num1, num2, (a, b) -> a - b);
				break;
				
			case 3:
				System.out.print("Enter the first number: ");
                num1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                num2 = sc.nextInt();
                calculate(num1, num2, (a, b) -> a * b);
				break;
				
			case 4:
				System.out.print("Enter the first number: ");
                num1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                num2 = sc.nextInt();
                calculate(num1, num2, (a, b) -> a / b);
				break;

			default:
				break;
			}
			
		}
		
		
		
	}
	

}
