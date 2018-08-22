package mypck;

import java.util.Scanner;

public class Kilom16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the driving distance :");
	     Scanner input = new Scanner(System.in);
		double distance = input.nextDouble();
		System.out.println("Enter the mile per gallon :");
		double gallon = input.nextDouble();
		System.out.println("Enter the pirce per gallon :");
		double prise = input.nextDouble();
		
		
		double total = distance / gallon * prise;
		
		System.out.println("The cost of driving is $%.2f:" + total);
		
	}

}
