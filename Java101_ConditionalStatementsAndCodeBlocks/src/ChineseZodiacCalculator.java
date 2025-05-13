import java.util.*;

public class ChineseZodiacCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int birthYear, remainder;
		String zodiacSign="";
		System.out.print("Doğum yılınızı giriniz: ");
		birthYear = sc.nextInt();
		remainder = birthYear%12;
		
		switch (remainder) {
		case 0: {
			zodiacSign = "Maymun";
			break;
		}
		case 1: {
			zodiacSign = "Horoz";
			break;
		}
		case 2: {
			zodiacSign = "Köpek";
			break;
		}
		case 3: {
			zodiacSign = "Domuz";
			break;
		}
		case 4: {
			zodiacSign = "Fare";
			break;
		}
		case 5: {
			zodiacSign = "Öküz";
			break;
		}
		case 6: {
			zodiacSign = "Kaplan";
			break;
		}
		case 7: {
			zodiacSign = "Tavşan";
			break;
		}
		case 8: {
			zodiacSign = "Ejderha";
			break;
		}
		case 9: {
			zodiacSign = "Yılan";
			break;
		}
		case 10: {
			zodiacSign = "At";
			break;
		}
		case 11: {
			zodiacSign = "Koyun";
			break;
		}
		default:
			System.out.println("Hata!");
		}
		
		System.out.println(zodiacSign);

	}

}
