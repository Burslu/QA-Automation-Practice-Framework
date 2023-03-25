package patika_pratik.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("mesai baslama saatini giriniz;");
        double start= scan.nextDouble();
        System.out.println("mesai bitis saatini giriniz;");
        double stop= scan.nextDouble();
        System.out.println("mesai ucreti giriniz;");
        double mesaiUcreti= scan.nextDouble();
        System.out.println("mesaikatsayi  ucreti giriniz;");
        double saatlikUcret= scan.nextDouble();

        System.out.println(fazladanMesai(saatlikUcret,start,stop,mesaiUcreti));
        System.out.println(fazladanMesai(9.0, 20.0, 40.0, 1.8));

    }

    private static double fazladanMesai(double saatlikUcret, double start, double stop, double mesaiUcreti) {
        double ucret1 =(17-start)*saatlikUcret;
        double ucret2 =(stop-17)*saatlikUcret*mesaiUcreti;
        return ucret1+ucret2;
    }
}
