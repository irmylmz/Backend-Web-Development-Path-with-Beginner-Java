import java.util.*;

public class Main {

	public static void main(String[] args) {
		int a,b;
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dik üçgenin a kenarını giriniz: ");
		a = sc.nextInt();
		System.out.print("Dik üçgenin b kenarını giriniz: ");
		b = sc.nextInt();
		c = Math.sqrt((a*a) + (b*b));
		System.out.println("Hipotenüs: " + c);

	}

}
