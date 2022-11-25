package Arrays_Clarusway;

import java.util.Arrays;
import java.util.Scanner;

public class Ders03_Arrays {
    public static void main(String[] args) {
        //array esitligi kontolu equals() -> metodu index ve value kontrolu

        int sayi1[]= {12,15,39,15,78,65,42};
        int sayi2[]= {42,12,38,18,98,69,32};

        System.out.println("sayi1 ve sayi2 degerleri esit mi "+ Arrays.equals(sayi1,sayi2));

        Arrays.sort(sayi1);
        Arrays.sort(sayi2);

        System.out.println("sayi1 ve sayi2 degerleri esit mi "+ Arrays.equals(sayi1,sayi2));


    //kullanican alinan degelrere bir int array print eden code creat ediniz;

//
//        Scanner sc =new Scanner(System.in);
//        System.out.print("array boyutu icin bir deger giriniz ");
//        int arrBoyut = sc.nextInt();
//
//        int arr[] =new int[arrBoyut];//boyutu belirlenmis bos int arry
//
//        for (int i = 0; i < arrBoyut; i++) {
//            System.out.println(i+" inci index");
//
//            arr[i]=sc.nextInt();
//
//        }
//        System.out.println("istedigin arry"+Arrays.toString(arr));
//        Arrays.sort(arr);//kucukten buyuge dogru siralar ...
//
//        for (int i = arr.length-1; i >=0 ; i--) {
//            System.out.print(arr[i] + " ");
//
//        }

        //girilen int arrayin elemanlarini toplayan programi print ediniz ...
        Scanner scanner =new Scanner(System.in);
        System.out.print("array boyutu icin bir deger giriniz ");
        int arrBoyutu = scanner.nextInt();

        int arry[] =new int[arrBoyutu];//boyutu belirlenmis bos int arry

        for (int i = 0; i < arrBoyutu; i++) {
            System.out.println(i+" inci index");

            arry[i]=scanner.nextInt();

        }
        System.out.println("istedigin arry"+Arrays.toString(arry));
        int arryToplam =0;
        for (int i = 0; i < arry.length; i++) {
            arryToplam +=arry[i];

            
        }
        System.out.println(+arryToplam);
    }
}
