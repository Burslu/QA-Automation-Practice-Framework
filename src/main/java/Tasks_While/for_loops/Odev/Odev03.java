package Tasks_While.for_loops.Odev;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz ;");
        int sayi = scan.nextInt();
        asalSayi(sayi);

        }

    private static void asalSayi(int sayi) {
        if (sayi%2==1 && sayi==2){
            for (int i=1; i<=sayi;i++){
                System.out.println(sayi+" girdiginiz ifade asaldir...");
                
            }

            
        }else {
            System.out.println(" girdiginiz ifade asaldegildir...");
            
        }

        
    }


}
