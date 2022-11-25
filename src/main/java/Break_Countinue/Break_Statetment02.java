package Break_Countinue;

import java.util.Scanner;

public class Break_Statetment02 {
    public static void main(String[] args) {


        /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop’un bir sonraki değerinden devam eder.
 */
// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

//        Scanner scan = new Scanner(System.in);
//        System.out.println("mail hesabinizi giriniz;");
//        String email=scan.nextLine();
//
//        for (int i =0; i<email.length(); i++){
//            char c = email.charAt(i);
//
//            if (c==' ') {
//                continue;
//
//
//            }
//
//            System.out.print(c);
//
//        }
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz;");
        int sayi=scan.nextInt();// 23 asil mi 2,3,5,6,7,8,....

        boolean asal_mi =true;

        for (int i = 2; i<sayi; i++){
            if (sayi%2==0){// eger sayi kendisine kadar olan sayilara tam bolunuyorsa
                asal_mi=false;
                break;
            }
        }
        if (asal_mi){
            System.out.println("girilen sayi ASALDIR");
        }else {
            System.out.println("girilen sayi asalDegildir");
        }

    }
}
