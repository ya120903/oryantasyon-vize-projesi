
import java.util.Scanner;

public class NotHesapla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Vize notu giriniz:");
        int vize = input.nextInt();

        System.out.println("Final notunu giriniz");
        int Final = input.nextInt();

        // Vize notunun %40'ı final notunun %60'ı alınır.

        double not = (vize * 0.4) + (Final * 0.6);

        System.out.println("Yıl sonu notunuz = " + not);


    }
}
