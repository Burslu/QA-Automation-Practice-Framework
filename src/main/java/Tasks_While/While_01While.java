package Tasks_While;

import java.util.Scanner;

public class While_01While {
    public static void main(String[] args) {
        /*
        baslangic ve bitis degerleri net (bilinen degerler) olan tekrarlardan foor loop
        ama adim sayisi belli olmayip bir sart  bagli olan tekrarlarda while loop kullanilmali

        11den 20 ye kadar olan tamsayilari print eden programi yaziniz
         */
        int basla = 0;
        while (basla<21){//basla degeri 21 den kucuk oldugu surece yazdir
            System.out.print(basla+" ");
            basla++;// while dongi degisim komutu
        }

        //7 kere javaCan prin eden programi yaziniz...
        int basla1 =1;
        while (basla1<=7){
            System.out.println(basla1+".javaCan");
            basla1++;
        }
        // 2 basamakli tek sayilari yan yana yazdiran kodu print ediniz ...

        int b=11;
        while (b<100){
            System.out.print(b+" ");
            b+=2;
        }
        //girilen metni tersten while ile print eden program...
                Scanner scan = new Scanner(System.in);
//        System.out.println("meyin tuuznluk .dasd");
//        String  metin = scan.nextLine();
//
//        int metinUzunluk = metin.length()-1;
//        while (metinUzunluk>=1){
//            System.out.print(metin.charAt(metinUzunluk-1));
//            metinUzunluk--;
//
//        }

        //girilen tamsayiya kadar tamsayilarin toplamini pront eden program

//        System.out.println("Bir tam sayi giriniz");
//        int sayi = scan.nextInt();
//        int toplam =0;
//        while (sayi>=0){//sayi 1 olana dek
//
//            toplam+=sayi;// her donguden sonra yeniyi ekle demek
//            sayi--;//her turda dondukce sayiyi 1 azalt .
//        } System.out.println("sayilarin toplami"+toplam);

        //girilen tam sayinin faktoriyelini print eden programi yaziniz...
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int tamsayi=scan1.nextInt();
        int faktoriel = 1;
        while (tamsayi>0) {//sayi 1 olana dek

            faktoriel *= tamsayi;// her donguden sonra yeniyi ekle demek
            tamsayi--;

        }
        System.out.println(faktoriel);
    }
}
