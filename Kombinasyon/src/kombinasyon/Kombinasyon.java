package kombinasyon;
import java.util.Scanner;
public class Kombinasyon {

	public static void main(String[] args) {
		int combination, n, r, i, total=1, total2= 1; int total3 = 1;
		System.out.print("n değerini giriniz : ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		System.out.print("r değerini giriiniz : ");
		r=scan.nextInt();
		
		//n!
		for(i=1; i<=n; i++ ) {
			total*=i;
			
		}
		
		//r!
		for(i=1; i<=r; i++) {
			total2*=i;
			
		}
		
		//(n-r)!
		for(i=1; i<=(n-r); i++) {
		total3*=i;
		}
		/*kombinasyon
		C(n,r)=n!/(r!*(n-r)!)
		*/
		combination= total/(total2*total3);
		System.out.print("n değerinizin r li kombinasyonu : " + combination );
		
	}

}
