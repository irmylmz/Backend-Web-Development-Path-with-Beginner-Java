import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kdvOranı= 0.18;
		System.out.print("Ücret tutarını giriniz: ");
		double tutar = sc.nextDouble();
		
		double kdvTutarı = tutar * kdvOranı;
		double kdvliTutar = tutar + kdvTutarı;
		
		System.out.println("KDV'siz Tutar: " + tutar);
		System.out.println("KDV Oranı: " + kdvOranı);
		System.out.println("KDV Tutarı: " + kdvTutarı);
		System.out.println("KDV'li Tutarı: " + kdvliTutar);

	}

}
