package Tasks_While.for_loops.OrnekVeTask;

import java.util.Scanner;

public class OrnekCozumu06loops {
    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum
        // tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner sc = new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz ;");
        int sayi1 = sc.nextInt();

        System.out.println("ikinci sayiyi giriniz ;");
        int sayi2 = sc.nextInt();
        int toplam=0;
        if (sayi1<sayi2){
        for (int i=sayi1; i<=sayi2; i++){
            System.out.println(i);
            toplam +=i;
        }
            System.out.println(sayi1+ " ile" + sayi2+ " arasindaki sayilarin toplami="+toplam);


            } else if (sayi2<sayi1) { for (int i=sayi2; i<=sayi1; i++){
            System.out.println(i);
            toplam +=i;
        }
            System.out.println(sayi2+ " ile" + sayi1+ " arasindaki sayilarin toplami="+toplam);

        }else {
            System.out.println(" girilen iki sayi esittir.");
    }

    }
}
