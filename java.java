import java.util.Random;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random( );
        System.out.println("Sayi tahmin oyunu,Hosgeldin!");
        System.out.println("1 ila 100000 arasinda bir sayi soyle");
        int tahmin = input.nextInt();
        int sayi = rnd.nextInt(100001);

        while (tahmin != sayi) {

            if (tahmin < 0 || tahmin > 100000) {
                System.out.println("Yanlis sayi girdin bir daha gir");
            } else if ( tahmin < sayi ) {
                System.out.println("Daha buyuk bir sayi gir");
            }else {
                System.out.println("Daha kucuk bir sayi gir");
            }
            tahmin = input.nextInt();
        }
        System.out.println("Oyunu kazandiniz!");
    }
}









