package sayıSıralama;

import java.util.Scanner;

public class SayılarıSıralama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  double a,b,c;
	        Scanner inp=new Scanner(System.in);
	        System.out.print("1.Sayiyi giriniz:");
	        a= inp.nextDouble();
	        System.out.print("2.sayiyi giriniz:");
	        b= inp.nextDouble();
	        System.out.print("3.sayiyi giriniz:");
	        c= inp.nextDouble();

	        if (a<b && a<c){
	            if (b<c){
	                System.out.println("Dogru siralama: a<b<c");
	            }else{
	                System.out.println("Dogru siralama: a<c<b");
	            }
	        } else if (b<a && b<c) {
	            if (a<c){
	                System.out.println("Dogru siralama: b<a<c");
	            }else{
	                System.out.println("Dogru siralama: b<c<a");
	            }
	        }else{
	            if (a<b){
	                System.out.println("Dogru siralama: c<a<b");
	            }else{
	                System.out.println("Dogru siralama: c<b<a");
	            }
	        }
	}

}
