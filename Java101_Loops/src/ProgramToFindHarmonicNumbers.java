import java.util.Scanner;

public class ProgramToFindHarmonicNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		double result = 0;
		
		for(int i=1; i<=n; i++) {
			result += (1.0/i);
			
		}
		
		System.out.println(result);
	}

}
