import java.util.Scanner;

public class Que_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("enter first value");
		
		
		if(sc.hasNextDouble()) {
			 double d1=sc.nextDouble();
			 System.out.println("enter second value");
		if(sc.hasNextDouble()) {
		double d2=sc.nextDouble();
		 
		 double avg=(d1+d2)/2;
		 System.out.print("Average is:"+ avg);
		}
		 else {
			 System.out.println(" First value is not double..!!");
		
		  }
		}
		else {
			System.out.println("Second value is not double..!!");
		}
		
	}
}


