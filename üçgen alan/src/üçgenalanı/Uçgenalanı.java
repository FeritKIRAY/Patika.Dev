package üçgenalanı;

import java.util.Scanner;

public class Uçgenalanı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double k1, k2, k3, u, a, cevre;
Scanner scan= new Scanner(System.in);
System.out.print("1. kenar uzunluğu : ");
k1=scan.nextDouble();
System.out.print("2. kenar uzunluğu : ");
k2=scan.nextDouble();
System.out.print("3. kenar uzunluğu : ");
k3=scan.nextDouble();
u=(k1 + k2 + k3 )/2;
cevre= (2*u);
a = Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));
System.out.println("Alan : " + a);
System.out.println("Çevre : " + cevre);

	
	}

}
