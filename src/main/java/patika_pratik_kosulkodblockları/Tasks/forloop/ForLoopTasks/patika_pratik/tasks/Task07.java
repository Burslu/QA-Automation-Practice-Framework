package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("3 sayi giriniz;");
        int sayi1 = sc.nextInt(); int sayi2 = sc.nextInt(); int sayi3 = sc.nextInt();
        buyukSayiBulma(sayi1,sayi2,sayi3);



    }

    private static void buyukSayiBulma( int sayi1, int sayi2, int sayi3) {

        if (sayi1 > sayi2) {
            System.out.println("en buyuk sayi"+(sayi1));

        } else if (sayi2 > sayi3) {
            System.out.println("en buyuk sayi " + (sayi2) + "dur");
        }else {
            System.out.println("en buyuk sayi"+(sayi3)+"dir");
        }
    }



}

