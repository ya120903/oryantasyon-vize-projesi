import java.util.Scanner ;

public class KuvvetHesaplama {
    public static void main ( String[] args ) {
        Scanner input = new Scanner( System.in ) ;

        System.out.println("Üssü alınacak sayıyı giriniz") ;
        double a = input.nextDouble();
        System.out.println("Kuvveti olan sayıyı giriniz") ;
        double b = input.nextDouble();

        System.out.println ( Math.pow ( 2 , 3 ));
        System.out.println ( Math.pow ( 4 , 0.5 ));
        System.out.println ( Math.pow ( 2.5 , 2 ));
        System.out.println ( Math.pow ( 2.5 , -2 ));

    }
}
