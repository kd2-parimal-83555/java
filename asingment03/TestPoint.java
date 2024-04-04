package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;


public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for point 1:");
        Point2D p1 = new Point2D();
        p1.acceptCoordinates();

        System.out.println("Enter coordinates for point 2:");
        Point2D p2 = new Point2D();
        p2.acceptCoordinates();

        System.out.println("Details of Point 1:");
        p1.displayDetails();
        System.out.println("Details of Point 2:");
        p2.displayDetails();

        if (p1.isEqual(p2)) {
            System.out.println("Points are located at the same position.");
        } else {
            System.out.println("Points are located at different positions.");
         
            System.out.println("Distance between Point 1 and Point 2: " + p1.calculateDistance(p2));
        }

        scanner.close();
    }
}