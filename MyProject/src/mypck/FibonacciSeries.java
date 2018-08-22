package mypck;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,a=0,b=0,c=1,i;
		System.out.println("Enter the number :");
	     Scanner input = new Scanner(System.in);
		
	     n = input.nextInt();
	     
	     System.out.println("Fibonicci Series :");
	     for(i=1; i<=n; i++)
	     {
	    	 a=b;
	    	 b=c;
	    	 c=a+b;
	    	 System.out.print(a + " ");
	     }
	     

	}

}
