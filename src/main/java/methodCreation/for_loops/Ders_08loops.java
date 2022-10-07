package methodCreation.for_loops;

import java.util.Scanner;

public class Ders_08loops {
    public static void main(String[] args) {

/*
girilen boyutta asagidaki gibi sekli yazdirinirz

*
**
***
****
*****
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("kare boyutu giriniz ;");
        int sekilBoyutu = sc.nextInt();

        for (int i = 1; i<=sekilBoyutu; i++){

            for (int j = 1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }
}
