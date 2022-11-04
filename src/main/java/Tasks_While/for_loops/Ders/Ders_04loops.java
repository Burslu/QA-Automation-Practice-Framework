package methodCreation.for_loops.Ders;

import java.util.Scanner;

public class Ders_04loops {
    public static void main(String[] args) {
//        //girilen sayinin faktorielini hesaplayan metod creat ediniz;
//        //sayi! = 1*2*3*....
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("bir sayi giriniz lutfen");
//        int sayi = sc.nextInt();
//
//        factariel(sayi);// int parametreli meteod
//
//
//
//
//    }//main disi
//
//    private static void factariel(int sayi) {
//        int factariel = 1;//bos bir kutu carmpa da 1 etkisiz...
//        for (int i= 1; i<=sayi; i ++) {
//            factariel*=i;
//            System.out.print(" "+factariel+" ");
//
//        }
//    }
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz lutfen");
        int ilkSayi = sc.nextInt();
        int sonSayi = sc.nextInt();
        ciftSayilar(ilkSayi,sonSayi);



    }

    private static void ciftSayilar(int ilkSayi, int sonSayi) {
        for (int i = ilkSayi; i<=sonSayi; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }


    }

}
