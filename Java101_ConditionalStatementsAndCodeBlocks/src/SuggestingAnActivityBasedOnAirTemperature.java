import java.util.*;

public class SuggestingAnActivityBasedOnAirTemperature {

	public static void main(String[] args) {
		int heat;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Sıcaklık giriniz: ");
		heat = sc.nextInt();
		
		if(heat < 5) {
			System.out.println("Kayak yapabilirsiniz. ");
		}else if(heat >= 5 && heat <= 25) {
			if(heat <= 15) {
				System.out.println("Sinemaya gidebilirsiniz. ");
			}if(heat >=10) {
				System.out.println("Piknik yapabilirsiniz. ");
			}
		}else {
			System.out.println("Yüzmeye gidebilirsiniz. ");
		}
		
	}

}
