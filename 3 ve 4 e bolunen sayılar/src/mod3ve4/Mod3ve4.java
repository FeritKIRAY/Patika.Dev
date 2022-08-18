package mod3ve4;

import java.util.Scanner;

public class Mod3ve4 {

	public static void main(String[] args) {
	/*	int a, toplam = 0, o, t = 0;
		Scanner inp = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz:");
		a = inp.nextInt();
		for (int i = 0; i <= a; i++) {
			if (i % 3 == 0 && i % 4 == 00) {
				t++;
				System.out.println("Tur Sayisi :" + t);
				System.out.println("3'e ve 4'e tam bolunen sayilar" + i);
				toplam = toplam + i;
				if (i == a) {
					o = toplam / t;
					System.out
							.println("Girdiginiz sayiya kadar 3'e ve 4'e tam bolunen sayilarin toplamasi : " + toplam);
					System.out.println("Girdiginiz sayiya kadar 3'e ve 4'e tam bolunen sayilarin ortalamasi : " + o);
				} else if (i == a) {
					o = toplam / t;
					System.out
							.println("Girdiginiz sayiya kadar 3'e ve 4'e tam bolunen sayilarin toplamasi : " + toplam);
					System.out.println("Girdiginiz sayiya kadar 3'e ve 4'e tam bolunen sayilarin ortalamasi : " + o);
				}
			}
		}
*/
		
		/*
		// 3 ve 4 e bolunebılen sayıların toplamı ve ortalamasının alınması
		 int sayi, sayac = 0, toplam = 0;

	        Scanner inputScanner = new Scanner(System.in);

	        System.out.print("Sayı Giriniz: ");
	        sayi = inputScanner.nextInt();

	        for (int i = 0; i <= sayi; i++) {
	            if ((i % 3 == 0) && (i % 4 == 0)) {
	                System.out.println(i);
	                toplam = toplam + i;
	                sayac++;
	            }
	        }
	        System.out.println("Ortalama Deger: " + toplam/sayac);
	        System.out.println("Toplam " + toplam);
	        
	        */
		
		int num, top=0;
		System.out.println("Bir sayı girin..");
		Scanner scan= new Scanner(System.in);
		num=scan.nextInt();
		for(int i=0; i<= num; i++) {
		if(i%4==0) {
			System.out.println(i);
			
			
			top+= num+i;
			
			
		}
		}
		System.out.println("Toplam : " + top);
			
	}

}
