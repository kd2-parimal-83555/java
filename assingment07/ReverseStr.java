import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		
		String str = null;
		String Reverse="";
		char ch;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
	    str=sc.next();
		for(int i=0; i<str.length(); i++) {		
		ch=str.charAt(i);
		
       Reverse=ch+Reverse;
       
}
		System.out.println("New string :"+Reverse);
	  
	    }
}