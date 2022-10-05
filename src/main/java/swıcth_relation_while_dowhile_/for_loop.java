package swıcth_relation_while_dowhile_;

import java.util.Scanner;

public class for_loop {

    public static void main(String[] args) {
        System.out.println("Enter the number of  items you would u like to items ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total =0;
        for(int i=0;i<quantity; i++){
            System.out.println("Enter the cost of item:");
            double price = scanner.nextInt();
            total = total + price;
        }
        scanner.close();
        System.out.println("your total is $"+total);
    }

}
