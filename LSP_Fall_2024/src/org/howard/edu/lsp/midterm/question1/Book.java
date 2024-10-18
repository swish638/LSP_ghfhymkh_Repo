package org.howard.edu.lsp.midterm.question1;

import java.util.Objects; //for handling equal


//source: https://stackoverflow.com/questions/26826220/creating-a-program-with-book-class-and-testbook-class-in-java

//source: https://www.javatpoint.com/understanding-toString()-method


/**
 * Class representing instance of book in library
 */

public class Book 
{
	private String title; //private so outside user cant change them
	private String author;
	private String ISBN;
	private int yearPublshd;
	
	//Constructor
	
	public Book(String title, String author, String ISBN, int yearPublshd) 
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.yearPublshd = yearPublshd;
		
	}
	
	
	//getters
	public String getTitle() 
	{
		return title;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	
	
	public String getISBN() 
	{
		return ISBN;
	}
	
	
	public int getyearPublshd() 
	{
		return yearPublshd;
	}
	
	
	//setters
	public void setTitle(String title) 
	{
		this.title = title;
	
	}
	
	public void setAuthor() 
	{
		this.author = author;
	}
	
	
	public void setISBN() 
	{
		this.ISBN = ISBN;
	}
	
	
	public void setyearPublshd() 
	{
		this.yearPublshd = yearPublshd;
	}
	
	
	//overriding equals
	public boolean equals(Object Obj) 
	{
		if(this == Obj) return true;
		
		Book book = (Book) Obj;
		return Objects.equals(ISBN, book.ISBN) && Objects.equals(author, book.author); //using isbn and author to determine if equal
		
	}
	
	
	
	//return string with information
	
	public String toString() 
	{
		return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublshd;
		
	}
	
	
	
	


	

}













