package methodCreation.for_loops;

import java.util.Scanner;

public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamSayi = scan.nextInt();
        System.out.println(poweOfThree(tamSayi));


    }

    private static boolean poweOfThree(int tamSayi) {
        int tamSayiKopya = tamSayi;
        int bolumSayisi =0;
        while (tamSayi>1) {
            if (tamSayi%3==0){
                tamSayi/=3;
                bolumSayisi++;
            }else {
                break;
            }

        }
        if (tamSayi == 1){
            for(int i = 0; i< bolumSayisi ; i++){
                if(i == bolumSayisi -1){
                    System.out.print("3");
                }else{
                    System.out.print("3*");
                }
                //System.out.print("3*");
            }
            System.out.println("= " + tamSayiKopya);
            return true;
        }else {
            return false;
        }
    }
}
