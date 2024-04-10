package com.sunbeam.tester;

import com.sunbeam.entity.Length;

public class Program {

	public static void main(String[] args) {
		
		Length L=new Length();
		
		try {
		L.accept();
		L.calculateLength();
		L.toString();
			
		}
		catch(RuntimeException e){
			e.printStackTrace();
		}

	}

}
