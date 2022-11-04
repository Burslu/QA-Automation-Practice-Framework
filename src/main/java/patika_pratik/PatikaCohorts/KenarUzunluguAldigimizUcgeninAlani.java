package patika_pratik.PatikaCohorts;

import java.util.Scanner;

public class KenarUzunluguAldigimizUcgeninAlani {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aKenari , bKenari , ckenari;
        double U;
        double alan;
        System.out.println("aKneari degerini giriniz:");
        aKenari = sc.nextInt();
        System.out.println("bKneari degerini giriniz:");
        bKenari = sc.nextInt();
        System.out.println("cKneari degerini giriniz:");
        ckenari = sc.nextInt();

        U = (aKenari+bKenari+ckenari/2);//ucgen cevresi.
        alan = Math.sqrt(U*(U-aKenari)*(U-bKenari)*(U-ckenari));
        System.out.println("Alan: "+alan);

    }
}
