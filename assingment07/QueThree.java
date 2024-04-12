package com.practice;

import java.util.Scanner;

//class St{
//	static int count=0;
//}

public class ggg {

	public static void main(String[] args) {
		
		String userString="";
		int res=0;
//		String arr[];
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String - ");
		userString= sc.nextLine().trim();
		String arr[] = userString.split(" ");

		for (String string : arr) {
			System.out.println(string);
			res=arr.length;
		} 
		
		System.out.println(res);
	

		
	}

}
