package swıcth_relation_while_dowhile_;

import java.util.Scanner;

//LOGİCAL OP
public class relation_and_logialop {
    public static void main(String[] args) {

        double penny = 0.25;
        double nickels = 0.50;
        double dimes = 0.5;
        double quarters = 0.20;
        int dolar = 1;
        Scanner scanner = new Scanner(System.in);
     System.out.println("welcome to change game dolar... "+ "your goal enter is to enter enough change your to make 1$");


        System.out.println("how many pennies would you like?");
        int numbpennies = scanner.nextInt();
        System.out.println("how many nickels would you like?");
        int numbnickels = scanner.nextInt();
        System.out.println("how many dimes would you like?");
        int numbdimes = scanner.nextInt();
        System.out.println("how many quarters would you like?");
        int numbquarters = scanner.nextInt();
        scanner.close();

        double total = numbpennies * penny + numbnickels * nickels + numbdimes * dimes + numbquarters * quarters;
        if (total<dolar){
            double amountshort = dolar - total;
            System.out.println("sorry you lose ,you were over "+ String.format("%.2f",amountshort));

        } else if (total> dolar) {
            double amountshort = total-dolar;
            System.out.println("sorry you lose ,you were over "+ String.format("%.2f",amountshort));
            
        }
        else {
            System.out.println("perfect you win");
        }
    }
     }








