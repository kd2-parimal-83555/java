package com.sunbeam.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Book> booklist = new HashSet<>();

//		

		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out
					.println("1. Accept book details and add in collection\n" + "2. Display all books from collection\n"
							+ "3. Sort the book details as per category and display it.\n"
							+ "4. Sort the book details as per author and display it.\n" + "5. Find book by id.");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				break;

			case 1:
				System.out.println("Enter isbn:");
				String isbn = sc.next();
				System.out.println("Enter price:");
				double price = sc.nextDouble();
				System.out.println("Enter AuthorName:");
				String author = sc.next();
				System.out
						.println("Enter Category:" + "\n0.Love" + "\n1.Fiction" + "\n2.Sports" + "\n3.CurrentAffairs");
				int category = sc.nextInt();

				System.out.println("Enter Quantity:");
				int quantity = sc.nextInt();

				booklist.add(new Book(isbn, price, author, category, quantity));

				break;

			case 2:
				for (Book ele : booklist) {
					System.out.println(ele);
				}
				break;

			case 3:
				class categoryComparator implements Comparator<Book> {

					@Override
					public int compare(Book o1, Book o2) {

						return o1.getC().compareTo(o2.getC());
					}

				}

				Comparator<Book> categoryComparator = new categoryComparator();
				List<Book> l2 = new ArrayList<>(booklist);
				Collections.sort(l2, categoryComparator);
				// Collections.sort(booklist,categoryComparator);

				System.out.println("After Sorting");
				for (Book ele : booklist) {
					System.out.println(ele);
				}

				break;

			case 4:
				class authornameCompartor implements Comparator<Book> {

					@Override
					public int compare(Book o1, Book o2) {
						
						return o1.getAuthorName().compareTo(o2.getAuthorName());
					}

				}
				Comparator<Book> authCompartor = new authornameCompartor();
				List<Book> l1 = new ArrayList<>(booklist);
				Collections.sort(l1, authCompartor);

				System.out.println("After Sorting");
				for (Book ele : booklist) {
					System.out.println(ele);
				}

				break;

			case 5:
				System.out.println("Enter Book id to search:");
				String book = sc.next();
				Book b = new Book();
				b.setIsbn(book);
				int count = 0;
				for (Book ele : booklist) {
					if (ele.equals(b)) {
						System.out.println("Book is present");
						System.out.println(ele);
						break;
					} else {
						count++;
					}

				}
				if (count > 0) {
					System.out.println("Book is not present");

				}

				break;

			default:
				break;

			}
		} while (choice != 0);

	}

}
