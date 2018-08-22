package mypck;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the value of X1 :");
	     Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		System.out.println("Enter the value of X2 :");
		double x2 = input.nextDouble();
		System.out.println("Enter the value of Y1 :");
		double y1 = input.nextDouble();
		System.out.println("Enter the value of Y2 :");
		double y2 = input.nextDouble();
		
		double xvalue = Math.pow(x1-x2, 2);
		double yvalue = Math.pow(y2-y1, 2);
		
		double distance = Math.sqrt(xvalue + yvalue);
		
		System.out.println("The value of Distanse  is : " + distance);
	}

}
