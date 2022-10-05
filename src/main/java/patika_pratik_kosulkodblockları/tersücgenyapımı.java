package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class tersücgenyapımı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayinisini giriniz:");
        int say = scanner.nextInt();

         for (int i=say; i>=1;i--){
             for (int k=1; k<=(say-i);k--){
                 System.out.print(" ");
             }
           for (int t=2*i-1; t>=1; t--){
               System.out.print("*");
           }

         }
        System.out.println();

    }
}
