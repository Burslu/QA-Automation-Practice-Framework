package methodCreation.for_loops;

import java.util.Scanner;

public class Ders_06looops
{
    public static void main(String[] args) {

        /*
        1 x 1 =1
        1 x 2 =2
        1 x 3 =3
        .
        .
        .
        .
        .
        yikaridaki carpim tablosunu 10 a kadar print eden kodu yaziniz...

         */

//        for (int i = 1; i<=10; i++) {
//
//            for (int j = 1; j <= 10; j++) {
//
//                System.out.println(i+" x"+j+"="+(i+j));
//            }
//            System.out.println(" ");
//        }
        //girilen bir boyutta karenin ekran ciktisi
        //bir sayi giriniz ;6
        /*
        100000
        010000
        001000
        000100
        000010
        000001
         */
//        seklini creat eden programi yaziniz
        Scanner sc = new Scanner(System.in);
        System.out.println("kare boyutu giriniz ;");
        int kareBoyutu = sc.nextInt();

        for (int i =1; i<=kareBoyutu; i++) {

            for (int j = 1; j<=kareBoyutu; j++){
                if (i==j){
                    System.out.print(" 1 ");
                }else {
                    System.out.print(" 0 ");
                }

            }
            System.out.println(" ");
        }

    }
}
