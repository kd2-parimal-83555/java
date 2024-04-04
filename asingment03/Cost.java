import java.util.Scanner;

public class Cost {
	public double milesPerDay;
	public  double gasoline;
	public   double milesPerGallon;
	public  double parkingFee;
	public  double tolls;
	
	

	public Cost(double milesPerDay,double gasoline,double milesPerGallon,double parkingFee,double tolls) {
		
		this.milesPerDay=milesPerDay;
		this.gasoline=gasoline;
		this.milesPerGallon=milesPerGallon;
		this.parkingFee=parkingFee;
		this.tolls=tolls;
		
//		public double gettotalCost() {
//		return totalCost;
}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
System.out.println("Enter Total miles driven per day ");
double milesPerDay=sc.nextDouble();

System.out.println("Enter Cost per gallon of gasoline. ");
double gasoline=sc.nextDouble();

System.out.println("Enter Average miles per gallon. ");
double milesPerGallon=sc.nextDouble();

System.out.println("Enter Parking fees per day. ");
double parkingFee=sc.nextDouble();

System.out.println("Enter Tolls per day. ");
double tolls=sc.nextDouble();



double gasCost = (milesPerDay/milesPerGallon) * gasoline;
double totalCost = gasCost + parkingFee + tolls ;

System.out.println("Total cost per day-" +totalCost);
 


	}

}
