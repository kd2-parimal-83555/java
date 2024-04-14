package com.sunbeam;

import java.util.Comparator;

public class Student implements Comparable<Student>{

	String name;
	int rollno;
	String city;
	double marks;
	
	public Student() {
		
	}
	
	public Student(String name, int rollno, String city, double marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", city=" + city + ", marks=" + marks + "]";
	}

	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
