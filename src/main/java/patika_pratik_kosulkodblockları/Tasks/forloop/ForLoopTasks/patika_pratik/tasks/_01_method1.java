package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik.tasks;

import java.util.Random;
import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intmax = randomNum(25);
        System.out.println("notunuz"+intmax);
    }

    public static int randomNum(int max){
        Random rd = new Random();
        int sonuc = rd.nextInt(max);
        return sonuc;
    }
}
