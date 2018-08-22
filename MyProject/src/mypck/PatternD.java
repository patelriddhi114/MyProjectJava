package mypck;

import java.util.Scanner;

public class PatternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of integer :");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		for(int i=1;i<=n ; i++)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
