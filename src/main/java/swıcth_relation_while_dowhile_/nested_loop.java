package swıcth_relation_while_dowhile_;

import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args) {

        int numberofstudent = 24;
        int numberoftesxt = 4;
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<numberofstudent; i++){
            double total =0;
            for (int t=0; t<numberoftesxt; t++){
                System.out.println("Enter the score for test:"+(t+1));
                double score =scanner.nextInt();
                total = total +score;
            }
            double avarage = total/numberoftesxt;
            System.out.println("the test avarage of student :"+(i+1)+" is "+avarage);
        }
        scanner.close();
    }
}
