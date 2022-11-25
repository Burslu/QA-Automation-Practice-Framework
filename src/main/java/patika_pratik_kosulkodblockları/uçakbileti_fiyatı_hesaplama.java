package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class uçakbileti_fiyatı_hesaplama {
    public static void main(String[] args) {
        double mesafe,age,toplam;
        int a = 0;
        int yolculukTipi;
        Scanner scanner =new Scanner(System.in);

        System.out.println("how many km will you fly :");
        mesafe = scanner.nextInt();

        System.out.println("Please Enter your age :");
        age = scanner.nextInt();

        System.out.println("Enter trip type = \nOne way or Round trip \n1=>One way,\n2=>Raund trip:");
        yolculukTipi = scanner.nextInt();
        toplam = mesafe * 0.10;

        if (mesafe>0 && age>0 && (a==1 || a==2)){
           if (age<12){
               toplam = toplam * 0.50;

           } else if (12<=age && age<=24) {
               toplam = toplam *0.90;
               
               
           } else if (65<age) {
               toplam=toplam*0.70;
               
           }
           if (a==2){
               toplam = toplam *0.80;


           }
           System.out.println("toplam tutar"+toplam+"Tl");

        }else {
            System.out.println("HATALİ VERİ GİRDİNİZ.");
        }

           scanner.close();

    }
}
