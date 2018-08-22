package mypck;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of integer :");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		System.out.println("Pattern 1 display like this :");
		pattern1(n);
		
		System.out.println("Pattern 2 display like this :");
		pattern2(n);
		
		System.out.println("Pattern 3 display like this :");
		pattern3(n);
		
		System.out.println("Pattern 4 display like this :");
		pattern4(n);
		
		System.out.println("Pattern 5 display like this :");
		pattern5(n);
		
		System.out.println("Pattern 6 display like this :");
		pattern6(n);
		
		System.out.println("Pattern 7 display like this :");
		pattern7(n);
		
	}
	
	public static void pattern1(int n)
	{
	
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i ;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int n)
	{
	
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-(i-1) ;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void pattern3(int n)
	{
	
		for(int i=1; i<=n; i++)
		{
			for(int j= (n - (i-1)) ; j <= n ;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n)
	{
	
		for(int i=1; i<=n; i++)
		{
			for(int k =1; k<=(n-i); k++ )
			{
				System.out.print(" ");
			}
			for(int j= (n - (i-1)) ; j <= n ;j++)
			{
				System.out.printf("%2d",j);
			}
			System.out.println();
		}
	}
	public static void pattern5(int n)
	{
	
		for(int i=1; i<=n; i++)
		{
			for(int k =1; k<=(n-i); k++ )
			{
				System.out.print("  ");
			}
			for(int j= 1 ; j <=i  ;j++)
			{
				System.out.printf("%2d",j);
			}
			for(int j= (i-1) ; j >= 1 ;j--)
			{
				System.out.printf("%2d",j);
			}
			System.out.println();
		}
	}
	public static void pattern6(int n)
	{
	
		for(int i=0; i<=n; i++)
		{
			/*for(int k =1; k<=(n-i); k++ )
			{
				System.out.print("  ");
			}*/
			for(int j= 0 ; j <=n  ;j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}
	public static void pattern7(int n)
	{
	
		for(int i=0; i<=n; i++)
		{
			/*for(int k =1; k<=(n-i); k++ )
			{
				System.out.print("  ");
			}*/
			for(int j= 0 ; j <=n  ;j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}
}
