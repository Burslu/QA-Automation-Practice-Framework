package patika_pratik_kosulkodblockları.methodCreation.Clarusway_Ornekleri;

import io.cucumber.java.it.Ma;

public class Random_sayi {
    public static void main(String[] args) {
        Math.random();//0.0 ve 1.0 arasinda bize bir deger verir .
        double random = Math.random();

        /*
        eger tam sayi olarak deger istiyorsak *10 gibi bir sayi ile carpabiliriz.
        eger ki bir deger araliginda olacak sekilde bir random rakam istiyorsak o zmana bize verilen formulu kullanabiliriz
        (int) (math.random) *   ((max-min)+1)) + min;
         */

        int min =10;
        int max =67;


        int randomNumb = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println("random sayi; "+randomNumb);


    }
}
