
/*Assume a car runs for about 18 kms in 25 minutes and 15 seconds. Write a program that
displays the average speed in miles per hour. (Note: 1 miles = 1.6 kms)*/
package mypck;

public class Kilometer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double minutes = 25;
		double seconds = 15;
		double distanceKG = 18;
		
		double distanceInKG = distanceKG / 1.6;
		
		double timeInMinutes = (minutes + seconds)/60;
		
		double mileperHours = distanceInKG / timeInMinutes;
		
		System.out.println("The average speed in miles per hours:" + mileperHours);
		
	}

}
