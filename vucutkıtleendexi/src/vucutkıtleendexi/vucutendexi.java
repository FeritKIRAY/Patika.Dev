package vucutkıtleendexi;

import java.util.Scanner;

public class vucutendexi {

	public static void main(String[] args) {
		Double boy;
		Double kilo;
		Double endex;
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz");
		boy=scan.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz");
		kilo=scan.nextDouble();
		endex=kilo/(boy*boy);
		System.out.println("Vucut Kitle indeksiniz : " + endex );

	}

}
