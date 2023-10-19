package com.mysol_13_q5;

import java.util.HashMap;
import java.util.Scanner;



public class BookMain {
	
	static int menu() {
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Insert in map");
		System.out.println("2. Find in map");
		choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------------------------------------");

		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		
		HashMap<String,Book> BookMap = new HashMap<>();
		
//		Book ONE = new Book("A",100,"Max",2); // VALUE1 
//		  
//		Book TWO = new Book("B",200,"John",3); // VALUE2
//		
//		Book THREE = new Book("C",300,"Robert",1); // VALUE3
//
//		Book FOUR = new Book("D",400,"Clinton",4); // VALUE4
//
//		Book FIVE = new Book("E",500,"Tom",3); // VALUE5
//
//		Book SIX = new Book("B",600,"John",3); // VALUE6
		
		while((choice = menu()) != 0)
		{
			switch (choice) {
			case 1://Insert in map
				Book b = new Book();
				
				break;
			case 2://Find in map
				
				break;

			default:
				break;
			}
			
		}

		// put keys and values in map
		
		
		
		
		
		
		

	}

}
