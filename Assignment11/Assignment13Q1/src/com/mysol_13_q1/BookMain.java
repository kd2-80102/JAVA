//Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. If any book with duplicate
//isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.

package com.mysol_13_q1;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Book> BookSet = new HashSet<>(); //duplicate based on Book's hashCode() + equals()

		BookSet.add(new Book("A",100,"Max",2));
		BookSet.add(new Book("B",200,"John",3));
		BookSet.add(new Book("C",300,"Robert",1));
		BookSet.add(new Book("D",400,"Clinton",4));
		BookSet.add(new Book("E",500,"Tom",3));
		BookSet.add(new Book("B",600,"John",3)); //// returns false if duplicate
		
		//Displaying the BookSet using iterator
		
		
		Iterator <Book> itr = BookSet.iterator();
		while(itr.hasNext()) {
			Book B_Itr = itr.next();
			System.out.println(B_Itr);
		}
		
		//It will not take duplicates
		
		//Now to implement Suppress isbn duplicates we will use equals() method also and hashCode()also
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
