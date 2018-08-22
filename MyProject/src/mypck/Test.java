package mypck;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("java**".matches("java*"));
		/*
		
		new A();
	    new B();
	  }
	}

	class A {
	  int i = 7;

	  public A() {
	    setI(20);
	    System.out.println("i from A is " + i);
	  }

	  public void setI(int i) {
	    this.i = 2 * i;
	  }
	}

	class B extends A {
	  public B() {
	    System.out.println("i from B is " + i);    
	  }

	  public void setI(int i) {
	    this.i = 3 * i;
			/*A a = new A(3);
		  
	}
	
}
		 
class A extends B 
{	
	public A(int t) 
	{
		System.out.println("A's constructor is invoked");
	}
}
class B 
{
	public B() 
	{
		System.out.println("B's constructor is invoked");
	
		 /*String s = "Hi, Good MoRning";
		    System.out.println(m(s));
		  }

		  public static int m(String s) {
		    int count = 0; 
		    for (int i = 0; i < s.length(); i++)
		      if (Character.isUpperCase(s.charAt(i)))
		        count++;

		    return count;
		  
/*
		System.out.println(Math.max(-2.1,-5.1));
		System.out.println(Math.floor(7.9));
		System.out.println(Math.ceil(Math.min(0.6,-8.6)));
		System.out.println(Math.round(-5.50));
	*/	
		
		/*int balance =10;
		while(true)
		{
			if(balance < 9)
			{
				System.out.println("java");
				break;
			}
			balance -= 9;
		}
		System.out.println(balance);
		
		
		int i=1;
		while(i<10)
		{
			if((i++)%2 ==0)
				System.out.println(i);
		}
		*/
		/*Scanner input = new Scanner(System.in);
		int number, max;
		 number = input.nextInt();
		 max = number;
		while (number != 0) {
			number = input.nextInt();
			if (number > max)
				max = number;
		 }
		 System.out.println("max is " + max);
		 System.out.println("number " + number);
		 
		Scanner input = new Scanner(System.in);
		int number, max;
		 number = input.nextInt();
		 max = number;
		do {
		 number = input.nextInt();
		if (number > max)
		 max = number;
		 } while (number != 0);
		 System.out.println("max is " + max);
		 System.out.println("number " + number);
		
		int i;
		for (i = 1; i < 10; i++);
		
		{
		 System.out.println("i is " + i);
		}
		for (int i = 0; i < 10; i++);
		 sum += i;
		 
		  if (i < j);
		  	System.out.println(i)
		  else
			  System.out.println(j);
		
		 while (j < 10);
		 {
			 j++;
		 }
		
		do {
			j++;
		} while (j < 10)
		
		  int i = 0;
		    while (i < 5) {
		      for (int j = i; j > 1; j--)
		        System.out.print(j + " ");
		      System.out.println("****");
		      i++;
		    }
		int balance = 10;
		while (true) {
		  if (balance < 9)
		    continue;
		  balance = balance - 9;
		}
		System.out.println("Balance is " + balance);
		
		
			int list[] = {1, 2, 3, 4, 5, 6};
			for (int i = 1; i < list.length; i++)
			{
				list[i] = list[i - 1];
				//System.out.println("List1 " + list[i] + " ");
			}
	        for (int i = 0; i < list.length; i++)
	        System.out.print( list[i] + " ");
	   
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = input.nextInt();
		for (int i = 1;i<=n;i++)
		{
			int num=i;
			for(int j = 1;j<=i;j++)
			{
				System.out.print(num + " ");
				num = num + n -j;
			}
			System.out.println();
		}
		int[][] array = {{1, 2}, {3, 4}, {5, 6}};
		int sum = 0;
		for (int i = 0; i < array.length; i++) 
		  sum += array[i][0];
		System.out.println(sum);
		
		/*int[] list = {1, 2, 3, 4, 5};
	    reverse(list);
	    for (int i = 0; i < list.length; i++)
	      System.out.print(list[i] + " ");
	  }

	  public static void reverse(int[] list) {
	    int[] newList = new int[list.length];

	    for (int i = 0; i < list.length; i++)
	      newList[i] = list[list.length - 1 - i];

	    list = newList;
	  
		/*int i = 5;
		while (i >= 1) {
		int num = 1;
		for (int j = 1; j <= i; j++) {
		 System.out.print(num + "xxx");
		 num *= 2;
		 }
		 System.out.println();
		 i--;
		}
		/*int x = 80000000;
		while(x>0)
			x++;
		System.out.println("x " + x);
		/*for(int i=0;i<4;i++)
		{
			System.out.println("i =" +i);
			for(int j=0;j<i; j++)
			{
				System.out.println("j =" +j);
				System.out.println("Java");
			}
		}*/
		/*
		for(int i=0,j=0; i+j<5 ;i++,j++)
			System.out.println("Loop");
		
		
		int sum=0;
		for(int i=0;i<5;++i)
		{
			if(i%3==0)
				continue;
			sum += i;
		}
		System.out.println(sum);
		
		/*int j,k;
		int i=j=k=7;
		System.out.println(i + " " + j + " " + k);
		*/
		
		/*int a=1;
		
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(--a);
		System.out.println(a--);
		*/
		
		/*float f = 12.5f;
		int i = (int)f;
		System.out.println(f);
		System.out.println(i);
		System.out.println(f/2);
		System.out.println(i/5);
		*/
		
		/*int x = 3,y=2,z=0;
		if(x>2)
		{
			if(y>2)
			{
				z=x+y;
				System.out.println(z);
			}
		}
		else
		{
			System.out.println(x);
		}*/
		
		/*int x=3,y=4;
		switch(x++ + ++x)
		{
			case 6 : y += 3;
			break;
			case 7 : y -= 3;
			break;
			default :
				y *=3;
		}
		System.out.println(y);
		*/
		
		/*for(int i=1,j=2,k=3;i<=10&&j<=10&&k<=10;++i,j++,++k)
		{
			System.out.println("Loops");
		}
		*/
		/*for (int i=10;i>=0;i/=2)
		{
			System.out.println("Loop");
		}*/
		
		//Scanner input = new Scanner(System.in);
		
		
		/*double[][] m = new double[5][5];
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j] = input.nextDouble();
			}
		}
		System.out.println(sum(m));
	
	}
	public static int sum(double[][] m)
	{
		int sum=0;
		for(int i=0;i<m.length;i++)
			sum += m[i][i];
		return sum;
	}*/
		
		
		/*int x=7,y=2,z=0;
		if(x>2)
		{
			if(y>2)
			{
				z=x+y;
				System.out.println(z);
			}
		}
		else
		{
			System.out.println(x);
		}
		*/
		
		/*do
		{
			while(1==1)
			{
				System.out.println("Java");
				break;
			}
		}while(true);
		
		*/
		/*int a = 6;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		a = 6;
		b = ++a;
		System.out.println(a);
		System.out.println(b);
		/*for(int i=0;i<3;i++);
		{
			System.out.println("Java");
		}*/
		/*for( ; ; )
		{
			System.out.println("Java");
			break;
		}*/
		/*
		String str1 = "abc:5";
		String str2 = "Abc:5";
		String str3 = "abc:"+5;
		String str4 = "Abc:"+(1+4);
		System.out.println(str1 == str1);
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str2 == str4);
		*/
		
		
		
		
	}
}
