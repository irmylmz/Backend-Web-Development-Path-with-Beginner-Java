import java.util.Scanner;

public class ProgramThatCalculatesExponents {
	static double power(int a, int b) {
		if(b == 0) return 1;
		if(b < 0) return 1 / power(a, -(b-1));
		return a * power(a, (b-1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base number: ");
		int base = sc.nextInt();
		
		System.out.print("Enter the power number: ");
		int pow = sc.nextInt();
		
		System.out.println("Result: " + power(base, pow));
		

	}

}
