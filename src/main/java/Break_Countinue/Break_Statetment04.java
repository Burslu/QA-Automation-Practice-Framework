package Break_Countinue;

import java.util.Scanner;

public class Break_Statetment04 {
    public static void main(String[] args) {

//        int count = 0;
//        for (int row = 1; row <= 3; row++) {
//            for (int col = 1; col <= 2; col++) {
//                if (row * col % 2 == 0) continue;//raw*col cift ise bekleme yapma devam ticari: count artma
//                count++;
//            }
//        }
//        System.out.println(count);
//
//

        // task -> girilen bir ifadedeki 'c' karakterine kadar kac tane 'a' karakter sayısı oldugunu print eden code create ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter  giriniz;");
        String chr = scan.nextLine();
        int aSayisi =0;
        for (int i=0; i<chr.length(); i++){
            if (chr.charAt(i)=='a'){
            aSayisi++;
            }else if (chr.charAt(i)=='c'){
                break;
            }
            System.out.println("dongude isleme giren karakter:"+chr.charAt(i));
        }
        System.out.println(" a sayısı adetı "+aSayisi);
    }
}
