package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class patika_ökrnek {
    public static void main(String[] args) {
        // yıldız yapacağız:
        Scanner scanner =new Scanner(System.in);
        System.out.print("Basamak sayisi giriniz:");
        int n = scanner.nextInt();

        for (int i=1; i<=n;i++){
            for (int k=1; k<=(n-i);k++){
            System.out.print(" ");
        }
            for (int j=1; j<= (2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println("");

    }
        for (int i=1; i<=n;i++){
            for (int z=1; z<=(n-1);z++){
                System.out.print(" ");
            }
            for (int j=1; j<= (2*i)-1;j++) {
                System.out.print("*");
            }
        }
}
}
