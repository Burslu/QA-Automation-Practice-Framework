package methodCreation.for_loops.Odev;

import java.util.Scanner;

public class Odev07 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
        Scanner sc = new Scanner(System.in);
        System.out.println("kare boyutu giriniz ;");

        int h =sc.nextInt();

        for (int i =1; i<=h; i++){

            int diff = h-1;
            int temp =i;
            for (int j=1; j<=i; j++){
                System.out.print(temp+" ");
                temp+=diff--;

            }
            System.out.println(" ");
        }

        }



    }

