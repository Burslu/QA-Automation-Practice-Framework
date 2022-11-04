package patika_pratik.PatikaCohorts;

import java.util.Scanner;

public class NotOrtHesaplayanProgram {
    public static void main(String[] args) {

        int  matematik , fizik , kimya , türkçe, müzik,tarih;


        Scanner sc = new Scanner(System.in);

        System.out.println("lutfen matemetık notunuzu giriniz:");
        matematik = sc.nextInt();
        System.out.println("lutfen fizik notunuzu giriniz:");
        fizik     = sc.nextInt();
        System.out.println("lutfen kimya notunuzu giriniz:");
        kimya     = sc.nextInt();
        System.out.println("lutfen türkçe notunuzu giriniz:");
        türkçe    = sc.nextInt();
        System.out.println("lutfen müzik notunuzu giriniz:");
        müzik     = sc.nextInt();
        System.out.println("lutfen tarih notunuzu giriniz:");
        tarih     = sc.nextInt();

        int toplam = (matematik+fizik+kimya+müzik+türkçe+tarih);
        double notOrt = (toplam/6);
        System.out.println("not ortalmaniz;"+notOrt);
        System.out.println(notOrt >= (60) ? "sınıfı gectiniz" : "Sınıf tekrarı kaldınız");


    }
}
