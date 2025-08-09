import java.util.Scanner;

public class EBOB_EKOKFindingProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the m1: ");
		int m1 = sc.nextInt();
		System.out.print("Enter the m2: ");
		int m2 = sc.nextInt();
		
		int ebob = 1;
		int ekok = 1;
		
		
		if(m1>m2) {
		    int i = m2;
			while(i>=1) {
				if(m1%i==0 && m2%i==0) {
					ebob = i;
					System.out.println("EBOB (m1>m2): "+ebob);
					break;
				}
				i--;
			}	
		}
		if(m2>m1) {
		    int j=m1;
			while(j>=1) {
				if(m1%j==0 && m2%j==0) {
					ebob = j;
					System.out.println("EBOB (m1<m2): "+ebob);
					break;
				}
				j--;
			}
		}
		
		int k=1;
		while(k<=(m1*m2) ) {
			if(k%m1==0 && k%m2==0) {
				ekok = k;
				System.out.println("EKOK: " +ekok);
				break;
			}
			k++;
		}
		
		
		
		/*
		
		// Ebob için
		if(m1>m2) {
			for(int i=m2; i>=1; i--) {
				if(m1%i==0 && m2%i==0) {
					ebob = i;
					System.out.println("EBOB (m1>m2): "+ebob);
					break;
				}
			}	
		}else if(m2>m1) {
			for(int j=m1; j>=1; j--) {
				if(m1%j==0 && m2%j==0) {
					ebob = j;
					System.out.println("EBOB (m1<m2): "+ebob);
					break;
				}
			}
		}
		
		//Ekok için
		
		for(int k=1; k<=(m1*m2); k++) {
			if(k%m1==0 && k%m2==0) {
				ekok = k;
				System.out.println("EKOK: " +ekok);
				break;
			}
		}
		
		*/
		

	}

}
