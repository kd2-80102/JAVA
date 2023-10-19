package com.mysol_13_q6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;





public class StudentMain {
	
	static int menu() 
	{
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Insert in map");
		System.out.println("2. Find in map");
		System.out.print("Enter your choice = ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Student s;
		Map<Integer, Student> StudentMap = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while ((choice = menu()) != 0) 
		{
			switch (choice) 
			{
			case 1://Accept student details from the user and insert it into the map
				s = new Student();
				s.acceptStudent();
				StudentMap.put(s.getRollno(), s);
				break;
			case 2://Find a student in the map
				System.out.print("Enter Roll Number to search: ");
		        int rollno  = sc.nextInt();
		        Student studSearch = StudentMap.get(rollno);//WILL RETURN AN OBJECT OF THAT PARTICULAR roll number
		        
		        if (studSearch != null) {
		            System.out.println("Found Student: " + studSearch);
		        } else {
		            System.out.println("Student not found.");
		        }
				break;
			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
		System.out.println("Thank you for using our Student App");	
		
		
		
		
		
		
		
		

	}

}
