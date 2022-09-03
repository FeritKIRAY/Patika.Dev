package recursiveuslusayi;
import java.util.Scanner;
public class RecursiveUsluSayi {
    static int pow(int base,int exponent){
        if (base == 1 | exponent == 0) {
            return 1;
        }
        return pow(base,exponent-1)*base;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,r;
        System.out.println("taban sayısını giriniz: ");
        n = scan.nextInt();
        System.out.println("üs sayısını giriniz: ");
        r = scan.nextInt();
        System.out.println(pow(n,r));
	}

}
