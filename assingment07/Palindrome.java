import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str=null;
		String Reverse="";
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		str=sc.next();
		
		for(int i=0; i<str.length();i++) {
			ch=str.charAt(i);
			Reverse=ch+Reverse;
		}
		
		System.out.println("Reverse String="+Reverse);

		String orinalstr=str;
		
		if(orinalstr.equals(Reverse)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("string is NOT palindrome");
		}
	}

}
