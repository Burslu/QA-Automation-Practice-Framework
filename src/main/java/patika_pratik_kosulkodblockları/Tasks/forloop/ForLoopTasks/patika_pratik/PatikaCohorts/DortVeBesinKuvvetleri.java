package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik.PatikaCohorts;

import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int number ;//degisken isimlerim sayi , ortalma ,sayac
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        number = scan.nextInt();
        System.out.println("4 un kuvvetleri :");
        for (int i=1; i<=number; i*=4){//girilen sayiya kadar artirildi 4 icin
                System.out.println(i);
    }

        System.out.println("5 in kuvvetleri:");
        for (int j=1; j<=number; j*=5){//girilen sayiya kadar artirildi 5 icin
                System.out.println(j);
            }

}
}
