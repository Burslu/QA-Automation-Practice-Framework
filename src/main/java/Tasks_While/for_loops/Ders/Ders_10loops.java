package methodCreation.for_loops.Ders;

public class Ders_10loops {
    public static void main(String[] args) {
    /*
A
A B
A B C
A B C D
A B C D E
A B C D E F
 SEKLINDE YAZDIRINIZ 65=A DEGERIDIR...

        */

        int harf = 65 ;
        for (int i=0; i<=8; i++) {
            for (int j=0; j<=i; j++){
                System.out.print((char)(harf+j)+" ");

            }
            System.out.println(" ");
        }



    }
}
