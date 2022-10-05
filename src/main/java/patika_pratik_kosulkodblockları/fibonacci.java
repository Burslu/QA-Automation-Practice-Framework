package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        int n1=0,n2=1,a,b;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Eleman sayisini giriniz:");
        a=scanner.nextInt();
        for (int i=2; i<=a; i++){
            b=n1+n2;
            System.out.println(n1+"+"+n2+"="+b);
            n1=n2;
            n2=b;
            System.out.println();
        }


    }
}
