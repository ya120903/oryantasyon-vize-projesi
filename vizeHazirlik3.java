
import java.util.Scanner ;

public class vizeHazirlik3 {
    public static void main (String[] args) {
        Scanner giris = new Scanner(System.in) ;
        double x , f , g ;

                System.out.println("Bir sayi giriniz.");
        x = giris.nextDouble();

        if ( x>0.0) {
            f = 1 / ( 1 + Math.log(x)) ;
            g = 1 / (x + Math.log(x)) ;

        }
        else  {
            f = 1 / ( 1 + x * x ) ;
            g = 1 / ( 1 + x + x * x) ;

            System.out.println( f );
            System.out.println( g );
        }
    }
}

