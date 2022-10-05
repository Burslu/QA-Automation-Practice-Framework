package example;

import java.util.Scanner;

public class egzersiz3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n<1 || n>10){
            System.out.println("YOUR PROGRAM İS NOT BETWEEN 1 OR 10 PLEASE TRY AGAİN...");
            n= scanner.nextInt();
        }
        System.out.println("YOUR PROGRAM İS working congrets");
    }
}
