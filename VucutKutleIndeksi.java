import java.util.Scanner ;

public class VucutKutleIndeksi {

    public static void main(String[] args ) {
        
        Scanner input = new Scanner(System.in);


        System.out.println("Boyunuzu cm olarak giriniz.");
        int boy = input.nextInt();

        System.out.println("Kilonuzu kg olarak giriniz.");
        int kilo = input.nextInt();

        double oran = boy / kilo ;

        if( oran < 2.0 ) {
            System.out.println("Şişmansınız") ;
        }
        else if ( oran > 2.0 && oran < 2.5  ) {
            System.out.println("Normal kilodasınız.") ;
        }
        else {
            System.out.println("Zayıfsınız");
        }


    }
}


















