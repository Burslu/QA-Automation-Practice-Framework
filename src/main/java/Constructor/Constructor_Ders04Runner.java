package Constructor;

public class Constructor_Ders04Runner extends Constructor_04Teacher{

    public static void main(String[] args) {

        Constructor_04Teacher ogretmen1 = new Constructor_04Teacher();//ogretmen 1 obje creat edildi .

    ogretmen1.brans    = "MAT" ;
    ogretmen1.tecrube  = 2000 ;
    ogretmen1.ad       = "Berkay" ;
    ogretmen1.maas     = 8950 ;
    ogretmen1.DersSaati= 25;

        System.out.println(ogretmen1);

        Constructor_04Teacher ogretmen2 = new Constructor_04Teacher();
    }
}
