package dairealan;

import java.util.Scanner;

public class DaireAlanı {

	public static void main(String[] args) {
		
/* Dairenin alanının hesaplanması
		int r;
		Double pi=3.14;
	    Scanner scan= new Scanner(System.in);
	    System.out.print("Dairenin yarı çapını giriniz...");
	    r=scan.nextInt();
	    Double alan= pi*r*r;
	    Double cevre= 2*pi*r;
	    System.out.println("Dairenin alanı : " + alan );
	    System.out.println("Dairenin çevresi : " + cevre );
		
	*/	
		
		// daire diliminin alanın blunması
		int r, x;
		Double alan, pi = 3.14;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz.." );
		r= scan.nextInt();
		System.out.println("Merkez acının ölçüsünü giriniz..");
		x=scan.nextInt();
		alan= (pi*(r*r)*x);
		System.out.println("Daire diliminin alanı : " +alan);
		
		
		
	}

}
