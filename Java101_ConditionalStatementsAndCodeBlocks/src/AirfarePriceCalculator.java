import java.util.*;

public class AirfarePriceCalculator {

	public static void main(String[] args) {
		int age, distance, tripType;
		double price = 0.1;
		boolean isError = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		System.out.print("Enter your distance: ");
		distance = sc.nextInt();
		System.out.print("For One Way press 1, Round Trip press 2.\nEnter your trip type: ");
		tripType = sc.nextInt();
		
		price *= distance;

		
		if(distance > 0 && age > 0 && tripType > 0 && tripType < 3) {
			if(age<12) {
				price -= (price/2);
			}else if(age<24) {
				price -= (price/10);
			}else if (age>65) {
				price -= ((price*3)/10);
			}if (tripType==2) {
				price -= (price/5);
				price *= 2; 
			}
			System.out.println(price);
		}else {
			isError = true;
		}
		
		if(isError) {
			System.out.println("Hatalı Veri Girdiniz !");
		}
		
		

	}

}
