package desenegöremetot;

import java.util.Scanner;

public class DeseneGöreMetod {

	 static void desen(int N , int a){
	        
	        if(N>0){
	            System.out.print(N + " ");
	            desen(N-5, a);
	        }else{
	            desenT(N , a);
	        }
	    }
	    static void desenT(int N, int a){
	        
	        System.out.print(N + " ");

	        if(N<a){
	            desenT(N+5,a);
	        }
	    }

	    public static void main(String[] args) throws Exception {

	        int N;

	        Scanner input = new Scanner(System.in);

	        System.out.print("Bir sayı giriniz : ");

	        N = input.nextInt();
	        int a = N;
	        desen(N,a);

	}

}
