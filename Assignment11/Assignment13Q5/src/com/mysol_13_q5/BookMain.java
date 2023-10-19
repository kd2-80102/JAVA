package com.mysol_13_q5;

import java.util.HashMap;
import java.util.Scanner;



public class BookMain 
{
	
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

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int choice;
		Book b;
		HashMap<String,Book> BookMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

		
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
		
		
		while ((choice = menu()) != 0) 
		{
			switch (choice) 
			{
			case 1:
				b = new Book();
				b.acceptBook();
				BookMap.put(b.getisbn(), b);
				break;
			case 2:
				System.out.print("Enter ISBN to search: ");
		        String isbn = sc.next();
		        Book SearchBook = BookMap.get(isbn);//WILL RETURN AN OBJECT OF THAT PARTICULAR ISBN
		        
		        if (SearchBook != null) {
		            System.out.println("Found book: " + SearchBook);
		        } else {
		            System.out.println("Book not found.");
		        }
				break;
			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
		System.out.println("Thank you for using our Book Ap");	

	}

}
