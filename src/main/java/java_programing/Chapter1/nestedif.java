package java_programing.Chapter1;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {

        //başlangıç durumu olarak ne yapacağız
        int requiredSalary = 30000;
        int requiredYersEmplyoed = 2;

        //bilinmeyen koşullar
        System.out.println("maasizi giriniz:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextInt();
        System.out.println("kaç yildir calisiyorsunuz:");
        double years = scanner.nextInt();
        scanner.close();
        // karar aşaması
        if (salary >= requiredSalary) {
            if (years >= requiredYersEmplyoed) {
                System.out.println("tabrikler para almaya hak kazandınzı ...");
            } else {
                System.out.println("tekrar deneyeniz..." + requiredYersEmplyoed + "years");
            }


        } else {
            System.out.println("DAHA COK PARA KAZANMALİNİZ..." + requiredSalary + "2. gerekinim");
        }
    }
}