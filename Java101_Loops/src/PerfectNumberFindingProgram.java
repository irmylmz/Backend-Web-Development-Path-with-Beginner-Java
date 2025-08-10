import java.util.Scanner;

public class PerfectNumberFindingProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int top = 0;
		
		for(int i=1; i<num; i++) {
			if(num%i==0){
				top += i;
			}
		}
		
		if(top==num) {
			System.out.println(num + " is perfect number.");
		}else {
			System.out.println(num + " is not perfect number.");
		}

	}

}
