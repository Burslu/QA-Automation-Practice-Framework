package Tasks_While.for_loops.OrnekVeTask;

import java.util.Scanner;

public class OrnekCozumu05loops
{
    public static void main(String[] args) {

        /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString
    metop kullanarak for ve javayi tersten yazdiracagiz ...*/

        Scanner sc = new Scanner(System.in);
        System.out.println("bir deger giriniz;");
        String birDeger = sc.nextLine();

        System.out.println(reverString(birDeger));

    }
    private static String reverString(String birDeger) {
        String reserveBirDeger = "";
        for (int i =birDeger.length()-1; i >=0; i--){
            reserveBirDeger +=birDeger.charAt(i);

        }
        return  reserveBirDeger;
    }
}
