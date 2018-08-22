package mypck;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	System.out.println("How many rows you want in this pattern?");
         
		 	Scanner sc = new Scanner(System.in);
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	              
	        int i=1;
	        while(i<=rows)
	        {
	        	int j =1;
	        	while(j<i)
	        	{
	        		System.out.println(" ");
	        	}
	        	j++;
	        	int k =i;
	        	while(k<=rows)
	        	{
	        		System.out.print(k+" ");
	        	}
	        	k++;
	        	System.out.println();
	        	
	        }
	        i++;
	        int a = rows-1;
	        while(a>=1)
	        {
	        	int j=1;
	        	while(j<i)
	        	{
	        		System.out.println(" ");
	        	}
	        	j++;
	        	int k = i;
	        	while(k<=rows)
	        	{
	        		System.out.print(k+" ");
	        	}
	        	k++;
	        	System.out.println();
	        	
	        }
	        a--;
	        /*for (int i = 1; i <= rows; i++) 
	        {    
	            for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	                 
	            for (int j = i; j <= rows; j++) 
	            { 
	                System.out.print(j+" "); 
	            } 
	             
	            System.out.println(); 
	        } 
	        for (int i = rows-1; i >= 1; i--) 
	        {
	            
	            for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	            for (int j = i; j <= rows; j++)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }*/
	}

}
