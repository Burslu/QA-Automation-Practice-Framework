package patika_pratik_kosulkodblockları.methodCreation.Clarusway_Ornekleri.StudentCodeChallence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ornek01 {
    public static void main(String[] args) {
//        int sayi[]={20,12,23,17,7,8,10,2,1,0};
//        System.out.println("sayimiz"+ Arrays.toString(sayi));
//        System.out.println();//dummy
//        ArrayList<Integer> yeniList =new ArrayList<>();
//
//        System.out.println(tekCifyAyirma(sayi, yeniList));
//
//
//
//    private static ArrayList<Integer> tekCifyAyirma(int[] sayi, ArrayList<Integer> yeniList) {
//        for (int a:sayi) {
//            if (a%2==1){
//                yeniList.add(a);
//            }
//        }
//
//        for (int b:sayi) {
//            if (b%2==0){
//                yeniList.add(b);
//            }
//        }
//        System.out.println(yeniList);
//
//        return yeniList;
//    }

    /*
        Java N ve M Boyutlu Dizinin Satırlarının Toplamını Bulma

        Bu örnekte N ve M değerlerini kullanıcıdan alıp, iki boyutlu dizi oluşturacağız.
         Daha sonra da dizinin elemanlarını kullanıcıdan alıp, her satırın sonuna o satırın toplamını yazdıracağız.


         örneğin;

         12    12     24
         5     15     20
         12    18     30

         */


    Scanner sc = new Scanner(System.in);

    int toplam = 0;
    System.out.println("satir sayisini giriniz ; ");
    int satir = sc.nextInt();
    System.out.println("sutun sayisini giriniz ; ");
    int sutun = sc.nextInt();

    int sayilar[] [] = new int[satir][sutun];//iki boyutlu array olustuurduk satir ve stunlari
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println("sen bana bir sayi ver ");
                sayilar[i][j] = sc.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(sayilar));

        for (int i = 0; i < satir; i++) {
            toplam = 0 ;
            for (int j = 0; j < sutun; j++) {
                System.out.print(toplam += sayilar[i][j]);
            }

        }
        System.out.println(toplam);

    }
}
