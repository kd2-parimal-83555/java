package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Output {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student arr[]=new Student[5];
		arr[0]=new Student("parimal",1000,"nagpur",65);
		arr[1]=new Student("vedant",1001,"nagpur",68);
		arr[2]=new Student("anupam",1002,"paresia",75);
		arr[3]=new Student("om",1003,"satara",80);
		arr[4]=new Student("ganesh",1004,"buldhana",95);
	
		System.out.println("Before sorting :");
		for(Student student:arr)
		System.out.println(student);
		 
		class StudentrollnoComparator implements Comparator<Student>{

			@Override
			public int compare(Student s1,Student s2) {
				int value=Integer.compare(s1.rollno,s2.rollno);
					
				return value;
			}
			
		}
		
		class StudentnameComparator implements Comparator<Student>{

			@Override
			public int compare(Student s1, Student s2) {
				int value=s1.name.compareTo(s2.name);
				return value;
			}
		}
		 
		
		 
		class StudentmarksComparator implements Comparator<Student>{

			@Override
			public int compare(Student s1,Student s2) {
				int value=Double.compare(s1.marks,s2.marks);
					
				return value;
			}
			
		}
		
		
		int choice=0;
		do {
			
			System.out.println("1 for sorted on thier city");
			System.out.println("2 for sorted on thier marks");
			System.out.println("3 for sorted on thier Name");
			choice=sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Thankb you for Visit");
				break;
				
			case 1:
				class StudentcityComparator implements Comparator<Student>{

					@Override
					public int compare(Student s1,Student s2) {
						int value=s1.city.compareTo(s2.city);
						return value;
					}
					
				}
				StudentcityComparator scity=new StudentcityComparator();
				Arrays.sort(arr,scity);
				for(Student student:arr)
					System.out.println(student);
				break;
				
			case 2:
				Comparator<Student>smarks=new StudentmarksComparator();
				Arrays.sort(arr,smarks);
				for(Student student:arr)
					System.out.println(student);
				break;	
				
			case 3:
				Comparator<Student>sname=new StudentnameComparator();
				Arrays.sort(arr,sname);
				for(Student student:arr)
					System.out.println(student);
				break;
				
				default:System.out.println("-----ERROR-----");
				
			}
		}while(choice!=0);

}
}
