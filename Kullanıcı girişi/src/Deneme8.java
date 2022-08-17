import java.util.Scanner;

public class Deneme8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kullanıcı adı girişi
		// kullanıcıdan gelen şifre kayıtlı olanla uyuşuyormu dıye kontrol edılecek
		
		String sys_kul_adı = "ferit";
	    String parola = "12345";
	    Scanner scan = new Scanner(System.in);
		System.out.println("Kullanıcı adı: ");
		String kullanıcı_adı = scan.nextLine();
		System.out.println("Parola: ");
		String kul_parola = scan.nextLine();
	
		
		if ( !(sys_kul_adı.equals(kullanıcı_adı)) && !(parola.equals(kul_parola))) {
			System.out.println("Kullanıcı Adı ve Parola Yanlış");
		}
		
		else if((sys_kul_adı.equals(kullanıcı_adı)) && !(parola.equals(kul_parola))) {
			System.out.println("Parola Yanlış");
		}
		
		
		else if(!(sys_kul_adı.equals(kullanıcı_adı)) && (parola.equals(kul_parola))) {
			System.out.println("Kullanıcı adı Yanlış");
		}
		
		
		else {
			System.out.println("Giriş Başarılı..");
	}

}
}
// çalıştıramadım.....
