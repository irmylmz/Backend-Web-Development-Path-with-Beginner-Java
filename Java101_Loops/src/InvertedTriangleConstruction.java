import java.util.Scanner;

public class InvertedTriangleConstruction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i=n; i>=0; i--) {
			for(int k=(2*i)-1; k>=1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
