package Tasks_While.for_loops.OrnekVeTask;

import java.util.Scanner;

public class OrnekCozumu04loops {
    public static void main(String[] args) {
        /*
        Get the number of rows and columns from user.
        Create a rectangle.
        rows = 3 and column = 5 ==> * * * * *
                                    * * * * *
                                    * * * * *
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("sutun boyutu giriniz ;");
        int sutunBoyutu = sc.nextInt();
        System.out.println("satir boyutu giriniz ;");
        int satirBoyutu = sc.nextInt();
        for (int i=0; i<sutunBoyutu; i++){
            for (int j=0; j<satirBoyutu; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
