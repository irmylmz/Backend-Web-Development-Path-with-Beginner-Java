import java.util.Scanner;

public class ProgramToFindPowersOf2LessThanEnteredNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		System.out.println("Powers of 4 up to the entered number: ");
		for(int i=1; i<=n; i*=4) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Powers of 5 up to the entered number: ");
		for(int j=1; j<=n; j*=5) {
			System.out.println(j);
		}
		System.out.println();
		System.out.println("Powers of 2 up to the entered number: ");
		for(int i=1; i<=n; i*=2) {
			System.out.println(i);
		}
	}

}
