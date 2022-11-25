package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir deger seciniz kare,dikdorgen,ucgen;");
        String secim = sc.nextLine();
        System.out.println("Bir deger seciniz kare,dikdorgen,ucgen;");
        int sayi1 = sc.nextInt();
        System.out.println("Bir deger seciniz kare,dikdorgen,ucgen;");
        int sayi2 = sc.nextInt();

        secim(secim,sayi1,sayi2);


    }

    private static void secim(String secim, int sayi1, int sayi2) {

        switch (secim){
            case "kare":
                sayi2=sayi1;
                kareAlan(sayi1,sayi1);
                kareCevre(sayi2,sayi2);
                break;
            case "dikdortgen":
                break;

            case "ucgen":
                break;


            default:
                System.out.println("hatali secim yaptiniz ");
                secim(secim,sayi1,sayi2);
        }
    }

    private static void kareAlan(int sayi1, int sayi2) {
        System.out.println("kare alani;"+(sayi1*sayi2));
    }

    private static void kareCevre(int sayi1, int sayi2) {
        System.out.println("kare cevresi;"+(sayi1+sayi2)*2);
    }
}

