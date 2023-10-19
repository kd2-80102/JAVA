package com.mysol13_q3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;




public class BookMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Book> BookSet = new TreeSet<>(); //// duplicate based on Book's compareTo()
		
		
		BookSet.add(new Book("A",100,"Max",2));
		BookSet.add(new Book("B",200,"John",3));
		BookSet.add(new Book("C",300,"Robert",1));
		BookSet.add(new Book("D",400,"Clinton",4));
		BookSet.add(new Book("E",500,"Tom",3));
		BookSet.add(new Book("B",600,"John",3)); //// returns false if duplicate
		
		
		Iterator<Book> itr = BookSet.iterator();
		while(itr.hasNext()) {
			Book B_Itr = itr.next();
			System.out.println(B_Itr);
		}
		
		
		
		
		
		
		

	}

}
