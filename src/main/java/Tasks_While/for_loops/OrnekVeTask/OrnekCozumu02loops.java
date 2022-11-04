package methodCreation.for_loops.OrnekVeTask;

public class OrnekCozumu02loops {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.


//        for (int i=0; i<=255; i++){
//            char Karakter = (char)(i);
//            System.out.println(i+" ="+Karakter);
//        }


        /*  ForLoop
        print even numbers from 100 to 0 but do not use decrement(i--).
             INPUT      :
             OUTPUT  : 100 98 96 94 92 ....2 0
      */
         int num = 100;

         for (int i=num; i>=0; i=i-2){
             System.out.print(i+ " ");
         }


    }
}
