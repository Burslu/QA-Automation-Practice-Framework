package patika_pratik_kosulkodblockları.methodCreation.Clarusway_Ornekleri;

public class Ornek03 {
    public static void main(String[] args) {
        //atilan iki zarin toplamlarinin 9 olmasi durumunda " kazandiniz " yazisini yazdiriniz .
        //aksi takdirde " tekrar deneyiniz " yazdirsin .

             int min = 1;
             int max = 6;


             int zar1 = (int) (Math.random()*((max-min)+1))+min;
             int zar2 = (int) (Math.random()*((max-min)+1))+min;
        System.out.println("zar1:"+zar1);
        System.out.println("zar2:"+zar2);
             int toplam =zar1 + zar2 ;

             if (toplam==9){
                 System.out.println("K  azandiniz");
             }
             else {
                 System.out.println("Tekrar deneyiniz");
             }
    }
}
