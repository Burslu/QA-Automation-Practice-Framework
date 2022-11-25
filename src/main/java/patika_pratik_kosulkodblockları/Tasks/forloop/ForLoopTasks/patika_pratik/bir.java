package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik;

import java.util.Scanner;

public class bir {
    public static void main(String[] args) {
     // değişkenler
        int a,b ;
        double c , u , alan;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.kenarı giriniz:");
        a = scanner.nextInt();
        System.out.println("2.kenarı giriniz:");
        b = scanner.nextInt();
        System.out.println("3.kenarı giriniz:");
        c = scanner.nextInt();
        u = (a+b+c)/2;
        alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("alan=:"+alan);
    }
    }