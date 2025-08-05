import java.util.Scanner;

public class ProgramToCalculateExponentialNumbers {

	public static void main(String[] args) {
		int n,k;
		Scanner sc = new Scanner(System.in);
		System.out.print("The number to be raised to the exponent: ");
		n = sc.nextInt();
		System.out.print("Power of the number: ");
		k = sc.nextInt();
		int total = 1;
		
		/*
		int i = 1;
		while(i<=k) {
			total *= n;
			i++;
		}
       */
		
		for(int i=1; i<=k; i++) {
			total *= n;
		}
		
		System.out.println("Total: "+total);
	}

}
