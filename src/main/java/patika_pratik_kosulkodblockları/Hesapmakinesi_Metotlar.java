package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class Hesapmakinesi_Metotlar {

    static void modAl(int a, int b) {
        int result = a%b;
        System.out.println("Mod alma" + result);
    }

    static void alanhes(int a, int b) {
        int cevre = 2 * (a * b);
        int alan = a * b;
        System.out.println("cevre" + cevre);
        System.out.println("Alan" + alan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String menü = "1.Mod alma\n"
                + "2.Dikdörtgen alanı hesaplama"
                + "cıkıs yapma:";
        System.out.println(menü);
        while (true){
            System.out.println(menü);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scanner.nextInt();
            switch (select) {


            }
            }
        }
    }


