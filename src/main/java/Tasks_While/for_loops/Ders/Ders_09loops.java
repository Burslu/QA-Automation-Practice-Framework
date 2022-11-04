package methodCreation.for_loops.Ders;

import java.util.Scanner;

public class Ders_09loops {
    public static void main(String[] args) {

        /*
        girilen bir ifadenin istenen harf sayisini print eden codu creat ediniz ;

        input ; selam JavaCan
        output;a sayisi ; 3
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir cumle giriniz ;");
        String girilenIfade = sc.nextLine();
        System.out.println("sayilacak harf nedir ;");
        char harf= sc.nextLine().charAt(0);
        int harfSayisi = 0;// ilk deger 0 atadik cunki saymada etki etmemesi icin
        for (int i =0; i<girilenIfade.length(); i++){
            if (girilenIfade.charAt(i)==harf){
                harfSayisi++;
            }

        }
        System.out.println("girgidiniz cumlede "+girilenIfade+" de istediginiz harf "+harfSayisi+" kadar var.");

    }
}
