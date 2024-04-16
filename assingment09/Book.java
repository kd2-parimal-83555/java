package com.sunbeam.utility;
import java.util.Objects;

public class Book{
	private String isbn;
	private double price;
	private String authorName;
	private Category c;
	private int quantity;
	
	Book(){
		
	}
	

	public Book(String isbn, double price, String authorName, int ch, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		c=Category.values()[ch];
		this.c = c;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setC(Category c) {
		this.c = c;
	}
	public Category getC() {
		return c;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", c=" + c + ", quantity="
				+ quantity + "]";
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}



	
	
	
	
	

	
	
	
	
}
/*
 * Store book details in a library in hashing based data structure : HashSet
Book details : isbn(string), category(enum), price(double), authorName(string), quantity(int) .
Unique ID : isbn
Write a menu driven code that have below menus.
1. Accept book details and add in collection
2. Display all books from collection
3. Sort the book details as per category and display it.
4. Sort the book details as per author and display it.
5. Find book by id.
 */
