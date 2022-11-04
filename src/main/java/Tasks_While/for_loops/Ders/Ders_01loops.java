package methodCreation.for_loops.Ders;

import java.util.Scanner;

public interface Ders_01loops {

    public static void main(String[] args) {

        // 41 kere masallah yazdir

//        for (int i=1; i<=11; i++){
//        System.out.println(i+".masallah koc");
//
//            System.out.print(i+".selam");
//
//        }
        // iki basamakli tek sayilari yan yana yazdiran program .,.

//        for (int i=11; i<=99; i+=2){
//
//            System.out.println(i+"tek sayilar");
//
//
//        }
//        System.out.println("************");
//        for(int i=11; i<=99; i++){
//            if (i%2==1){
//                System.out.println(i+" "+"aradiginiz tek sayilardandir...");
//
//            }
//        }
        //girilen sayidan 100 e kadar olan 4 un katiolan tam sayilarin print eden kod yazin
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz;");
        int sayi = scan.nextInt();

        if (sayi>100) {
            System.out.println("100 den kucuk sayi giriniz");
        }else {
            for (int i=sayi; i<100; i++){
                if ( i%4==0){
                    System.out.print(i+" ");
                }
            }

        }






        }

    }

