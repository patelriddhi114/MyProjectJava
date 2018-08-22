package mypck;

import java.util.Scanner;

public class SortedTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter list1: ");
        int n = input.nextInt();
         
        int[] arr1 = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr1[i]=input.nextInt();
        }
        System.out.println("Enter list2: ");
        int m = input.nextInt();
         
        int[] arr2 = new int[m];
        for(int i =0 ; i < m ; i++){
            arr2[i]=input.nextInt();
        }
         
		int[] result=merge(arr1, arr2);
		for (int j=0; j<result.length;j++)
		{
			System.out.print(result[j]+ " ");
		}
	}
		 
	static int[] merge(int[] arr1, int[] arr2)
	{
		int arr1_Length=arr1.length;
		int arr2_Length=arr2.length;
		int[] result = new int[arr1_Length + arr2_Length];
		int i=0, j = 0;
		 
		for(int k = 0 ; k< (arr1_Length + arr2_Length);k++)
		{
			if ( i >= arr1_Length ) 
			{
				result[k] = arr2[j];
				j ++;
			}
			else if ( j >= arr2_Length) 
			{
				result[k] = arr1[i];
				i ++;
			}
			else
			{
			 
				if ( arr1[i] < arr2[j]) 
				{
					result[k] = arr1[i];
					i ++;
				}
				else
				{
					result[k] = arr2[j];
					j ++;
				}
			}
		}
		return result;
		}
	
}
