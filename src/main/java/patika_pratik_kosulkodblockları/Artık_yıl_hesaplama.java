package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class Artık_yıl_hesaplama {
    public static void main(String[] args) {
        int yil;
        Scanner scanner = new Scanner(System.in);
        System.out.println("yil giriniz");
        yil = scanner.nextInt();

        if ((yil % 4 ==0) && (yil %100 !=0) || (yil % 400 == 0)){
            System.out.println("artik yil");
        }else {
            System.out.println("bir artik yil degildir.");
        }
        scanner.close();
    }
}
