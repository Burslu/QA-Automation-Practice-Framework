package Break_Countinue;

import java.util.Scanner;

public class Break_Statetment03 {
    public static void main(String[] args) {

//         Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Pin giriniz;");
//        String dogruPin = "JavaCan";
//        int girisHakki = 3;
//        String Pin = scan.nextLine();
//            while (true){
//                System.out.println("pininizi giriniz");
//                String PinGiris = scan.nextLine();
//                if (PinGiris.equals(dogruPin)){
//                    System.out.println("pin basarili giris yaptiniz");
//                    break;
//                } else  {
//                    System.out.println("pin yanlis tekrar deneyiniz");
//                    girisHakki--;
//                    System.out.println("kalan hakkiniz"+girisHakki);
//                    if (girisHakki==0){
//                        System.out.println("sistem bloke oldu gecmis olsun ");
//                        break;
//                    }
//                }
//            }
        Scanner sc = new Scanner(System.in);
        System.out.println("Pin giriniz;");
        String DogruPin = "JavaCan";

        int DenemeHakki = 3;

            for (int i=0; i<DenemeHakki; i++){
                String DenemePini= sc.nextLine();
                if (DenemePini==DogruPin){
                    System.out.println("Dogru pin girdiniz buyurun.");
                    break;
                }
                else if(i==DenemeHakki-1){
                        System.out.println("deneme hakkiniz bitti sistem bloke oldu gecmis olsun ");
                        break;
                    }

                else {

                    System.out.println("kalan hakkiniz;"+(DenemeHakki-i));
                    System.out.println("pininiz yanlis tekrar deneyiz");


                }
            }

    }
}
