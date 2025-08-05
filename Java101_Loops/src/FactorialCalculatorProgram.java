import java.util.Scanner;

public class FactorialCalculatorProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number n: ");
		int n = sc.nextInt();
		System.out.print("Enter a number r: ");
		int r = sc.nextInt();
		
		if (r > n || n < 0 || r < 0) {
            System.out.println("Incorrect entry: r cannot be greater than n, and negative numbers cannot be entered.");
            return;
        }
	
		int upProduct=1, lowerProduct=1;
		int k = n-r;
		
		// n sonradan kullanmak istersen temnpN oluşturmak lazım
		while(n>r) {
			upProduct*=n;
			n--;
		}
		for(int i= 1; i<=k;i++) {
			lowerProduct*=i;
		}
		
		float total = upProduct / lowerProduct;
		System.out.println(total);

	}

}
