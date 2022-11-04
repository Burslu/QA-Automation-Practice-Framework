package methodCreation.for_loops.Ders;

import java.util.Scanner;

public class Ders_02looops {
    public static void main(String[] args) {
        //girilen 100 den kucuk tam sayi icin
        /*birden baslayarak girilen tum sayilari print eden fakat;
        ---sayi 3 un kati ise sayi yerine ' java '
        ---sayi 5 in kati ise sayi yerine 'candir'
        ---sayi hem 3 un hemde 5 in kati ise sayi yerine JavaCan yazdiran programi yaziniz.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz lutfen");
        int sayi = sc.nextInt();


    if (sayi>100) {//girilen sayinin 100 den kucuk olma sarti
        System.out.println(sayi+" lutfen 100 den kucuk bir sayi giriniz.");
    }else{
        for (int i=1; i<sayi; i++){
            if (i%3==0&& i%5==0)//girilen sayinin 3 e ve 5 e bolunme sorunu */
                 {
                     System.out.println("javaCan");
            } else if (i%3==0) {
                System.out.println("java");
                
            } else if (i%5==0) {
                System.out.println("Candir");

            }else {
                System.out.println(i+" "+"normal sayidir");
            }

        }
    }
    }
}
