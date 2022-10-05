package inhertance_chapter;

public class Test {

    public static void main(String[] args) {
        Baba babaObje = new Cocuk();
        babaObje.babaSelamVer();
        System.out.println(babaObje.name);
        Cocuk cocukObje = new Cocuk();
        cocukObje.Cocukmetod();
    }
}
