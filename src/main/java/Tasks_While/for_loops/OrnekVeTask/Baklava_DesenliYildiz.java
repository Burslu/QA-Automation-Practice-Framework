package Tasks_While.for_loops.OrnekVeTask;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Baklava_DesenliYildiz {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Baklava Boyutunu Giriniz ;");
        int boyut = sc.nextInt();


        for (int i=1; i<=boyut; i++ ){//en dis dongu satir sayisi belirler
            for (int j=boyut; j>i; j--){//bosluk kismi
                System.out.print(" ");
            }
            for (int yildiz =1; yildiz<=i; yildiz++){//yildiz kismi
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i=1; i<=boyut; i++ ){//en dis dongu satir sayisi belirler
            for (int j=1; j<=i; j++){//bosluk kismi
                System.out.print(" ");
            }
            for (int yildiz =boyut; yildiz>i; yildiz--){//yildiz kismi
                System.out.print("*"+" ");
            }
            System.out.println();
        }



    }
}
/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
 */