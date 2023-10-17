package com.sunbeam;

import java.util.Scanner;

public class Person {
	
	private String name;
	public Person() {
		this("");
	}
	public Person(String name) {
		this.name = name;
	}
	public void accept() {
        System.out.println("Enter name : ");
        this.name= new Scanner(System.in).next();
    }
    public void display() {
        System.out.println(" Name : "+ this.name);
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
	


