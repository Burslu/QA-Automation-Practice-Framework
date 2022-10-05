package patika_pratik;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class dizielamanlarıbulma {
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi kaç elamanlı olacak:");
        n=scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println(i+1+"Eleman:");
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        for (int eleman : list){
            System.out.println(eleman+" ");
        }
    }
}

