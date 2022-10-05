package swıcth_relation_while_dowhile_;

import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {

        //initialize know variables
        int rate=15;
        int maxhours=40;
        //get input for unknows variables
        System.out.println("how many hours did work this hours?");
        Scanner scanner = new Scanner(System.in);
        double hoursworker =scanner.nextInt();
        //validete input
        while (hoursworker > maxhours ){
            System.out.println("ınvalid entry. yours hours must be between 1 and 40. try again");
            hoursworker = scanner.nextInt();
        }
       scanner.close();
        //calculate gross
        double gross = rate * hoursworker;
        System.out.println("Gross pay:$"+gross );




    }
}
