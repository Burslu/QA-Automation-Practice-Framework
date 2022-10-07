package patika_pratik.tasks;

import java.util.Scanner;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.o;

public class Task11 {

    public static void main(String[] args) {
//
//    /*
//    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
//
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//
//    Test data
//    hackerDili("javayı severim")
//    j4v4yı 53v3r1m
//
//    İpucu harfleri değiştirin ve ekrana yazdırın.
////    */
        Scanner sc = new Scanner(System.in);
        System.out.println("yazilan metin;");
        String yazilanMetin =sc.nextLine();
        System.out.println(hackerDili(yazilanMetin));


    }

    private static String hackerDili(String yazilanMetin) {
        String hackdil = yazilanMetin;
        hackdil = hackdil.replace('s','5');
        hackdil = hackdil.replace('a','4');
        hackdil = hackdil.replace('e','3');
        hackdil = hackdil.replace('i','1');
        hackdil = hackdil.replace('o','0');

        return hackdil;

    }

}