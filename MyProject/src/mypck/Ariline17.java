package mypck;

import java.util.Scanner;

public class Ariline17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the speed and acceleration :");
	     Scanner input = new Scanner(System.in);
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double total = (speed * speed) / (2 * acceleration);
		
		System.out.println("The minimum runway length for this airplan :" + total);
	
	}

}
