package Arrays_Clarusway.Haftanin_Taskj15_Arrays.ArraysEasyTasks.odev;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_Create_array {

    public static void main(String[] args) {
//        /*
//        Task ->
//        elemanları : Apple, Orange , Banana, Kiwi
//        olan String Array (Dizi) crdeate edip print eden code create ediniz.
//
//         */
//
//        //Kodu aşağıya yazınız.
//        String array = "Apple, Orange, Banana, Kiwi";
//        ArrayList<String>Fruties =  new ArrayList<>(new ArrayList<>("Apple", "Orange" , "Banana" ,"kiwi"));
//        String arr[]= { Apple, Orange , Banana ,kiwi};
//        ArrayList<String> stringelamanlari = new ArrayList<>(Arrays.asList("Apple , Orange , Banana , Kiwi"));
//        System.out.println("elemanlarimiz= "+stringelamanlari);
        ArrayList<Integer> sayiList = new ArrayList<>();
        for (int i = 1; i <=10; i++) {
           sayiList.add(i);
        }
        System.out.println(sayiList);

    }
}
