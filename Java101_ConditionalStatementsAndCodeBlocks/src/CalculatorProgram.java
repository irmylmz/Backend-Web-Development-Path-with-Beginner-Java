import java.util.*;


public class CalculatorProgram {

	public static void main(String[] args) {
		int a, b, select;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz: ");
		a = sc.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		b = sc.nextInt();
		
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Yapmak istediğiniz işlemi seçiniz: ");

		select = sc.nextInt();
		
		switch (select) {
		case 1: {
			System.out.println("Toplam: " + (a+b));
			break;
		}case 2: {
			System.out.println("Çıkan: " + (a-b));
			break;
		}case 3: {
			System.out.println("Çarpım: " + (a*b));
			break;
		}case 4: {
			 if (b != 0) {
                 System.out.println("Bölüm: " + ((double) a / b));
             } else {
                 System.out.println("Bir sayıyı 0'a bölemezsiniz!");
             }
             break;
		}
		default:
			System.out.println("Geçerli bir işlem seçin!");
		}

	}

}
