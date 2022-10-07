package methodCreation.for_loops;

import java.util.Scanner;

public class Ders_07loops {
    public static void main(String[] args) {
        /*
        girilen boyutta kareyi print eden kod yaziniz ;
          5 x 5
        1 2 3 4 5
        2 4 6 8 10
        3 6 9 12 15
        4 8 12 16 20
        5 10 15 20 25

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("kare boyutu giriniz ;");
        int kareBoyutu = sc.nextInt();

        for (int i = 1; i<=kareBoyutu; i++){

            for (int j = 1; j<=kareBoyutu; j++){
                System.out.print((i*j)+" ");
            }
            System.out.println(" ");
        }

    }
}
