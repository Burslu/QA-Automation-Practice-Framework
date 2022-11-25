package Constructor;

public class Constructor_Ders05Arac {

    // fields => aracin uretilirken alacagi degerler...
    int maxHiz;
    String model;

    public Constructor_Ders05Arac(int maxHiz) {// bir parametreli constructor.
        this(191,"peugeot");
    }

    public Constructor_Ders05Arac(int maxHiz, String model) {
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("iki parametreli constructor");
    }

}
