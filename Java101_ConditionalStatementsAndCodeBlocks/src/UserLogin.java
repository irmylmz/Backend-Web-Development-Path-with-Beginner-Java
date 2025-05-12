import java.util.*;

public class UserLogin {

	public static void main(String[] args) {
		String userName, password;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kullanıcı adınızı giriniz: ");
		userName = sc.nextLine();
		System.out.print("Şifrenizi adınızı giriniz: ");
		password = sc.nextLine();
		
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş yapıldı.");
		}else {
			System.out.println("Yanlış bilgi girdiniz.");
		}
		
		System.out.println("");

	}

}
