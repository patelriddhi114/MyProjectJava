package mypck;

import java.util.Scanner;

public class Palimdrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
	     Scanner input = new Scanner(System.in);
		
	     int number = input.nextInt();
	     int first = number /100;
	     System.out.println(first + " is a first");
	     int last = number % 10;
	     System.out.println(last + " is a last");
	     
	     
	     if(last == first)
	     {
	    	 System.out.println(number + " is a palimdrom");
	     }
	     else
	     {
	    	 System.out.println(number + " is not a palimdrom");
	     }
	}

}
