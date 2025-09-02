import java.util.Arrays;
import java.util.Scanner;

public class ProgramToFindMaximumAndMinimumValuesInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = {56, 34, 1, 8, 101, -2, -33};
		/*
        int min = list[0];
        int max = list[0];  
        for(int i : list) {
        	if(i > max) {
        		max = i;
        	}
        	if(i < min) {
        		min = i;
        	}
        }
        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);    */
		
		System.out.println("Enter a number: ");
		Integer closeMax = null, closeMin = null;
		int num = sc.nextInt();
		Arrays.sort(list);
		
		for(int i : list) {
			if (i < num) {
                if (closeMin == null || i > closeMin) {
                    closeMin = i;
                }
            } else if (i > num) {
                if (closeMax == null || i < closeMax) {
                    closeMax = i;
                }
            }
			
		}
		
		if (closeMin != null)
            System.out.println("The nearest number smaller than the entered number: " + closeMin);
        else
            System.out.println("No number smaller than the entered number was found.");

        if (closeMax != null)
            System.out.println("The nearest number greater than the entered number: " + closeMax);
        else
            System.out.println("No number greater than the number entered was found.");
		

	}

}
