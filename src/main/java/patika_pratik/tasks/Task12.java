package patika_pratik.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner sc = new Scanner(System.in);
       System.out.println("bir e_mail adresi giriniz;");
        String kontrol = sc.nextLine();
        mailKontrol(kontrol, "@gmail.com",".com");

    }

    private static boolean mailKontrol(String atIceriyormu, String a,String b) {
        System.out.println(a.contains("@"));
        System.out.println(b.contains("."));
        return atIceriyormu.contains(a);



    }
}