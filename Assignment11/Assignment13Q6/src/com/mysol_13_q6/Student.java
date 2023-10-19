package com.mysol_13_q6;

import java.util.Objects;
import java.util.Scanner;

public class Student {

	private int rollno;
	private String name;
	private String city;
	private double marks;
	public Student() {
	
	}
	public Student(int rollno, String name, String city, double marks) {
	
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public void acceptStudent() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Student Details");
	    System.out.print("Enter Roll No: ");
	    this.rollno = sc.nextInt();
	    sc.nextLine(); // Consume the newline character
	    System.out.print("Enter Name: ");
	    this.name = sc.nextLine();
	    System.out.print("Enter City: ");
	    this.city = sc.nextLine();
	    System.out.print("Enter Marks: ");
	    this.marks = sc.nextDouble();
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(this.rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if(this.rollno == other.rollno) {
			return true;
		}
		return false;
		}

	@Override
	public String toString() {
		return "Student [rollno = " + rollno + ", name = " + name + ", city = " + city + ", marks = " + marks + "]";
	}
	
	
}
