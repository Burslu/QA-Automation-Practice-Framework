package methodCreation.for_loops;

import java.util.Scanner;

public class ornek_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kare boyutu giriniz ;");
        int kareBoyutu = sc.nextInt();
        for (int i =1; i<=kareBoyutu; i ++){// ana dongum
            for (int k=0; k<kareBoyutu-i; k++){//bosluklari olusturdugum dongum
                System.out.print(" ");

            }
            for (int j = 0; j<i; j++){// yildiz+ bosluklarin harizlandigi bolum
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i =1; i<=kareBoyutu; i ++){
            for (int j = 0; j<i; j++){
                System.out.print(" ");//bosluklari olusturdugum dongum
            }
            for (int k=0; k<kareBoyutu-i; k++){
                System.out.print("* ");// yildiz+ bosluklarin harizlandigi bolum

            }


            System.out.println();
        }


    }
}
