package com.mysol_13_q2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Book> BookSet = new LinkedHashSet<>(); // duplicate based on Book's hashCode() + equals()
		
		BookSet.add(new Book("A",100,"Max",2));
		BookSet.add(new Book("B",200,"John",3));
		BookSet.add(new Book("C",300,"Robert",1));
		BookSet.add(new Book("D",400,"Clinton",4));
		BookSet.add(new Book("E",500,"Tom",3));
		BookSet.add(new Book("B",600,"John",3)); //// returns false if duplicate
		
		Iterator <Book> itr = BookSet.iterator();
		
		while(itr.hasNext()) {
			Book B_Itr = itr.next();
			System.out.println(B_Itr);
		}
		
		//It will print in isbn order
		
		
		
		
		
		
		
		
		
		

	}

}
