package Tasks_While.for_loops.Odev;

public class yildiz {

    public static void main(String[] args) {

      int x = 5;
        for (int i = 0; i < x; i++) {
            System.out.print("");
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.println();
            }
        }
    }
}
