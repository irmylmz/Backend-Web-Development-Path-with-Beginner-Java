import java.util.*;

public class PassingTheClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mat, tur, fiz, kim, cog;
		
		System.out.print("Matematik notunu giriniz: ");
		mat = sc.nextInt();
		if (!(0 <= mat && mat <= 100)) {
		    System.out.println("Geçerli Matematik notu girilmedi");
		    mat=55;
		}
		
		System.out.print("Türkçe notunu giriniz: ");
		tur = sc.nextInt();
		if (!(0 <= tur && tur <= 100)) {
		    System.out.println("Geçerli Türkçe notu girilmedi");
		    tur=55;
		}
		
		System.out.print("Fizik notunu giriniz: ");
		fiz = sc.nextInt();
		if (!(0 <= fiz && fiz <= 100)) {
		    System.out.println("Geçerli Fizik notu girilmedi");
		    fiz=55;
		}
		
		System.out.print("Kimya notunu giriniz: ");
		kim = sc.nextInt();
		if (!(0 <= kim && kim <= 100)) {
		    System.out.println("Geçerli Kimya notu girilmedi");
		    kim=55;
		}
		
		System.out.print("Coğrafya notunu giriniz: ");
		cog = sc.nextInt();
		if (!(0 <= cog && cog <= 100)) {
		    System.out.println("Geçerli Coğrafya notu girilmedi");
		    cog=55;
		}	
			
		double ave = (mat+tur+kim+fiz+cog)/5;
		
		if(ave<=55) {
			System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
		}else {
			System.out.println("Tebrikler, sınıfı geçtiniz!");
		}
		System.out.println("Ortalamanız: " + ave);
		

	}

}
