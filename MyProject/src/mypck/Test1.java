package mypck;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "Welcome";
		String s2 = "welcome";
		
		//a
		boolean isEqual = s1.equals(s2);
		System.out.println("Equals :" + isEqual);
		
		//b
		boolean isEqual1 = s1.equalsIgnoreCase(s2);
		System.out.println("Equals Ignore Case :" + isEqual1);
		
		//c 
		int x = s1.compareTo(s2);
		System.out.println("Compare to :" + x);
		
		//d
		int x1 = s1.compareTo(s2);
		System.out.println("CompareIgnore Case to :" + x1);
		
		
		System.out.printf("%.2f\n%0.3f\n", 1.23456, 2.34);
		
	}

}
