import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		int right = 0;
		int selected;
		int[] wrong = new int[5];
		boolean isWin = false;
		boolean isWrong = false;
		
		while(right < 5) {
			System.out.print("Please enter your guess: ");
			selected = sc.nextInt();
			if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0-100.");
                if(isWrong) {
                	right++;
                	System.out.println("You have made too many incorrect entries. Remaining chances: " + (5-right));
                }else {
                	isWrong = true;
                	System.out.println("Your remaining bet will be deducted from your bet if you make another incorrect entry.");
                }
                continue;
			}
			if(selected == num) {
				System.out.println("Congratulations, you guessed correctly! The number you guessed: " + num);
				isWin = true;
				break;
			}else {
				System.out.println();
				System.out.println("You entered an incorrect number!");
                if (selected > num) {
                    System.out.println(selected + " is greater than the hidden number.");
                } else {
                    System.out.println(selected + " is less than the hidden number.");
                }
                wrong[right++] = selected;
				// right++;
                System.out.println("Your remaining time: " + (5-right));
			}
			
		}
		
		sc.close();
		
		if(!isWin) {
			System.out.println(num);
			System.out.println("You lose.");
			if(!isWrong){
				System.out.println("Your Guesses: " + Arrays.toString(wrong));
			}
			
		}
		

	}

}
