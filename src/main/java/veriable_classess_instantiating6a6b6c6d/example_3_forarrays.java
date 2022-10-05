package veriable_classess_instantiating6a6b6c6d;

import java.util.Scanner;

public class example_3_forarrays {
    public static void main(String[] args) {
        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner input =new Scanner(System.in);
        System.out.println("Enter for the day of week:");
        int index = input.nextInt();
        input.close();
        System.out.println(" Zorttt corresponding day:"+week[index-1]);
    }
}
