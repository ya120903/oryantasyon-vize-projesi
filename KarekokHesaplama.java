import java.util.Scanner ;

public class KarekokHesaplama {
    public static void main (String[] args) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.println("Karekökü alınacak sayıyı giriniz.") ;
        double a = input.nextDouble();
        double b = (double)Math.sqrt( a ) ;

        System.out.println("Sayının karekökü:" + b + " ");
    }
}