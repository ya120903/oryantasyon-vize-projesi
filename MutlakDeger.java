import java.util.Scanner ;

public class MutlakDeger {
    public static void main(String[] args){

        Scanner input = new Scanner ( System.in ) ;

        System.out.println(" Mutlak değeri alınacak sayıyı giriniz. ") ;

        int a = input.nextInt() ;


        System.out.println( Math.abs( a ) ) ;

    }
}