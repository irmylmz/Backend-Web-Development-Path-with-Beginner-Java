import java.util.Scanner;

public class ArmstrongNumberFindingProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int tempNumber = number;
        int result = 0;
        int basValue= 0;
        
        while(tempNumber!=0) {
        	basValue = tempNumber % 10;
        	result += basValue;
        	tempNumber/=10;
        }
		
		System.out.println(result);
		
		/*
		for(int i=0; i<=1000; i++) {
			int number = i;
			int basNumber = 0;
	        int tempNumber = number;
	        int basValue;
	        int result = 0;
	        int basPow;
	        
	        while(tempNumber != 0 ) {
	        	tempNumber /= 10;
	        	basNumber++;
	        }
	        
	        tempNumber = number;
	        
	        while(tempNumber!=0) {
	        	basValue = tempNumber % 10;
	        	basPow = 1;
	        	for(int j=1; j<=basNumber; j++) {
	        		basPow *= basValue;
	        	}
	        	result += basPow;
	        	tempNumber/=10;
	        }
	        
	        if (result == number) {
	            System.out.println(number + " sayısı bir Armstrong sayıdır.");
	        } else {
	            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
	        }
		}
        
        */
        

	}

}
