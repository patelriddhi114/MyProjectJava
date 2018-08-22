package mypck;

public class Output13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b = 10;
		int c = 10;
		
		c = a++ + ++b - --b + ++a + --b - ++b - a++ + b++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
