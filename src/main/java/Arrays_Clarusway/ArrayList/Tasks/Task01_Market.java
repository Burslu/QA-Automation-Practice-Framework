package Arrays_Clarusway.ArrayList.Tasks;

import java.util.Arrays;

public class Task01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap
     * */


    public static void main(String[] args) {
        
//   //dizi elemanlarin karasini alan programi creat ediniz.
//    int arry[] ={2,6,4,5,8,9};
//
//        for (int i = 0; i < arry.length; i++) {
//            arry[i]*=arry[i];
//
//        }
//        System.out.println("elemanlarin karesi ;"+ Arrays.toString(arry));
    


    //dizi elemanlarini ort deger hesaplayan ve ortdan buyuk olanlari hesaplayan program ...

    int arrys[]={1,2,3,4,5,6};
    int toplam =0;
        for (int i = 0; i < arrys.length; i++) {
            toplam +=arrys[i];
        }
        double ort = toplam/arrys.length;//ortalmayi verir
        System.out.println("ortlama; "+ort);
        System.out.println("ortalamadan buyuk elemanlar");

        for (int i = 0; i < arrys.length; i++) {
            if (arrys[i]>ort){
                System.out.println(arrys[i]+" ");
            }
            
        }

        //HeySiri diye arryi  ByeSiri seklinde degistiriniz .
        String str = "HeySiri";

        str = str.replace("Hey","Bye");
        System.out.println(str);

        String ary[]=new String[1];
        ary[0]=str;
        System.out.println(Arrays.toString(ary));

        //verilen arry de toplamlari 9 olan ciftleri bulunuz

        int arry[] = {5,7,24,4,2,-15,3,8,1};
        int istenenToplam =9;
        toplamDokuz(arry , istenenToplam);
        
    }

    private static void toplamDokuz(int[] arry, int istenenToplam) {

        for (int i = 0; i < arry.length; i++) {//1. degeri aliyoruz
            for (int j = i+1; j < arry.length ; j++) {//2.degeri alip toplami 9 veriyor mu onu kontrol ediyoruz .
                    if (arry[i]+arry[j]==istenenToplam){
                        System.out.println(arry[i]+" ve"+arry[j]+"toplami;"+istenenToplam);
                    }
                
            }
        }
    }
}
