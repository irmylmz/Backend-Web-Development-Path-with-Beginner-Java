import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("The size of the array is n: ");
		int n = sc.nextInt();
		int[] list = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print((i+1)+ ". Element: ");
			list[i] = sc.nextInt();
		}
		
		/*
		 Deneme 
		for(int j = 0; j < n-1; j++) {
			if(list[j] > list[j+1]){
				int temp = list[j];
				list[j] = list[j+1];
				list[j+1] = temp;  
			}
		}
		*/
		
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		
		
	}

}
