package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class ödev1_minmax_değerbulma {
    public static void main(String[] args) {
        int counter;
        int min=1,max=1;
        int sayi;
        System.out.println("Kac tane sayi gireceksiniz:");
        Scanner scanner = new Scanner(System.in);
        counter= scanner.nextInt();
        for (int i=1; i <=counter; i++){
            System.out.println(i+"Birinci sayiyi giribiz:");
            sayi =scanner.nextInt();
            if (i==0){
                max=sayi;
                min=sayi;
            }if (sayi>max) {
                max=sayi;
                
            }if (sayi<min) {
                min=sayi;
                
            }

        }
        System.out.println("En buyuk sayi:"+max);
        System.out.println("En kucuk sayi:"+min);
    }
}
