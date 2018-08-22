package mypck;

import java.util.Scanner;

public class GratestDivisionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First no : ");
        int n1=sc.nextInt();
        System.out.print("Enter the Second no : ");
        int n2=sc.nextInt();
        int gcd=1;
         
        for(int i=2 ; i<=Math.max(n1, n2) ; i++)
        {
        	if((n1%i == 0) && (n2%i == 0))
        	{
        		gcd=i;
        	}
        }
        System.out.print("GCD = "+gcd);
	}

}
