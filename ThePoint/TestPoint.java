//Savannah Muniz

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args){
		
		int x1, x2, y1, y2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Program will calculate the distance between two points.");
		
		System.out.println("Enter x value for point 1: ");
		x1 = keyboard.nextInt();
		
		System.out.println("Enter y value for point 1: ");
		y1 = keyboard.nextInt();
		
		ThePoint p1 = new ThePoint(x1, y1);
		
		System.out.println("Enter x value for point 2: ");
		x2 = keyboard.nextInt();
		
		System.out.println("Enter y value for point 2: ");
		y2 = keyboard.nextInt();
		
		ThePoint p2 = new ThePoint(x2, y2);
		
		System.out.println("The points are: ("+x1+", "+y1+") and ("+x2+", "+y2+").");
		System.out.println("The distance between these points is: "+ThePoint.getDistance(p1, p2)+".");
		
		keyboard.close();
	}

}
