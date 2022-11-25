package patika_pratik_kosulkodblockları.methodCreation.Clarusway_Ornekleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListOrnek02 {
    public static void main(String[] args) {
        /*
        A list has elements “H”, “G” and “E”
        Ask user to enter a letter
        If the letter exists in list convert it to "Got it"
        otherwise add it to the list.
        Example : [H, G, E]
                  Enter a letter :  h
                  [Got It, G, E]
                  Enter a letter :  a
                  [H, G, E, A]
         */
        List<String> list = new ArrayList<>();
        list.add("H");
        list.add("G");
        list.add("E");
        System.out.println("liste ; "+list);

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir har giriniz :");
        String letter = sc.next().trim().substring(0,1).toUpperCase();
        if (list.contains(letter)){
            list.set(list.indexOf(letter), "got it" );
        }else {
            list.add(letter);

        }
        System.out.println("list ; "+list);
    }
}
  /*
    Ask user to enter a number and print on console number by number matrix.

    Example:
    Input: 10

    Output:
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0

    */