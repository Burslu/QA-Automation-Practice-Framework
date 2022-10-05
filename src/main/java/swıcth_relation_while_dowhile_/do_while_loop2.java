package swıcth_relation_while_dowhile_;

import java.util.Scanner;

// do while loop
// write a program  that allows user to enter two numbers,
//and then sums up the two numbers,the user should be able to
//repeat this action until they indicate they are done
public class do_while_loop2 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
      boolean again = false;
        do{
             System.out.println("Enter the first number:");
             double nub1 = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double nub2 = scanner.nextDouble();

            double sum= nub1+nub2;
            System.out.println("the sum is "+sum);
            System.out.println("would u like to start over? "+sum);
            again = scanner.nextBoolean();
        }
        while (again);
     scanner.close();
     }
    }


