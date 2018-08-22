package mypck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double[] array = {2.3,2.9,2.5,2.1,2.4,2.2};
		
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>(Arrays.asList(array));
		
		System.out.print("Enter six double value: ");
		//int n = input.nextInt();
		
	
		
		/*for(int i = 1; i<=6 ;i++)
		{
			list.add(input.nextDouble());
		}
		*/
		list.add(0,2.6);
		list.add(2.7);
		list.add(2.8);
		list.remove(2.1);
		
		System.out.println("Size of the list " +list.size());
		
		list.set(0, 2.0);
		
		System.out.println("Max is =" +java.util.Collections.max(list));
		System.out.println("Min is =" +java.util.Collections.min(list));
		
		java.util.Collections.sort(list);
		
		System.out.println("List is " + list);
	}

}
