package swıcth_relation_while_dowhile_;

import java.util.Scanner;

public class switch_statment {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner =new Scanner(System.in);
        String grade =scanner.next();
        String message;
        switch (grade){
            case "A":
                message ="excellent job";
                break;
            case "B":
               message = "great job";
                break;
            case "C":
                message = "good job";
                break;
            case "D":
                message = "you need to work a lot ";
                break;
            case "F":
                message= "UH OH UG ";
                break;
            default:
                message= "ERrOR ErrROR";
                break;

        }
        System.out.println(message);
    }
}
