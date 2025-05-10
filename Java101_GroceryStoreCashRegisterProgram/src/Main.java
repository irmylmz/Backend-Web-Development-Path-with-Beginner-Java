import java.util.*;

public class Main {

	public static void main(String[] args) {
		double armut = 2.14, elma= 3.67, domates=1.11, muz=0.95, patlican=5.00;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo ? : ");
		armut *= sc.nextDouble();
		System.out.print("Elma Kaç Kilo ? : ");
		elma *= sc.nextDouble();
		System.out.print("Domates Kaç Kilo ? : ");
		domates *= sc.nextDouble();
		System.out.print("Muz Kaç Kilo ? : ");
		muz *= sc.nextDouble();
		System.out.print("Patlıcan Kaç Kilo ? : ");
		patlican *= sc.nextDouble();
		
		double tutar = armut + elma + domates + muz + patlican;
		System.out.println("Toplam Tutar : " + tutar);
		
	}

}
