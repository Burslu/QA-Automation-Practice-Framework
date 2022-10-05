package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class metod_üst_alma {
    static int power() {

        Scanner scanner = new Scanner(System.in);
        int base, exponent;
        System.out.println("taban degeri giriniz:");
        base = scanner.nextInt();
        System.out.println("ust degeri giriniz:");
        exponent = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
            if (exponent == 0) {
                return 1;
            }
        }
        System.out.println("Result:"+result);
        return result;
    }

    public static void main(String[] args) {
        power();
    }
}





