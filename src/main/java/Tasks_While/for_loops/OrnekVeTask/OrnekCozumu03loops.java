package methodCreation.for_loops.OrnekVeTask;

import java.util.Scanner;

public class OrnekCozumu03loops {
    public static void main(String[] args) {
         /*   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
        hesaplayan kodu yazın
        Örnek Ekran Çıktısı
        Girilen sayı=4               1 -> 1  2-> 4  3->9  4-> 16
        Kareler toplamı=14
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("1'den buyuk bir tam sayi giriniz");
        int tamSayi = scan.nextInt();
        int kareleriToplami=0;
        for (int i=1; i<=tamSayi; i++){//1 2 3

            kareleriToplami +=i*i;//1 5 14

        }
        System.out.println("Girilen sayi ="+tamSayi);
        System.out.println("kare toplam "+kareleriToplami);
    }
}
