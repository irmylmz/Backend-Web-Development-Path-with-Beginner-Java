import java.util.*;

public class Main {

	public static void main(String[] args) {
		int km;
		double perKm = 2.20, total = 10;
		Scanner sc = new Scanner(System.in);
		System.out.print("Kilometre giriniz: ");
		km = sc.nextInt();
		
		total += (perKm * km);
		
		total = (total < 20) ? 20 : total;
		
		System.out.println("Toplam tutar: " + total);
 		
	}

}
