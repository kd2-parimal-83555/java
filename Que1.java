import java.util.Scanner;
public class Que1 {

	public static void main(String[] args) {
		
   Scanner scanner= new Scanner(System.in);
   System.out.println("Enter number");
   int number =scanner.nextInt();
   
   System.out.println("Enter given number : "+number);
   System.out.println("binary equivalent : "+Integer.toBinaryString(number));
   System.out.println("Octal equivalent : "+Integer.toOctalString(number));
   System.out.println("Hexadecimal equivalent : "+Integer.toHexString(number));
    
	}

}
