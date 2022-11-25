package DateTime;

import java.time.LocalTime;

public class LocalTime02 {
    public static void main(String[] args) {
        //localTime = saat dakika saniye tutar .
        LocalTime time = LocalTime.now();//bu sistemden zaman bilgisi atar .
        System.out.println("time"+time);
        System.out.println("time.getHour()="+time.getHour());
        System.out.println("time=.getMinute()="+time.getMinute());
        System.out.println("time.getNano()="+time.getNano());
        System.out.println("time.getScond()="+time.getSecond());
        LocalTime time1 = LocalTime.of(15,2,17);//belirli bir saat ve dakikaya gider.


        System.out.println(time1.plusMinutes(52));
    }

}
