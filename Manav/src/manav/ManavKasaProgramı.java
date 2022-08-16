package manav;

import java.util.Scanner;

public class ManavKasaProgramı {

	public static void main(String[] args) {
		Double a, e, d, m, p;
		Scanner scan = new Scanner(System.in);
		System.out.print("armut kaç kılo :");
		a = scan.nextDouble();
		System.out.print("elma kaç kılo :");
		e = scan.nextDouble();
		System.out.print("domates kaç kılo :");
		d = scan.nextDouble();
		System.out.print("muz kaç kılo :");
		m = scan.nextDouble();
		System.out.print("patlıcan kaç kılo :");
		p = scan.nextDouble();
		Double a1 = 2.14, e1 = 3.67, d1 = 1.11, m1 = 0.95, p1 = 5.0;
		Double toplam = ((a * a1) + (e * e1) + (d * d1) + (m * m1) + (p * p1));
		System.out.println("Toplam Tutar : " + toplam);

	}

}
