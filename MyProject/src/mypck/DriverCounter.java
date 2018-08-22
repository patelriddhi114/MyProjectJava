package mypck;

public class DriverCounter {

	int counter1;
	static int counter2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DriverCounter dc1 = new DriverCounter();
		DriverCounter dc2 = new DriverCounter();
		DriverCounter dc3 = new DriverCounter();
		
		dc1.findCount();
		dc1.displayCount();
		dc2.findCount();
		dc2.displayCount();
		dc3.findCount();
		dc3.displayCount();
		
	}
	public void findCount()
	{
		counter1++;
		counter2++;
	}
	public void displayCount()
	{
		System.out.println("counter1:" + counter1);
		System.out.println("counter2:" + counter2);
	}
}
