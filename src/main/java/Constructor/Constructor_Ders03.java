package Constructor;

public class Constructor_Ders03 {
    // main olmayan sadece studfent obj creat etmek icin pojo

    String  ad ;
    String  soyad ;
    int     sinif ;
    int     okulno ;
    double  notOrt ;

    public void mezuniyet(){
        if (notOrt>=50){
            System.out.println("mezun oldunuz tebrikler");
        }else {
            System.out.println("sinif tekrari ");
        }
    }

    @Override
    public String toString() {
        return "Constructor_Ders03{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif=" + sinif +
                ", okulno=" + okulno +
                ", notOrt=" + notOrt +
                '}';
    }
}
