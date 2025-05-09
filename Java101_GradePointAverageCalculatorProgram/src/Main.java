import java.util.*;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Değişkenleri oluştur
				int mat, fizik, kimya, turkce, tarih, muzik;
				
				//Scanner sınıfımızı tanımladık
				Scanner sc = new Scanner(System.in);
				
				//Kullanıcıdan değerleri al
				System.out.println("Matematik Notunuz: ");
				mat = sc.nextInt();
				
				System.out.println("Fizik Notunuz: ");
				fizik = sc.nextInt();
				
				System.out.println("Kimya Notunuz: ");
				kimya = sc.nextInt();
				
				System.out.println("Türkçe Notunuz: ");
				turkce = sc.nextInt();
				
				System.out.println("Tarih Notunuz: ");
				tarih = sc.nextInt();
				
				System.out.println("Müzik Notunuz: ");
				muzik = sc.nextInt();
				
				double result = (mat+fizik+kimya+turkce+tarih+muzik)/ 6.0;
				System.out.println(result);
				
				String str = (result>60) ? "Geçti" : "Kaldı";
				System.out.println(str);

	}

}
