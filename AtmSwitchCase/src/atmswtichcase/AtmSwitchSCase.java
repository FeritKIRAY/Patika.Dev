package atmswtichcase;
import java.util.Scanner;
public class AtmSwitchSCase {

	public static void main(String[] args) {
		  String userName, password;
	        int right = 3;
	        double balance = 1500;
	        int select;

	        Scanner inp = new Scanner(System.in);

	        while (right > 0) {

	            System.out.print("Kullanici adinizi Giriniz: ");
	            userName = inp.nextLine();
	            System.out.print("Sifrenizi giriniz: ");
	            password = inp.nextLine();

	            if (userName.equals("Ferit") && password.equals("123123")) {
	                System.out.println("Merhaba Giris basarili." +
	                        " Bankamıza Hosgeldiniz");

	                do {
	                    System.out.println("Yapmak istediginiz islemi seciniz: ");
	                    System.out.println("1-Para yatirma\n" +
	                            "2-Para Cekme\n" +
	                            "3-Bakiye sorgula\n" +
	                            "4-Cikis");

	                    select = inp.nextInt();
	                    switch (select) {

	                        case 1:
	                            System.out.println("Yatirilacak tutari giriniz: ");
	                            int price = inp.nextInt();
	                            balance += price;
	                            break;

	                        case 2:
	                            System.out.println("Cekilecek tutari giriniz: ");
	                            price = inp.nextInt();
	                            if (price > balance) {
	                                System.out.println("Bakiye yetersiz.");
	                            } else {
	                                balance -= price;
	                            }break;

	                        case 3:
	                            System.out.println("Kalan Bakiyeniz: " + balance);
	                            break;
	                        case 4:
	                            break;
	                        default:
	                            System.out.println("Hatali islem yaptiniz tekrar deneyiniz\n");
	                            break;
	                    }
	                }while (select!=4);
	                System.out.println("Cikis yapiliyor");
	                break;

	            } else{
	                right--;
	                if (right == 0) {
	                    System.out.println("Hesabiniz bloke edilmistir" +
	                            " Bankamiz ile iletisime geciniz");
	                } else {

	                    System.out.println("Kalan hakkiniz: " + right);
	                }
	            }
	        }

	}

}
