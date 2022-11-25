package DateTime;
import  java.time.LocalDate;
public class LocalDate01 {
    public static void main(String[] args) {
         LocalDate bugun = LocalDate.now();
        System.out.println("bugun="+bugun);
        System.out.println("bugun.getYear()="+bugun.getYear());
        System.out.println("bugun.getMountValue()="+bugun.getDayOfMonth());


        LocalDate date1 = LocalDate.of(1999,8,28);
        LocalDate date2 = LocalDate.of(2001,7,6);

        //verilen bir tarihin oncesine ve sonrasina gitmek ...
        System.out.println(date1.plusDays(2));
        System.out.println(date2.plusMonths(1));
        System.out.println(bugun.plusWeeks(5));
        System.out.println(bugun.minusDays(15));
    }
}
