package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik.tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir yil giriniz ;");
        int yilBulma = scan.nextInt();
        System.out.println(yilBulma(yilBulma));


    }

    private static boolean yilBulma(int yil) {

        if (yil%4==0) {
//            System.out.println(+yil+"Bir artik yildir");
            return true;
        } else if ((yil*400)%4==0) {
//            System.out.println(+yil+"Bir artik yildir");
            return false;
        }else {
//            System.out.println("artik yil degildir"+yil);
            return false;
        }

//        return false;
    }
}
