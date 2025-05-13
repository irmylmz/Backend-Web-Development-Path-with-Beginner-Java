import java.util.*;

public class LeapYearCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int year;
		boolean isYearLeap = false; 
		System.out.println("Yılı giriniz: ");
		year = sc.nextInt();
	
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					isYearLeap = true;
				}else {
					isYearLeap = false;
				}
			}else {
				isYearLeap = true;
			}
		}else {
			isYearLeap = false;
		}
		
		if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isYearLeap = true;
            }
        }
		
		System.out.println(isYearLeap);

	}

}
