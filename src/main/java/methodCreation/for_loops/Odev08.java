package methodCreation.for_loops;

public class Odev08 {

    public static void main(String[] args) {

        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-98-97-96....
        100 ve 0 dahil değildir.*/
            int toplam=0;
            for (int i =100; i>0; i--) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                    toplam +=i;

                }


            }
        System.out.println("sayilarin toplami="+toplam);
    }
}
