package patika_pratik_kosulkodblockları.methodCreation.Clarusway_Ornekleri;

import java.util.Scanner;

public class ArrayListOrnek01 {
    public static void main(String[] args) {
     /*
    Ask user to enter a number and print on console number by number matrix.

    Example:
    Input: 10

    Output:
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0

    */
        Scanner sc =new Scanner(System.in);
        System.out.println("matris boyutunu giriniz:");
        int sayi = sc.nextInt();

        for (int i = 0; i < sayi; i++) {//outfor satir
            for (int j = 0; j < sayi; j++) {//inerfor sutun
                System.out.print((int) (Math.random()*5)+" ");

            }
            System.out.println();
        }


    }
}
