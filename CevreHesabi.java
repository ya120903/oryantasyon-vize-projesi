import java.util.Scanner ;

public class CevreHesabi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        final double PI_SAYISI = 3.141593 ;
                System.out.println("Lütfen yarıçapı giriniz.");

        double yaricap = input.nextDouble();
        double cevre = 2 * PI_SAYISI * yaricap ;

        System.out.println("cevre = " + cevre + " ") ;
    }

}
