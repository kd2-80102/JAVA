package com.mysol_13_q4;


import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class BookPriceComparator implements Comparator<Book>
{
	@Override
	public int compare(Book b1,Book b2) {
		return -Double.compare(b1.getPrice(), b2.getPrice());
	}
}


public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookPriceComparator PriceComparator = new BookPriceComparator();
		TreeSet<Book> BookSet = new TreeSet<>(PriceComparator); // duplicate based on Book's hashCode() + equals()
		
		BookSet.add(new Book("A",100,"Max",2));
		BookSet.add(new Book("B",200,"John",3));
		BookSet.add(new Book("C",300,"Robert",1));
		BookSet.add(new Book("D",400,"Clinton",4));
		BookSet.add(new Book("E",500,"Tom",3));
		BookSet.add(new Book("B",600,"John",3)); //// returns false if duplicate
		
		System.out.println("Forward Traversal");
		
		Iterator <Book> itrForward = BookSet.iterator();
		while(itrForward.hasNext()) {
			Book B_Itr = itrForward.next();
			System.out.println(B_Itr);
		}
		
		System.out.println("Reverse Traversal");
		

		Iterator<Book> itrReverse = BookSet.descendingIterator();
		while(itrReverse.hasNext()) {
			Book bItr = itrReverse.next();
			System.out.println(bItr);
		}	

	}

}
