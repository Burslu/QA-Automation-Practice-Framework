package swıcth_relation_while_dowhile_;

import java.util.Scanner;

public class Lesson1wıthjava {
    public static void main(String[] args) {

        System.out.println("kac saat  calıştı  ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("saati kaç para  ");
        double rate = scanner.nextDouble();
        scanner.close();
        double lesson1 = hours * rate ;

        System.out.println("the employee's gross pay is £ " +lesson1);

    }
}
