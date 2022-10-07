package Tasks_While;

import java.util.Scanner;

public class While_03 {
    public static void main(String[] args) {
        // girilen tam sayinin tam bolen sayisini print eden programi creat ediniz..,

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz ;");
        int sayi = sc.nextInt();

        int bolenSayi = 1 ;
        int tamBolenAdeti = 0;

        while (bolenSayi<=sayi){
        if (sayi%bolenSayi==0){//sayi bolen sayiya tam bolunur
            tamBolenAdeti++;



        }
        bolenSayi++;    //sonsuza dusmemesi icin ve diger sayilarin boldugunu kontrol etmesi icin yazildi ...

        }
        System.out.println("girginiz sayi "+sayi+"'nin "+tamBolenAdeti+" kadar boleni var .");

    }
}
