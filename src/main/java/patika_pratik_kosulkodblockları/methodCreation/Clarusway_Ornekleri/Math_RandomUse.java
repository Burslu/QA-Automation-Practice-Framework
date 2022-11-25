package patika_pratik_kosulkodblockları.methodCreation.Clarusway_Ornekleri;

import java.util.Scanner;

public class Math_RandomUse {
    public static void main(String[] args) {
        //MAth random kullanarak verilen sayinin cift yada tek olup olmadigini bulan programi creat ediniz .
        //cift say iise cift sayi oldugunu tek sayi ise tek sayi oldugunuz yazdiriniz .
        Scanner sc = new Scanner(System.in);
        int sayi1 = 18;
        int sayi2 = 56;

        int randomNumb = (int) (Math.random() * ((sayi2 - sayi1) + 1)) + sayi1;
        System.out.println("bir sayi girniz ;");
        System.out.println(+randomNumb %2==0?"cift":"tek");

        //consele uzerinden max ve min degeri saglayiniz ve buradan gelen rakamlari
       // math.random() da olmasini sitediginiz araliga getiriniz .


        Scanner scn = new Scanner(System.in);
        System.out.println("sayi bir "); int sayibir = scn.nextInt();
        System.out.println("sayi iki "); int sayiiki = scn.nextInt();

        System.out.println(Math.max(sayibir, sayiiki));

        if (sayibir>sayiiki){
           int random  = (int) Math.random() * sayibir;
            System.out.println("random"+random);
        }else {
            int random  = (int) Math.random() * sayiiki;
            System.out.println("random"+random);
        }


    }
}
