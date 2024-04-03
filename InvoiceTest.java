package p1;
import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		String partDes;
		int quantity;
		double price;
		String partNo;
		double invoice = 0;
		int a;

		do {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the part name - ");
			partDes = sc.next();

			System.out.print("Enter the part number - ");
			partNo = sc.next();

			System.out.print("Enter the quantity - ");
			quantity = sc.nextInt();
			if (quantity < 0) {
				quantity = 0;
			}

			System.out.print("Enter the price - ");
			price = sc.nextDouble();
			if (price < 0) {
				price = 0.0;
			}

			Invoice i = new Invoice(partDes, quantity, price, partNo);
			invoice = i.invoiceAmount();

			System.out.println("Do you want to continue - \nYes = 1 \nNo= 0");
			a = sc.nextInt();
			if (a == 0)
				break;

		} while (a != 0);

		System.out.println("The invoice for your order is - " + invoice);

	}
}


