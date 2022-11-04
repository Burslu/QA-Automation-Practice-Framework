package methodCreation.for_loops.OrnekVeTask;

import java.util.Scanner;

public class NewForLoops13_10_2022 {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

//
//        int Sayi = 2566;
//        System.out.println(basamakSayisi(Sayi));
//
//    }
//
//    private static int basamakSayisi(int Sayi) {
//        int toplam = 0;
//        while (Sayi != 0) {
//            toplam += Sayi % 10;
//            Sayi /= 10;
//
//
//        }

//        return toplam;


        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yukarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.



    /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz ;");
//        int sayi = sc.nextInt();
//        int toplam = 0;
//
//        for (int i=1; i<sayi; i++){
//            if (i%2==1) {
//                System.out.println(i + " sayisi tektir");
//                toplam ++;
//            }
//            }
//            System.out.println(toplam);
//
//
//
//        }

         /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.
    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****
*/
//        for (int satir=1; satir<=5; satir++){
//            for (int bosluk=5-satir; bosluk>0; bosluk--){
//                System.out.print(" ");
//                }
//            for (int yildiz=1; yildiz<=satir; yildiz++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz ;");
//
//        int toplam=0;
//        int count = 0;
//
//
//        for (int i=0; i<=100; i++){
//            count++;
//            int sayi = sc.nextInt();
//            toplam +=sayi;
//            if (toplam>100){
//                System.out.println(count+"yeterli sayiyi girdiniz");
//             break;
//            }
//            System.out.println(toplam);
//        }









    }

}


