import java.util.Scanner;

public class ProgramToFindTheSumOfOddNumbers {

	public static void main(String[] args) {
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number: ");
			n = sc.nextInt();
			if(n%2==1) sum+=n;
		}while(n > 0);
		
		System.out.println(sum);

	}

}
