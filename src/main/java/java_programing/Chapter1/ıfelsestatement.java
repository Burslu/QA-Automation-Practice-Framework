package java_programing.Chapter1;

import java.util.Scanner;

/*
if else
 */
public class ıfelsestatement {
public static void main(String args[]){
        //başlangıç
        int quota=10;
        //bilinmeyen veriler
        System.out.println("bu hafta kac tane satıs yaptınız giriniz?");
    Scanner  scanner = new Scanner(System.in);
    int sales = scanner.nextInt();
    scanner.close();
        //karar veriş ve çıktı
   if (sales >= quota){
       System.out.println("TEBRİKLER kotaniz tamamlandı.");
   }
   else {
       int salesShort = quota -sales;

       System.out.println("BAŞARAMADINIZ DAHA SİKİ ÇALİSMALİSİNİZ"+salesShort+"salesShort");
   }
}
}
