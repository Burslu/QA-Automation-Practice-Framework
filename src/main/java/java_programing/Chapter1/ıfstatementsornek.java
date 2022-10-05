package java_programing.Chapter1;

import java.util.Scanner;

public class ıfstatementsornek {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Sayı giriniz;");
        int sayi= in.nextInt();
        for(int i=0; i< 10;i++){
            System.out.println(sayi+"x"+"="+(sayi*(i+1)));
        }


    }


}
