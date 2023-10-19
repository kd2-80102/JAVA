package mysol01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.ListIterator;

public class BookMain {

    static int menu() {
        int choice;
        System.out.println("------------------------------------------------------");
        System.out.println("Menu");
        System.out.println("1. Add new book in list");
        System.out.println("2. Display all books in forward order");
        System.out.println("3. Search a book with given isbn");
        System.out.println("4. Delete a book at given index.");
        System.out.println("5. Delete a book with given isbn");
        System.out.println("6. Reverse the list");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = new Scanner(System.in).nextInt();
        System.out.println("------------------------------------------------------");

        return choice;
    }

    public static void main(String[] args) {
        int choice = 0;
        int index, count = 0;
        Book key;
        String isbn;
        int quantity = 0;
        Scanner sc = new Scanner(System.in);

        List<Book> bookList = new ArrayList<>();
        Book b;

        ListIterator<Book> itr;

        System.out.println("Enter how many books you want to store.");

        while ((choice = menu()) != 0) {
            switch (choice) {
                case 1: // Add new book to the list
                    // If the book is present, increment its quantity.
                    b = new Book();
                    b.acceptBook();
                    if (bookList.contains(b)) {
                        int idx = bookList.indexOf(b);
                        Book b1 = bookList.get(idx);
                        b1.setQuantity(b1.getQuantity() + 1);
                    } else {
                        // If the book is not present, add it to the list.
                        bookList.add(b);
                    }
                    break;

                case 2:
                    System.out.println("Forward display: ");
                    itr = bookList.listIterator();
                    while (itr.hasNext()) {
                        b = itr.next();
                        System.out.println(b);
                    }
                    break;

                case 3:
                    System.out.print("Enter ISBN of the book to find: ");
                    String isbn1 = sc.next();
                    Book key1 = new Book();
                    key1.setIbsn(isbn1);
                    int index1 = bookList.indexOf(key1);

                    if (index1 == -1)
                        System.out.println("BOOK not found.");
                    else {
                        System.out.println("BOOK Found at Index: " + index1);
                        b = bookList.get(index1);
                        System.out.println(b);
                    }
                    break;

                case 4:
                    System.out.println("Enter the index you want to delete at: ");
                    int index3 = sc.nextInt();
                    bookList.remove(index3);
                    break;

                case 5: // Delete a book with given ISBN
                    System.out.print("Enter ISBN of the book to delete: ");
                    String isbn2 = sc.next();
                    Book key3 = new Book();
                    key3.setIbsn(isbn2);
                    int index31 = bookList.indexOf(key3);
                    if (index31 == -1) {
                        System.out.println("BOOK not found");
                    } else {
                        bookList.remove(index31);
                        System.out.println("Book is deleted at index: " + index31);
                    }
                    break;

                case 6:
                    Collections.reverse(bookList);
                    break;


                default:
                    System.out.println("Wrong Choice Entered :(");
                    break;
            }
        }
    }
}
