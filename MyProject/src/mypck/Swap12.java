/*
 * Write java program for the following, (5 + 5 mark)
a) Swap 2 numbers with temp variable.
b) Swap 2 numbers without temp variable

*/

package mypck;

import java.util.Scanner;

public class Swap12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*(a)*/
		  /*int x, y, temp;
	      System.out.println("Enter x and y :");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	      
	      System.out.println("Before swapping\nX = " + x + "\nY = " + y);

	      temp = x ;
	      x = y;
	      y = temp;
	      
	      System.out.println("Before swapping\nX = " + x + "\nY = " + y);
	
	*/
		int x, y, temp;
	      System.out.println("Enter x and y :");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	      
	      System.out.println("Before swapping\nX = " + x + "\nY = " + y);
	      
	      x = x+y;
	      y = x-y;
	      x = x-y;
	      
	      System.out.println("Before swapping\nX = " + x + "\nY = " + y);
	}

}
