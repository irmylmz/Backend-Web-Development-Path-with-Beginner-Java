import java.util.Scanner;

public class AdvancedCalculator {
	
	static int sum(int a, int b) {
		return a + b;
	}
	
	static int minus(int a, int b) {
		return a - b;
	}
	
	static int times(int a, int b) {
		return  a * b;
	}
	
	static int diveded(int a, int b) {
		if(b == 0) {
			System.out.print("İkinci sayı sıfırdan farklı olmalı! ");
			return 0;
		}
		return a / b;
	}
	
	static int power(int a, int b) {
		int result = 1;
		for(int i = 1; i<b; i++) {
			result *= a;
		}
		return result;
	}
	
	static int mod(int a, int b) {
		return  a % b;
	}
	
	static void calc(int a, int b) {
		System.out.println("Alan: " + (a*b));
		System.out.println("Çevre: " + (2*(a+b)));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		// = sc.nextInt();
		
		String menu = "1 - Toplama İşlemi\n" + 
		"2 - Çıkarma İşlemi\n" +
		"3 - Çarpma İşlemi\n" +
		"4 - Bölme İşlemi\n" +
		"5 - Üslü Sayı Hesaplama\n" +
		"6 - Mod Alma\n" +
		"7 - Dikdörtgen Alan ve Çevre Hesabı\n" +
		"0 - Çıkış Yap";
		
		System.out.println(menu);
		
		while(true) {
			System.out.print("Bir işlem seçiniz: ");
			select = sc.nextInt();
			
			if(select ==0) {
				break;
			}
			
			System.out.print("Birinci sayıyı giriniz: ");
			int n1 = sc.nextInt();
			
			System.out.print("İkinci sayıyı giriniz: ");
			int n2 = sc.nextInt();
			
			switch (select) {
			case 1: {
				System.out.println("Result: " + sum(n1, n2));
				break;
			}
			
			case 2: {
				System.out.println("Result: " + minus(n1, n2));
				break;
			}
			
			case 3: {
				System.out.println("Result: " + times(n1, n2));
				break;
			}
			
			case 4: {
				System.out.println("Result: " + diveded(n1, n2));
				break;
			}
			
			case 5: {
				System.out.println("Result: " + power(n1, n2));
				break;
			}
			
			case 6: {
				System.out.println("Result: " + mod(n1, n2));
				break;
			}
			
			case 7: {
				calc(n1, n2);
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + select);
			}
		};
				
	}

}
