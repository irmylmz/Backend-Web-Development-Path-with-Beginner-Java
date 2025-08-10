import java.util.Scanner;

public class FindingMinAndMaxValuesFromEnteredNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("The number you will enter: ");
		int n = sc.nextInt();
		int max, min;
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		max = num;
		min = num;
		n--;
		
		do {
			System.out.print("Enter a number: ");
			num = sc.nextInt();

			if(num<min) {
				min = num;
			}
			if(num>max) {
				max = num;
			}		
			n--;
			
		}while(n>0);
		
		System.out.println("Max number: " + max);
		System.out.println("Min number: " + min);
		
	}

}
