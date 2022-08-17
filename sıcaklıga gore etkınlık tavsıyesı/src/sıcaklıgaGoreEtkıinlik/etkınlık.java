package sıcaklıgaGoreEtkıinlik;

import java.util.Scanner;

public class etkınlık {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double temp;
	        Scanner scan=new Scanner(System.in);
	        System.out.print("Hava sicakligini giriniz:");
	        temp= scan.nextDouble();
	        if (temp<=5){
	            System.out.println("Kayak yapmaya gidebilirsiniz.");
	        } else if (temp>5 && temp<=15 ) {
	            System.out.println("Sinemaya gidebilirsiniz.");
	        } else if (temp>15 && temp<=25) {
	            System.out.println("Piknige gidebilirsiniz.");
	        } else if (temp>25) {
	            System.out.println("Yüzmeye gidebilirsiniz.");
	        }
	}

}
