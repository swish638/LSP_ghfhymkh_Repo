package org.howard.edu.lsp.midterm.question1;

public class BookDriver {

	public static void main(String[] args) {
		 Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925); //insantiating new book objects with set attributes
	     Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
	     Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

	     System.out.println(book1.equals(book2)); // return true
	     System.out.println(book1.equals(book3)); // return false
	     System.out.println(book1); 


	}

}
