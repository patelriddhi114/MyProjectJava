package mypck;

import java.util.Scanner;

public class CalculateArea18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of r :");
		double r = input.nextDouble();
		
		double carea = Math.PI * r*r;
		
		System.out.println("Enter the value of l and b :");
		double l = input.nextDouble();
		double b = input.nextDouble();
		 
		double arealb = l * b; 
		
		System.out.println("Enter the value of h  :");
		double h = input.nextDouble();
		
		double areaCylinder = 2 * Math.PI * r *(r+h);
		
		
		System.out.println("Enter the value of a :");
		double a = input.nextDouble();
		
		double haxagon = ((3 * Math.sqrt(3)) / 2 ) * Math.pow(a,2);
		
		double P1 = 2 * Math.PI * r;
		
		double P2 = 2 * l * b;
		
		double v = Math.PI * r * r * h;
		
		System.out.println("Enter the value of s  :");
		double s = input.nextDouble();
		System.out.println("Enter the value of Side1  :");
		double side1 = input.nextDouble();
		System.out.println("Enter the value of side2  :");
		double side2 = input.nextDouble();
		System.out.println("Enter the value of side3  :");
		double side3 = input.nextDouble();
		
		double tarea = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		
		System.out.println("The area of Circle  is : " + carea);
		System.out.println("The area of Rectange  is : " + arealb);
		System.out.println("The area of Cylinder  is : " + areaCylinder);
		System.out.println("The area of Haxagon  is : " + haxagon);
		System.out.println("The area of Perimeter P   is : " + P1);
		System.out.println("The area of Perimeter  2lb : " + P2);
		System.out.println("The area of volume  is : " + v);
		System.out.println("The area of Triangle  is : " + tarea);
		
		
		
		
	}

}
