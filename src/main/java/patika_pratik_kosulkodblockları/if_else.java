package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        double s1,s2;
         int select;
        Scanner scanner = new Scanner(System.in);
        System.out.println("BİRİNİCİ SAYİYİ GİRİNİZ:");
        s1 = scanner.nextDouble();
        System.out.println("ikinci SAYİYİ GİRİNİZ:");
        s2 = scanner.nextDouble();
        System.out.println("1.işlem toplama\n 2.işlem cıkarma\n3.islem carpma\n4.ıslem bölme");
        select = scanner.nextInt();
        System.out.println("");

       switch (select){
           case 1:
               System.out.println("toplama"+(s1+s2));
               break;
           case 2:
               System.out.println("cıkarma"+(s1-s2));
               break;
           case 3:
               System.out.println("carpama"+(s1*s2));
               break;
           case 4:
               System.out.println("bolme"+(s1/s2));
               break;

       }

    }

}
