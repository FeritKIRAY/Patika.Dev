package üslüsayıalma;
import java.util.Scanner;
public class Üslüsayıalma {

	public static void main(String[] args) {
	int a,n, i=1, total=1;
	Scanner scan=new Scanner(System.in);
	System.out.print("Üssü alınacak sayıyı giriniz :"  );
    a=scan.nextInt();
    System.out.print("Üssü giriniz : ");
	n=scan.nextInt();
	for(i=1; i<=n; ) {
		total*=a;
		i++;
	}
	System.out.print("Sonuç : " + total);
	
	}

}
