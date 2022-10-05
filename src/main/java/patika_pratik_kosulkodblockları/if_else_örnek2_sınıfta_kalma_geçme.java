package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class if_else_örnek2_sınıfta_kalma_geçme {
    public static void main(String[] args) {
        int Mat,Fizik,Turkce,Kimya,Tarih;
        int avarage;
        System.out.println("ortalama hesaplamaya hosgeldiniz:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz ");
        Mat = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz ");
        Fizik = scanner.nextInt();

        System.out.println("turkce notunuzu giriniz ");
        Turkce = scanner.nextInt();

        System.out.println("Kimya notunuzu giriniz ");
        Kimya = scanner.nextInt();

        System.out.println("Tarih notunuzu giriniz ");
        Tarih = scanner.nextInt();
        avarage=(Mat+Fizik+Kimya+Tarih+Turkce)/5;
        {
            if (avarage >= 55) {
                System.out.println("tebrikler aq sınıfı gectin " + avarage);
            }
        }
    }
}
