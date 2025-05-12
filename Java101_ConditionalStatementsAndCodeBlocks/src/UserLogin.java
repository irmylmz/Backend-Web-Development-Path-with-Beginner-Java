import java.util.*;

public class UserLogin {

	String userName, password;
		int req;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kullanıcı adınızı giriniz: ");
		userName = sc.nextLine();
		System.out.print("Şifrenizi adınızı giriniz: ");
		password = sc.nextLine();
		
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş yapıldı.");
		}else {
			System.out.println("Yanlış bilgi girdiniz.");
			System.out.println("Şifrenizi sıfırlamak ister misiniz?\nEvet ise 1'e basın.");
			req = sc.nextInt();
			if(req == 1) {
				sc.nextLine();
				password = sc.nextLine();
				if (password.equals(password)) {
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
				}else {
					System.out.println("Şifre oluşturuldu.");
				}
			}else {
				System.out.println("Giriş yapılamadı.");
			}
		}

	}

}
