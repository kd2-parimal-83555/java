package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int npoints;
		Scanner snc = new Scanner(System.in);
		System.out.println("how many no of points to plot");
		npoints = snc.nextInt();
		Point2D[] points = new Point2D[npoints];
		int x, y;
		for (int i = 0; i < npoints; i++) {
			System.out.println("Enter x");
			x = snc.nextInt();
			System.out.println("Enter y");
			y = snc.nextInt();
			points[i] = new Point2D(x, y);

		}

		for (Point2D p : points)
			p.displayDetails();

	

			while (true) {

				System.out.println("Food Menu:");
				System.out.println("1) Display details of a specific point");
				System.out.println("2) Display x, y co-ordinates of all points");
				System.out.println("3) Display distance between specified points ");
				System.out.println("4)  Exit ");

				System.out.print("Enter your choice: ");

				int choice = snc.nextInt();

				if (choice == 4) {
					// User chose to Exit from loop
					break;
				}

				switch (choice) {
				case 1: {
//	                	1. Display details of a specific point
//	        			User i/p : index
					System.out.println("Enter the index of point to display from 0 to "+(npoints-1));
					int ip = snc.nextInt();
					
					
						if (ip < npoints && ip >= 0) {
							points[ip].displayDetails();
						} else {
							System.out.println("Invalid index , pls retry!!!!");
						}
					}
			
					break;
				case 2: {
//					2) Display x, y co-ordinates of all points
//					Hint : for-each
					for (Point2D p : points)
						p.displayDetails();
				}

					break;
				case 3:{
//					3) User i/p : 2 indices for the points , validate the indices
//				Display distance between specified points (iff they are not located at the same position)
//				eg : sop("Enter index of strt point n end point");
//				validation : boundary condition (0<=index<length-1)
//				isEqual -- false --compute distance --display it.
					System.out.println("Enter the index of point 1 from 0 to "+(npoints-1));
					int ip1 = snc.nextInt();
					Point2D p2,p1;
					if(0<=ip1 && ip1<npoints) {
						p1 = points[ip1];
	                     
					}else {
						System.out.println("INVALID index entered");
						break;
					}
					System.out.println("Enter the index of point 2 from 0 to "+(npoints-1));
					int ip2 = snc.nextInt();
					if(0<=ip2 && ip2<npoints) {
						   p2 = points[ip2];
					}else {
						System.out.println("INVALID index entered");
						break;
					}
					
					if (p1.isEqual(p2)) {
			            System.out.println("Points are located at the same position.");
			        } else {
			            System.out.println("Points are located at different positions.");
			         
			            System.out.println("Distance between Point 1 and Point 2: " + p1.calculateDistance(p2));
			        }
				
				}

					break;
				
				default:
					System.out.println("Invalid choice!");
					break;
				}
			}

		}

}
