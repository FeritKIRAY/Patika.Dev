package harmonıksayılar;

import java.util.Scanner;

public class Harmonıksayılar {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		double n=scan.nextDouble();
		double result=0;
		for (double i = 1; i<=n; i++) {
			result+= (1/i);
			
		

	        }
	        System.out.println(result);

	}

}
