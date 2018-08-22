package mypck;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,i;
		long factorial =1;
		System.out.println("Enter the number :");
	     Scanner input = new Scanner(System.in);
		
	     number = input.nextInt();
	     
	     
	     if(number < 0)
	     {
	    	 System.out.println("Error");
	     }
	     else
	     {
	    	 for(i=1;i<=number;i++)
	    	 {
	    		 factorial *= i;
	    	 }
	    	 System.out.println("Factorial of " +number+ " is " + factorial);
	     }
	}

}
