package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class ebob_ekok {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("N1 sayisini giriniz:");
        int n1 = scanner.nextInt();

        System.out.println("N2 sayisini giriniz:");
        int n2 = scanner.nextInt();
        int ebob=1;
        for (int i=0; i<=n1; i++){
            if (n1 % i ==0  &&  n2 % i==0){
                System.out.println(i);
                ebob=i;
            }
        }
        for (int k=n1; k>=1; k--){
            if (n1 % k==0 && n2 % k==0){
                ebob=k;
                System.out.println("ebob");
                break;
            }
        }





    }
}
