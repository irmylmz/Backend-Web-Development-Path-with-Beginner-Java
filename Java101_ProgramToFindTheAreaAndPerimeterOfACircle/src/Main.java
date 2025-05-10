import java.util.*;

public class Main {

	public static void main(String[] args) {
		int r;
		double pi=3.14, alan, cevre ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Yarıçapı giriniz: ");
		r = sc.nextInt();
		
		alan = pi*r*r;
		cevre = 2*pi*r;
		System.out.println("Alan: " + alan + " Çevre: " + cevre);

	}

}
