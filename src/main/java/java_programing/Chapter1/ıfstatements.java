package java_programing.Chapter1;

import java.util.Scanner;

// ıf statements lerning 1000 dolar standart ücret alınıyor.
// 10 müşteriyi geçen ek 250 dolar alır.
public class ıfstatements {


    public static void main(String args[]){
        // bildiğimiz veriler
        int salary = 1000;
        int bonus = 250;
        // bilinmeyen veriler
        System.out.println("calısan bu hafta kac satıs yaptı?" );
        Scanner scanner = new Scanner(System.in);
        int sales =scanner.nextInt();
        scanner.close();
        // bonus kazançlar
        if (sales >= 10){
            salary = salary + bonus;

        }
      // çıkış
        System.out.println("calısanlar ekstra       " + salary);
    }
}
