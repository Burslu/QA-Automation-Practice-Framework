package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class ATM_YAPIYORUZ {
    public static void main(String[] args) {
      String username, passapord;
        int right = 3;
        int balance = 2077;
        int select,tutar;
        Scanner scanner =new Scanner(System.in);

     while (right > 0){
         System.out.println("Lutfen kullanici adinizi giriniz:");
         username = scanner.nextLine();
         System.out.println("lutfen parolanizi giriniz:");
         passapord =scanner.nextLine();
      if(username.equals("ooobeko123") && passapord.equals(123789465)){
          System.out.println("Merhaba is bankasına hosgeldiniz "+username+"Bey");

          System.out.println("Yapmak istediğiniz işlem numarasini seciniz:");
          System.out.println("1 -para cekme\n 2- para yatırma\n 3 Bakiye sorugulama \n online ödemeler");
          select =scanner.nextInt();
          switch (select){
              case 1:
                  System.out.println("yatirmak istediğiniz tutari giriniz:");
                  tutar = scanner.nextInt();
                  balance += balance;
                  System.out.println("para yatırma isleminiz gerçeklesmistir bakiyeniz"+balance);
                  break;
          }

      }
     }
    }
}
