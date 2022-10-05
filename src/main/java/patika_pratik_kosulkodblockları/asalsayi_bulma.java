package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class asalsayi_bulma {

    static int asal(){
        int say;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        say = scanner.nextInt();

           for (int i=2;i<=say;i++){

               if (say/i==0){

                   System.out.println("asal sayi degildir");

               }else {
                   System.out.println("asal sayidir\n"+say);
               }

        }

        return 0;
    }


    public static void main(String[] args) {
        asal();
    }
}
