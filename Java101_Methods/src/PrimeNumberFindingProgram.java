import java.util.Scanner;

public class PrimeNumberFindingProgram {
	
	static boolean isPrimeRec(int a, int b) {
		if(a==1 || a==2) return true;
		if(a%b == 0) return false;
		// b, sqrt(a)'yı geçtiyse bölen yoktur
		if(b*b > a) return true;
		return isPrimeRec(a, b+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(isPrimeRec(num, 2)) System.out.println("The number is prime.");
		else {
			System.out.println("The number is NOT prime.");
		}
		
		

	}

}
