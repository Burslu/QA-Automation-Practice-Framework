package methodCreation.for_loops.Ders;

import java.util.Scanner;

public class Ders_11loops {
    public static void main(String[] args) {


        /*
        girilen 5 sayinin   10 ile 20 arasi haric digerlernin toplamini hesaplayan programi creat
        ediniz...
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("5 adet sayiya ihtiyacimiz var lutfen giris yapiniz;");
        int toplam = 0 ;
        for (int i=1;i<=5;i++) {
            System.out.println(i+".sayiyi giriniz");
            int sayi = sc.nextInt();
            if (sayi<=10 || sayi>=20){
                toplam+=sayi;
            }//if sonu

        }// for sonu
        System.out.println("girdiniz sayilarin toplami"+toplam);

        }
}
