package Constructor;

public class Constructor_Ders02_Arac {

    String  marka;
    String  model;
    int     km;
    double  motorhacmi;
    boolean vitesAuto;
    boolean ikinciel;
    int     yil;

    public static void main(String[] args) {
        Constructor_Ders02_Arac arac1 = new Constructor_Ders02_Arac();
        arac1.ikinciel   = true;
        arac1.marka      = "volvo";
        arac1.km         = 50000;
        arac1.model      = "xc90";
        arac1.yil        = 2014;
        arac1.motorhacmi = 1590;
        arac1.vitesAuto  = false;
        //                      true            50000       2014            xc90                false           volvo              1590
        System.out.println(arac1.ikinciel+" "+arac1.km+" "+arac1.yil+" "+arac1.model+" "+arac1.vitesAuto+" "+arac1.marka+" "+arac1.motorhacmi);

        //task 02
        Constructor_Ders02_Arac myarac2 = new Constructor_Ders02_Arac();
        myarac2.ikinciel   = true;
        myarac2.marka      = "peugeot";
        myarac2.km         = 25000;
        myarac2.model      = "208";
        myarac2.yil        = 2018;
        myarac2.motorhacmi = 1.2;
        myarac2.vitesAuto  = true;

        System.out.println(myarac2.ikinciel+"kac km de  "+myarac2.km+" "+myarac2.yil+" "+myarac2.model+" "+myarac2.vitesAuto+" "+myarac2.marka+" "+myarac2.motorhacmi);


    }
}
