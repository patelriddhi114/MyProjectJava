package mypck;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,flag=0;
		System.out.println("Enter the number :");
	     Scanner input = new Scanner(System.in);
		
	     int number = input.nextInt();
	     
	     for(i=2; i<=number/2; i++)
	     {
	    	 if(number%i==0)
	    	 {
	    		 flag=1;
	    		 break;
	    	 }
	     }
	     
	     if(flag == 0)
	     {
	    	 System.out.println(number + " is a prime");
	     }
	     else
	     {
	    	 System.out.println(number + " is not a prime");
	     }
	}

}
