package Tasks_While;

import java.util.Scanner;

public class While_02 {
    public static void main(String[] args) {
        //girilen tam sayilarin toplamini print eden probrami giriniz ...
        // metod    ile

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz ;");
        int sayi = scan.nextInt();
        rakamTopla(sayi);
    }

    private static int rakamTopla(int sayi) {
        int rakamToplama = 0;
        while (sayi > 0) {//sayi 1 olana dek calisir...
        rakamToplama+=sayi%10;//sayinin birler basamagi eklendi
        sayi/=10;//sayinin birler basamagi rakam toplamin eklendi

        }
        System.out.println(rakamToplama);
        return rakamToplama;
    }
}