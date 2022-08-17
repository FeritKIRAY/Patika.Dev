package hesapMakinesi;
import java.util.Scanner;


public class HesapMakinesi {
	 public static void main(String[] args) {
	int n1,n2, select;
	Scanner scan=new Scanner(System.in);
	System.out.print("Bir sayı giriniz : ");
	n1=scan.nextInt();
	System.out.print("Number2 Giriniz: ");
    n2 = scan.nextInt();
    System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
    select = scan.nextInt();

    switch(select){
        case 1:
            System.out.print("Toplama Sonucu: " + (n1 + n2));
            break;

        case 2:
            System.out.print("Cikarma Sonucu: " + (n1 - n2));
            break;

        case 3:
            System.out.print("Carpma Sonucu: " + (n1 * n2));
            break;

        case 4:

            if(n2 != 0){
                System.out.print("Bolme Sonucu: " + (1 / n2));
            }else{
                System.out.println("Sifira Bolunemez ");
            }
            break;

        default:
            System.out.println("Hatalı Bir Tuşlama Yaptınız..");
    }
	
	
	
	 }	
	
}
