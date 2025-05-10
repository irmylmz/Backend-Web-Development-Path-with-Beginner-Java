import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height, weight;
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		height = sc.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		weight = sc.nextDouble();
		double index = weight / (height*height);
		System.out.println("Vücut Kitle İndeksiniz : " + index);

	}

}
