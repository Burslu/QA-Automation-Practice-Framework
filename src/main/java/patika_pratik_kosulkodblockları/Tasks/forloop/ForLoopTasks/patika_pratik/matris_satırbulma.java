package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik;

import java.util.Scanner;

public class matris_satırbulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("matris kac satirli ?  ");
        int length = scan.nextInt();
        System.out.print("matris kac kolonlu ?  ");
        int weight = scan.nextInt();
        System.out.println("matrisin elemanlarını sırasıyla giriniz .");

        int[][] matrix = new int[length][weight];

        for(int i =0  ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[i].length;j++)
                matrix[i][j] = scan.nextInt();
        }
        System.out.println("==================================");
        System.out.println("matris : ");
        System.out.println();

        for(int i =0  ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[i].length;j++)
                System.out.print(matrix[i][j]+"   ");
            System.out.println();
        }
        System.out.println("------------");
        System.out.println("matrisin transpozu : ");
        System.out.println();
        //int[][] matrix_transpoze = new int[weight][length];
        for(int j = 0 ; j < matrix[0].length;j++){
            for(int i =0  ; i < matrix.length;i++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
        scan.close();
    }
}