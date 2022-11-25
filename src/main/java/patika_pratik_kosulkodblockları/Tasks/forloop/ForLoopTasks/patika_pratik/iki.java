package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik;

import java.util.Scanner;

public class iki {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total ,startPrice= 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz:");
        km = scanner.nextInt();
        total = (km *perKm);
        total +=startPrice;
        total = (total<20) ? 20: total;
        System.out.println("toplam tutar:"+ total);

    }

}
