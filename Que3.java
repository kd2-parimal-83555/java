import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		int choice,quantity;
		double totalBill=0;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1 for samosa");
		System.out.println("2for idli");
		System.out.println("3 for poha");
		System.out.println("4 for dosa");
		System.out.println("5 for Generate bill");
		System.out.println("Select item");
		choice=sc.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			totalBill=totalBill+(15*quantity);
				break;
		case 2: 
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			totalBill=totalBill+(25*quantity);
				break;
		case 3: 
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			totalBill=totalBill+(55*quantity);
				break;
		case 4: 
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			totalBill=totalBill+(5*quantity);
				break;
				
		case 5: 
			System.out.println("Total Bill :" +totalBill);
			break;
			default:
				break;
		}
		
		
		
		}while(choice!=5);
	}

}
