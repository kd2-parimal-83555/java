package com.sunbeam.entity;

import java.util.Scanner;

import com.sunbeam.exception.ExceptionLineTooLong;

public class Length {
	String str;
	int length;
	@Override
	public String toString() {
		return "Length [str=" + str + ", length=" + length + "]";
	}
	
	public Length() {
		this.str="";
		this.length=0;
		
	}
	public Length(String str, int length) {
		super();
		this.str = str;
		this.length = length;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		str=sc.next();
		
		
		
	}
	public void calculateLength() {
		if(str.length()>8)
		throw new ExceptionLineTooLong("invalid number of character");
		length=str.length();
		System.out.println("length is: "+length);
		
//		int totalLength=str.length();
	}
	

}
