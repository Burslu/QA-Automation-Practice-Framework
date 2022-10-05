package veriable_classess_instantiating6a6b6c6d;

import java.util.Scanner;

public class variable_scope {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();



        //check if the user is qualifed
        boolean qualified =isUserQualified(creditScore,salary);


        //notify user
        notifyUser(qualified);

    }
    public static double getSalary(){
        System.out.println("Enter your salary");

        double salary = scanner.nextInt();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;

    }
    public static boolean isUserQualified(int creditScore,double salary){
        if (creditScore >= requiredCreditScore && salary >=requiredSalary){
        return true;
        }
        else {
            return false;
        }
    }
    public static void notifyUser(boolean isqualified){
        if(isqualified){
            System.out.println("congrats");

        }
        else {
            System.out.println("try again !");
        }
    }

}
