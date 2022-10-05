package veriable_classess_instantiating6a6b6c6d;

import java.util.Random;

public class arrays_exmple {
    private static final int LENGHT =6;
    private static final int MAX_TİCKET_NUMBER = 69;
    public static void main(String[] args) {
     int[] ticket = generateNumbers();
    }
    public static int[] generateNumbers(){
        int [] ticket = new int[6];
        Random random = new Random();
        for (int i=0; i<LENGHT; i++){
            ticket[i] =     random.nextInt(MAX_TİCKET_NUMBER) +1;

        }
        return ticket;
    }
    public static void  printTicket(int ticket[]){
        for (int i=0; i<LENGHT; i++){
            System.out.println(ticket[i]);
        }
    }
}
