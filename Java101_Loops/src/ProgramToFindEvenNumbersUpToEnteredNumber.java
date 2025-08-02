import java.util.Scanner;


public class ProgramToFindEvenNumbersUpToEnteredNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int k = sc.nextInt();
		
		/*
		for(int i=0; i<=k; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		*/
		
		int i = 0;
		while(i<=k) {
			if(i%2 == 0) System.out.println(i);
			i++;
		}

	}

}
