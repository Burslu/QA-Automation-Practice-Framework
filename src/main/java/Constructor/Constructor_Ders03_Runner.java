package Constructor;

public class Constructor_Ders03_Runner extends Constructor_Ders03{
    public static void main(String[] args) {
        Constructor_Ders03 ogrenci1 = new Constructor_Ders03();
        ogrenci1.ad      = " Berkay " ;
        ogrenci1.soyad   = " USLU " ;
        ogrenci1.notOrt  = 71 ;
        ogrenci1.sinif   = 1 ;
        ogrenci1.okulno  = 41 ;

        System.out.println("ogrenci1 "+ogrenci1);
        ogrenci1.mezuniyet();//mezun oldunuz ...
    }
}
