package Break_Countinue;

import java.util.Scanner;

public class Break_Statetment01 {
    public static void main(String[] args) {
//        break loop'u isrtenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop’u, loop’un koşul bölümüne bağlı
//        kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop’a bağlı kod bloğunun
//        herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu’nu görür görmez,
//                loop başlangıç koşulu sağlanmış olsa bile, loop’dan çıkar ve loop’dan sonra gelen ilk işlem
//        satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
//        içinde kullanıldığı loop’dan çıkışı sağlar:
//
//
//        temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
               // */

        // Task ->girilen bir mail hesabının @ sembolune kadar olan karakterlerni print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("mail hesabinizi giriniz;");

        String email =scan.nextLine();
        for (int i = 0; i<=email.length(); i++){//0 inci indeksten son indekse kadar donguye al
            char c =email.charAt(i);// dongude her karakteri c ye atar
            if (c=='@'){//c de @ var ise if blogu run edilir
                break;//if blok loopu sonlandirir.
            }
            System.out.println(c);
        }

    }
}
