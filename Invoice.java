package p1;

import java.util.Scanner;

public class Invoice {

	private String partDes;
	private int quantity;
	private double price;
	private String partNo;

	public Invoice() {
	}

	public Invoice(String partDes, int quantity, double price, String partNo) {
		
		this.partDes = partDes;
		this.quantity = quantity;
		this.price = price;
		this.partNo = partNo;
	}

	
	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartdDes() {
		return partDes;
	}

	public void setPartdDes(String partdDes) {
		this.partDes = partdDes;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double invoiceAmount() {
		return price * quantity;
	}
}


