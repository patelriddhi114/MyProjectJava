package mypck;

import java.util.Scanner;

public class PatternC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of integer :");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		for(int i=1;i<n ; i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
