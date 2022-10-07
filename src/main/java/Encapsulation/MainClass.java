package Encapsulation;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Encapsulated_class Deneme1 = new Encapsulated_class();
        Encapsulated_class Deneme2 = new Encapsulated_class();
        System.out.println(Deneme1.getBakiye());
        Deneme1.setBakiye(50);
        int suankiBakiye = Deneme1.getBakiye();
        System.out.println(Deneme1.getBakiye());
        System.out.println("Deneme2.getBakiye() = " + Deneme2.getBakiye());
Deneme1.dbl = 5.5;
Deneme2.dbl = 3432;
        Scanner sc = new Scanner(System.in);

        System.out.println(ilkharf(sc.nextLine()));
        System.out.println(ilkharf(sc.nextLine()));
        System.out.println(ilkharf(sc.nextLine()));
        System.out.println(ilkharf(sc.nextLine()));
        System.out.println(ilkharf(sc.nextLine()));
        System.out.println(ilkharf(sc.nextLine()));
        double sepetTutari1 = sc.nextDouble();
        double sepetTutari2 = sc.nextDouble();
        double sepetTutari3 = sc.nextDouble();
        System.out.println("Indiriminiz " + indirimHesaplama(sepetTutari1)+" TL");
        System.out.println("Indiriminiz " + indirimHesaplama(sepetTutari2)+" TL");
        System.out.println("Indiriminiz " + indirimHesaplama(sepetTutari3)+" TL");
        System.out.println("noturunu giriniz");
        boolean Gecmenotuhes = GecmeNotuhesaplama(5);
        System.out.println("notunuz"+Gecmenotuhes);
    }

    public static int topla(int a, int b){
        int sonuc = a+b;
        return sonuc;
    }
    public static double indirimHesaplama(double tutar){
       return  (tutar*20)/100;

    }


    public static char ilkharf(String str)
    {
        return str.charAt(0);
    }
    public static char ikinciharf(String str)
    {
        return str.charAt(1);
    }
    //50 uzeri ise true 50 altinda ise false bunu uygun metod
    public static boolean GecmeNotuhesaplama(double Not){
        if (Not>=50){
            return true;
        }else {
            return false;
        }


    }
}

