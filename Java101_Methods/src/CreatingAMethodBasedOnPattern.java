import java.util.Scanner;

public class CreatingAMethodBasedOnPattern {
	static void createModel(int n) {
		System.out.print(n + " "); // İleri gitme

        if (n > 0) {
        	createModel(n - 5);
            System.out.print(n + " "); // Geri dönme
        }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		createModel(num);
		
	}

}
