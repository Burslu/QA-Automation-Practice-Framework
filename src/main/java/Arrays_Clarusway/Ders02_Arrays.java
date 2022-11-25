package Arrays_Clarusway;

import java.util.Arrays;

public class Ders02_Arrays {
    public static void main(String[] args) {
//         int ary []= {67,97,15,61,41,86,55,24};
//
//         int sayi = 33;
//         boolean flag = false;
//        for (int i = 0; i < ary.length; i++) {
//            if (ary[i]==sayi){
//                flag=true;
//            }
//
//        }
//        if (flag){
//            System.out.println("aradiginiz sayi arryde var");
//        }
//        else {
//            System.out.println("aradiginiz sayi arrayde yok");
//        }
//        Arrays.sort(ary);//array elemanlarini sirala
//        System.out.println(Arrays.toString(ary));
//        System.out.println(Arrays.binarySearch(ary, 41));//arrayde 34 elamani var mi yok mu onu arar.// sirasini belirler olmasaydi olmasi gereken sirayi da verir .


        String str = "berkay uslu 1999 dogumludur";//sitring ifadeyi kelimelere atadik .
        String strArrys[]=str.split(" ");//" " karakterden sonra parcala.
        System.out.println(Arrays.toString(strArrys));

        System.out.println(strArrys.length);//kelime sayisini print eden program

        String strHarf[]=str.split("");
        System.out.println(Arrays.toString(strHarf));//harf olarak parcalar...
        System.out.println(strHarf.length);//karakter sayisini bulur uzunlugunu








    }
}
