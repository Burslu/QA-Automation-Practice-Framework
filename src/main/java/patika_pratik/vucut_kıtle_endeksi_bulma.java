package patika_pratik;

import java.util.Scanner;

public class vucut_kıtle_endeksi_bulma {
    public static void main(String[] args) {
        double b,k,vti;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu Metre cinsinden giriniz:");
        b = scanner.nextDouble();
        System.out.println("kilonuzu giriniz:");
        k = scanner.nextDouble();
        vti= k/(b*b);
        System.out.println("vücüt kitle endeksiniz:"+vti);
        if(vti>25){;
        System.out.println("fazla kilolusunuz kilo vermelisiniz..."+vti);
    }
        else{
            System.out.println("kilonuz normal tebrikler:");
        }
}
}
