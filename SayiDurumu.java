import java.util.Scanner;

public class SayiDurumu {
    public static void main( String[] args ) {

        Scanner input = new Scanner( System.in);
        System.out.println(" Bir sayı giriniz.");

        double sayi = input.nextDouble();

        // sayı 0'dan küçük ise negatif
        if ( sayi < 0.0 ) {
            System.out.println( " Sayı negatiftir. ");
        }

        // sayı 0' dan büyük ise pozitif
        if ( sayi > 0.0 ) {
            System.out.println(" Sayı pozitiftir. ");
        }


        }
    }

