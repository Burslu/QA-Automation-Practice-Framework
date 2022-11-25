package Constructor;

public class Constructor_04Teacher {
    String  ad ;
    String  soyad ;
    String  brans ;
    int     DersSaati ;
    int     tecrube ;
    double  maas ;


    public void dersSaati(){
        System.out.println("20 saatten sonra ek mesaiye girer.");
    }

    public Constructor_04Teacher(String ad, String soyad, String brans, int dersSaati, int tecrube, double maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        DersSaati = dersSaati;
        this.tecrube = tecrube;
        this.maas = maas;
    }

    public Constructor_04Teacher() {

    }

    @Override
    public String toString() {
        return "Constructor_04Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", DersSaati=" + DersSaati +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                '}';
    }
}
