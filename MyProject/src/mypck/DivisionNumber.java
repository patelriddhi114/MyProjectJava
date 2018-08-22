package mypck;

public class DivisionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=100;i<=200;i++)
		{
			if(1%6==0 ^ i%5==0)
			{
				
				System.out.println((count++ % 10 !=0) ? i+ "" : i + "\n");
			}
		}
	}

}
