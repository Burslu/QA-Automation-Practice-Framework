package Constructor;

public class Constructor_Ders01 {


    String str ;
    String selam  = "Berkay";
    public static void main(String[] args) {
        /*
        1-construtar ismi class ismi ile ayni olmali buyuk harf ile baslamalidir.
        2-constructor creat edildiginde name den sonra (){} mutlaka kul.
        3-eger p`li constructor creat edildiginde java defoult cons eder (siler)
        4-cons.  return type olmaz metoddan ayiran ozellikdir.
        5-class olustugunda java default cons. creat eder .
         */
//          class name       obje name      new keyword         default cons.
        Constructor_Ders01     obj1 =         new             Constructor_Ders01();
        Constructor_Ders01     obj2 =         new             Constructor_Ders01();
            obj1.selam = "Berkay USLU";//obje degeri atama yolu ile degeri degistirildi.
            obj2.str   = "Beko";
        System.out.println(obj1);





    }
}
